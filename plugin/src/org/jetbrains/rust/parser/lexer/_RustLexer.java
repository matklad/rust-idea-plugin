/* The following code was generated by JFlex 1.4.3 on 9/16/15 12:30 AM */

package org.jetbrains.rust.parser.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.jetbrains.rust.psi.RustTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/16/15 12:30 AM from the specification file
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
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\50\1\13"+
    "\1\56\2\0\1\45\1\11\1\36\1\37\1\4\1\27\1\47\1\52"+
    "\1\25\1\3\1\7\1\17\1\22\1\21\1\23\1\7\1\20\1\7"+
    "\1\16\1\7\1\51\1\46\1\54\1\53\1\55\2\0\32\10\1\42"+
    "\1\14\1\43\1\0\1\6\1\0\1\33\1\57\1\63\1\71\1\26"+
    "\1\30\1\62\1\70\1\15\2\10\1\34\1\65\1\61\1\64\1\67"+
    "\1\10\1\12\1\35\1\31\1\32\1\10\1\72\1\66\1\60\1\10"+
    "\1\40\1\44\1\41\54\0\1\5\12\0\1\5\4\0\1\5\5\0"+
    "\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5\16\0\5\5\7\0"+
    "\1\5\1\0\1\5\201\0\5\5\1\0\2\5\2\0\4\5\10\0"+
    "\1\5\1\0\3\5\1\0\1\5\1\0\24\5\1\0\123\5\1\0"+
    "\213\5\10\0\236\5\11\0\46\5\2\0\1\5\7\0\47\5\110\0"+
    "\33\5\5\0\3\5\55\0\53\5\25\0\12\24\4\0\2\5\1\0"+
    "\143\5\1\0\1\5\17\0\2\5\7\0\2\5\12\24\3\5\2\0"+
    "\1\5\20\0\1\5\1\0\36\5\35\0\131\5\13\0\1\5\16\0"+
    "\12\24\41\5\11\0\2\5\4\0\1\5\5\0\26\5\4\0\1\5"+
    "\11\0\1\5\3\0\1\5\27\0\31\5\107\0\1\5\1\0\13\5"+
    "\127\0\66\5\3\0\1\5\22\0\1\5\7\0\12\5\4\0\12\24"+
    "\1\0\7\5\1\0\7\5\5\0\10\5\2\0\2\5\2\0\26\5"+
    "\1\0\7\5\1\0\1\5\3\0\4\5\3\0\1\5\20\0\1\5"+
    "\15\0\2\5\1\0\3\5\4\0\12\24\2\5\23\0\6\5\4\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\2\5\1\0"+
    "\2\5\37\0\4\5\1\0\1\5\7\0\12\24\2\0\3\5\20\0"+
    "\11\5\1\0\3\5\1\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\5\5\3\0\1\5\22\0\1\5\17\0\2\5\4\0\12\24\25\0"+
    "\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\5\5\3\0\1\5\36\0\2\5\1\0\3\5\4\0\12\24\1\0"+
    "\1\5\21\0\1\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0"+
    "\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0"+
    "\14\5\26\0\1\5\25\0\12\24\25\0\10\5\1\0\3\5\1\0"+
    "\27\5\1\0\12\5\1\0\5\5\3\0\1\5\32\0\2\5\6\0"+
    "\2\5\4\0\12\24\25\0\10\5\1\0\3\5\1\0\27\5\1\0"+
    "\12\5\1\0\5\5\3\0\1\5\40\0\1\5\1\0\2\5\4\0"+
    "\12\24\1\0\2\5\22\0\10\5\1\0\3\5\1\0\51\5\2\0"+
    "\1\5\20\0\1\5\21\0\2\5\4\0\12\24\12\0\6\5\5\0"+
    "\22\5\3\0\30\5\1\0\11\5\1\0\1\5\2\0\7\5\72\0"+
    "\60\5\1\0\2\5\14\0\7\5\11\0\12\24\47\0\2\5\1\0"+
    "\1\5\2\0\2\5\1\0\1\5\2\0\1\5\6\0\4\5\1\0"+
    "\7\5\1\0\3\5\1\0\1\5\1\0\1\5\2\0\2\5\1\0"+
    "\4\5\1\0\2\5\11\0\1\5\2\0\5\5\1\0\1\5\11\0"+
    "\12\24\2\0\4\5\40\0\1\5\37\0\12\24\26\0\10\5\1\0"+
    "\44\5\33\0\5\5\163\0\53\5\24\0\1\5\12\24\6\0\6\5"+
    "\4\0\4\5\3\0\1\5\3\0\2\5\7\0\3\5\4\0\15\5"+
    "\14\0\1\5\1\0\12\24\6\0\46\5\1\0\1\5\5\0\1\5"+
    "\2\0\53\5\1\0\u014d\5\1\0\4\5\2\0\7\5\1\0\1\5"+
    "\1\0\4\5\2\0\51\5\1\0\4\5\2\0\41\5\1\0\4\5"+
    "\2\0\7\5\1\0\1\5\1\0\4\5\2\0\17\5\1\0\71\5"+
    "\1\0\4\5\2\0\103\5\45\0\20\5\20\0\125\5\14\0\u026c\5"+
    "\2\0\21\5\1\0\32\5\5\0\113\5\25\0\15\5\1\0\4\5"+
    "\16\0\22\5\16\0\22\5\16\0\15\5\1\0\3\5\17\0\64\5"+
    "\43\0\1\5\4\0\1\5\3\0\12\24\46\0\12\24\6\0\130\5"+
    "\10\0\51\5\1\0\1\5\5\0\106\5\12\0\35\5\51\0\12\24"+
    "\36\5\2\0\5\5\13\0\54\5\25\0\7\5\10\0\12\24\46\0"+
    "\27\5\11\0\65\5\53\0\12\24\6\0\12\24\15\0\1\5\135\0"+
    "\57\5\21\0\7\5\4\0\12\24\51\0\36\5\15\0\2\5\12\24"+
    "\54\5\32\0\44\5\34\0\12\24\3\0\3\5\12\24\44\5\153\0"+
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
    "\u010d\5\3\0\20\5\12\24\2\5\24\0\57\5\20\0\31\5\10\0"+
    "\106\5\61\0\11\5\2\0\147\5\2\0\4\5\1\0\4\5\14\0"+
    "\13\5\115\0\12\5\1\0\3\5\1\0\4\5\1\0\27\5\35\0"+
    "\64\5\16\0\62\5\34\0\12\24\30\0\6\5\3\0\1\5\4\0"+
    "\12\24\34\5\12\0\27\5\31\0\35\5\7\0\57\5\34\0\1\5"+
    "\12\24\46\0\51\5\27\0\3\5\1\0\10\5\4\0\12\24\6\0"+
    "\27\5\3\0\1\5\5\0\60\5\1\0\1\5\3\0\2\5\2\0"+
    "\5\5\2\0\1\5\1\0\1\5\30\0\3\5\2\0\13\5\7\0"+
    "\3\5\14\0\6\5\2\0\6\5\2\0\6\5\11\0\7\5\1\0"+
    "\7\5\221\0\43\5\15\0\12\24\6\0\u2ba4\5\14\0\27\5\4\0"+
    "\61\5\u2104\0\u016e\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0"+
    "\1\5\1\0\12\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0"+
    "\2\5\1\0\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0"+
    "\66\5\50\0\14\5\164\0\5\5\1\0\207\5\23\0\12\24\7\0"+
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
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\1\1\3"+
    "\1\1\1\3\1\5\1\3\1\6\6\3\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\5\3"+
    "\1\30\5\0\1\31\1\0\1\3\1\32\1\0\1\33"+
    "\1\34\1\3\1\35\4\3\1\36\4\3\1\37\3\3"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\10\3"+
    "\1\0\1\4\3\0\1\47\1\0\1\50\1\31\1\51"+
    "\2\3\1\52\4\3\1\53\3\3\1\54\1\55\6\3"+
    "\1\56\1\3\1\57\1\60\1\3\1\61\1\0\1\47"+
    "\1\3\1\62\1\63\1\64\2\3\1\65\1\3\1\66"+
    "\1\67\7\3\2\0\2\3\1\70\1\71\3\3\1\72"+
    "\1\73\1\74\1\75\1\47\1\76\1\77\1\100\1\101"+
    "\4\3\1\102\7\3\1\103";

  private static int [] zzUnpackAction() {
    int [] result = new int[169];
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
    "\0\0\0\73\0\166\0\261\0\354\0\u0127\0\u0162\0\u019d"+
    "\0\u01d8\0\u0213\0\u024e\0\u0289\0\73\0\u02c4\0\u02ff\0\u033a"+
    "\0\u0375\0\u03b0\0\u03eb\0\73\0\73\0\73\0\73\0\73"+
    "\0\73\0\u0426\0\u0461\0\73\0\73\0\73\0\73\0\u049c"+
    "\0\u04d7\0\u0512\0\u054d\0\73\0\u0588\0\u05c3\0\u05fe\0\u0639"+
    "\0\u0674\0\u06af\0\u06ea\0\u0725\0\u0760\0\u079b\0\u07d6\0\u0811"+
    "\0\u01d8\0\u084c\0\73\0\u0887\0\354\0\354\0\u08c2\0\u08fd"+
    "\0\u0938\0\u0973\0\u09ae\0\u09e9\0\354\0\u0a24\0\u0a5f\0\u0a9a"+
    "\0\u0ad5\0\354\0\u0b10\0\u0b4b\0\u0b86\0\73\0\73\0\73"+
    "\0\73\0\73\0\73\0\73\0\u0bc1\0\u0bfc\0\u0c37\0\u0c72"+
    "\0\u0cad\0\u0ce8\0\u0d23\0\u0d5e\0\u0d99\0\73\0\u0dd4\0\u0e0f"+
    "\0\u0e4a\0\u0e85\0\u0ec0\0\73\0\u0efb\0\354\0\u0f36\0\u0f71"+
    "\0\73\0\u0fac\0\u0fe7\0\u1022\0\u105d\0\354\0\u1098\0\u10d3"+
    "\0\u110e\0\354\0\354\0\u1149\0\u1184\0\u11bf\0\u11fa\0\u1235"+
    "\0\u1270\0\354\0\u12ab\0\354\0\354\0\u12e6\0\u06ea\0\u1321"+
    "\0\u135c\0\u1397\0\354\0\354\0\354\0\u13d2\0\u140d\0\354"+
    "\0\u1448\0\354\0\354\0\u1483\0\u14be\0\u14f9\0\u1534\0\u156f"+
    "\0\u15aa\0\u15e5\0\u1620\0\u165b\0\u1696\0\u16d1\0\354\0\354"+
    "\0\u170c\0\u1747\0\u1782\0\354\0\354\0\354\0\354\0\73"+
    "\0\354\0\354\0\354\0\354\0\u17bd\0\u17f8\0\u1833\0\u186e"+
    "\0\354\0\u18a9\0\u18e4\0\u191f\0\u195a\0\u1995\0\u19d0\0\u1a0b"+
    "\0\354";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[169];
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
    "\1\2\2\3\1\4\1\2\2\5\1\6\1\5\1\7"+
    "\1\10\1\11\1\2\1\12\7\6\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\3\5\1\46\1\5\1\47\1\5\1\50\2\5\1\51"+
    "\74\0\2\3\73\0\1\52\1\53\74\0\3\5\1\0"+
    "\1\5\2\0\7\5\2\0\1\5\1\0\6\5\21\0"+
    "\14\5\7\0\1\6\5\0\1\54\7\6\1\55\1\56"+
    "\3\0\1\54\40\0\2\57\1\0\2\57\2\60\1\57"+
    "\1\60\1\57\1\60\2\57\1\60\10\57\1\60\1\57"+
    "\6\60\21\57\14\60\6\0\3\5\1\0\1\5\1\61"+
    "\1\0\7\5\2\0\1\62\1\0\6\5\21\0\14\5"+
    "\13\61\1\63\1\64\56\61\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\1\65\5\5\21\0"+
    "\2\5\1\66\3\5\1\67\5\5\25\0\1\70\53\0"+
    "\3\5\1\0\1\5\2\0\7\5\2\0\1\5\1\0"+
    "\4\5\1\71\1\5\21\0\2\5\1\72\4\5\1\73"+
    "\4\5\6\0\3\5\1\0\1\5\2\0\7\5\2\0"+
    "\1\5\1\0\3\5\1\74\2\5\21\0\2\5\1\75"+
    "\2\5\1\76\6\5\6\0\3\5\1\0\1\77\2\0"+
    "\7\5\2\0\1\5\1\0\6\5\21\0\1\5\1\100"+
    "\12\5\6\0\3\5\1\0\1\5\2\0\7\5\2\0"+
    "\1\5\1\0\5\5\1\101\21\0\14\5\6\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\5\1\0\5\5"+
    "\1\102\21\0\14\5\6\0\3\5\1\0\1\5\2\0"+
    "\7\5\2\0\1\103\1\0\6\5\21\0\14\5\6\0"+
    "\3\5\1\0\1\5\2\0\7\5\2\0\1\104\1\0"+
    "\1\5\1\105\4\5\21\0\14\5\44\0\1\106\73\0"+
    "\1\107\102\0\1\110\70\0\1\111\1\0\1\112\70\0"+
    "\1\113\72\0\1\114\25\0\3\5\1\0\1\5\2\0"+
    "\7\5\2\0\1\5\1\0\6\5\21\0\1\5\1\115"+
    "\12\5\6\0\3\5\1\0\1\116\2\0\7\5\2\0"+
    "\1\5\1\0\6\5\21\0\5\5\1\117\6\5\6\0"+
    "\3\5\1\0\1\5\2\0\7\5\2\0\1\5\1\0"+
    "\2\5\1\120\1\121\2\5\21\0\5\5\1\122\6\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\2\5\1\123\3\5\21\0\14\5\6\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\5\1\0\6\5"+
    "\21\0\11\5\1\124\2\5\2\52\1\0\70\52\4\53"+
    "\1\125\66\53\16\0\1\126\1\127\1\130\1\131\60\0"+
    "\1\132\6\0\7\132\75\0\1\133\22\0\1\133\31\0"+
    "\1\134\67\0\3\135\1\134\1\135\2\0\7\135\2\0"+
    "\1\135\1\0\6\135\21\0\14\135\6\0\3\5\1\0"+
    "\1\5\2\0\7\5\2\0\1\5\1\0\1\136\1\137"+
    "\4\5\21\0\14\5\2\61\1\0\70\61\6\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\5\1\0\6\5"+
    "\21\0\10\5\1\140\3\5\25\0\1\141\53\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\5\1\0\5\5"+
    "\1\142\21\0\14\5\6\0\3\5\1\0\1\5\2\0"+
    "\7\5\2\0\1\5\1\0\2\5\1\143\3\5\21\0"+
    "\14\5\6\0\3\5\1\0\1\5\2\0\7\5\2\0"+
    "\1\5\1\0\1\5\1\144\4\5\21\0\14\5\6\0"+
    "\3\5\1\0\1\5\2\0\7\5\2\0\1\5\1\0"+
    "\4\5\1\145\1\5\21\0\14\5\6\0\3\5\1\0"+
    "\1\146\2\0\7\5\2\0\1\5\1\0\6\5\21\0"+
    "\14\5\6\0\3\5\1\0\1\5\2\0\7\5\2\0"+
    "\1\5\1\0\2\5\1\147\1\150\2\5\21\0\14\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\6\5\21\0\10\5\1\151\3\5\6\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\152\1\0\6\5"+
    "\21\0\14\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\5\1\0\1\5\1\153\4\5\21\0\14\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\4\5\1\154\1\5\21\0\14\5\6\0\3\5"+
    "\1\0\1\155\2\0\7\5\2\0\1\5\1\0\3\5"+
    "\1\156\2\5\21\0\14\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\1\5\1\157\4\5"+
    "\21\0\14\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\5\1\0\3\5\1\160\2\5\21\0\14\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\6\5\21\0\2\5\1\161\11\5\6\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\5\1\0\1\5"+
    "\1\162\4\5\21\0\14\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\1\5\1\163\4\5"+
    "\21\0\14\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\5\1\0\6\5\21\0\12\5\1\164\1\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\6\5\21\0\1\165\13\5\6\0\3\5\1\0"+
    "\1\5\2\0\7\5\2\0\1\166\1\0\6\5\21\0"+
    "\14\5\3\53\1\167\1\125\66\53\20\0\1\126\75\0"+
    "\1\126\71\0\1\126\57\0\1\132\6\0\7\132\1\0"+
    "\1\56\1\0\1\170\51\0\1\171\6\0\7\171\54\0"+
    "\3\135\1\0\1\135\2\0\7\135\2\0\1\135\1\0"+
    "\6\135\21\0\14\135\6\0\3\5\1\0\1\5\2\0"+
    "\7\5\2\0\1\5\1\0\2\5\1\172\3\5\21\0"+
    "\14\5\6\0\3\5\1\0\1\5\2\0\7\5\2\0"+
    "\1\5\1\0\4\5\1\173\1\5\21\0\14\5\6\0"+
    "\3\5\1\0\1\5\2\0\7\5\2\0\1\174\1\0"+
    "\6\5\21\0\14\5\6\0\3\5\1\0\1\5\2\0"+
    "\7\5\2\0\1\5\1\0\6\5\21\0\6\5\1\175"+
    "\5\5\6\0\3\5\1\0\1\5\2\0\7\5\2\0"+
    "\1\176\1\0\6\5\21\0\14\5\6\0\3\5\1\0"+
    "\1\5\2\0\7\5\2\0\1\5\1\0\5\5\1\177"+
    "\21\0\14\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\200\1\0\6\5\21\0\14\5\6\0\3\5"+
    "\1\0\1\5\2\0\1\201\6\5\2\0\1\5\1\0"+
    "\6\5\21\0\14\5\6\0\3\5\1\0\1\5\2\0"+
    "\7\5\2\0\1\202\1\0\6\5\21\0\14\5\6\0"+
    "\3\5\1\0\1\5\2\0\7\5\2\0\1\5\1\0"+
    "\1\203\5\5\21\0\14\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\2\5\1\204\3\5"+
    "\21\0\14\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\5\1\0\1\5\1\205\4\5\21\0\14\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\206"+
    "\1\0\6\5\21\0\14\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\1\5\1\207\4\5"+
    "\21\0\14\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\5\1\0\5\5\1\210\21\0\14\5\6\0"+
    "\3\5\1\0\1\5\2\0\7\5\2\0\1\5\1\0"+
    "\6\5\21\0\4\5\1\211\7\5\6\0\3\5\1\0"+
    "\1\212\2\0\7\5\2\0\1\5\1\0\6\5\21\0"+
    "\14\5\20\0\1\213\1\214\60\0\1\171\6\0\7\171"+
    "\3\0\1\170\50\0\3\5\1\0\1\215\2\0\7\5"+
    "\2\0\1\5\1\0\6\5\21\0\14\5\6\0\3\5"+
    "\1\0\1\216\2\0\7\5\2\0\1\5\1\0\6\5"+
    "\21\0\14\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\217\1\0\6\5\21\0\14\5\6\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\5\1\0\1\5"+
    "\1\220\4\5\21\0\14\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\6\5\21\0\4\5"+
    "\1\221\7\5\6\0\3\5\1\0\1\5\2\0\1\222"+
    "\6\5\2\0\1\5\1\0\6\5\21\0\14\5\6\0"+
    "\1\223\2\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\6\5\21\0\14\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\224\1\0\6\5\21\0\14\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\1\5\1\225\4\5\21\0\14\5\6\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\5\1\0\6\5"+
    "\21\0\11\5\1\226\2\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\227\1\0\6\5\21\0\14\5"+
    "\23\0\1\230\71\0\1\230\56\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\6\5\21\0\2\5"+
    "\1\231\11\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\5\1\0\6\5\21\0\2\5\1\232\11\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\1\5\1\233\4\5\21\0\14\5\6\0\3\5"+
    "\1\0\1\5\2\0\7\5\2\0\1\5\1\0\6\5"+
    "\21\0\4\5\1\234\7\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\4\5\1\235\1\236"+
    "\21\0\14\5\6\0\3\5\1\0\1\5\2\0\1\237"+
    "\6\5\2\0\1\5\1\0\6\5\21\0\14\5\6\0"+
    "\3\5\1\0\1\5\2\0\7\5\2\0\1\5\1\0"+
    "\1\5\1\240\4\5\21\0\14\5\6\0\3\5\1\0"+
    "\1\5\2\0\7\5\2\0\1\5\1\0\1\5\1\241"+
    "\4\5\21\0\14\5\6\0\3\5\1\0\1\242\2\0"+
    "\7\5\2\0\1\5\1\0\6\5\21\0\14\5\6\0"+
    "\3\5\1\0\1\5\2\0\1\243\6\5\2\0\1\5"+
    "\1\0\6\5\21\0\14\5\6\0\3\5\1\0\1\5"+
    "\2\0\7\5\2\0\1\5\1\0\6\5\21\0\2\5"+
    "\1\244\11\5\6\0\3\5\1\0\1\5\2\0\7\5"+
    "\2\0\1\5\1\0\6\5\21\0\3\5\1\245\10\5"+
    "\6\0\1\246\2\5\1\0\1\5\2\0\7\5\2\0"+
    "\1\5\1\0\6\5\21\0\14\5\6\0\3\5\1\0"+
    "\1\5\2\0\7\5\2\0\1\5\1\0\4\5\1\247"+
    "\1\5\21\0\14\5\6\0\3\5\1\0\1\5\2\0"+
    "\1\250\6\5\2\0\1\5\1\0\6\5\21\0\14\5"+
    "\6\0\3\5\1\0\1\5\2\0\7\5\2\0\1\5"+
    "\1\0\1\5\1\251\4\5\21\0\14\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6726];
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
    "\1\0\1\11\12\1\1\11\6\1\6\11\2\1\4\11"+
    "\4\1\1\11\6\1\5\0\1\1\1\0\1\1\1\11"+
    "\1\0\21\1\7\11\10\1\1\0\1\11\3\0\1\1"+
    "\1\0\1\11\4\1\1\11\26\1\1\0\22\1\2\0"+
    "\13\1\1\11\21\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[169];
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
    while (i < 1728) {
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
        case 36: 
          { return FAT_ARROW;
          }
        case 68: break;
        case 27: 
          { return IF;
          }
        case 69: break;
        case 33: 
          { return AMPERSAND_AMPERSAND;
          }
        case 70: break;
        case 37: 
          { return LESS_EQUAL;
          }
        case 71: break;
        case 60: 
          { return MATCH;
          }
        case 72: break;
        case 50: 
          { return IMPL;
          }
        case 73: break;
        case 4: 
          { return LIT_INTEGER;
          }
        case 74: break;
        case 32: 
          { return PIPE_PIPE;
          }
        case 75: break;
        case 39: 
          { return LIT_FLOAT;
          }
        case 76: break;
        case 10: 
          { return CURLY_RIGHT;
          }
        case 77: break;
        case 47: 
          { return MOD;
          }
        case 78: break;
        case 54: 
          { return TYPE;
          }
        case 79: break;
        case 56: 
          { return FALSE;
          }
        case 80: break;
        case 16: 
          { return COMMA;
          }
        case 81: break;
        case 21: 
          { return LESS;
          }
        case 82: break;
        case 46: 
          { return MUT;
          }
        case 83: break;
        case 5: 
          { return DOT;
          }
        case 84: break;
        case 23: 
          { return HASH;
          }
        case 85: break;
        case 28: 
          { return IN;
          }
        case 86: break;
        case 15: 
          { return SEMI;
          }
        case 87: break;
        case 61: 
          { return WHERE;
          }
        case 88: break;
        case 8: 
          { return PAR_RIGHT;
          }
        case 89: break;
        case 18: 
          { return COLON;
          }
        case 90: break;
        case 48: 
          { return PUB;
          }
        case 91: break;
        case 58: 
          { return CRATE;
          }
        case 92: break;
        case 49: 
          { return BLOCK_COMMENT;
          }
        case 93: break;
        case 55: 
          { return SELF;
          }
        case 94: break;
        case 9: 
          { return CURLY_LEFT;
          }
        case 95: break;
        case 11: 
          { return BRACKET_LEFT;
          }
        case 96: break;
        case 14: 
          { return AMPERSAND;
          }
        case 97: break;
        case 20: 
          { return ASSIGN;
          }
        case 98: break;
        case 38: 
          { return GREATER_EQUAL;
          }
        case 99: break;
        case 12: 
          { return BRACKET_RIGHT;
          }
        case 100: break;
        case 29: 
          { return DOT_DOT;
          }
        case 101: break;
        case 24: 
          { return LINE_COMMENT;
          }
        case 102: break;
        case 57: 
          { return TRAIT;
          }
        case 103: break;
        case 40: 
          { return LIT_CHAR;
          }
        case 104: break;
        case 22: 
          { return GREATER;
          }
        case 105: break;
        case 52: 
          { return ENUM;
          }
        case 106: break;
        case 31: 
          { return AS;
          }
        case 107: break;
        case 51: 
          { return ELSE;
          }
        case 108: break;
        case 62: 
          { return RETURN;
          }
        case 109: break;
        case 34: 
          { return THIN_ARROW;
          }
        case 110: break;
        case 30: 
          { return FN;
          }
        case 111: break;
        case 35: 
          { return EQUAL_EQUAL;
          }
        case 112: break;
        case 19: 
          { return MINUS;
          }
        case 113: break;
        case 64: 
          { return STRUCT;
          }
        case 114: break;
        case 44: 
          { return USE;
          }
        case 115: break;
        case 45: 
          { return LET;
          }
        case 116: break;
        case 7: 
          { return PAR_LEFT;
          }
        case 117: break;
        case 13: 
          { return PIPE;
          }
        case 118: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 119: break;
        case 25: 
          { return LIFETIME;
          }
        case 120: break;
        case 53: 
          { return TRUE;
          }
        case 121: break;
        case 43: 
          { return FOR;
          }
        case 122: break;
        case 41: 
          { return REF;
          }
        case 123: break;
        case 3: 
          { return IDENT;
          }
        case 124: break;
        case 59: 
          { return CONST;
          }
        case 125: break;
        case 65: 
          { return STATIC;
          }
        case 126: break;
        case 26: 
          { return LIT_STRING;
          }
        case 127: break;
        case 6: 
          { return PLUS;
          }
        case 128: break;
        case 42: 
          { return DOT_DOT_DOT;
          }
        case 129: break;
        case 63: 
          { return EXTERN;
          }
        case 130: break;
        case 67: 
          { return LIT_BYTE_STRING;
          }
        case 131: break;
        case 17: 
          { return BANG;
          }
        case 132: break;
        case 66: 
          { return LIT_BYTE;
          }
        case 133: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 134: break;
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
