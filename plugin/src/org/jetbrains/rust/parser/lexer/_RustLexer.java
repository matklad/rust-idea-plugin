/* The following code was generated by JFlex 1.4.3 on 9/8/15 7:27 PM */

package org.jetbrains.rust.parser.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.jetbrains.rust.psi.RustTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/8/15 7:27 PM from the specification file
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
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\35\1\12"+
    "\4\0\1\10\1\24\1\25\1\4\1\0\1\34\1\0\1\32\1\3"+
    "\12\14\1\0\1\33\5\0\32\7\1\30\1\13\1\31\1\0\1\6"+
    "\1\0\1\21\1\36\1\43\1\47\1\17\1\20\1\42\1\52\1\40"+
    "\2\7\1\22\1\46\1\41\1\44\1\50\1\7\1\11\1\23\1\15"+
    "\1\16\1\7\1\51\1\45\1\37\1\7\1\26\1\0\1\27\54\0"+
    "\1\5\12\0\1\5\4\0\1\5\5\0\27\5\1\0\37\5\1\0"+
    "\u01ca\5\4\0\14\5\16\0\5\5\7\0\1\5\1\0\1\5\201\0"+
    "\5\5\1\0\2\5\2\0\4\5\10\0\1\5\1\0\3\5\1\0"+
    "\1\5\1\0\24\5\1\0\123\5\1\0\213\5\10\0\236\5\11\0"+
    "\46\5\2\0\1\5\7\0\47\5\110\0\33\5\5\0\3\5\55\0"+
    "\53\5\43\0\2\5\1\0\143\5\1\0\1\5\17\0\2\5\7\0"+
    "\2\5\12\0\3\5\2\0\1\5\20\0\1\5\1\0\36\5\35\0"+
    "\131\5\13\0\1\5\30\0\41\5\11\0\2\5\4\0\1\5\5\0"+
    "\26\5\4\0\1\5\11\0\1\5\3\0\1\5\27\0\31\5\107\0"+
    "\1\5\1\0\13\5\127\0\66\5\3\0\1\5\22\0\1\5\7\0"+
    "\12\5\17\0\7\5\1\0\7\5\5\0\10\5\2\0\2\5\2\0"+
    "\26\5\1\0\7\5\1\0\1\5\3\0\4\5\3\0\1\5\20\0"+
    "\1\5\15\0\2\5\1\0\3\5\16\0\2\5\23\0\6\5\4\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\2\5\1\0"+
    "\2\5\37\0\4\5\1\0\1\5\23\0\3\5\20\0\11\5\1\0"+
    "\3\5\1\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5\3\0"+
    "\1\5\22\0\1\5\17\0\2\5\43\0\10\5\2\0\2\5\2\0"+
    "\26\5\1\0\7\5\1\0\2\5\1\0\5\5\3\0\1\5\36\0"+
    "\2\5\1\0\3\5\17\0\1\5\21\0\1\5\1\0\6\5\3\0"+
    "\3\5\1\0\4\5\3\0\2\5\1\0\1\5\1\0\2\5\3\0"+
    "\2\5\3\0\3\5\3\0\14\5\26\0\1\5\64\0\10\5\1\0"+
    "\3\5\1\0\27\5\1\0\12\5\1\0\5\5\3\0\1\5\32\0"+
    "\2\5\6\0\2\5\43\0\10\5\1\0\3\5\1\0\27\5\1\0"+
    "\12\5\1\0\5\5\3\0\1\5\40\0\1\5\1\0\2\5\17\0"+
    "\2\5\22\0\10\5\1\0\3\5\1\0\51\5\2\0\1\5\20\0"+
    "\1\5\21\0\2\5\30\0\6\5\5\0\22\5\3\0\30\5\1\0"+
    "\11\5\1\0\1\5\2\0\7\5\72\0\60\5\1\0\2\5\14\0"+
    "\7\5\72\0\2\5\1\0\1\5\2\0\2\5\1\0\1\5\2\0"+
    "\1\5\6\0\4\5\1\0\7\5\1\0\3\5\1\0\1\5\1\0"+
    "\1\5\2\0\2\5\1\0\4\5\1\0\2\5\11\0\1\5\2\0"+
    "\5\5\1\0\1\5\25\0\4\5\40\0\1\5\77\0\10\5\1\0"+
    "\44\5\33\0\5\5\163\0\53\5\24\0\1\5\20\0\6\5\4\0"+
    "\4\5\3\0\1\5\3\0\2\5\7\0\3\5\4\0\15\5\14\0"+
    "\1\5\21\0\46\5\1\0\1\5\5\0\1\5\2\0\53\5\1\0"+
    "\u014d\5\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0"+
    "\51\5\1\0\4\5\2\0\41\5\1\0\4\5\2\0\7\5\1\0"+
    "\1\5\1\0\4\5\2\0\17\5\1\0\71\5\1\0\4\5\2\0"+
    "\103\5\45\0\20\5\20\0\125\5\14\0\u026c\5\2\0\21\5\1\0"+
    "\32\5\5\0\113\5\25\0\15\5\1\0\4\5\16\0\22\5\16\0"+
    "\22\5\16\0\15\5\1\0\3\5\17\0\64\5\43\0\1\5\4\0"+
    "\1\5\103\0\130\5\10\0\51\5\1\0\1\5\5\0\106\5\12\0"+
    "\35\5\63\0\36\5\2\0\5\5\13\0\54\5\25\0\7\5\70\0"+
    "\27\5\11\0\65\5\122\0\1\5\135\0\57\5\21\0\7\5\67\0"+
    "\36\5\15\0\2\5\12\0\54\5\32\0\44\5\51\0\3\5\12\0"+
    "\44\5\153\0\4\5\1\0\4\5\3\0\2\5\11\0\300\5\100\0"+
    "\u0116\5\2\0\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0"+
    "\7\5\1\0\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0"+
    "\6\5\4\0\15\5\5\0\3\5\1\0\7\5\164\0\1\5\15\0"+
    "\1\5\20\0\15\5\145\0\1\5\4\0\1\5\2\0\12\5\1\0"+
    "\1\5\3\0\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\4\5\1\0\13\5\2\0\4\5\5\0\5\5\4\0\1\5\64\0"+
    "\2\5\u0a7b\0\57\5\1\0\57\5\1\0\205\5\6\0\4\5\3\0"+
    "\2\5\14\0\46\5\1\0\1\5\5\0\1\5\2\0\70\5\7\0"+
    "\1\5\20\0\27\5\11\0\7\5\1\0\7\5\1\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\120\0"+
    "\1\5\u01d5\0\2\5\52\0\5\5\5\0\2\5\4\0\126\5\6\0"+
    "\3\5\1\0\132\5\1\0\4\5\5\0\51\5\3\0\136\5\21\0"+
    "\33\5\65\0\20\5\u0200\0\u19b6\5\112\0\u51cd\5\63\0\u048d\5\103\0"+
    "\56\5\2\0\u010d\5\3\0\20\5\12\0\2\5\24\0\57\5\20\0"+
    "\31\5\10\0\106\5\61\0\11\5\2\0\147\5\2\0\4\5\1\0"+
    "\4\5\14\0\13\5\115\0\12\5\1\0\3\5\1\0\4\5\1\0"+
    "\27\5\35\0\64\5\16\0\62\5\76\0\6\5\3\0\1\5\16\0"+
    "\34\5\12\0\27\5\31\0\35\5\7\0\57\5\34\0\1\5\60\0"+
    "\51\5\27\0\3\5\1\0\10\5\24\0\27\5\3\0\1\5\5\0"+
    "\60\5\1\0\1\5\3\0\2\5\2\0\5\5\2\0\1\5\1\0"+
    "\1\5\30\0\3\5\2\0\13\5\7\0\3\5\14\0\6\5\2\0"+
    "\6\5\2\0\6\5\11\0\7\5\1\0\7\5\221\0\43\5\35\0"+
    "\u2ba4\5\14\0\27\5\4\0\61\5\u2104\0\u016e\5\2\0\152\5\46\0"+
    "\7\5\14\0\5\5\5\0\1\5\1\0\12\5\1\0\15\5\1\0"+
    "\5\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0\154\5\41\0"+
    "\u016b\5\22\0\100\5\2\0\66\5\50\0\14\5\164\0\5\5\1\0"+
    "\207\5\44\0\32\5\6\0\32\5\13\0\131\5\3\0\6\5\2\0"+
    "\6\5\2\0\6\5\2\0\3\5\43\0";

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
    "\1\4\7\3\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\5\3\1\17\3\0\1\20"+
    "\1\0\4\3\1\21\1\22\3\3\1\23\7\3\1\0"+
    "\1\24\1\3\1\25\2\3\1\26\3\3\1\27\3\3"+
    "\1\30\1\31\1\32\1\3\1\33\1\34\12\3\1\35"+
    "\4\3\1\36\1\37\1\40\1\41\1\3\1\42\1\43"+
    "\6\3\1\44\1\3\1\45\6\3\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[112];
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
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285"+
    "\0\53\0\53\0\53\0\53\0\53\0\53\0\u02b0\0\53"+
    "\0\53\0\53\0\u02db\0\u0306\0\u0331\0\u035c\0\u0387\0\u03b2"+
    "\0\u03dd\0\u0408\0\u012d\0\53\0\u0433\0\u045e\0\u0489\0\u04b4"+
    "\0\u04df\0\254\0\254\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6"+
    "\0\u05e1\0\u060c\0\u0637\0\u0662\0\u068d\0\u06b8\0\u06e3\0\53"+
    "\0\u070e\0\254\0\u0739\0\u0764\0\254\0\u078f\0\u07ba\0\u07e5"+
    "\0\53\0\u0810\0\u083b\0\u0866\0\254\0\254\0\254\0\u0891"+
    "\0\u03dd\0\254\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993"+
    "\0\u09be\0\u09e9\0\u0a14\0\u0a3f\0\254\0\u0a6a\0\u0a95\0\u0ac0"+
    "\0\u0aeb\0\254\0\254\0\254\0\254\0\u0b16\0\254\0\254"+
    "\0\u0b41\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0c18\0\254\0\u0c43"+
    "\0\254\0\u0c6e\0\u0c99\0\u0cc4\0\u0cef\0\u0d1a\0\u0d45\0\254";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[112];
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
    "\1\7\1\10\1\2\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\4\5\1\34"+
    "\2\5\1\35\1\5\1\36\1\37\1\5\54\0\2\3"+
    "\53\0\1\40\1\41\54\0\2\5\1\0\1\5\2\0"+
    "\10\5\12\0\15\5\2\42\1\0\50\42\6\0\2\5"+
    "\1\0\1\5\1\43\1\0\10\5\12\0\15\5\12\43"+
    "\1\44\1\45\37\43\14\0\1\11\44\0\2\5\1\0"+
    "\1\46\2\0\10\5\12\0\15\5\6\0\2\5\1\0"+
    "\1\5\2\0\7\5\1\47\12\0\15\5\6\0\2\5"+
    "\1\0\1\5\2\0\10\5\12\0\7\5\1\50\5\5"+
    "\6\0\2\5\1\0\1\5\2\0\5\5\1\51\2\5"+
    "\12\0\3\5\1\52\11\5\6\0\2\5\1\0\1\5"+
    "\2\0\7\5\1\53\12\0\15\5\6\0\2\5\1\0"+
    "\1\5\2\0\3\5\1\54\4\5\12\0\2\5\1\55"+
    "\12\5\6\0\2\5\1\0\1\5\2\0\1\5\1\56"+
    "\6\5\12\0\15\5\32\0\1\57\26\0\2\5\1\0"+
    "\1\5\2\0\10\5\12\0\1\5\1\60\13\5\6\0"+
    "\2\5\1\0\1\61\2\0\10\5\12\0\6\5\1\62"+
    "\6\5\6\0\2\5\1\0\1\5\2\0\2\5\1\63"+
    "\5\5\12\0\6\5\1\64\6\5\6\0\2\5\1\0"+
    "\1\5\2\0\2\5\1\65\5\5\12\0\15\5\6\0"+
    "\2\5\1\0\1\5\2\0\10\5\12\0\14\5\1\66"+
    "\2\40\1\0\50\40\4\41\1\67\46\41\10\0\1\70"+
    "\42\0\2\43\1\0\50\43\6\0\2\5\1\0\1\5"+
    "\2\0\2\5\1\71\5\5\12\0\15\5\6\0\2\5"+
    "\1\0\1\5\2\0\3\5\1\72\4\5\12\0\15\5"+
    "\6\0\2\5\1\0\1\5\2\0\1\5\1\73\6\5"+
    "\12\0\15\5\6\0\2\5\1\0\1\5\2\0\6\5"+
    "\1\74\1\5\12\0\15\5\6\0\2\5\1\0\1\5"+
    "\2\0\1\5\1\75\6\5\12\0\15\5\6\0\2\5"+
    "\1\0\1\5\2\0\4\5\1\76\3\5\12\0\15\5"+
    "\6\0\2\5\1\0\1\77\2\0\5\5\1\100\2\5"+
    "\12\0\15\5\32\0\1\101\26\0\2\5\1\0\1\5"+
    "\2\0\1\5\1\102\6\5\12\0\15\5\6\0\2\5"+
    "\1\0\1\5\2\0\5\5\1\103\2\5\12\0\15\5"+
    "\6\0\2\5\1\0\1\5\2\0\10\5\12\0\3\5"+
    "\1\104\11\5\6\0\2\5\1\0\1\5\2\0\1\5"+
    "\1\105\6\5\12\0\15\5\6\0\2\5\1\0\1\5"+
    "\2\0\10\5\12\0\11\5\1\106\3\5\6\0\2\5"+
    "\1\0\1\5\2\0\10\5\12\0\1\107\14\5\6\0"+
    "\2\5\1\0\1\5\2\0\3\5\1\110\4\5\12\0"+
    "\15\5\3\41\1\111\1\67\46\41\6\0\2\5\1\0"+
    "\1\5\2\0\3\5\1\112\4\5\12\0\15\5\6\0"+
    "\2\5\1\0\1\5\2\0\3\5\1\113\4\5\12\0"+
    "\15\5\6\0\2\5\1\0\1\5\2\0\7\5\1\114"+
    "\12\0\15\5\6\0\2\5\1\0\1\5\2\0\3\5"+
    "\1\115\4\5\12\0\15\5\6\0\2\5\1\0\1\5"+
    "\2\0\2\5\1\116\5\5\12\0\15\5\6\0\2\5"+
    "\1\0\1\5\2\0\1\5\1\117\6\5\12\0\15\5"+
    "\6\0\2\5\1\0\1\5\2\0\3\5\1\120\4\5"+
    "\12\0\15\5\6\0\2\5\1\0\1\5\2\0\1\5"+
    "\1\121\6\5\12\0\15\5\6\0\2\5\1\0\1\5"+
    "\2\0\7\5\1\122\12\0\15\5\6\0\2\5\1\0"+
    "\1\123\2\0\10\5\12\0\15\5\6\0\2\5\1\0"+
    "\1\124\2\0\10\5\12\0\15\5\6\0\2\5\1\0"+
    "\1\5\2\0\3\5\1\125\4\5\12\0\15\5\6\0"+
    "\2\5\1\0\1\5\2\0\1\5\1\126\6\5\12\0"+
    "\15\5\6\0\2\5\1\0\1\5\2\0\10\5\12\0"+
    "\5\5\1\127\7\5\6\0\2\5\1\0\1\5\2\0"+
    "\10\5\12\0\2\5\1\130\12\5\6\0\1\131\1\5"+
    "\1\0\1\5\2\0\10\5\12\0\15\5\6\0\2\5"+
    "\1\0\1\5\2\0\3\5\1\132\4\5\12\0\15\5"+
    "\6\0\2\5\1\0\1\5\2\0\1\5\1\133\6\5"+
    "\12\0\15\5\6\0\2\5\1\0\1\5\2\0\3\5"+
    "\1\134\4\5\12\0\15\5\6\0\2\5\1\0\1\5"+
    "\2\0\10\5\12\0\3\5\1\135\11\5\6\0\2\5"+
    "\1\0\1\5\2\0\10\5\12\0\2\5\1\136\12\5"+
    "\6\0\2\5\1\0\1\5\2\0\1\5\1\137\6\5"+
    "\12\0\15\5\6\0\2\5\1\0\1\5\2\0\10\5"+
    "\12\0\5\5\1\140\7\5\6\0\2\5\1\0\1\5"+
    "\2\0\6\5\1\141\1\142\12\0\15\5\6\0\2\5"+
    "\1\0\1\5\2\0\10\5\12\0\10\5\1\143\4\5"+
    "\6\0\2\5\1\0\1\5\2\0\10\5\12\0\2\5"+
    "\1\144\12\5\6\0\2\5\1\0\1\5\2\0\1\5"+
    "\1\145\6\5\12\0\15\5\6\0\2\5\1\0\1\5"+
    "\2\0\3\5\1\146\4\5\12\0\15\5\6\0\2\5"+
    "\1\0\1\5\2\0\1\5\1\147\6\5\12\0\15\5"+
    "\6\0\2\5\1\0\1\150\2\0\10\5\12\0\15\5"+
    "\6\0\2\5\1\0\1\5\2\0\7\5\1\151\12\0"+
    "\15\5\6\0\2\5\1\0\1\5\2\0\10\5\12\0"+
    "\2\5\1\152\12\5\6\0\2\5\1\0\1\5\2\0"+
    "\10\5\12\0\3\5\1\153\11\5\6\0\2\5\1\0"+
    "\1\5\2\0\10\5\12\0\4\5\1\154\10\5\6\0"+
    "\1\155\1\5\1\0\1\5\2\0\10\5\12\0\15\5"+
    "\6\0\2\5\1\0\1\5\2\0\6\5\1\156\1\5"+
    "\12\0\15\5\6\0\2\5\1\0\1\5\2\0\10\5"+
    "\12\0\2\5\1\157\12\5\6\0\2\5\1\0\1\5"+
    "\2\0\1\5\1\160\6\5\12\0\15\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3440];
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
    "\1\0\1\11\16\1\6\11\1\1\3\11\6\1\3\0"+
    "\1\11\1\0\21\1\1\0\1\11\10\1\1\11\57\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[112];
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
    while (i < 1592) {
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
        case 4: 
          { return LIT_INTEGER;
          }
        case 39: break;
        case 37: 
          { return LIFETIMES;
          }
        case 40: break;
        case 8: 
          { return CURLY_RIGHT;
          }
        case 41: break;
        case 25: 
          { return MOD;
          }
        case 42: break;
        case 29: 
          { return FALSE;
          }
        case 43: break;
        case 13: 
          { return COMMA;
          }
        case 44: break;
        case 11: 
          { return DOT;
          }
        case 45: break;
        case 24: 
          { return MUT;
          }
        case 46: break;
        case 12: 
          { return SEMI;
          }
        case 47: break;
        case 6: 
          { return PAR_RIGHT;
          }
        case 48: break;
        case 32: 
          { return WHERE;
          }
        case 49: break;
        case 26: 
          { return PUB;
          }
        case 50: break;
        case 27: 
          { return BLOCK_COMMENT;
          }
        case 51: break;
        case 30: 
          { return CRATE;
          }
        case 52: break;
        case 7: 
          { return CURLY_LEFT;
          }
        case 53: break;
        case 9: 
          { return BRACKET_LEFT;
          }
        case 54: break;
        case 10: 
          { return BRACKET_RIGHT;
          }
        case 55: break;
        case 19: 
          { return DOT_DOT;
          }
        case 56: break;
        case 15: 
          { return LINE_COMMENT;
          }
        case 57: break;
        case 20: 
          { return LIT_CHAR;
          }
        case 58: break;
        case 18: 
          { return AS;
          }
        case 59: break;
        case 17: 
          { return FN;
          }
        case 60: break;
        case 34: 
          { return STRUCT;
          }
        case 61: break;
        case 21: 
          { return USE;
          }
        case 62: break;
        case 22: 
          { return LET;
          }
        case 63: break;
        case 5: 
          { return PAR_LEFT;
          }
        case 64: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 65: break;
        case 28: 
          { return TRUE;
          }
        case 66: break;
        case 3: 
          { return IDENT;
          }
        case 67: break;
        case 31: 
          { return CONST;
          }
        case 68: break;
        case 35: 
          { return STATIC;
          }
        case 69: break;
        case 16: 
          { return LIT_STRING;
          }
        case 70: break;
        case 23: 
          { return DOT_DOT_DOT;
          }
        case 71: break;
        case 33: 
          { return EXTERN;
          }
        case 72: break;
        case 38: 
          { return LIT_BYTE_STRING;
          }
        case 73: break;
        case 14: 
          { return BANG;
          }
        case 74: break;
        case 36: 
          { return LIT_BYTE;
          }
        case 75: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 76: break;
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
