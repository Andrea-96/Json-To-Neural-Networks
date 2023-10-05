package compilerPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output {

	public String output;

	public Output() {

		output = new String();
	}

	public void getOutput() {
		
		try {
	        File file = new File("output.file");
	        FileWriter fw = new FileWriter(file);
	        fw.write(output);
	        fw.flush();
	        fw.close();
	    }
	    catch(IOException e) {
	        e.printStackTrace();
	    }
	}

	public void appendRegressionHeader() {

		output = output + "#classic env\n" + "import matplotlib.pyplot as plt\n" + "import numpy as np\n"
				+ "import pandas as pd\n" + "import tensorflow as tf\n"
				+ "from sklearn.model_selection import train_test_split\n" + "#fix fig size\n"
				+ "plt.rcParams[\"figure.figsize\"]=16,9\n\n" + "dataset = pd.read_csv('regression.csv')\n"
				+ "dataset = dataset.drop(columns=['Extracurricular Activities'])\n\n" + "X = dataset.iloc[:, :4]\n"
				+ "y = dataset.iloc[:, -1]\n\n"
				+ "X_train, X_temp, y_train, y_temp = train_test_split(X, y, test_size=0.3, random_state=42)\n"
				+ "X_val, X_test, y_val, y_test = train_test_split(X_temp, y_temp, test_size=0.5, random_state=42)\n\n"
				+ "tf.keras.utils.set_random_seed(42)\n\n" + "model = tf.keras.Sequential([\n"
				+ "		tf.keras.layers.Input(shape=X_train.shape[1:]),\n";
	}

	public void appendClassificationHeader() {

		output = output + "#classic env\n" + "import matplotlib.pyplot as plt\n" + "import numpy as np\n"
				+ "import pandas as pd\n" + "import tensorflow as tf\n"
				+ "from sklearn.model_selection import train_test_split\n" + "#fix fig size\n"
				+ "plt.rcParams[\"figure.figsize\"]=16,9\n\n" + "dataset = pd.read_csv('binary_classification.csv')\n"
				+ "dataset = dataset.drop(columns=['id'])\n\n" + "mapping = {'B':0, 'M':1}\n"
				+ "dataset['diagnosis'] = dataset['diagnosis'].map(mapping)\n" + "X = dataset.iloc[:, 1:31]\n"
				+ "y = dataset.iloc[:, 0]\n\n"
				+ "X_train, X_temp, y_train, y_temp = train_test_split(X, y, test_size=0.3, random_state=42)\n"
				+ "X_val, X_test, y_val, y_test = train_test_split(X_temp, y_temp, test_size=0.5, random_state=42)\n\n"
				+ "tf.keras.utils.set_random_seed(42)\n\n" + "model = tf.keras.Sequential([\n"
				+ "		tf.keras.layers.Input(shape=X_train.shape[1:]),\n";
	}

	public void appendHiddenLayer(int numberOfNeuron, String activationFunction) {

		output = output + "\t\ttf.keras.layers.Dense(" + String.valueOf(numberOfNeuron) + ", activation="
				+ activationFunction + "),\n";
	}

	public void appendOutputLayer(int numberOfNeuron, String activationFunction) {

		output = output + "		tf.keras.layers.Dense(" + String.valueOf(numberOfNeuron) + ", activation="
				+ activationFunction + ")\n"
				+ "])\n\nearly_stopping_cb = tf.keras.callbacks.EarlyStopping(monitor='val_loss', patience=100, "
				+ "restore_best_weights=True)\n";
	}

	public void appendLearningRate(Float learningRate) {

		output = output + "opt = tf.keras.optimizers.Adam(learning_rate=" + String.valueOf(learningRate) + ")\n";
	}

	public void appendCompileEarlyStopping(String lossFunction, String earlyStopping, int numberOfEpochs) {

		output = output + "model.compile(loss=" + lossFunction + ", optimizer=opt)\n\n"
				+ "print('LEARNING IN PROGRESS...')\n"
				+ "history = model.fit(X_train, y_train, epochs="+String.valueOf(numberOfEpochs)+", validation_data=(X_val, y_val), "
				+ "callbacks=early_stopping_cb, verbose=0)\n"
				+ "print('')\n\n";
		appendResult("early_stopping_cb.stopped_epoch + 1");
	}

	public void appendCompile(String lossFunction, int numberOfEpochs) {

		output = output + "model.compile(loss=" + lossFunction + ", optimizer=opt)\n\n"
				+ "print('LEARNING IN PROGRESS...')\n"
				+ "history = model.fit(X_train, y_train, epochs="+String.valueOf(numberOfEpochs)+", validation_data=(X_val, y_val), "
				+ "verbose=0)\n"
				+ "print('')\n\n";
		appendResult(String.valueOf(numberOfEpochs));
	}

	public void appendResult(String numberOfEpochs) {

		output = output
				+ "print('TRAIN PERFORMANCE:')\n"
				+ "print(model.evaluate(X_train, y_train, verbose=0))\n"
				+ "print('')\n\n"
				+ "print('VALIDATION PERFORMANCE:')\n"
				+ "print(model.evaluate(X_val, y_val, verbose=0))\n"
				+ "print('')\n\n"
				+ "print('TEST PERFORMANCE:')\n"
				+ "print(model.evaluate(X_test, y_test, verbose=0))\n"
				+ "print('')\n\n"
				+ "print('NEURAL NETWORK ARCHITECTURE:')\n"
				+ "model.summary()\n"
				+ "print('')\n\n"
				+ "print('LEARNING CURVES:')\n"
				+ "pd.DataFrame(history.history).plot(xlim=[0, "+numberOfEpochs+"], grid=True, xlabel=\"Epoch\", style=[\"r--\", \"b-\"])\n"
				+ "plt.show()";

	}

}
