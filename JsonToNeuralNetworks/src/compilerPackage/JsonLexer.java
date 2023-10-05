// $ANTLR 3.5.1 /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g 2023-08-31 15:35:03


package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JsonLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JsonLexer() {} 
	public JsonLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JsonLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g"; }

	// $ANTLR start "TASK"
	public final void mTASK() throws RecognitionException {
		try {
			int _type = TASK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:140:8: ( '\"task\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:140:9: '\"task\"'
			{
			match("\"task\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TASK"

	// $ANTLR start "HIDDEN_LAYERS"
	public final void mHIDDEN_LAYERS() throws RecognitionException {
		try {
			int _type = HIDDEN_LAYERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:141:16: ( '\"hidden_layers\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:141:17: '\"hidden_layers\"'
			{
			match("\"hidden_layers\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HIDDEN_LAYERS"

	// $ANTLR start "NUMBER_OF_NEURONS"
	public final void mNUMBER_OF_NEURONS() throws RecognitionException {
		try {
			int _type = NUMBER_OF_NEURONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:142:19: ( '\"neurons\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:142:20: '\"neurons\"'
			{
			match("\"neurons\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER_OF_NEURONS"

	// $ANTLR start "ACTIVATION_FUNCTION"
	public final void mACTIVATION_FUNCTION() throws RecognitionException {
		try {
			int _type = ACTIVATION_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:143:21: ( '\"activation_function\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:143:22: '\"activation_function\"'
			{
			match("\"activation_function\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACTIVATION_FUNCTION"

	// $ANTLR start "OUTPUT_LAYER"
	public final void mOUTPUT_LAYER() throws RecognitionException {
		try {
			int _type = OUTPUT_LAYER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:144:15: ( '\"output_layer\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:144:16: '\"output_layer\"'
			{
			match("\"output_layer\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUTPUT_LAYER"

	// $ANTLR start "NUMBER_OF_EPOCHS"
	public final void mNUMBER_OF_EPOCHS() throws RecognitionException {
		try {
			int _type = NUMBER_OF_EPOCHS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:145:18: ( '\"epochs\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:145:19: '\"epochs\"'
			{
			match("\"epochs\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER_OF_EPOCHS"

	// $ANTLR start "EARLY_STOPPING"
	public final void mEARLY_STOPPING() throws RecognitionException {
		try {
			int _type = EARLY_STOPPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:146:17: ( '\"early_stopping\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:146:18: '\"early_stopping\"'
			{
			match("\"early_stopping\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EARLY_STOPPING"

	// $ANTLR start "LEARNING_RATE"
	public final void mLEARNING_RATE() throws RecognitionException {
		try {
			int _type = LEARNING_RATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:147:16: ( '\"learning_rate\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:147:17: '\"learning_rate\"'
			{
			match("\"learning_rate\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEARNING_RATE"

	// $ANTLR start "LOSS_FUNCTION"
	public final void mLOSS_FUNCTION() throws RecognitionException {
		try {
			int _type = LOSS_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:148:16: ( '\"loss_function\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:148:17: '\"loss_function\"'
			{
			match("\"loss_function\""); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOSS_FUNCTION"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:152:11: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:152:12: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:155:9: ( '0' .. '9' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:157:11: ( ( '-' )? ( DIGIT )+ )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:157:12: ( '-' )? ( DIGIT )+
			{
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:157:12: ( '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:157:12: '-'
					{
					match('-'); 
					}
					break;

			}

			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:157:17: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:158:9: ( ( INTEGER ) DOT ( DIGIT )+ )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:158:10: ( INTEGER ) DOT ( DIGIT )+
			{
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:158:10: ( INTEGER )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:158:11: INTEGER
			{
			mINTEGER(); 

			}

			mDOT(); 

			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:158:24: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:159:24: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:159:25: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:159:28: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\\') ) {
					alt4=1;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:159:29: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:159:37: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:160:11: ( 'true' | 'false' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='t') ) {
				alt5=1;
			}
			else if ( (LA5_0=='f') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:160:12: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:160:19: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:161:8: ( 'null' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:161:9: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "CL"
	public final void mCL() throws RecognitionException {
		try {
			int _type = CL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:164:6: ( ':' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:164:7: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL"

	// $ANTLR start "CM"
	public final void mCM() throws RecognitionException {
		try {
			int _type = CM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:165:7: ( ',' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:165:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CM"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:166:8: ( '.' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:166:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:169:6: ( '[' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:169:7: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:170:6: ( ']' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:170:7: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "LBR"
	public final void mLBR() throws RecognitionException {
		try {
			int _type = LBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:171:7: ( '{' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:171:8: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBR"

	// $ANTLR start "RBR"
	public final void mRBR() throws RecognitionException {
		try {
			int _type = RBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:172:7: ( '}' )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:172:8: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:175:6: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:175:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:175:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ERROR_TK"
	public final void mERROR_TK() throws RecognitionException {
		try {
			int _type = ERROR_TK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:178:11: ( . )
			// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:178:12: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TK"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:8: ( TASK | HIDDEN_LAYERS | NUMBER_OF_NEURONS | ACTIVATION_FUNCTION | OUTPUT_LAYER | NUMBER_OF_EPOCHS | EARLY_STOPPING | LEARNING_RATE | LOSS_FUNCTION | INTEGER | FLOAT | STRING | BOOLEAN | NULL | CL | CM | DOT | LB | RB | LBR | RBR | WS | ERROR_TK )
		int alt7=23;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:10: TASK
				{
				mTASK(); 

				}
				break;
			case 2 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:15: HIDDEN_LAYERS
				{
				mHIDDEN_LAYERS(); 

				}
				break;
			case 3 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:29: NUMBER_OF_NEURONS
				{
				mNUMBER_OF_NEURONS(); 

				}
				break;
			case 4 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:47: ACTIVATION_FUNCTION
				{
				mACTIVATION_FUNCTION(); 

				}
				break;
			case 5 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:67: OUTPUT_LAYER
				{
				mOUTPUT_LAYER(); 

				}
				break;
			case 6 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:80: NUMBER_OF_EPOCHS
				{
				mNUMBER_OF_EPOCHS(); 

				}
				break;
			case 7 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:97: EARLY_STOPPING
				{
				mEARLY_STOPPING(); 

				}
				break;
			case 8 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:112: LEARNING_RATE
				{
				mLEARNING_RATE(); 

				}
				break;
			case 9 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:126: LOSS_FUNCTION
				{
				mLOSS_FUNCTION(); 

				}
				break;
			case 10 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:140: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 11 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:148: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 12 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:154: STRING
				{
				mSTRING(); 

				}
				break;
			case 13 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:161: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 14 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:169: NULL
				{
				mNULL(); 

				}
				break;
			case 15 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:174: CL
				{
				mCL(); 

				}
				break;
			case 16 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:177: CM
				{
				mCM(); 

				}
				break;
			case 17 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:180: DOT
				{
				mDOT(); 

				}
				break;
			case 18 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:184: LB
				{
				mLB(); 

				}
				break;
			case 19 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:187: RB
				{
				mRB(); 

				}
				break;
			case 20 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:190: LBR
				{
				mLBR(); 

				}
				break;
			case 21 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:194: RBR
				{
				mRBR(); 

				}
				break;
			case 22 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:198: WS
				{
				mWS(); 

				}
				break;
			case 23 :
				// /Users/andreatresoldi/progetto linguaggi/MIO progetto/JsonToNeuralNetworks/src/compilerPackage/Json.g:1:201: ERROR_TK
				{
				mERROR_TK(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\2\17\1\31\3\17\21\uffff\1\31\172\uffff";
	static final String DFA7_eofS =
		"\u0093\uffff";
	static final String DFA7_minS =
		"\2\0\1\60\1\56\1\162\1\141\1\165\11\uffff\7\0\1\uffff\1\56\14\uffff\33"+
		"\0\1\uffff\10\0\1\uffff\14\0\1\uffff\4\0\1\uffff\2\0\1\uffff\4\0\1\uffff"+
		"\31\0\1\uffff\3\0\1\uffff\1\0\1\uffff\1\0\3\uffff\1\0\3\uffff\1\0\1\uffff"+
		"\3\0\2\uffff";
	static final String DFA7_maxS =
		"\2\uffff\2\71\1\162\1\141\1\165\11\uffff\7\uffff\1\uffff\1\71\14\uffff"+
		"\33\uffff\1\uffff\10\uffff\1\uffff\14\uffff\1\uffff\4\uffff\1\uffff\2"+
		"\uffff\1\uffff\4\uffff\1\uffff\31\uffff\1\uffff\3\uffff\1\uffff\1\uffff"+
		"\1\uffff\1\uffff\3\uffff\1\uffff\3\uffff\1\uffff\1\uffff\3\uffff\2\uffff";
	static final String DFA7_acceptS =
		"\7\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\7\uffff\1\14\1\uffff"+
		"\1\12\1\13\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\33\uffff"+
		"\1\1\10\uffff\1\1\14\uffff\1\6\4\uffff\1\3\2\uffff\1\6\4\uffff\1\3\31"+
		"\uffff\1\5\3\uffff\1\2\1\uffff\1\5\1\uffff\1\10\1\11\1\2\1\uffff\1\7\1"+
		"\10\1\11\1\uffff\1\7\3\uffff\2\4";
	static final String DFA7_specialS =
		"\1\77\1\72\16\uffff\1\1\1\5\1\22\1\32\1\55\1\0\1\31\16\uffff\1\2\1\6\1"+
		"\23\1\33\1\56\1\71\1\100\1\115\1\131\1\3\1\7\1\24\1\34\1\57\1\73\1\101"+
		"\1\116\1\132\1\4\1\10\1\25\1\35\1\60\1\74\1\102\1\117\1\133\1\uffff\1"+
		"\11\1\26\1\36\1\61\1\75\1\103\1\120\1\134\1\uffff\1\12\1\27\1\37\1\62"+
		"\1\76\1\104\1\121\1\135\1\13\1\30\1\40\1\63\1\uffff\1\105\1\122\1\136"+
		"\1\14\1\uffff\1\41\1\64\1\uffff\1\106\1\123\1\137\1\15\1\uffff\1\42\1"+
		"\65\1\107\1\124\1\140\1\16\1\43\1\66\1\110\1\125\1\141\1\17\1\44\1\67"+
		"\1\111\1\126\1\142\1\20\1\45\1\70\1\112\1\127\1\143\1\21\1\46\1\uffff"+
		"\1\113\1\130\1\144\1\uffff\1\47\1\uffff\1\114\3\uffff\1\50\3\uffff\1\51"+
		"\1\uffff\1\52\1\53\1\54\2\uffff}>";
	static final String[] DFA7_transitionS = {
			"\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\1\11\17\1\10\1\2\1\11\1\17\12"+
			"\3\1\7\40\17\1\12\1\17\1\13\10\17\1\5\7\17\1\6\5\17\1\4\6\17\1\14\1\17"+
			"\1\15\uff82\17",
			"\141\27\1\23\3\27\1\25\2\27\1\21\3\27\1\26\1\27\1\22\1\24\4\27\1\20"+
			"\uff8b\27",
			"\12\30",
			"\1\32\1\uffff\12\30",
			"\1\33",
			"\1\33",
			"\1\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\141\27\1\45\uff9e\27",
			"\151\27\1\46\uff96\27",
			"\145\27\1\47\uff9a\27",
			"\143\27\1\50\uff9c\27",
			"\165\27\1\51\uff8a\27",
			"\141\27\1\53\16\27\1\52\uff8f\27",
			"\145\27\1\54\11\27\1\55\uff90\27",
			"",
			"\1\32\1\uffff\12\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\163\27\1\56\uff8c\27",
			"\144\27\1\57\uff9b\27",
			"\165\27\1\60\uff8a\27",
			"\164\27\1\61\uff8b\27",
			"\164\27\1\62\uff8b\27",
			"\157\27\1\63\uff90\27",
			"\162\27\1\64\uff8d\27",
			"\141\27\1\65\uff9e\27",
			"\163\27\1\66\uff8c\27",
			"\153\27\1\67\uff94\27",
			"\144\27\1\70\uff9b\27",
			"\162\27\1\71\uff8d\27",
			"\151\27\1\72\uff96\27",
			"\160\27\1\73\uff8f\27",
			"\143\27\1\74\uff9c\27",
			"\154\27\1\75\uff93\27",
			"\162\27\1\76\uff8d\27",
			"\163\27\1\77\uff8c\27",
			"\42\27\1\100\uffdd\27",
			"\145\27\1\101\uff9a\27",
			"\157\27\1\102\uff90\27",
			"\166\27\1\103\uff89\27",
			"\165\27\1\104\uff8a\27",
			"\150\27\1\105\uff97\27",
			"\171\27\1\106\uff86\27",
			"\156\27\1\107\uff91\27",
			"\137\27\1\110\uffa0\27",
			"",
			"\156\27\1\112\uff91\27",
			"\156\27\1\113\uff91\27",
			"\141\27\1\114\uff9e\27",
			"\164\27\1\115\uff8b\27",
			"\163\27\1\116\uff8c\27",
			"\137\27\1\117\uffa0\27",
			"\151\27\1\120\uff96\27",
			"\146\27\1\121\uff99\27",
			"",
			"\137\27\1\122\uffa0\27",
			"\163\27\1\123\uff8c\27",
			"\164\27\1\124\uff8b\27",
			"\137\27\1\125\uffa0\27",
			"\42\27\1\126\uffdd\27",
			"\163\27\1\127\uff8c\27",
			"\156\27\1\130\uff91\27",
			"\165\27\1\131\uff8a\27",
			"\154\27\1\132\uff93\27",
			"\42\27\1\133\uffdd\27",
			"\151\27\1\134\uff96\27",
			"\154\27\1\135\uff93\27",
			"",
			"\164\27\1\137\uff8b\27",
			"\147\27\1\140\uff98\27",
			"\156\27\1\141\uff91\27",
			"\141\27\1\142\uff9e\27",
			"",
			"\157\27\1\144\uff90\27",
			"\141\27\1\145\uff9e\27",
			"",
			"\157\27\1\146\uff90\27",
			"\137\27\1\147\uffa0\27",
			"\143\27\1\150\uff9c\27",
			"\171\27\1\151\uff86\27",
			"",
			"\156\27\1\152\uff91\27",
			"\171\27\1\153\uff86\27",
			"\160\27\1\154\uff8f\27",
			"\162\27\1\155\uff8d\27",
			"\164\27\1\156\uff8b\27",
			"\145\27\1\157\uff9a\27",
			"\137\27\1\160\uffa0\27",
			"\145\27\1\161\uff9a\27",
			"\160\27\1\162\uff8f\27",
			"\141\27\1\163\uff9e\27",
			"\151\27\1\164\uff96\27",
			"\162\27\1\165\uff8d\27",
			"\146\27\1\166\uff99\27",
			"\162\27\1\167\uff8d\27",
			"\151\27\1\170\uff96\27",
			"\164\27\1\171\uff8b\27",
			"\157\27\1\172\uff90\27",
			"\163\27\1\173\uff8c\27",
			"\165\27\1\174\uff8a\27",
			"\42\27\1\175\uffdd\27",
			"\156\27\1\176\uff91\27",
			"\145\27\1\177\uff9a\27",
			"\156\27\1\u0080\uff91\27",
			"\42\27\1\u0081\uffdd\27",
			"\156\27\1\u0082\uff91\27",
			"",
			"\147\27\1\u0084\uff98\27",
			"\42\27\1\u0085\uffdd\27",
			"\42\27\1\u0086\uffdd\27",
			"",
			"\143\27\1\u0088\uff9c\27",
			"",
			"\42\27\1\u0089\uffdd\27",
			"",
			"",
			"",
			"\164\27\1\u008c\uff8b\27",
			"",
			"",
			"",
			"\151\27\1\u008e\uff96\27",
			"",
			"\157\27\1\u008f\uff90\27",
			"\156\27\1\u0090\uff91\27",
			"\42\27\1\u0091\uffdd\27",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( TASK | HIDDEN_LAYERS | NUMBER_OF_NEURONS | ACTIVATION_FUNCTION | OUTPUT_LAYER | NUMBER_OF_EPOCHS | EARLY_STOPPING | LEARNING_RATE | LOSS_FUNCTION | INTEGER | FLOAT | STRING | BOOLEAN | NULL | CL | CM | DOT | LB | RB | LBR | RBR | WS | ERROR_TK );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA7_21 = input.LA(1);
						s = -1;
						if ( (LA7_21=='p') ) {s = 42;}
						else if ( (LA7_21=='a') ) {s = 43;}
						else if ( ((LA7_21 >= '\u0000' && LA7_21 <= '`')||(LA7_21 >= 'b' && LA7_21 <= 'o')||(LA7_21 >= 'q' && LA7_21 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA7_16 = input.LA(1);
						s = -1;
						if ( (LA7_16=='a') ) {s = 37;}
						else if ( ((LA7_16 >= '\u0000' && LA7_16 <= '`')||(LA7_16 >= 'b' && LA7_16 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA7_37 = input.LA(1);
						s = -1;
						if ( (LA7_37=='s') ) {s = 46;}
						else if ( ((LA7_37 >= '\u0000' && LA7_37 <= 'r')||(LA7_37 >= 't' && LA7_37 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA7_46 = input.LA(1);
						s = -1;
						if ( (LA7_46=='k') ) {s = 55;}
						else if ( ((LA7_46 >= '\u0000' && LA7_46 <= 'j')||(LA7_46 >= 'l' && LA7_46 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA7_55 = input.LA(1);
						s = -1;
						if ( (LA7_55=='\"') ) {s = 64;}
						else if ( ((LA7_55 >= '\u0000' && LA7_55 <= '!')||(LA7_55 >= '#' && LA7_55 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA7_17 = input.LA(1);
						s = -1;
						if ( (LA7_17=='i') ) {s = 38;}
						else if ( ((LA7_17 >= '\u0000' && LA7_17 <= 'h')||(LA7_17 >= 'j' && LA7_17 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA7_38 = input.LA(1);
						s = -1;
						if ( (LA7_38=='d') ) {s = 47;}
						else if ( ((LA7_38 >= '\u0000' && LA7_38 <= 'c')||(LA7_38 >= 'e' && LA7_38 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA7_47 = input.LA(1);
						s = -1;
						if ( (LA7_47=='d') ) {s = 56;}
						else if ( ((LA7_47 >= '\u0000' && LA7_47 <= 'c')||(LA7_47 >= 'e' && LA7_47 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA7_56 = input.LA(1);
						s = -1;
						if ( (LA7_56=='e') ) {s = 65;}
						else if ( ((LA7_56 >= '\u0000' && LA7_56 <= 'd')||(LA7_56 >= 'f' && LA7_56 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA7_65 = input.LA(1);
						s = -1;
						if ( (LA7_65=='n') ) {s = 74;}
						else if ( ((LA7_65 >= '\u0000' && LA7_65 <= 'm')||(LA7_65 >= 'o' && LA7_65 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA7_74 = input.LA(1);
						s = -1;
						if ( (LA7_74=='_') ) {s = 82;}
						else if ( ((LA7_74 >= '\u0000' && LA7_74 <= '^')||(LA7_74 >= '`' && LA7_74 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA7_82 = input.LA(1);
						s = -1;
						if ( (LA7_82=='l') ) {s = 90;}
						else if ( ((LA7_82 >= '\u0000' && LA7_82 <= 'k')||(LA7_82 >= 'm' && LA7_82 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA7_90 = input.LA(1);
						s = -1;
						if ( (LA7_90=='a') ) {s = 98;}
						else if ( ((LA7_90 >= '\u0000' && LA7_90 <= '`')||(LA7_90 >= 'b' && LA7_90 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA7_98 = input.LA(1);
						s = -1;
						if ( (LA7_98=='y') ) {s = 105;}
						else if ( ((LA7_98 >= '\u0000' && LA7_98 <= 'x')||(LA7_98 >= 'z' && LA7_98 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA7_105 = input.LA(1);
						s = -1;
						if ( (LA7_105=='e') ) {s = 111;}
						else if ( ((LA7_105 >= '\u0000' && LA7_105 <= 'd')||(LA7_105 >= 'f' && LA7_105 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA7_111 = input.LA(1);
						s = -1;
						if ( (LA7_111=='r') ) {s = 117;}
						else if ( ((LA7_111 >= '\u0000' && LA7_111 <= 'q')||(LA7_111 >= 's' && LA7_111 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA7_117 = input.LA(1);
						s = -1;
						if ( (LA7_117=='s') ) {s = 123;}
						else if ( ((LA7_117 >= '\u0000' && LA7_117 <= 'r')||(LA7_117 >= 't' && LA7_117 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA7_123 = input.LA(1);
						s = -1;
						if ( (LA7_123=='\"') ) {s = 129;}
						else if ( ((LA7_123 >= '\u0000' && LA7_123 <= '!')||(LA7_123 >= '#' && LA7_123 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA7_18 = input.LA(1);
						s = -1;
						if ( (LA7_18=='e') ) {s = 39;}
						else if ( ((LA7_18 >= '\u0000' && LA7_18 <= 'd')||(LA7_18 >= 'f' && LA7_18 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA7_39 = input.LA(1);
						s = -1;
						if ( (LA7_39=='u') ) {s = 48;}
						else if ( ((LA7_39 >= '\u0000' && LA7_39 <= 't')||(LA7_39 >= 'v' && LA7_39 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA7_48 = input.LA(1);
						s = -1;
						if ( (LA7_48=='r') ) {s = 57;}
						else if ( ((LA7_48 >= '\u0000' && LA7_48 <= 'q')||(LA7_48 >= 's' && LA7_48 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA7_57 = input.LA(1);
						s = -1;
						if ( (LA7_57=='o') ) {s = 66;}
						else if ( ((LA7_57 >= '\u0000' && LA7_57 <= 'n')||(LA7_57 >= 'p' && LA7_57 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA7_66 = input.LA(1);
						s = -1;
						if ( (LA7_66=='n') ) {s = 75;}
						else if ( ((LA7_66 >= '\u0000' && LA7_66 <= 'm')||(LA7_66 >= 'o' && LA7_66 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA7_75 = input.LA(1);
						s = -1;
						if ( (LA7_75=='s') ) {s = 83;}
						else if ( ((LA7_75 >= '\u0000' && LA7_75 <= 'r')||(LA7_75 >= 't' && LA7_75 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA7_83 = input.LA(1);
						s = -1;
						if ( (LA7_83=='\"') ) {s = 91;}
						else if ( ((LA7_83 >= '\u0000' && LA7_83 <= '!')||(LA7_83 >= '#' && LA7_83 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA7_22 = input.LA(1);
						s = -1;
						if ( (LA7_22=='e') ) {s = 44;}
						else if ( (LA7_22=='o') ) {s = 45;}
						else if ( ((LA7_22 >= '\u0000' && LA7_22 <= 'd')||(LA7_22 >= 'f' && LA7_22 <= 'n')||(LA7_22 >= 'p' && LA7_22 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA7_19 = input.LA(1);
						s = -1;
						if ( (LA7_19=='c') ) {s = 40;}
						else if ( ((LA7_19 >= '\u0000' && LA7_19 <= 'b')||(LA7_19 >= 'd' && LA7_19 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA7_40 = input.LA(1);
						s = -1;
						if ( (LA7_40=='t') ) {s = 49;}
						else if ( ((LA7_40 >= '\u0000' && LA7_40 <= 's')||(LA7_40 >= 'u' && LA7_40 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA7_49 = input.LA(1);
						s = -1;
						if ( (LA7_49=='i') ) {s = 58;}
						else if ( ((LA7_49 >= '\u0000' && LA7_49 <= 'h')||(LA7_49 >= 'j' && LA7_49 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA7_58 = input.LA(1);
						s = -1;
						if ( (LA7_58=='v') ) {s = 67;}
						else if ( ((LA7_58 >= '\u0000' && LA7_58 <= 'u')||(LA7_58 >= 'w' && LA7_58 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA7_67 = input.LA(1);
						s = -1;
						if ( (LA7_67=='a') ) {s = 76;}
						else if ( ((LA7_67 >= '\u0000' && LA7_67 <= '`')||(LA7_67 >= 'b' && LA7_67 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA7_76 = input.LA(1);
						s = -1;
						if ( (LA7_76=='t') ) {s = 84;}
						else if ( ((LA7_76 >= '\u0000' && LA7_76 <= 's')||(LA7_76 >= 'u' && LA7_76 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA7_84 = input.LA(1);
						s = -1;
						if ( (LA7_84=='i') ) {s = 92;}
						else if ( ((LA7_84 >= '\u0000' && LA7_84 <= 'h')||(LA7_84 >= 'j' && LA7_84 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA7_92 = input.LA(1);
						s = -1;
						if ( (LA7_92=='o') ) {s = 100;}
						else if ( ((LA7_92 >= '\u0000' && LA7_92 <= 'n')||(LA7_92 >= 'p' && LA7_92 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA7_100 = input.LA(1);
						s = -1;
						if ( (LA7_100=='n') ) {s = 106;}
						else if ( ((LA7_100 >= '\u0000' && LA7_100 <= 'm')||(LA7_100 >= 'o' && LA7_100 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA7_106 = input.LA(1);
						s = -1;
						if ( (LA7_106=='_') ) {s = 112;}
						else if ( ((LA7_106 >= '\u0000' && LA7_106 <= '^')||(LA7_106 >= '`' && LA7_106 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA7_112 = input.LA(1);
						s = -1;
						if ( (LA7_112=='f') ) {s = 118;}
						else if ( ((LA7_112 >= '\u0000' && LA7_112 <= 'e')||(LA7_112 >= 'g' && LA7_112 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA7_118 = input.LA(1);
						s = -1;
						if ( (LA7_118=='u') ) {s = 124;}
						else if ( ((LA7_118 >= '\u0000' && LA7_118 <= 't')||(LA7_118 >= 'v' && LA7_118 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA7_124 = input.LA(1);
						s = -1;
						if ( (LA7_124=='n') ) {s = 130;}
						else if ( ((LA7_124 >= '\u0000' && LA7_124 <= 'm')||(LA7_124 >= 'o' && LA7_124 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA7_130 = input.LA(1);
						s = -1;
						if ( (LA7_130=='c') ) {s = 136;}
						else if ( ((LA7_130 >= '\u0000' && LA7_130 <= 'b')||(LA7_130 >= 'd' && LA7_130 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA7_136 = input.LA(1);
						s = -1;
						if ( (LA7_136=='t') ) {s = 140;}
						else if ( ((LA7_136 >= '\u0000' && LA7_136 <= 's')||(LA7_136 >= 'u' && LA7_136 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA7_140 = input.LA(1);
						s = -1;
						if ( (LA7_140=='i') ) {s = 142;}
						else if ( ((LA7_140 >= '\u0000' && LA7_140 <= 'h')||(LA7_140 >= 'j' && LA7_140 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA7_142 = input.LA(1);
						s = -1;
						if ( (LA7_142=='o') ) {s = 143;}
						else if ( ((LA7_142 >= '\u0000' && LA7_142 <= 'n')||(LA7_142 >= 'p' && LA7_142 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA7_143 = input.LA(1);
						s = -1;
						if ( (LA7_143=='n') ) {s = 144;}
						else if ( ((LA7_143 >= '\u0000' && LA7_143 <= 'm')||(LA7_143 >= 'o' && LA7_143 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA7_144 = input.LA(1);
						s = -1;
						if ( (LA7_144=='\"') ) {s = 145;}
						else if ( ((LA7_144 >= '\u0000' && LA7_144 <= '!')||(LA7_144 >= '#' && LA7_144 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA7_20 = input.LA(1);
						s = -1;
						if ( (LA7_20=='u') ) {s = 41;}
						else if ( ((LA7_20 >= '\u0000' && LA7_20 <= 't')||(LA7_20 >= 'v' && LA7_20 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA7_41 = input.LA(1);
						s = -1;
						if ( (LA7_41=='t') ) {s = 50;}
						else if ( ((LA7_41 >= '\u0000' && LA7_41 <= 's')||(LA7_41 >= 'u' && LA7_41 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA7_50 = input.LA(1);
						s = -1;
						if ( (LA7_50=='p') ) {s = 59;}
						else if ( ((LA7_50 >= '\u0000' && LA7_50 <= 'o')||(LA7_50 >= 'q' && LA7_50 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA7_59 = input.LA(1);
						s = -1;
						if ( (LA7_59=='u') ) {s = 68;}
						else if ( ((LA7_59 >= '\u0000' && LA7_59 <= 't')||(LA7_59 >= 'v' && LA7_59 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA7_68 = input.LA(1);
						s = -1;
						if ( (LA7_68=='t') ) {s = 77;}
						else if ( ((LA7_68 >= '\u0000' && LA7_68 <= 's')||(LA7_68 >= 'u' && LA7_68 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA7_77 = input.LA(1);
						s = -1;
						if ( (LA7_77=='_') ) {s = 85;}
						else if ( ((LA7_77 >= '\u0000' && LA7_77 <= '^')||(LA7_77 >= '`' && LA7_77 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA7_85 = input.LA(1);
						s = -1;
						if ( (LA7_85=='l') ) {s = 93;}
						else if ( ((LA7_85 >= '\u0000' && LA7_85 <= 'k')||(LA7_85 >= 'm' && LA7_85 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA7_93 = input.LA(1);
						s = -1;
						if ( (LA7_93=='a') ) {s = 101;}
						else if ( ((LA7_93 >= '\u0000' && LA7_93 <= '`')||(LA7_93 >= 'b' && LA7_93 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA7_101 = input.LA(1);
						s = -1;
						if ( (LA7_101=='y') ) {s = 107;}
						else if ( ((LA7_101 >= '\u0000' && LA7_101 <= 'x')||(LA7_101 >= 'z' && LA7_101 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA7_107 = input.LA(1);
						s = -1;
						if ( (LA7_107=='e') ) {s = 113;}
						else if ( ((LA7_107 >= '\u0000' && LA7_107 <= 'd')||(LA7_107 >= 'f' && LA7_107 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA7_113 = input.LA(1);
						s = -1;
						if ( (LA7_113=='r') ) {s = 119;}
						else if ( ((LA7_113 >= '\u0000' && LA7_113 <= 'q')||(LA7_113 >= 's' && LA7_113 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA7_119 = input.LA(1);
						s = -1;
						if ( (LA7_119=='\"') ) {s = 125;}
						else if ( ((LA7_119 >= '\u0000' && LA7_119 <= '!')||(LA7_119 >= '#' && LA7_119 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA7_42 = input.LA(1);
						s = -1;
						if ( (LA7_42=='o') ) {s = 51;}
						else if ( ((LA7_42 >= '\u0000' && LA7_42 <= 'n')||(LA7_42 >= 'p' && LA7_42 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA7_1 = input.LA(1);
						s = -1;
						if ( (LA7_1=='t') ) {s = 16;}
						else if ( (LA7_1=='h') ) {s = 17;}
						else if ( (LA7_1=='n') ) {s = 18;}
						else if ( (LA7_1=='a') ) {s = 19;}
						else if ( (LA7_1=='o') ) {s = 20;}
						else if ( (LA7_1=='e') ) {s = 21;}
						else if ( (LA7_1=='l') ) {s = 22;}
						else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '`')||(LA7_1 >= 'b' && LA7_1 <= 'd')||(LA7_1 >= 'f' && LA7_1 <= 'g')||(LA7_1 >= 'i' && LA7_1 <= 'k')||LA7_1=='m'||(LA7_1 >= 'p' && LA7_1 <= 's')||(LA7_1 >= 'u' && LA7_1 <= '\uFFFF')) ) {s = 23;}
						else s = 15;
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA7_51 = input.LA(1);
						s = -1;
						if ( (LA7_51=='c') ) {s = 60;}
						else if ( ((LA7_51 >= '\u0000' && LA7_51 <= 'b')||(LA7_51 >= 'd' && LA7_51 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA7_60 = input.LA(1);
						s = -1;
						if ( (LA7_60=='h') ) {s = 69;}
						else if ( ((LA7_60 >= '\u0000' && LA7_60 <= 'g')||(LA7_60 >= 'i' && LA7_60 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA7_69 = input.LA(1);
						s = -1;
						if ( (LA7_69=='s') ) {s = 78;}
						else if ( ((LA7_69 >= '\u0000' && LA7_69 <= 'r')||(LA7_69 >= 't' && LA7_69 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA7_78 = input.LA(1);
						s = -1;
						if ( (LA7_78=='\"') ) {s = 86;}
						else if ( ((LA7_78 >= '\u0000' && LA7_78 <= '!')||(LA7_78 >= '#' && LA7_78 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA7_0 = input.LA(1);
						s = -1;
						if ( (LA7_0=='\"') ) {s = 1;}
						else if ( (LA7_0=='-') ) {s = 2;}
						else if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {s = 3;}
						else if ( (LA7_0=='t') ) {s = 4;}
						else if ( (LA7_0=='f') ) {s = 5;}
						else if ( (LA7_0=='n') ) {s = 6;}
						else if ( (LA7_0==':') ) {s = 7;}
						else if ( (LA7_0==',') ) {s = 8;}
						else if ( (LA7_0=='.') ) {s = 9;}
						else if ( (LA7_0=='[') ) {s = 10;}
						else if ( (LA7_0==']') ) {s = 11;}
						else if ( (LA7_0=='{') ) {s = 12;}
						else if ( (LA7_0=='}') ) {s = 13;}
						else if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {s = 14;}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\b')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\u001F')||LA7_0=='!'||(LA7_0 >= '#' && LA7_0 <= '+')||LA7_0=='/'||(LA7_0 >= ';' && LA7_0 <= 'Z')||LA7_0=='\\'||(LA7_0 >= '^' && LA7_0 <= 'e')||(LA7_0 >= 'g' && LA7_0 <= 'm')||(LA7_0 >= 'o' && LA7_0 <= 's')||(LA7_0 >= 'u' && LA7_0 <= 'z')||LA7_0=='|'||(LA7_0 >= '~' && LA7_0 <= '\uFFFF')) ) {s = 15;}
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA7_43 = input.LA(1);
						s = -1;
						if ( (LA7_43=='r') ) {s = 52;}
						else if ( ((LA7_43 >= '\u0000' && LA7_43 <= 'q')||(LA7_43 >= 's' && LA7_43 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA7_52 = input.LA(1);
						s = -1;
						if ( (LA7_52=='l') ) {s = 61;}
						else if ( ((LA7_52 >= '\u0000' && LA7_52 <= 'k')||(LA7_52 >= 'm' && LA7_52 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA7_61 = input.LA(1);
						s = -1;
						if ( (LA7_61=='y') ) {s = 70;}
						else if ( ((LA7_61 >= '\u0000' && LA7_61 <= 'x')||(LA7_61 >= 'z' && LA7_61 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA7_70 = input.LA(1);
						s = -1;
						if ( (LA7_70=='_') ) {s = 79;}
						else if ( ((LA7_70 >= '\u0000' && LA7_70 <= '^')||(LA7_70 >= '`' && LA7_70 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA7_79 = input.LA(1);
						s = -1;
						if ( (LA7_79=='s') ) {s = 87;}
						else if ( ((LA7_79 >= '\u0000' && LA7_79 <= 'r')||(LA7_79 >= 't' && LA7_79 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA7_87 = input.LA(1);
						s = -1;
						if ( (LA7_87=='t') ) {s = 95;}
						else if ( ((LA7_87 >= '\u0000' && LA7_87 <= 's')||(LA7_87 >= 'u' && LA7_87 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA7_95 = input.LA(1);
						s = -1;
						if ( (LA7_95=='o') ) {s = 102;}
						else if ( ((LA7_95 >= '\u0000' && LA7_95 <= 'n')||(LA7_95 >= 'p' && LA7_95 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA7_102 = input.LA(1);
						s = -1;
						if ( (LA7_102=='p') ) {s = 108;}
						else if ( ((LA7_102 >= '\u0000' && LA7_102 <= 'o')||(LA7_102 >= 'q' && LA7_102 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA7_108 = input.LA(1);
						s = -1;
						if ( (LA7_108=='p') ) {s = 114;}
						else if ( ((LA7_108 >= '\u0000' && LA7_108 <= 'o')||(LA7_108 >= 'q' && LA7_108 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA7_114 = input.LA(1);
						s = -1;
						if ( (LA7_114=='i') ) {s = 120;}
						else if ( ((LA7_114 >= '\u0000' && LA7_114 <= 'h')||(LA7_114 >= 'j' && LA7_114 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA7_120 = input.LA(1);
						s = -1;
						if ( (LA7_120=='n') ) {s = 126;}
						else if ( ((LA7_120 >= '\u0000' && LA7_120 <= 'm')||(LA7_120 >= 'o' && LA7_120 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA7_126 = input.LA(1);
						s = -1;
						if ( (LA7_126=='g') ) {s = 132;}
						else if ( ((LA7_126 >= '\u0000' && LA7_126 <= 'f')||(LA7_126 >= 'h' && LA7_126 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA7_132 = input.LA(1);
						s = -1;
						if ( (LA7_132=='\"') ) {s = 137;}
						else if ( ((LA7_132 >= '\u0000' && LA7_132 <= '!')||(LA7_132 >= '#' && LA7_132 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA7_44 = input.LA(1);
						s = -1;
						if ( (LA7_44=='a') ) {s = 53;}
						else if ( ((LA7_44 >= '\u0000' && LA7_44 <= '`')||(LA7_44 >= 'b' && LA7_44 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA7_53 = input.LA(1);
						s = -1;
						if ( (LA7_53=='r') ) {s = 62;}
						else if ( ((LA7_53 >= '\u0000' && LA7_53 <= 'q')||(LA7_53 >= 's' && LA7_53 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA7_62 = input.LA(1);
						s = -1;
						if ( (LA7_62=='n') ) {s = 71;}
						else if ( ((LA7_62 >= '\u0000' && LA7_62 <= 'm')||(LA7_62 >= 'o' && LA7_62 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA7_71 = input.LA(1);
						s = -1;
						if ( (LA7_71=='i') ) {s = 80;}
						else if ( ((LA7_71 >= '\u0000' && LA7_71 <= 'h')||(LA7_71 >= 'j' && LA7_71 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA7_80 = input.LA(1);
						s = -1;
						if ( (LA7_80=='n') ) {s = 88;}
						else if ( ((LA7_80 >= '\u0000' && LA7_80 <= 'm')||(LA7_80 >= 'o' && LA7_80 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA7_88 = input.LA(1);
						s = -1;
						if ( (LA7_88=='g') ) {s = 96;}
						else if ( ((LA7_88 >= '\u0000' && LA7_88 <= 'f')||(LA7_88 >= 'h' && LA7_88 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA7_96 = input.LA(1);
						s = -1;
						if ( (LA7_96=='_') ) {s = 103;}
						else if ( ((LA7_96 >= '\u0000' && LA7_96 <= '^')||(LA7_96 >= '`' && LA7_96 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA7_103 = input.LA(1);
						s = -1;
						if ( (LA7_103=='r') ) {s = 109;}
						else if ( ((LA7_103 >= '\u0000' && LA7_103 <= 'q')||(LA7_103 >= 's' && LA7_103 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA7_109 = input.LA(1);
						s = -1;
						if ( (LA7_109=='a') ) {s = 115;}
						else if ( ((LA7_109 >= '\u0000' && LA7_109 <= '`')||(LA7_109 >= 'b' && LA7_109 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA7_115 = input.LA(1);
						s = -1;
						if ( (LA7_115=='t') ) {s = 121;}
						else if ( ((LA7_115 >= '\u0000' && LA7_115 <= 's')||(LA7_115 >= 'u' && LA7_115 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA7_121 = input.LA(1);
						s = -1;
						if ( (LA7_121=='e') ) {s = 127;}
						else if ( ((LA7_121 >= '\u0000' && LA7_121 <= 'd')||(LA7_121 >= 'f' && LA7_121 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA7_127 = input.LA(1);
						s = -1;
						if ( (LA7_127=='\"') ) {s = 133;}
						else if ( ((LA7_127 >= '\u0000' && LA7_127 <= '!')||(LA7_127 >= '#' && LA7_127 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA7_45 = input.LA(1);
						s = -1;
						if ( (LA7_45=='s') ) {s = 54;}
						else if ( ((LA7_45 >= '\u0000' && LA7_45 <= 'r')||(LA7_45 >= 't' && LA7_45 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA7_54 = input.LA(1);
						s = -1;
						if ( (LA7_54=='s') ) {s = 63;}
						else if ( ((LA7_54 >= '\u0000' && LA7_54 <= 'r')||(LA7_54 >= 't' && LA7_54 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA7_63 = input.LA(1);
						s = -1;
						if ( (LA7_63=='_') ) {s = 72;}
						else if ( ((LA7_63 >= '\u0000' && LA7_63 <= '^')||(LA7_63 >= '`' && LA7_63 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA7_72 = input.LA(1);
						s = -1;
						if ( (LA7_72=='f') ) {s = 81;}
						else if ( ((LA7_72 >= '\u0000' && LA7_72 <= 'e')||(LA7_72 >= 'g' && LA7_72 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA7_81 = input.LA(1);
						s = -1;
						if ( (LA7_81=='u') ) {s = 89;}
						else if ( ((LA7_81 >= '\u0000' && LA7_81 <= 't')||(LA7_81 >= 'v' && LA7_81 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA7_89 = input.LA(1);
						s = -1;
						if ( (LA7_89=='n') ) {s = 97;}
						else if ( ((LA7_89 >= '\u0000' && LA7_89 <= 'm')||(LA7_89 >= 'o' && LA7_89 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA7_97 = input.LA(1);
						s = -1;
						if ( (LA7_97=='c') ) {s = 104;}
						else if ( ((LA7_97 >= '\u0000' && LA7_97 <= 'b')||(LA7_97 >= 'd' && LA7_97 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA7_104 = input.LA(1);
						s = -1;
						if ( (LA7_104=='t') ) {s = 110;}
						else if ( ((LA7_104 >= '\u0000' && LA7_104 <= 's')||(LA7_104 >= 'u' && LA7_104 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA7_110 = input.LA(1);
						s = -1;
						if ( (LA7_110=='i') ) {s = 116;}
						else if ( ((LA7_110 >= '\u0000' && LA7_110 <= 'h')||(LA7_110 >= 'j' && LA7_110 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA7_116 = input.LA(1);
						s = -1;
						if ( (LA7_116=='o') ) {s = 122;}
						else if ( ((LA7_116 >= '\u0000' && LA7_116 <= 'n')||(LA7_116 >= 'p' && LA7_116 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA7_122 = input.LA(1);
						s = -1;
						if ( (LA7_122=='n') ) {s = 128;}
						else if ( ((LA7_122 >= '\u0000' && LA7_122 <= 'm')||(LA7_122 >= 'o' && LA7_122 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA7_128 = input.LA(1);
						s = -1;
						if ( (LA7_128=='\"') ) {s = 134;}
						else if ( ((LA7_128 >= '\u0000' && LA7_128 <= '!')||(LA7_128 >= '#' && LA7_128 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 7, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
