package testerPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import compilerPackage.Handler;
import compilerPackage.JsonLexer;
import compilerPackage.JsonParser;

public class ParserTester {

	static JsonParser parser;

	public static void main(String[] args) {
		CommonTokenStream tokens;
		String fileIn = "input.file";

		try {
			System.out.println("Parsing with ANTLR lexer");
			System.out.println("-----------------------");

			// create the lexer and pass it the document to analyze the lexer
			JsonLexer lexer = new JsonLexer(new ANTLRReaderStream(new FileReader(fileIn)));

			// create a stream (channel) of token for communication between lexer and parser
			tokens = new CommonTokenStream(lexer);

			// create the parser
			parser = new JsonParser(tokens);

			// launch the syntactic analysis of the incoming document
			parser.parseJson();

			// check of result
			Handler h = parser.getHandler();
			if (h.getErrorList().size() == 0) {
				System.out.println("Parsing completed successfully");
				//System.out.println("Neural Network Python Code:\n");
				h.getOutput();

			} else
				for (int i = 0; i < h.getErrorList().size(); i++)
					System.err.println("Errore " + (i + 1) + ":\t" + h.getErrorList().get(i) + "");

		} catch (Exception e) {
			System.out.println("Parsing with ANTLR aborted\n\n");
			e.printStackTrace();
		}

	}

}
