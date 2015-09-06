// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.rust.parser.RustTokenType;
import org.jetbrains.rust.psi.impl.*;

public interface RustTypes {

  IElementType ARRAY_REF_EXPR = new RustElementType("ARRAY_REF_EXPR");
  IElementType ASSIGN_EXPR = new RustElementType("ASSIGN_EXPR");
  IElementType ATTRS_AND_VIS = new RustElementType("ATTRS_AND_VIS");
  IElementType BAND_EXPR = new RustElementType("BAND_EXPR");
  IElementType BLOCK_EXPR = new RustElementType("BLOCK_EXPR");
  IElementType BORROW_EXPR = new RustElementType("BORROW_EXPR");
  IElementType BOR_EXPR = new RustElementType("BOR_EXPR");
  IElementType BXOR_EXPR = new RustElementType("BXOR_EXPR");
  IElementType CALL_EXPR = new RustElementType("CALL_EXPR");
  IElementType CAST_EXPR = new RustElementType("CAST_EXPR");
  IElementType DEREF_EXPR = new RustElementType("DEREF_EXPR");
  IElementType DIV_EXPR = new RustElementType("DIV_EXPR");
  IElementType EQ_EXPR = new RustElementType("EQ_EXPR");
  IElementType EXPR = new RustElementType("EXPR");
  IElementType GENERIC_PARAMS = new RustElementType("GENERIC_PARAMS");
  IElementType GEQ_EXPR = new RustElementType("GEQ_EXPR");
  IElementType GT_EXPR = new RustElementType("GT_EXPR");
  IElementType INNER_ATTR = new RustElementType("INNER_ATTR");
  IElementType ITEM_CONST = new RustElementType("ITEM_CONST");
  IElementType ITEM_FN = new RustElementType("ITEM_FN");
  IElementType ITEM_MOD = new RustElementType("ITEM_MOD");
  IElementType ITEM_STATIC = new RustElementType("ITEM_STATIC");
  IElementType LAND_EXPR = new RustElementType("LAND_EXPR");
  IElementType LEQ_EXPR = new RustElementType("LEQ_EXPR");
  IElementType LIT = new RustElementType("LIT");
  IElementType LITERAL_EXPR = new RustElementType("LITERAL_EXPR");
  IElementType LOR_EXPR = new RustElementType("LOR_EXPR");
  IElementType LT_EXPR = new RustElementType("LT_EXPR");
  IElementType MACRO_EXPR = new RustElementType("MACRO_EXPR");
  IElementType META_ITEM = new RustElementType("META_ITEM");
  IElementType MINUS_EXPR = new RustElementType("MINUS_EXPR");
  IElementType MOD_EXPR = new RustElementType("MOD_EXPR");
  IElementType MOD_ITEM = new RustElementType("MOD_ITEM");
  IElementType MUL_EXPR = new RustElementType("MUL_EXPR");
  IElementType NEQ_EXPR = new RustElementType("NEQ_EXPR");
  IElementType NOT_EXPR = new RustElementType("NOT_EXPR");
  IElementType OUTER_ATTR = new RustElementType("OUTER_ATTR");
  IElementType OUTER_ATTRS = new RustElementType("OUTER_ATTRS");
  IElementType PAREN_EXPR = new RustElementType("PAREN_EXPR");
  IElementType PLUS_EXPR = new RustElementType("PLUS_EXPR");
  IElementType REF_EXPR = new RustElementType("REF_EXPR");
  IElementType SHL_EXPR = new RustElementType("SHL_EXPR");
  IElementType SHR_EXPR = new RustElementType("SHR_EXPR");
  IElementType SIMPLE_REF_EXPR = new RustElementType("SIMPLE_REF_EXPR");
  IElementType STMT = new RustElementType("STMT");
  IElementType TY = new RustElementType("TY");
  IElementType UNARY_MIN_EXPR = new RustElementType("UNARY_MIN_EXPR");
  IElementType VISIBILITY = new RustElementType("VISIBILITY");
  IElementType WHERE_CLAUSE = new RustElementType("WHERE_CLAUSE");

  IElementType BANG = new RustTokenType("!");
  IElementType BLOCK_COMMENT = new RustTokenType("block_comment");
  IElementType BRACKET_LEFT = new RustTokenType("[");
  IElementType BRACKET_RIGHT = new RustTokenType("]");
  IElementType COMMA = new RustTokenType(",");
  IElementType CONST = new RustTokenType("const");
  IElementType CURLY_LEFT = new RustTokenType("{");
  IElementType CURLY_RIGHT = new RustTokenType("}");
  IElementType DOT = new RustTokenType(".");
  IElementType DOT_DOT = new RustTokenType("..");
  IElementType DOT_DOT_DOT = new RustTokenType("...");
  IElementType FALSE = new RustTokenType("false");
  IElementType FN = new RustTokenType("fn");
  IElementType IDENT = new RustTokenType("ident");
  IElementType LIFETIMES = new RustTokenType("lifetimes");
  IElementType LINE_COMMENT = new RustTokenType("line_comment");
  IElementType LIT_BOOL = new RustTokenType("lit_bool");
  IElementType LIT_BYTE = new RustTokenType("byte_lit");
  IElementType LIT_BYTE_STRING = new RustTokenType("byte_string_lit");
  IElementType LIT_CHAR = new RustTokenType("lit_char");
  IElementType LIT_INTEGER = new RustTokenType("lit_integer");
  IElementType LIT_STRING = new RustTokenType("lit_string");
  IElementType MOD = new RustTokenType("mod");
  IElementType MUT = new RustTokenType("mut");
  IElementType PARAM = new RustTokenType("param");
  IElementType PAR_LEFT = new RustTokenType("(");
  IElementType PAR_RIGHT = new RustTokenType(")");
  IElementType PUB = new RustTokenType("pub");
  IElementType SEMI = new RustTokenType(";");
  IElementType STATIC = new RustTokenType("static");
  IElementType STR = new RustTokenType("str");
  IElementType TRUE = new RustTokenType("true");
  IElementType WHERE = new RustTokenType("where");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARRAY_REF_EXPR) {
        return new RustArrayRefExprImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new RustAssignExprImpl(node);
      }
      else if (type == ATTRS_AND_VIS) {
        return new RustAttrsAndVisImpl(node);
      }
      else if (type == BAND_EXPR) {
        return new RustBandExprImpl(node);
      }
      else if (type == BLOCK_EXPR) {
        return new RustBlockExprImpl(node);
      }
      else if (type == BORROW_EXPR) {
        return new RustBorrowExprImpl(node);
      }
      else if (type == BOR_EXPR) {
        return new RustBorExprImpl(node);
      }
      else if (type == BXOR_EXPR) {
        return new RustBxorExprImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new RustCallExprImpl(node);
      }
      else if (type == CAST_EXPR) {
        return new RustCastExprImpl(node);
      }
      else if (type == DEREF_EXPR) {
        return new RustDerefExprImpl(node);
      }
      else if (type == DIV_EXPR) {
        return new RustDivExprImpl(node);
      }
      else if (type == EQ_EXPR) {
        return new RustEqExprImpl(node);
      }
      else if (type == EXPR) {
        return new RustExprImpl(node);
      }
      else if (type == GENERIC_PARAMS) {
        return new RustGenericParamsImpl(node);
      }
      else if (type == GEQ_EXPR) {
        return new RustGeqExprImpl(node);
      }
      else if (type == GT_EXPR) {
        return new RustGtExprImpl(node);
      }
      else if (type == INNER_ATTR) {
        return new RustInnerAttrImpl(node);
      }
      else if (type == ITEM_CONST) {
        return new RustItemConstImpl(node);
      }
      else if (type == ITEM_FN) {
        return new RustItemFnImpl(node);
      }
      else if (type == ITEM_MOD) {
        return new RustItemModImpl(node);
      }
      else if (type == ITEM_STATIC) {
        return new RustItemStaticImpl(node);
      }
      else if (type == LAND_EXPR) {
        return new RustLandExprImpl(node);
      }
      else if (type == LEQ_EXPR) {
        return new RustLeqExprImpl(node);
      }
      else if (type == LIT) {
        return new RustLitImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new RustLiteralExprImpl(node);
      }
      else if (type == LOR_EXPR) {
        return new RustLorExprImpl(node);
      }
      else if (type == LT_EXPR) {
        return new RustLtExprImpl(node);
      }
      else if (type == MACRO_EXPR) {
        return new RustMacroExprImpl(node);
      }
      else if (type == META_ITEM) {
        return new RustMetaItemImpl(node);
      }
      else if (type == MINUS_EXPR) {
        return new RustMinusExprImpl(node);
      }
      else if (type == MOD_EXPR) {
        return new RustModExprImpl(node);
      }
      else if (type == MOD_ITEM) {
        return new RustModItemImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new RustMulExprImpl(node);
      }
      else if (type == NEQ_EXPR) {
        return new RustNeqExprImpl(node);
      }
      else if (type == NOT_EXPR) {
        return new RustNotExprImpl(node);
      }
      else if (type == OUTER_ATTR) {
        return new RustOuterAttrImpl(node);
      }
      else if (type == OUTER_ATTRS) {
        return new RustOuterAttrsImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new RustParenExprImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new RustPlusExprImpl(node);
      }
      else if (type == REF_EXPR) {
        return new RustRefExprImpl(node);
      }
      else if (type == SHL_EXPR) {
        return new RustShlExprImpl(node);
      }
      else if (type == SHR_EXPR) {
        return new RustShrExprImpl(node);
      }
      else if (type == SIMPLE_REF_EXPR) {
        return new RustSimpleRefExprImpl(node);
      }
      else if (type == STMT) {
        return new RustStmtImpl(node);
      }
      else if (type == TY) {
        return new RustTyImpl(node);
      }
      else if (type == UNARY_MIN_EXPR) {
        return new RustUnaryMinExprImpl(node);
      }
      else if (type == VISIBILITY) {
        return new RustVisibilityImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new RustWhereClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
