package testerPackage;

import java.io.FileReader;
import java.io.IOException;

import compilerPackage.JsonLexer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

public class ScannerTester {

	public static void main(String[] args) throws IOException {

		// input file
		String fileIn = "input.file";

		Token tk;
		int i;

		try {
			System.out.println("Test ANTLR lexer");

			// create the scanner and pass it an input stream
			JsonLexer lexer = new JsonLexer(new ANTLRReaderStream(new FileReader(fileIn)));
			i = 1;

			// loop that scans the stream from start to finish, each time requesting the
			// scanner to provide the
			// next token (nextToken method) until meet EOF of the input
			while ((tk = lexer.nextToken()).getType() != JsonLexer.EOF) {

				// retrieves informations about the detected tokens
				int line = tk.getLine();
				int col = tk.getCharPositionInLine() + 1;
				int type = tk.getType();
				String text = tk.getText();

				// note: activate this control if you want to discard the hidden tokens
				if (tk.getChannel() != JsonLexer.HIDDEN)
					if (tk.getType() != JsonLexer.ERROR_TK)

						// print the information about current token
						System.out.println("Token " + i++ + ": " + "(" + line + "," + col + ")\t\t" + "TokenType: "
								+ type + "\t" + text);
					else

						// print informations about the error token on standard error
						System.err.println("Token " + i++ + ": " + "(" + line + "," + col + ")\t\t" + "TokenType: "
								+ type + "\t" + text + " ERRORE!");

			}

		} catch (Exception e) {
			System.out.println("Test ANTLR aborted");
			e.printStackTrace();
		}

	}

}
