package compilerPackage;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

public class Handler {

	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;
	public static int TASK_ERROR = 2;
	public static int NUMBER_OF_NEURONS_HIDDEN_LAYER_ERROR = 3;
	public static int NUMBER_OF_NEURON_OUTPUT_LAYER_ERROR = 4;
	public static int GROWING_NEURON_ERROR = 5;
	public static int ACTIVATION_FUNCTION_HIDDEN_LAYER_ERROR = 6;
	public static int ACTIVATION_FUNCTION_OUTPUT_LAYER_ERROR = 7;
	public static int NUMBER_OF_EPOCHS_ERROR = 8;
	public static int LEARNING_RATE_ERROR = 9;
	public static int LOSS_FUNCTION_ERROR = 10;


	String binaryClassification = "\"binary classification\"";
	String univariateRegression = "\"univariate regression\"";
	String relu = "\"relu\"";
	String sigmoid = "\"sigmoid\"";
	String linear = "\"linear\"";
	String tanh = "\"tanh\"";
	String mae = "\"mae\"";
	String binaryCrossEntropy = "\"binary_crossentropy\"";

	List<String> errorList;
	TokenStream input;
	Output output;

	public Handler(TokenStream input) {
		this.input = input;
		errorList = new ArrayList<String>();
		output = new Output();
	}

	public void getOutput() {

		output.getOutput();
	}

	public List<String> getErrorList() {
		return errorList;
	}

	// management of lexical and syntactical errors
	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;
		if (tk == null)
			tk = input.LT(-1);

		if (tk.getType() == JsonLexer.ERROR_TK)
			errMsg = "Lexical Error " + LEXICAL_ERROR;
		else
			errMsg = "Syntax Error " + SYNTAX_ERROR;

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]: " + " on token '"
				+ tk.getText() + "'.\n";

		errorList.add(errMsg);
	}

	// management of semantic errors
	void myErrorHandler(int code, Token tk) {
		String errMsg;

		// the first two cases should never happen (but just in case we insert controls)
		if (code == LEXICAL_ERROR)
			errMsg = "Fake Lexical Error " + code;
		else if (code == SYNTAX_ERROR)
			errMsg = "Fake Syntax Error " + code;

		else
			errMsg = "Semantic Error " + code;

		if (tk == null)
			tk = input.LT(-1);
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]: ";

		if (code == TASK_ERROR)
			errMsg += "The neural network is unable to performe " + tk.getText() + " task.\n"
					+ "\t\tPlease select one beetwen univariate regression or binary classification.\n";

		if (code == NUMBER_OF_NEURONS_HIDDEN_LAYER_ERROR)
			errMsg += "The number of neurons within an hidden layer must be greater than 0.\n"
					+ "\t\tThe value " + tk.getText() + " you have inserted is not correct.\n";

		if (code == NUMBER_OF_NEURON_OUTPUT_LAYER_ERROR)
			errMsg += "The number of neurons within the output layer must be 1.\n" 
		            + "\t\tThe value " + tk.getText() + " you have inserted is not correct.\n";

		if (code == GROWING_NEURON_ERROR)
			errMsg += "The number of neurons in a hidden layer at position i+1 must be less equal \n"
					+ "\t\tof the number of neuron in the hidden layer at position i.\n";

		if (code == ACTIVATION_FUNCTION_HIDDEN_LAYER_ERROR)
			errMsg += "The activation function " + tk.getText() + " is not compatible for an hidden layer.\n"
					+ "\t\tPlease select one between tanh, relu, linear or sigmoid.\n";

		if (code == ACTIVATION_FUNCTION_OUTPUT_LAYER_ERROR)
			errMsg += "The activation function " + tk.getText() + " is not compatible for the output layer or "
					+ "the task you have selected.\n\t\tPlease select relu/linear for univariate regression task or "
					+ "sigmoid for binary classification.\n";
		
		if (code == NUMBER_OF_EPOCHS_ERROR)
			errMsg += "The number of training epochs must be greater than 49 to ensure a good training.\n"
					+ "\t\tThe value " + tk.getText() +" you have inserted is not correct.\n";
		
		if (code == LEARNING_RATE_ERROR)
			errMsg += "The learning rate must be greater than 0.\n"
					+ "\t\tThe value " + tk.getText() +" you have inserted is not correct.\n";

		if (code == LOSS_FUNCTION_ERROR)
			errMsg += "The loss function " + tk.getText() + " is not compatible for the task you have selected.\n"
					+ "\t\tPlease select mae for univariate regression task or binary_crossentropy for "
					+ "binary classification.\n";

		errorList.add(errMsg);
	}

	public void checkTask(Token taskType) {

		if (taskType != null) {

			if (taskType.getText().equals(binaryClassification)) {

				output.appendClassificationHeader();

				return;
			}
			if (taskType.getText().equals(univariateRegression)) {

				output.appendRegressionHeader();

				return;
			}

			myErrorHandler(TASK_ERROR, taskType);

		}
	}

	public void checkNeurons(Token n, Token lt) {

		if (n != null && lt != null) {

			int numberOfNeurons = Integer.parseInt(n.getText());
			int layerType = lt.getType();

			if (layerType == 14 && numberOfNeurons <= 0) {

				myErrorHandler(NUMBER_OF_NEURONS_HIDDEN_LAYER_ERROR, n);
			}

			if (layerType == 23 && numberOfNeurons != 1) {

				myErrorHandler(NUMBER_OF_NEURON_OUTPUT_LAYER_ERROR, n);
			}

		}

	}

	public void checkDecreasingNeuron(Token precN, Token currN) {

		if (precN != null && currN != null) {

			int precNumberOfNeuron = Integer.parseInt(precN.getText());
			int currNumberOfNeuron = Integer.parseInt(currN.getText());

			if (currNumberOfNeuron > precNumberOfNeuron) {

				myErrorHandler(GROWING_NEURON_ERROR, null);
			}

		}

	}

	public void checkActivationFunction(Token lt, Token tt, Token af) {

		if (lt != null && tt != null && af != null) {

			int layerType = lt.getType();
			String taskType = tt.getText();
			String activationFunction = af.getText();

			if (layerType == 14) {

				if (!activationFunction.equals(relu) && !activationFunction.equals(tanh)
						&& !activationFunction.equals(sigmoid) && !activationFunction.equals(linear)) {

					myErrorHandler(ACTIVATION_FUNCTION_HIDDEN_LAYER_ERROR, af);
				}
			}

			if (layerType == 23) {

				if (taskType.equals(binaryClassification) && !activationFunction.equals(sigmoid)) {
					
					myErrorHandler(ACTIVATION_FUNCTION_OUTPUT_LAYER_ERROR, af);
				}
				if (taskType.equals(univariateRegression) && (!activationFunction.equals(relu)
						&& !activationFunction.equals(linear))) {
					
					myErrorHandler(ACTIVATION_FUNCTION_OUTPUT_LAYER_ERROR, af);
				}
			}

		}

	}
	
	public void buildLayer(Token n, Token lt, Token af) {

		if (n != null && af != null && lt != null) {

			int numberOfNeurons = Integer.parseInt(n.getText());
			int layerType = lt.getType();
			String activationFunction = af.getText();

			if (layerType == 14) {

				output.appendHiddenLayer(numberOfNeurons, activationFunction);

			}

			if (layerType == 23) {

				output.appendOutputLayer(numberOfNeurons, activationFunction);
			}

		}

	}

	public void checkNumberOfEpochs(Token ep) {

		if (ep != null) {

			if (Integer.parseInt(ep.getText()) < 50) {

				myErrorHandler(NUMBER_OF_EPOCHS_ERROR, ep);
			}

		}
	}
	
	public void checkLearningRate(Token lr) {

		if (lr != null) {

			Float learningRate = Float.parseFloat(lr.getText());

			if (learningRate <= 0) {

				myErrorHandler(LEARNING_RATE_ERROR, lr);

			} else {
				output.appendLearningRate(learningRate);
			}

		}

	}



	public void checkLossFunction(Token tt, Token lf, Token es, Token ep) {

		if (tt != null && lf != null && es != null && ep != null) {

			String taskType = tt.getText();
			String lossFunction = lf.getText();
			String earlyStopping = es.getText();
			int numberOfEpochs = Integer.parseInt(ep.getText());

			if (taskType.equals(binaryClassification)) {

				if (!lossFunction.equals(binaryCrossEntropy)) {

					myErrorHandler(LOSS_FUNCTION_ERROR, lf);
					return;
				}
			}

			if (taskType.equals(univariateRegression)) {

				if (!lossFunction.equals(mae)) {

					myErrorHandler(LOSS_FUNCTION_ERROR, lf);
					return;
				}
			}

			if (earlyStopping.equals("true")) {

				output.appendCompileEarlyStopping(lossFunction, earlyStopping, numberOfEpochs);

			} else {
				output.appendCompile(lossFunction, numberOfEpochs);

			}

		}

	}



}
