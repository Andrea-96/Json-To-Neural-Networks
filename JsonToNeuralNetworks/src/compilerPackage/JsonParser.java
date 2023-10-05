// $ANTLR 3.5.1 /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g 2023-08-31 15:35:03


package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JsonParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTIVATION_FUNCTION", "BOOLEAN", 
		"CL", "CM", "DIGIT", "DOT", "EARLY_STOPPING", "ERROR_TK", "ESC_SEQ", "FLOAT", 
		"HIDDEN_LAYERS", "INTEGER", "LB", "LBR", "LEARNING_RATE", "LOSS_FUNCTION", 
		"NULL", "NUMBER_OF_EPOCHS", "NUMBER_OF_NEURONS", "OUTPUT_LAYER", "RB", 
		"RBR", "STRING", "TASK", "WS"
	};
	public static final int EOF=-1;
	public static final int ACTIVATION_FUNCTION=4;
	public static final int BOOLEAN=5;
	public static final int CL=6;
	public static final int CM=7;
	public static final int DIGIT=8;
	public static final int DOT=9;
	public static final int EARLY_STOPPING=10;
	public static final int ERROR_TK=11;
	public static final int ESC_SEQ=12;
	public static final int FLOAT=13;
	public static final int HIDDEN_LAYERS=14;
	public static final int INTEGER=15;
	public static final int LB=16;
	public static final int LBR=17;
	public static final int LEARNING_RATE=18;
	public static final int LOSS_FUNCTION=19;
	public static final int NULL=20;
	public static final int NUMBER_OF_EPOCHS=21;
	public static final int NUMBER_OF_NEURONS=22;
	public static final int OUTPUT_LAYER=23;
	public static final int RB=24;
	public static final int RBR=25;
	public static final int STRING=26;
	public static final int TASK=27;
	public static final int WS=28;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JsonParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JsonParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return JsonParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g"; }



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



	// $ANTLR start "parseJson"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:53:1: parseJson : principalObjectRule ;
	public final void parseJson() throws RecognitionException {
		initParser();
		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:55:1: ( principalObjectRule )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:56:1: principalObjectRule
			{
			pushFollow(FOLLOW_principalObjectRule_in_parseJson61);
			principalObjectRule();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parseJson"



	// $ANTLR start "principalObjectRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:59:1: principalObjectRule : LBR taskType= taskRule CM hiddenLayersRule[taskType] CM outputLayersRule[taskType] CM numberOfEpochs= numberOfEpochsRule CM earlyStopping= earlyStoppingRule CM learningRateRule CM lossFunctionRule[taskType, earlyStopping, numberOfEpochs] RBR ;
	public final void principalObjectRule() throws RecognitionException {
		Token taskType =null;
		Token numberOfEpochs =null;
		Token earlyStopping =null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:60:1: ( LBR taskType= taskRule CM hiddenLayersRule[taskType] CM outputLayersRule[taskType] CM numberOfEpochs= numberOfEpochsRule CM earlyStopping= earlyStoppingRule CM learningRateRule CM lossFunctionRule[taskType, earlyStopping, numberOfEpochs] RBR )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:61:1: LBR taskType= taskRule CM hiddenLayersRule[taskType] CM outputLayersRule[taskType] CM numberOfEpochs= numberOfEpochsRule CM earlyStopping= earlyStoppingRule CM learningRateRule CM lossFunctionRule[taskType, earlyStopping, numberOfEpochs] RBR
			{
			match(input,LBR,FOLLOW_LBR_in_principalObjectRule70); 
			pushFollow(FOLLOW_taskRule_in_principalObjectRule77);
			taskType=taskRule();
			state._fsp--;

			match(input,CM,FOLLOW_CM_in_principalObjectRule79); 
			pushFollow(FOLLOW_hiddenLayersRule_in_principalObjectRule81);
			hiddenLayersRule(taskType);
			state._fsp--;

			match(input,CM,FOLLOW_CM_in_principalObjectRule84); 
			pushFollow(FOLLOW_outputLayersRule_in_principalObjectRule86);
			outputLayersRule(taskType);
			state._fsp--;

			match(input,CM,FOLLOW_CM_in_principalObjectRule89); 
			pushFollow(FOLLOW_numberOfEpochsRule_in_principalObjectRule93);
			numberOfEpochs=numberOfEpochsRule();
			state._fsp--;

			match(input,CM,FOLLOW_CM_in_principalObjectRule95); 
			pushFollow(FOLLOW_earlyStoppingRule_in_principalObjectRule101);
			earlyStopping=earlyStoppingRule();
			state._fsp--;

			match(input,CM,FOLLOW_CM_in_principalObjectRule103); 
			pushFollow(FOLLOW_learningRateRule_in_principalObjectRule105);
			learningRateRule();
			state._fsp--;

			match(input,CM,FOLLOW_CM_in_principalObjectRule107); 
			pushFollow(FOLLOW_lossFunctionRule_in_principalObjectRule109);
			lossFunctionRule(taskType, earlyStopping, numberOfEpochs);
			state._fsp--;

			match(input,RBR,FOLLOW_RBR_in_principalObjectRule112); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "principalObjectRule"



	// $ANTLR start "taskRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:78:1: taskRule returns [Token taskType] : TASK CL task= STRING ;
	public final Token taskRule() throws RecognitionException {
		Token taskType = null;


		Token task=null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:79:1: ( TASK CL task= STRING )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:80:1: TASK CL task= STRING
			{
			match(input,TASK,FOLLOW_TASK_in_taskRule124); 
			match(input,CL,FOLLOW_CL_in_taskRule126); 
			task=(Token)match(input,STRING,FOLLOW_STRING_in_taskRule130); 
			taskType=task; h.checkTask(taskType);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return taskType;
	}
	// $ANTLR end "taskRule"



	// $ANTLR start "hiddenLayersRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:84:1: hiddenLayersRule[Token taskType] : hiddenLayers= HIDDEN_LAYERS CL LB numberOfNeuron= layerRule[taskType, $hiddenLayers, null] ( CM numberOfNeuron= layerRule[taskType, $hiddenLayers, numberOfNeuron] )* RB ;
	public final void hiddenLayersRule(Token taskType) throws RecognitionException {
		Token hiddenLayers=null;
		Token numberOfNeuron =null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:85:13: (hiddenLayers= HIDDEN_LAYERS CL LB numberOfNeuron= layerRule[taskType, $hiddenLayers, null] ( CM numberOfNeuron= layerRule[taskType, $hiddenLayers, numberOfNeuron] )* RB )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:86:13: hiddenLayers= HIDDEN_LAYERS CL LB numberOfNeuron= layerRule[taskType, $hiddenLayers, null] ( CM numberOfNeuron= layerRule[taskType, $hiddenLayers, numberOfNeuron] )* RB
			{
			hiddenLayers=(Token)match(input,HIDDEN_LAYERS,FOLLOW_HIDDEN_LAYERS_in_hiddenLayersRule145); 
			match(input,CL,FOLLOW_CL_in_hiddenLayersRule147); 
			match(input,LB,FOLLOW_LB_in_hiddenLayersRule150); 
			pushFollow(FOLLOW_layerRule_in_hiddenLayersRule154);
			numberOfNeuron=layerRule(taskType, hiddenLayers, null);
			state._fsp--;

			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:89:2: ( CM numberOfNeuron= layerRule[taskType, $hiddenLayers, numberOfNeuron] )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CM) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:89:2: CM numberOfNeuron= layerRule[taskType, $hiddenLayers, numberOfNeuron]
					{
					match(input,CM,FOLLOW_CM_in_hiddenLayersRule158); 
					pushFollow(FOLLOW_layerRule_in_hiddenLayersRule162);
					numberOfNeuron=layerRule(taskType, hiddenLayers, numberOfNeuron);
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,RB,FOLLOW_RB_in_hiddenLayersRule167); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "hiddenLayersRule"



	// $ANTLR start "outputLayersRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:93:1: outputLayersRule[Token taskType] : outputLayer= OUTPUT_LAYER CL layerRule[taskType, $outputLayer, null] ;
	public final void outputLayersRule(Token taskType) throws RecognitionException {
		Token outputLayer=null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:94:12: (outputLayer= OUTPUT_LAYER CL layerRule[taskType, $outputLayer, null] )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:95:12: outputLayer= OUTPUT_LAYER CL layerRule[taskType, $outputLayer, null]
			{
			outputLayer=(Token)match(input,OUTPUT_LAYER,FOLLOW_OUTPUT_LAYER_in_outputLayersRule179); 
			match(input,CL,FOLLOW_CL_in_outputLayersRule181); 
			pushFollow(FOLLOW_layerRule_in_outputLayersRule183);
			layerRule(taskType, outputLayer, null);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "outputLayersRule"



	// $ANTLR start "layerRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:98:1: layerRule[Token taskType, Token layerType, Token precNumberOfNeurons] returns [Token numberOfNeurons] : LBR NUMBER_OF_NEURONS CL nOfN= INTEGER CM ACTIVATION_FUNCTION CL activationFunction= STRING RBR ;
	public final Token layerRule(Token taskType, Token layerType, Token precNumberOfNeurons) throws RecognitionException {
		Token numberOfNeurons = null;


		Token nOfN=null;
		Token activationFunction=null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:99:1: ( LBR NUMBER_OF_NEURONS CL nOfN= INTEGER CM ACTIVATION_FUNCTION CL activationFunction= STRING RBR )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:100:1: LBR NUMBER_OF_NEURONS CL nOfN= INTEGER CM ACTIVATION_FUNCTION CL activationFunction= STRING RBR
			{
			match(input,LBR,FOLLOW_LBR_in_layerRule198); 
			match(input,NUMBER_OF_NEURONS,FOLLOW_NUMBER_OF_NEURONS_in_layerRule200); 
			match(input,CL,FOLLOW_CL_in_layerRule202); 
			nOfN=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_layerRule206); 
			match(input,CM,FOLLOW_CM_in_layerRule208); 
			numberOfNeurons=nOfN; h.checkNeurons(numberOfNeurons, layerType);
			h.checkDecreasingNeuron(precNumberOfNeurons, numberOfNeurons);
			match(input,ACTIVATION_FUNCTION,FOLLOW_ACTIVATION_FUNCTION_in_layerRule215); 
			match(input,CL,FOLLOW_CL_in_layerRule217); 
			activationFunction=(Token)match(input,STRING,FOLLOW_STRING_in_layerRule221); 
			h.checkActivationFunction(layerType, taskType, activationFunction);
			match(input,RBR,FOLLOW_RBR_in_layerRule225); 
			h.buildLayer(numberOfNeurons, layerType, activationFunction);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return numberOfNeurons;
	}
	// $ANTLR end "layerRule"



	// $ANTLR start "numberOfEpochsRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:110:1: numberOfEpochsRule returns [Token numberOfEpochs] : NUMBER_OF_EPOCHS CL nOfE= INTEGER ;
	public final Token numberOfEpochsRule() throws RecognitionException {
		Token numberOfEpochs = null;


		Token nOfE=null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:111:1: ( NUMBER_OF_EPOCHS CL nOfE= INTEGER )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:112:1: NUMBER_OF_EPOCHS CL nOfE= INTEGER
			{
			match(input,NUMBER_OF_EPOCHS,FOLLOW_NUMBER_OF_EPOCHS_in_numberOfEpochsRule239); 
			match(input,CL,FOLLOW_CL_in_numberOfEpochsRule241); 
			nOfE=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numberOfEpochsRule245); 
			numberOfEpochs=nOfE; h.checkNumberOfEpochs(numberOfEpochs);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return numberOfEpochs;
	}
	// $ANTLR end "numberOfEpochsRule"



	// $ANTLR start "earlyStoppingRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:116:1: earlyStoppingRule returns [Token earlyStopping] : EARLY_STOPPING CL eStopping= BOOLEAN ;
	public final Token earlyStoppingRule() throws RecognitionException {
		Token earlyStopping = null;


		Token eStopping=null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:117:1: ( EARLY_STOPPING CL eStopping= BOOLEAN )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:118:1: EARLY_STOPPING CL eStopping= BOOLEAN
			{
			match(input,EARLY_STOPPING,FOLLOW_EARLY_STOPPING_in_earlyStoppingRule260); 
			match(input,CL,FOLLOW_CL_in_earlyStoppingRule262); 
			eStopping=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_earlyStoppingRule266); 
			earlyStopping=eStopping;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return earlyStopping;
	}
	// $ANTLR end "earlyStoppingRule"



	// $ANTLR start "learningRateRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:122:1: learningRateRule : LEARNING_RATE CL learningRate= FLOAT ;
	public final void learningRateRule() throws RecognitionException {
		Token learningRate=null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:123:1: ( LEARNING_RATE CL learningRate= FLOAT )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:124:1: LEARNING_RATE CL learningRate= FLOAT
			{
			match(input,LEARNING_RATE,FOLLOW_LEARNING_RATE_in_learningRateRule278); 
			match(input,CL,FOLLOW_CL_in_learningRateRule280); 
			learningRate=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_learningRateRule284); 
			h.checkLearningRate(learningRate);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "learningRateRule"



	// $ANTLR start "lossFunctionRule"
	// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:128:1: lossFunctionRule[Token taskType, Token earlyStopping, Token numberOfEpochs] : LOSS_FUNCTION CL lossFunction= STRING ;
	public final void lossFunctionRule(Token taskType, Token earlyStopping, Token numberOfEpochs) throws RecognitionException {
		Token lossFunction=null;

		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:129:1: ( LOSS_FUNCTION CL lossFunction= STRING )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:130:1: LOSS_FUNCTION CL lossFunction= STRING
			{
			match(input,LOSS_FUNCTION,FOLLOW_LOSS_FUNCTION_in_lossFunctionRule296); 
			match(input,CL,FOLLOW_CL_in_lossFunctionRule298); 
			lossFunction=(Token)match(input,STRING,FOLLOW_STRING_in_lossFunctionRule302); 
			h.checkLossFunction(taskType, lossFunction, earlyStopping, numberOfEpochs);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lossFunctionRule"

	// Delegated rules



	public static final BitSet FOLLOW_principalObjectRule_in_parseJson61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_principalObjectRule70 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_taskRule_in_principalObjectRule77 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_principalObjectRule79 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_hiddenLayersRule_in_principalObjectRule81 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_principalObjectRule84 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_outputLayersRule_in_principalObjectRule86 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_principalObjectRule89 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_numberOfEpochsRule_in_principalObjectRule93 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_principalObjectRule95 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_earlyStoppingRule_in_principalObjectRule101 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_principalObjectRule103 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_learningRateRule_in_principalObjectRule105 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_principalObjectRule107 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_lossFunctionRule_in_principalObjectRule109 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBR_in_principalObjectRule112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TASK_in_taskRule124 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_taskRule126 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_taskRule130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HIDDEN_LAYERS_in_hiddenLayersRule145 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_hiddenLayersRule147 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_LB_in_hiddenLayersRule150 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_layerRule_in_hiddenLayersRule154 = new BitSet(new long[]{0x0000000001000080L});
	public static final BitSet FOLLOW_CM_in_hiddenLayersRule158 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_layerRule_in_hiddenLayersRule162 = new BitSet(new long[]{0x0000000001000080L});
	public static final BitSet FOLLOW_RB_in_hiddenLayersRule167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OUTPUT_LAYER_in_outputLayersRule179 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_outputLayersRule181 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_layerRule_in_outputLayersRule183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_layerRule198 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_NUMBER_OF_NEURONS_in_layerRule200 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_layerRule202 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_layerRule206 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_layerRule208 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTIVATION_FUNCTION_in_layerRule215 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_layerRule217 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_layerRule221 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RBR_in_layerRule225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_OF_EPOCHS_in_numberOfEpochsRule239 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_numberOfEpochsRule241 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_numberOfEpochsRule245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EARLY_STOPPING_in_earlyStoppingRule260 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_earlyStoppingRule262 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BOOLEAN_in_earlyStoppingRule266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEARNING_RATE_in_learningRateRule278 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_learningRateRule280 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FLOAT_in_learningRateRule284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOSS_FUNCTION_in_lossFunctionRule296 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CL_in_lossFunctionRule298 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_lossFunctionRule302 = new BitSet(new long[]{0x0000000000000002L});
}
