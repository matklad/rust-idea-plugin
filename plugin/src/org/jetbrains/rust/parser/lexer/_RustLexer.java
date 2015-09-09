/* The following code was generated by JFlex 1.4.3 on 9/9/15 10:01 PM */

package org.jetbrains.rust.parser.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.jetbrains.rust.psi.RustTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/9/15 10:01 PM from the specification file
 * <tt>/home/matklad/projects/rust-idea-plugin/plugin/src/org/jetbrains/rust/parser/lexer/RustLexer.flex</tt>
 */
public class _RustLexer implements FlexLexer {
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
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\40\1\12"+
    "\3\0\1\35\1\10\1\26\1\27\1\4\1\44\1\37\1\43\1\16"+
    "\1\3\12\15\1\41\1\36\1\45\1\42\1\46\2\0\32\7\1\32"+
    "\1\13\1\33\1\0\1\6\1\0\1\23\1\47\1\54\1\61\1\21"+
    "\1\22\1\53\1\63\1\51\2\7\1\24\1\57\1\52\1\55\1\60"+
    "\1\7\1\11\1\25\1\17\1\20\1\7\1\62\1\56\1\50\1\7"+
    "\1\30\1\34\1\31\54\0\1\5\12\0\1\5\4\0\1\5\5\0"+
    "\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5\16\0\5\5\7\0"+
    "\1\5\1\0\1\5\201\0\5\5\1\0\2\5\2\0\4\5\10\0"+
    "\1\5\1\0\3\5\1\0\1\5\1\0\24\5\1\0\123\5\1\0"+
    "\213\5\10\0\236\5\11\0\46\5\2\0\1\5\7\0\47\5\110\0"+
    "\33\5\5\0\3\5\55\0\53\5\25\0\12\14\4\0\2\5\1\0"+
    "\143\5\1\0\1\5\17\0\2\5\7\0\2\5\12\14\3\5\2\0"+
    "\1\5\20\0\1\5\1\0\36\5\35\0\131\5\13\0\1\5\16\0"+
    "\12\14\41\5\11\0\2\5\4\0\1\5\5\0\26\5\4\0\1\5"+
    "\11\0\1\5\3\0\1\5\27\0\31\5\107\0\1\5\1\0\13\5"+
    "\127\0\66\5\3\0\1\5\22\0\1\5\7\0\12\5\4\0\12\14"+
    "\1\0\7\5\1\0\7\5\5\0\10\5\2\0\2\5\2\0\26\5"+
    "\1\0\7\5\1\0\1\5\3\0\4\5\3\0\1\5\20\0\1\5"+
    "\15\0\2\5\1\0\3\5\4\0\12\14\2\5\23\0\6\5\4\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\2\5\1\0"+
    "\2\5\37\0\4\5\1\0\1\5\7\0\12\14\2\0\3\5\20\0"+
    "\11\5\1\0\3\5\1\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\5\5\3\0\1\5\22\0\1\5\17\0\2\5\4\0\12\14\25\0"+
    "\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\5\5\3\0\1\5\36\0\2\5\1\0\3\5\4\0\12\14\1\0"+
    "\1\5\21\0\1\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0"+
    "\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0"+
    "\14\5\26\0\1\5\25\0\12\14\25\0\10\5\1\0\3\5\1\0"+
    "\27\5\1\0\12\5\1\0\5\5\3\0\1\5\32\0\2\5\6\0"+
    "\2\5\4\0\12\14\25\0\10\5\1\0\3\5\1\0\27\5\1\0"+
    "\12\5\1\0\5\5\3\0\1\5\40\0\1\5\1\0\2\5\4\0"+
    "\12\14\1\0\2\5\22\0\10\5\1\0\3\5\1\0\51\5\2\0"+
    "\1\5\20\0\1\5\21\0\2\5\4\0\12\14\12\0\6\5\5\0"+
    "\22\5\3\0\30\5\1\0\11\5\1\0\1\5\2\0\7\5\72\0"+
    "\60\5\1\0\2\5\14\0\7\5\11\0\12\14\47\0\2\5\1\0"+
    "\1\5\2\0\2\5\1\0\1\5\2\0\1\5\6\0\4\5\1\0"+
    "\7\5\1\0\3\5\1\0\1\5\1\0\1\5\2\0\2\5\1\0"+
    "\4\5\1\0\2\5\11\0\1\5\2\0\5\5\1\0\1\5\11\0"+
    "\12\14\2\0\4\5\40\0\1\5\37\0\12\14\26\0\10\5\1\0"+
    "\44\5\33\0\5\5\163\0\53\5\24\0\1\5\12\14\6\0\6\5"+
    "\4\0\4\5\3\0\1\5\3\0\2\5\7\0\3\5\4\0\15\5"+
    "\14\0\1\5\1\0\12\14\6\0\46\5\1\0\1\5\5\0\1\5"+
    "\2\0\53\5\1\0\u014d\5\1\0\4\5\2\0\7\5\1\0\1\5"+
    "\1\0\4\5\2\0\51\5\1\0\4\5\2\0\41\5\1\0\4\5"+
    "\2\0\7\5\1\0\1\5\1\0\4\5\2\0\17\5\1\0\71\5"+
    "\1\0\4\5\2\0\103\5\45\0\20\5\20\0\125\5\14\0\u026c\5"+
    "\2\0\21\5\1\0\32\5\5\0\113\5\25\0\15\5\1\0\4\5"+
    "\16\0\22\5\16\0\22\5\16\0\15\5\1\0\3\5\17\0\64\5"+
    "\43\0\1\5\4\0\1\5\3\0\12\14\46\0\12\14\6\0\130\5"+
    "\10\0\51\5\1\0\1\5\5\0\106\5\12\0\35\5\51\0\12\14"+
    "\36\5\2\0\5\5\13\0\54\5\25\0\7\5\10\0\12\14\46\0"+
    "\27\5\11\0\65\5\53\0\12\14\6\0\12\14\15\0\1\5\135\0"+
    "\57\5\21\0\7\5\4\0\12\14\51\0\36\5\15\0\2\5\12\14"+
    "\54\5\32\0\44\5\34\0\12\14\3\0\3\5\12\14\44\5\153\0"+
    "\4\5\1\0\4\5\3\0\2\5\11\0\300\5\100\0\u0116\5\2\0"+
    "\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0\7\5\1\0"+
    "\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0\6\5\4\0"+
    "\15\5\5\0\3\5\1\0\7\5\164\0\1\5\15\0\1\5\20\0"+
    "\15\5\145\0\1\5\4\0\1\5\2\0\12\5\1\0\1\5\3\0"+
    "\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0\4\5\1\0"+
    "\13\5\2\0\4\5\5\0\5\5\4\0\1\5\64\0\2\5\u0a7b\0"+
    "\57\5\1\0\57\5\1\0\205\5\6\0\4\5\3\0\2\5\14\0"+
    "\46\5\1\0\1\5\5\0\1\5\2\0\70\5\7\0\1\5\20\0"+
    "\27\5\11\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\7\5\120\0\1\5\u01d5\0"+
    "\2\5\52\0\5\5\5\0\2\5\4\0\126\5\6\0\3\5\1\0"+
    "\132\5\1\0\4\5\5\0\51\5\3\0\136\5\21\0\33\5\65\0"+
    "\20\5\u0200\0\u19b6\5\112\0\u51cd\5\63\0\u048d\5\103\0\56\5\2\0"+
    "\u010d\5\3\0\20\5\12\14\2\5\24\0\57\5\20\0\31\5\10\0"+
    "\106\5\61\0\11\5\2\0\147\5\2\0\4\5\1\0\4\5\14\0"+
    "\13\5\115\0\12\5\1\0\3\5\1\0\4\5\1\0\27\5\35\0"+
    "\64\5\16\0\62\5\34\0\12\14\30\0\6\5\3\0\1\5\4\0"+
    "\12\14\34\5\12\0\27\5\31\0\35\5\7\0\57\5\34\0\1\5"+
    "\12\14\46\0\51\5\27\0\3\5\1\0\10\5\4\0\12\14\6\0"+
    "\27\5\3\0\1\5\5\0\60\5\1\0\1\5\3\0\2\5\2\0"+
    "\5\5\2\0\1\5\1\0\1\5\30\0\3\5\2\0\13\5\7\0"+
    "\3\5\14\0\6\5\2\0\6\5\2\0\6\5\11\0\7\5\1\0"+
    "\7\5\221\0\43\5\15\0\12\14\6\0\u2ba4\5\14\0\27\5\4\0"+
    "\61\5\u2104\0\u016e\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0"+
    "\1\5\1\0\12\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0"+
    "\2\5\1\0\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0"+
    "\66\5\50\0\14\5\164\0\5\5\1\0\207\5\23\0\12\14\7\0"+
    "\32\5\6\0\32\5\13\0\131\5\3\0\6\5\2\0\6\5\2\0"+
    "\6\5\2\0\3\5\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\1\1\3\1\1"+
    "\1\4\1\5\7\3\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\6\3\1\27\3\0\1\30"+
    "\2\0\1\31\5\3\1\32\1\3\1\33\14\3\1\0"+
    "\1\34\1\35\1\36\2\3\1\37\2\3\1\40\1\41"+
    "\10\3\1\42\1\43\1\44\1\3\1\45\1\46\1\47"+
    "\5\3\1\50\1\3\1\51\4\3\1\52\4\3\1\53"+
    "\1\54\1\55\1\56\1\3\1\57\1\60\6\3\1\61"+
    "\1\3\1\62\6\3\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
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
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\64\0\64\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u016c\0\64\0\u0548\0\u057c\0\u05b0"+
    "\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\320\0\u06e8\0\320"+
    "\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\64\0\u057c\0\64"+
    "\0\u09c0\0\u09f4\0\320\0\u0a28\0\u0a5c\0\320\0\320\0\u0a90"+
    "\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\320"+
    "\0\320\0\320\0\u0c30\0\u04e0\0\320\0\320\0\u0c64\0\u0c98"+
    "\0\u0ccc\0\u0d00\0\u0d34\0\320\0\u0d68\0\320\0\u0d9c\0\u0dd0"+
    "\0\u0e04\0\u0e38\0\320\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\320"+
    "\0\320\0\320\0\320\0\u0f3c\0\320\0\320\0\u0f70\0\u0fa4"+
    "\0\u0fd8\0\u100c\0\u1040\0\u1074\0\320\0\u10a8\0\320\0\u10dc"+
    "\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\320";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
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
    "\1\2\2\3\1\4\1\2\1\5\1\2\1\5\1\6"+
    "\1\7\1\10\1\2\2\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\5\1\44"+
    "\2\5\1\45\2\5\1\46\1\47\1\5\1\50\1\5"+
    "\65\0\2\3\64\0\1\51\1\52\65\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\7\5\21\0\15\5\2\53"+
    "\1\0\61\53\6\0\2\5\1\0\1\5\1\54\2\0"+
    "\1\5\1\0\7\5\21\0\15\5\12\54\1\55\1\56"+
    "\50\54\14\0\2\11\1\57\63\0\1\60\53\0\2\5"+
    "\1\0\1\61\3\0\1\5\1\0\7\5\21\0\1\5"+
    "\1\62\13\5\6\0\2\5\1\0\1\5\3\0\1\5"+
    "\1\0\6\5\1\63\21\0\15\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\7\5\21\0\7\5\1\64"+
    "\5\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\4\5\1\65\2\5\21\0\3\5\1\66\2\5\1\67"+
    "\6\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\6\5\1\70\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\2\5\1\71\4\5\21\0\2\5"+
    "\1\72\12\5\6\0\2\5\1\0\1\5\3\0\1\5"+
    "\1\0\1\73\1\5\1\74\4\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\5\3\0\1\5\1\0\7\5\21\0"+
    "\1\5\1\75\13\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\7\5\21\0\10\5\1\76\4\5\6\0"+
    "\2\5\1\0\1\77\3\0\1\5\1\0\7\5\21\0"+
    "\6\5\1\100\6\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\1\5\1\101\5\5\21\0\6\5\1\102"+
    "\6\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\1\5\1\103\5\5\21\0\15\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\7\5\21\0\14\5\1\104"+
    "\2\51\1\0\61\51\4\52\1\105\57\52\10\0\1\106"+
    "\53\0\2\54\1\0\61\54\14\0\2\107\64\0\1\110"+
    "\53\0\2\5\1\0\1\5\3\0\1\5\1\0\1\5"+
    "\1\111\5\5\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\7\5\21\0\11\5\1\112\3\5"+
    "\6\0\2\5\1\0\1\5\3\0\1\5\1\0\2\5"+
    "\1\113\4\5\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\1\114\6\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\5\3\0\1\5\1\0\5\5\1\115"+
    "\1\5\21\0\15\5\6\0\2\5\1\0\1\116\3\0"+
    "\1\5\1\0\7\5\21\0\15\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\1\117\6\5\21\0\15\5"+
    "\6\0\2\5\1\0\1\5\3\0\1\5\1\0\3\5"+
    "\1\120\3\5\21\0\15\5\6\0\2\5\1\0\1\121"+
    "\3\0\1\5\1\0\4\5\1\122\2\5\21\0\15\5"+
    "\6\0\2\5\1\0\1\5\3\0\1\5\1\0\5\5"+
    "\1\123\1\5\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\1\124\6\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\5\3\0\1\5\1\0\7\5\21\0"+
    "\11\5\1\125\3\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\4\5\1\126\2\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\5\3\0\1\5\1\0\7\5\21\0"+
    "\3\5\1\127\11\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\1\130\6\5\21\0\15\5\6\0\2\5"+
    "\1\0\1\5\3\0\1\5\1\0\7\5\21\0\12\5"+
    "\1\131\2\5\6\0\2\5\1\0\1\5\3\0\1\5"+
    "\1\0\7\5\21\0\1\132\14\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\2\5\1\133\4\5\21\0"+
    "\15\5\3\52\1\134\1\105\57\52\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\2\5\1\135\4\5\21\0"+
    "\15\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\2\5\1\136\4\5\21\0\15\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\2\5\1\137\4\5\21\0"+
    "\15\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\6\5\1\140\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\2\5\1\141\4\5\21\0\15\5"+
    "\6\0\2\5\1\0\1\5\3\0\1\5\1\0\1\5"+
    "\1\142\5\5\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\1\143\6\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\5\3\0\1\5\1\0\3\5\1\144"+
    "\3\5\21\0\15\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\2\5\1\145\4\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\5\3\0\1\5\1\0\5\5\1\146"+
    "\1\5\21\0\15\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\1\147\6\5\21\0\15\5\6\0\2\5"+
    "\1\0\1\5\3\0\1\5\1\0\6\5\1\150\21\0"+
    "\15\5\6\0\2\5\1\0\1\151\3\0\1\5\1\0"+
    "\7\5\21\0\15\5\6\0\2\5\1\0\1\152\3\0"+
    "\1\5\1\0\7\5\21\0\15\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\2\5\1\153\4\5\21\0"+
    "\15\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\1\154\6\5\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\7\5\21\0\5\5\1\155\7\5"+
    "\6\0\2\5\1\0\1\5\3\0\1\5\1\0\7\5"+
    "\21\0\2\5\1\156\12\5\6\0\1\157\1\5\1\0"+
    "\1\5\3\0\1\5\1\0\7\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\5\3\0\1\5\1\0\2\5\1\160"+
    "\4\5\21\0\15\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\1\161\6\5\21\0\15\5\6\0\2\5"+
    "\1\0\1\5\3\0\1\5\1\0\2\5\1\162\4\5"+
    "\21\0\15\5\6\0\2\5\1\0\1\5\3\0\1\5"+
    "\1\0\7\5\21\0\3\5\1\163\11\5\6\0\2\5"+
    "\1\0\1\5\3\0\1\5\1\0\7\5\21\0\2\5"+
    "\1\164\12\5\6\0\2\5\1\0\1\5\3\0\1\5"+
    "\1\0\1\165\6\5\21\0\15\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\7\5\21\0\5\5\1\166"+
    "\7\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\5\5\1\167\1\170\21\0\15\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\7\5\21\0\10\5\1\171"+
    "\4\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\7\5\21\0\2\5\1\172\12\5\6\0\2\5\1\0"+
    "\1\5\3\0\1\5\1\0\1\173\6\5\21\0\15\5"+
    "\6\0\2\5\1\0\1\5\3\0\1\5\1\0\2\5"+
    "\1\174\4\5\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\1\175\6\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\176\3\0\1\5\1\0\7\5\21\0"+
    "\15\5\6\0\2\5\1\0\1\5\3\0\1\5\1\0"+
    "\6\5\1\177\21\0\15\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\7\5\21\0\2\5\1\200\12\5"+
    "\6\0\2\5\1\0\1\5\3\0\1\5\1\0\7\5"+
    "\21\0\3\5\1\201\11\5\6\0\2\5\1\0\1\5"+
    "\3\0\1\5\1\0\7\5\21\0\4\5\1\202\10\5"+
    "\6\0\1\203\1\5\1\0\1\5\3\0\1\5\1\0"+
    "\7\5\21\0\15\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\5\5\1\204\1\5\21\0\15\5\6\0"+
    "\2\5\1\0\1\5\3\0\1\5\1\0\7\5\21\0"+
    "\2\5\1\205\12\5\6\0\2\5\1\0\1\5\3\0"+
    "\1\5\1\0\1\206\6\5\21\0\15\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4628];
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
    "\1\0\1\11\17\1\21\11\7\1\3\0\1\11\2\0"+
    "\25\1\1\0\1\11\1\1\1\11\76\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
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
  public _RustLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _RustLexer(java.io.Reader in) {
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
    while (i < 1708) {
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
        case 41: 
          { return IMPL;
          }
        case 52: break;
        case 4: 
          { return LIT_INTEGER;
          }
        case 53: break;
        case 50: 
          { return LIFETIMES;
          }
        case 54: break;
        case 29: 
          { return LIT_FLOAT;
          }
        case 55: break;
        case 9: 
          { return CURLY_RIGHT;
          }
        case 56: break;
        case 35: 
          { return MOD;
          }
        case 57: break;
        case 39: 
          { return TYPE;
          }
        case 58: break;
        case 42: 
          { return FALSE;
          }
        case 59: break;
        case 15: 
          { return COMMA;
          }
        case 60: break;
        case 21: 
          { return LESS;
          }
        case 61: break;
        case 5: 
          { return DOT;
          }
        case 62: break;
        case 34: 
          { return MUT;
          }
        case 63: break;
        case 14: 
          { return SEMI;
          }
        case 64: break;
        case 45: 
          { return WHERE;
          }
        case 65: break;
        case 7: 
          { return PAR_RIGHT;
          }
        case 66: break;
        case 17: 
          { return COLON;
          }
        case 67: break;
        case 36: 
          { return PUB;
          }
        case 68: break;
        case 43: 
          { return CRATE;
          }
        case 69: break;
        case 37: 
          { return BLOCK_COMMENT;
          }
        case 70: break;
        case 40: 
          { return SELF;
          }
        case 71: break;
        case 8: 
          { return CURLY_LEFT;
          }
        case 72: break;
        case 10: 
          { return BRACKET_LEFT;
          }
        case 73: break;
        case 13: 
          { return AMPERSAND;
          }
        case 74: break;
        case 18: 
          { return ASSIGN;
          }
        case 75: break;
        case 11: 
          { return BRACKET_RIGHT;
          }
        case 76: break;
        case 25: 
          { return DOT_DOT;
          }
        case 77: break;
        case 23: 
          { return LINE_COMMENT;
          }
        case 78: break;
        case 28: 
          { return LIT_CHAR;
          }
        case 79: break;
        case 22: 
          { return GREATER;
          }
        case 80: break;
        case 27: 
          { return AS;
          }
        case 81: break;
        case 26: 
          { return FN;
          }
        case 82: break;
        case 19: 
          { return MINUS;
          }
        case 83: break;
        case 47: 
          { return STRUCT;
          }
        case 84: break;
        case 31: 
          { return USE;
          }
        case 85: break;
        case 33: 
          { return LET;
          }
        case 86: break;
        case 6: 
          { return PAR_LEFT;
          }
        case 87: break;
        case 12: 
          { return PIPE;
          }
        case 88: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 89: break;
        case 38: 
          { return TRUE;
          }
        case 90: break;
        case 32: 
          { return FOR;
          }
        case 91: break;
        case 3: 
          { return IDENT;
          }
        case 92: break;
        case 44: 
          { return CONST;
          }
        case 93: break;
        case 48: 
          { return STATIC;
          }
        case 94: break;
        case 24: 
          { return LIT_STRING;
          }
        case 95: break;
        case 20: 
          { return PLUS;
          }
        case 96: break;
        case 30: 
          { return DOT_DOT_DOT;
          }
        case 97: break;
        case 46: 
          { return EXTERN;
          }
        case 98: break;
        case 51: 
          { return LIT_BYTE_STRING;
          }
        case 99: break;
        case 16: 
          { return BANG;
          }
        case 100: break;
        case 49: 
          { return LIT_BYTE;
          }
        case 101: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 102: break;
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
