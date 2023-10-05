grammar Json;

options {

language = Java;
k =1;
}

@header {

package compilerPackage;
}

@lexer::header {

package compilerPackage;
}

@members {

Handler h;
public Handler getHandler () {
	
	return h;
}

// Override e delega nella gestione degli errori sintattici
public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	
	// recupero alcune meta informazioni relative all'errore
	String hdr = " * " + getErrorHeader(e);
	String msg = " - " + getErrorMessage(e, tokenNames);
	// recuperoil token corrente  
	Token tk = input.LT(1);	
	// lascio gestire il messaggio all'handler
	h.handleError(tk, hdr, msg);
}

	
void initParser () {
 
 	// passo lo stream di token all'handler 
	h = new Handler(input);
}
}


/* ****************************
**	 Analizzatore sintattico (Parser)
***************************** */


parseJson 
@init {initParser();}
:
principalObjectRule
;

principalObjectRule
:
LBR	
taskType = taskRule
CM
hiddenLayersRule[taskType]
CM
outputLayersRule[taskType]
CM
numberOfEpochs=numberOfEpochsRule
CM
earlyStopping = earlyStoppingRule
CM
learningRateRule
CM
lossFunctionRule[taskType, earlyStopping, numberOfEpochs]
RBR
;

taskRule returns[Token taskType]
:
TASK CL task=STRING 
{taskType=$task; h.checkTask(taskType);}
;

hiddenLayersRule[Token taskType]
:
hiddenLayers=HIDDEN_LAYERS CL 
LB
numberOfNeuron=layerRule[taskType, $hiddenLayers, null]
(CM numberOfNeuron=layerRule[taskType, $hiddenLayers, numberOfNeuron])*
RB
;

outputLayersRule[Token taskType]
:
outputLayer=OUTPUT_LAYER CL layerRule[taskType, $outputLayer, null]
;

layerRule[Token taskType, Token layerType, Token precNumberOfNeurons]
returns[Token numberOfNeurons]
:	
LBR
NUMBER_OF_NEURONS CL nOfN=INTEGER CM 
{numberOfNeurons=$nOfN; h.checkNeurons(numberOfNeurons, layerType);}
{h.checkDecreasingNeuron(precNumberOfNeurons, numberOfNeurons);}
ACTIVATION_FUNCTION CL activationFunction=STRING
{h.checkActivationFunction(layerType, taskType, $activationFunction);}
RBR
{h.buildLayer(numberOfNeurons, layerType, $activationFunction);}
;

numberOfEpochsRule returns[Token numberOfEpochs]
:
NUMBER_OF_EPOCHS CL nOfE=INTEGER 
{numberOfEpochs=$nOfE; h.checkNumberOfEpochs(numberOfEpochs);}
;

earlyStoppingRule returns[Token earlyStopping]
:
EARLY_STOPPING CL eStopping=BOOLEAN
{earlyStopping=$eStopping;}	
;

learningRateRule
:
LEARNING_RATE CL learningRate=FLOAT
{h.checkLearningRate($learningRate);}
;

lossFunctionRule[Token taskType, Token earlyStopping, Token numberOfEpochs]
:
LOSS_FUNCTION CL lossFunction=STRING 
{h.checkLossFunction(taskType, $lossFunction, earlyStopping,
numberOfEpochs);}
;

/* ****************************
**	 Analizzatore lessicale (Scanner)
***************************** */


// key
TASK				:'"task"';
HIDDEN_LAYERS		:'"hidden_layers"';
NUMBER_OF_NEURONS	:'"neurons"';	
ACTIVATION_FUNCTION	:'"activation_function"';
OUTPUT_LAYER		:'"output_layer"';
NUMBER_OF_EPOCHS	:'"epochs"';
EARLY_STOPPING		:'"early_stopping"';
LEARNING_RATE		:'"learning_rate"';
LOSS_FUNCTION		:'"loss_function"';

fragment
ESC_SEQ			:'\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');

fragment 
DIGIT			:'0'..'9';

//value
INTEGER			:'-'? (DIGIT)+;
FLOAT			:(INTEGER) DOT DIGIT+; 
STRING                	:'"'(ESC_SEQ|~('\\'|'"'))*'"';
BOOLEAN			:'true'|'false';
NULL			:'null';

// punctuation
CL			:':';
CM 			:',';
DOT 			:'.';

// parenthesis
LB			:'[';		
RB			:']';
LBR			:'{';		
RBR			:'}';

//white spaces
WS			:(' '|'\t'|'\r'|'\n')+{$channel=HIDDEN;};

//token error
ERROR_TK		:.; 