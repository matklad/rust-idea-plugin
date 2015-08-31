/* The following code was generated by JFlex 1.4.3 on 30.08.15 19:33 */

package org.jetbrains.rust.parser.lexer;

import java.util.*;
import com.intellij.lexer.*;
import com.intellij.psi.*;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.rust.parser.token.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 30.08.15 19:33 from the specification file
 * <tt>/Users/atsky/work/rust-idea-plugin/plugin/src/org/jetbrains/rust/parser/lexer/Rust.flex</tt>
 */
class _RustLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\3\2\0\1\3\22\0\1\3\17\0\12\2\7\0"+
    "\32\1\4\0\1\1\1\0\1\4\1\6\1\12\1\26\1\10\1\22"+
    "\1\1\1\25\1\23\1\1\1\11\1\16\1\20\1\14\1\13\1\24"+
    "\1\1\1\7\1\5\1\15\1\17\1\27\1\31\1\21\1\30\1\1"+
    "\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\16\2\1\4\26\2\1\5"+
    "\1\6\1\2\1\7\10\2\1\10\1\2\1\11\10\2"+
    "\1\12\1\2\1\13\2\2\1\14\1\2\1\15\1\2"+
    "\1\16\3\2\1\17\2\2\1\20\5\2\1\21\1\22"+
    "\5\2\1\23\1\24\1\25\2\2\1\26\1\2\1\27"+
    "\1\30\1\31\4\2\1\32\1\33\2\2\1\34\1\35"+
    "\1\2\1\36\1\2\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\2\1\47\1\2\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\32\0\64\0\116\0\150\0\202\0\234\0\266"+
    "\0\320\0\352\0\u0104\0\u011e\0\u0138\0\u0152\0\u016c\0\u0186"+
    "\0\u01a0\0\u01ba\0\64\0\u01d4\0\u01ee\0\u0208\0\u0222\0\u023c"+
    "\0\u0256\0\u0270\0\u028a\0\u02a4\0\u02be\0\u02d8\0\u02f2\0\u030c"+
    "\0\u0326\0\u0340\0\u035a\0\u0374\0\u038e\0\u03a8\0\u03c2\0\u03dc"+
    "\0\u03f6\0\64\0\64\0\u0410\0\64\0\u042a\0\u0444\0\u045e"+
    "\0\u0478\0\u0492\0\u04ac\0\u04c6\0\u04e0\0\64\0\u04fa\0\64"+
    "\0\u0514\0\u052e\0\u0548\0\u0562\0\u057c\0\u0596\0\u05b0\0\u05ca"+
    "\0\64\0\u05e4\0\64\0\u05fe\0\u0618\0\64\0\u0632\0\64"+
    "\0\u064c\0\64\0\u0666\0\u0680\0\u069a\0\64\0\u06b4\0\u06ce"+
    "\0\64\0\u06e8\0\u0702\0\u071c\0\u0736\0\u0750\0\64\0\64"+
    "\0\u076a\0\u0784\0\u079e\0\u07b8\0\u07d2\0\64\0\64\0\64"+
    "\0\u07ec\0\u0806\0\64\0\u0820\0\64\0\64\0\64\0\u083a"+
    "\0\u0854\0\u086e\0\u0888\0\64\0\64\0\u08a2\0\u08bc\0\64"+
    "\0\64\0\u08d6\0\64\0\u08f0\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\u090a\0\64\0\u0924\0\64";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\3\1\12\2\3\1\13\1\14\1\15\1\16"+
    "\1\3\1\17\1\20\1\21\4\3\1\22\33\0\2\3"+
    "\1\0\26\3\3\0\1\4\27\0\2\3\1\0\1\3"+
    "\1\23\24\3\1\0\2\3\1\0\4\3\1\24\4\3"+
    "\1\25\1\3\1\26\12\3\1\0\2\3\1\0\3\3"+
    "\1\27\3\3\1\30\16\3\1\0\2\3\1\0\4\3"+
    "\1\31\21\3\1\0\2\3\1\0\10\3\1\32\1\3"+
    "\1\33\2\3\1\34\10\3\1\0\2\3\1\0\3\3"+
    "\1\35\3\3\1\36\16\3\1\0\2\3\1\0\3\3"+
    "\1\37\20\3\1\40\1\3\1\0\2\3\1\0\4\3"+
    "\1\41\2\3\1\42\16\3\1\0\2\3\1\0\1\3"+
    "\1\43\6\3\1\44\15\3\1\0\2\3\1\0\1\45"+
    "\6\3\1\46\3\3\1\47\12\3\1\0\2\3\1\0"+
    "\1\50\6\3\1\51\1\52\15\3\1\0\2\3\1\0"+
    "\10\3\1\53\3\3\1\54\1\3\1\55\7\3\1\0"+
    "\2\3\1\0\3\3\1\56\7\3\1\57\12\3\1\0"+
    "\2\3\1\0\21\3\1\60\4\3\1\0\2\3\1\0"+
    "\12\3\1\61\13\3\1\0\2\3\1\0\1\62\2\3"+
    "\1\63\22\3\1\0\2\3\1\0\20\3\1\64\5\3"+
    "\1\0\2\3\1\0\4\3\1\65\21\3\1\0\2\3"+
    "\1\0\15\3\1\66\10\3\1\0\2\3\1\0\11\3"+
    "\1\67\4\3\1\70\7\3\1\0\2\3\1\0\13\3"+
    "\1\71\12\3\1\0\2\3\1\0\1\3\1\72\24\3"+
    "\1\0\2\3\1\0\11\3\1\73\14\3\1\0\2\3"+
    "\1\0\1\74\25\3\1\0\2\3\1\0\10\3\1\75"+
    "\15\3\1\0\2\3\1\0\1\76\12\3\1\77\12\3"+
    "\1\0\2\3\1\0\20\3\1\100\5\3\1\0\2\3"+
    "\1\0\11\3\1\101\14\3\1\0\2\3\1\0\7\3"+
    "\1\102\16\3\1\0\2\3\1\0\4\3\1\103\21\3"+
    "\1\0\2\3\1\0\1\3\1\104\24\3\1\0\2\3"+
    "\1\0\11\3\1\105\14\3\1\0\2\3\1\0\22\3"+
    "\1\106\1\107\2\3\1\0\2\3\1\0\11\3\1\110"+
    "\14\3\1\0\2\3\1\0\12\3\1\111\13\3\1\0"+
    "\2\3\1\0\3\3\1\112\22\3\1\0\2\3\1\0"+
    "\20\3\1\113\5\3\1\0\2\3\1\0\7\3\1\114"+
    "\7\3\1\115\6\3\1\0\2\3\1\0\2\3\1\116"+
    "\23\3\1\0\2\3\1\0\4\3\1\117\12\3\1\120"+
    "\6\3\1\0\2\3\1\0\16\3\1\121\7\3\1\0"+
    "\2\3\1\0\11\3\1\122\14\3\1\0\2\3\1\0"+
    "\13\3\1\123\12\3\1\0\2\3\1\0\4\3\1\124"+
    "\21\3\1\0\2\3\1\0\1\125\25\3\1\0\2\3"+
    "\1\0\13\3\1\126\12\3\1\0\2\3\1\0\14\3"+
    "\1\127\11\3\1\0\2\3\1\0\4\3\1\130\21\3"+
    "\1\0\2\3\1\0\4\3\1\131\21\3\1\0\2\3"+
    "\1\0\11\3\1\132\14\3\1\0\2\3\1\0\1\3"+
    "\1\133\7\3\1\134\14\3\1\0\2\3\1\0\17\3"+
    "\1\135\6\3\1\0\2\3\1\0\4\3\1\136\21\3"+
    "\1\0\2\3\1\0\4\3\1\137\21\3\1\0\2\3"+
    "\1\0\20\3\1\140\5\3\1\0\2\3\1\0\1\141"+
    "\25\3\1\0\2\3\1\0\6\3\1\142\17\3\1\0"+
    "\2\3\1\0\4\3\1\143\21\3\1\0\2\3\1\0"+
    "\1\3\1\144\24\3\1\0\2\3\1\0\12\3\1\145"+
    "\13\3\1\0\2\3\1\0\6\3\1\146\17\3\1\0"+
    "\2\3\1\0\23\3\1\147\2\3\1\0\2\3\1\0"+
    "\3\3\1\150\22\3\1\0\2\3\1\0\12\3\1\151"+
    "\13\3\1\0\2\3\1\0\17\3\1\152\6\3\1\0"+
    "\2\3\1\0\6\3\1\153\17\3\1\0\2\3\1\0"+
    "\3\3\1\154\22\3\1\0\2\3\1\0\5\3\1\155"+
    "\20\3\1\0\2\3\1\0\3\3\1\156\22\3\1\0"+
    "\2\3\1\0\3\3\1\157\22\3\1\0\2\3\1\0"+
    "\4\3\1\160\21\3\1\0\2\3\1\0\11\3\1\161"+
    "\14\3\1\0\2\3\1\0\17\3\1\162\6\3\1\0"+
    "\2\3\1\0\11\3\1\163\14\3\1\0\2\3\1\0"+
    "\16\3\1\164\7\3\1\0\2\3\1\0\21\3\1\165"+
    "\4\3\1\0\2\3\1\0\4\3\1\166\21\3\1\0"+
    "\2\3\1\0\4\3\1\167\21\3\1\0\2\3\1\0"+
    "\4\3\1\170\21\3\1\0\2\3\1\0\6\3\1\171"+
    "\17\3\1\0\2\3\1\0\11\3\1\172\14\3\1\0"+
    "\2\3\1\0\10\3\1\173\15\3\1\0\2\3\1\0"+
    "\10\3\1\174\15\3\1\0\2\3\1\0\10\3\1\175"+
    "\15\3\1\0\2\3\1\0\4\3\1\176\21\3\1\0"+
    "\2\3\1\0\13\3\1\177\12\3\1\0\2\3\1\0"+
    "\4\3\1\200\21\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2366];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\176\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
    private int commentStart;
    private int commentDepth;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _RustLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 82) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 23: 
          { return RustLexerTokens.KW_IMPL;
          }
        case 41: break;
        case 34: 
          { return RustLexerTokens.KW_WHILE;
          }
        case 42: break;
        case 27: 
          { return RustLexerTokens.KW_BREAK;
          }
        case 43: break;
        case 29: 
          { return RustLexerTokens.KW_CONST;
          }
        case 44: break;
        case 3: 
          { return TokenType.WHITE_SPACE;
          }
        case 45: break;
        case 2: 
          { return RustLexerTokens.ID;
          }
        case 46: break;
        case 8: 
          { return RustLexerTokens.KW_BOX;
          }
        case 47: break;
        case 24: 
          { return RustLexerTokens.KW_PROC;
          }
        case 48: break;
        case 6: 
          { return RustLexerTokens.KW_IN;
          }
        case 49: break;
        case 20: 
          { return RustLexerTokens.KW_TYPE;
          }
        case 50: break;
        case 12: 
          { return RustLexerTokens.KW_MOD;
          }
        case 51: break;
        case 13: 
          { return RustLexerTokens.KW_MUT;
          }
        case 52: break;
        case 37: 
          { return RustLexerTokens.KW_RETURN;
          }
        case 53: break;
        case 31: 
          { return RustLexerTokens.KW_MATCH;
          }
        case 54: break;
        case 22: 
          { return RustLexerTokens.KW_MOVE;
          }
        case 55: break;
        case 39: 
          { return RustLexerTokens.KW_UNSAFE;
          }
        case 56: break;
        case 36: 
          { return RustLexerTokens.KW_STRUCT;
          }
        case 57: break;
        case 16: 
          { return RustLexerTokens.KW_SELF;
          }
        case 58: break;
        case 15: 
          { return RustLexerTokens.KW_PUB;
          }
        case 59: break;
        case 35: 
          { return RustLexerTokens.KW_STATIC;
          }
        case 60: break;
        case 4: 
          { return RustLexerTokens.KW_AS;
          }
        case 61: break;
        case 38: 
          { return RustLexerTokens.KW_EXTERN;
          }
        case 62: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 63: break;
        case 32: 
          { return RustLexerTokens.KW_FALSE;
          }
        case 64: break;
        case 5: 
          { return RustLexerTokens.KW_FN;
          }
        case 65: break;
        case 17: 
          { return RustLexerTokens.KW_ENUM;
          }
        case 66: break;
        case 18: 
          { return RustLexerTokens.KW_ELSE;
          }
        case 67: break;
        case 33: 
          { return RustLexerTokens.KW_WHERE;
          }
        case 68: break;
        case 40: 
          { return RustLexerTokens.KW_CONTINUE;
          }
        case 69: break;
        case 25: 
          { return RustLexerTokens.KW_PRIV;
          }
        case 70: break;
        case 28: 
          { return RustLexerTokens.KW_CRATE;
          }
        case 71: break;
        case 11: 
          { return RustLexerTokens.KW_USE;
          }
        case 72: break;
        case 10: 
          { return RustLexerTokens.KW_LET;
          }
        case 73: break;
        case 19: 
          { return RustLexerTokens.KW_TRUE;
          }
        case 74: break;
        case 9: 
          { return RustLexerTokens.KW_REF;
          }
        case 75: break;
        case 14: 
          { return RustLexerTokens.KW_FOR;
          }
        case 76: break;
        case 26: 
          { return RustLexerTokens.KW_SUPER;
          }
        case 77: break;
        case 7: 
          { return RustLexerTokens.KW_IF;
          }
        case 78: break;
        case 21: 
          { return RustLexerTokens.KW_LOOP;
          }
        case 79: break;
        case 30: 
          { return RustLexerTokens.KW_TRAIT;
          }
        case 80: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
