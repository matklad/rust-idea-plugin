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
  IElementType COMMA_SEPARATED_LIST = new RustElementType("COMMA_SEPARATED_LIST");
  IElementType CONST_ITEM = new RustElementType("CONST_ITEM");
  IElementType DEREF_EXPR = new RustElementType("DEREF_EXPR");
  IElementType DIV_EXPR = new RustElementType("DIV_EXPR");
  IElementType EQ_EXPR = new RustElementType("EQ_EXPR");
  IElementType EXPR = new RustElementType("EXPR");
  IElementType EXTERN_CRATE_ITEM = new RustElementType("EXTERN_CRATE_ITEM");
  IElementType FN_ITEM = new RustElementType("FN_ITEM");
  IElementType FN_PARAM = new RustElementType("FN_PARAM");
  IElementType GENERIC_PARAMS = new RustElementType("GENERIC_PARAMS");
  IElementType GEQ_EXPR = new RustElementType("GEQ_EXPR");
  IElementType GT_EXPR = new RustElementType("GT_EXPR");
  IElementType IF_EXPR = new RustElementType("IF_EXPR");
  IElementType IMPL_ITEM = new RustElementType("IMPL_ITEM");
  IElementType IMPL_MEMBER = new RustElementType("IMPL_MEMBER");
  IElementType INNER_ATTR = new RustElementType("INNER_ATTR");
  IElementType ITEM_WITH_ATTRS = new RustElementType("ITEM_WITH_ATTRS");
  IElementType LAMBDA_EXPR = new RustElementType("LAMBDA_EXPR");
  IElementType LAMBDA_PARAM = new RustElementType("LAMBDA_PARAM");
  IElementType LAND_EXPR = new RustElementType("LAND_EXPR");
  IElementType LEQ_EXPR = new RustElementType("LEQ_EXPR");
  IElementType LIT = new RustElementType("LIT");
  IElementType LITERAL_EXPR = new RustElementType("LITERAL_EXPR");
  IElementType LOR_EXPR = new RustElementType("LOR_EXPR");
  IElementType LT_EXPR = new RustElementType("LT_EXPR");
  IElementType MACRO_EXPR = new RustElementType("MACRO_EXPR");
  IElementType MATCH_EXPR = new RustElementType("MATCH_EXPR");
  IElementType MEMBER_FN_ITEM = new RustElementType("MEMBER_FN_ITEM");
  IElementType MEMBER_FN_PARAMS = new RustElementType("MEMBER_FN_PARAMS");
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
  IElementType PAT = new RustElementType("PAT");
  IElementType PATH = new RustElementType("PATH");
  IElementType PATH_GLOB = new RustElementType("PATH_GLOB");
  IElementType PATH_ITEM = new RustElementType("PATH_ITEM");
  IElementType PATS = new RustElementType("PATS");
  IElementType PLUS_EXPR = new RustElementType("PLUS_EXPR");
  IElementType RANGE_EXPR = new RustElementType("RANGE_EXPR");
  IElementType RECORD_STRUCT_ATTR = new RustElementType("RECORD_STRUCT_ATTR");
  IElementType RECORD_STRUCT_BODY = new RustElementType("RECORD_STRUCT_BODY");
  IElementType REF_EXPR = new RustElementType("REF_EXPR");
  IElementType RETURN_EXPR = new RustElementType("RETURN_EXPR");
  IElementType SELF_PARAM = new RustElementType("SELF_PARAM");
  IElementType SHL_EXPR = new RustElementType("SHL_EXPR");
  IElementType SHR_EXPR = new RustElementType("SHR_EXPR");
  IElementType SIMPLE_REF_EXPR = new RustElementType("SIMPLE_REF_EXPR");
  IElementType STATEMENT_LIKE_EXPR = new RustElementType("STATEMENT_LIKE_EXPR");
  IElementType STATIC_ITEM = new RustElementType("STATIC_ITEM");
  IElementType STMT = new RustElementType("STMT");
  IElementType STRUCT_EXPR = new RustElementType("STRUCT_EXPR");
  IElementType STRUCT_FIELD = new RustElementType("STRUCT_FIELD");
  IElementType STRUCT_ITEM = new RustElementType("STRUCT_ITEM");
  IElementType TUPLE_EXPR = new RustElementType("TUPLE_EXPR");
  IElementType TUPLE_STRUCT_ATTR = new RustElementType("TUPLE_STRUCT_ATTR");
  IElementType TUPLE_STRUCT_BODY = new RustElementType("TUPLE_STRUCT_BODY");
  IElementType TY = new RustElementType("TY");
  IElementType TYPE_PATH = new RustElementType("TYPE_PATH");
  IElementType TYPE_PATH_SEGMENT = new RustElementType("TYPE_PATH_SEGMENT");
  IElementType TY_PARAM = new RustElementType("TY_PARAM");
  IElementType TY_SUM = new RustElementType("TY_SUM");
  IElementType UNARY_MIN_EXPR = new RustElementType("UNARY_MIN_EXPR");
  IElementType USE_ITEM = new RustElementType("USE_ITEM");
  IElementType VISIBILITY = new RustElementType("VISIBILITY");
  IElementType WHERE_CLAUSE = new RustElementType("WHERE_CLAUSE");

  IElementType AMPERSAND = new RustTokenType("&");
  IElementType AMPERSAND_AMPERSAND = new RustTokenType("&&");
  IElementType AS = new RustTokenType("as");
  IElementType ASSIGN = new RustTokenType("=");
  IElementType BANG = new RustTokenType("!");
  IElementType BARE_FN = new RustTokenType("bare_fn");
  IElementType BLOCK_COMMENT = new RustTokenType("block_comment");
  IElementType BRACKET_LEFT = new RustTokenType("[");
  IElementType BRACKET_RIGHT = new RustTokenType("]");
  IElementType COLON = new RustTokenType(":");
  IElementType COMMA = new RustTokenType(",");
  IElementType CONST = new RustTokenType("const");
  IElementType CRATE = new RustTokenType("crate");
  IElementType CURLY_LEFT = new RustTokenType("{");
  IElementType CURLY_RIGHT = new RustTokenType("}");
  IElementType DOT = new RustTokenType(".");
  IElementType DOT_DOT = new RustTokenType("..");
  IElementType DOT_DOT_DOT = new RustTokenType("...");
  IElementType ELSE = new RustTokenType("else");
  IElementType EXTERN = new RustTokenType("extern");
  IElementType FALSE = new RustTokenType("false");
  IElementType FN = new RustTokenType("fn");
  IElementType FOR = new RustTokenType("for");
  IElementType GREATER = new RustTokenType(">");
  IElementType GREATER_EQUAL = new RustTokenType(">=");
  IElementType IDENT = new RustTokenType("ident");
  IElementType IF = new RustTokenType("if");
  IElementType IMPL = new RustTokenType("impl");
  IElementType LESS = new RustTokenType("<");
  IElementType LESS_EQUAL = new RustTokenType("<=");
  IElementType LET = new RustTokenType("let");
  IElementType LIFETIME = new RustTokenType("lifetime");
  IElementType LIFETIMES = new RustTokenType("lifetimes");
  IElementType LINE_COMMENT = new RustTokenType("line_comment");
  IElementType LIT_BOOL = new RustTokenType("lit_bool");
  IElementType LIT_BYTE = new RustTokenType("byte_lit");
  IElementType LIT_BYTE_STRING = new RustTokenType("byte_string_lit");
  IElementType LIT_CHAR = new RustTokenType("lit_char");
  IElementType LIT_FLOAT = new RustTokenType("lit_float");
  IElementType LIT_INTEGER = new RustTokenType("lit_integer");
  IElementType LIT_STRING = new RustTokenType("lit_string");
  IElementType MATCH = new RustTokenType("match");
  IElementType MINUS = new RustTokenType("-");
  IElementType MOD = new RustTokenType("mod");
  IElementType MUT = new RustTokenType("mut");
  IElementType PAR_LEFT = new RustTokenType("(");
  IElementType PAR_RIGHT = new RustTokenType(")");
  IElementType PIPE = new RustTokenType("|");
  IElementType PIPE_PIPE = new RustTokenType("||");
  IElementType PLUS = new RustTokenType("+");
  IElementType PTR = new RustTokenType("ptr");
  IElementType PUB = new RustTokenType("pub");
  IElementType RETURN = new RustTokenType("return");
  IElementType SELF = new RustTokenType("self");
  IElementType SEMI = new RustTokenType(";");
  IElementType STATIC = new RustTokenType("static");
  IElementType STR = new RustTokenType("str");
  IElementType STRUCT = new RustTokenType("struct");
  IElementType TRUE = new RustTokenType("true");
  IElementType TYPE = new RustTokenType("type");
  IElementType UNSAFE = new RustTokenType("unsafe");
  IElementType USE = new RustTokenType("use");
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
      else if (type == COMMA_SEPARATED_LIST) {
        return new RustCommaSeparatedListImpl(node);
      }
      else if (type == CONST_ITEM) {
        return new RustConstItemImpl(node);
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
      else if (type == EXTERN_CRATE_ITEM) {
        return new RustExternCrateItemImpl(node);
      }
      else if (type == FN_ITEM) {
        return new RustFnItemImpl(node);
      }
      else if (type == FN_PARAM) {
        return new RustFnParamImpl(node);
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
      else if (type == IF_EXPR) {
        return new RustIfExprImpl(node);
      }
      else if (type == IMPL_ITEM) {
        return new RustImplItemImpl(node);
      }
      else if (type == IMPL_MEMBER) {
        return new RustImplMemberImpl(node);
      }
      else if (type == INNER_ATTR) {
        return new RustInnerAttrImpl(node);
      }
      else if (type == ITEM_WITH_ATTRS) {
        return new RustItemWithAttrsImpl(node);
      }
      else if (type == LAMBDA_EXPR) {
        return new RustLambdaExprImpl(node);
      }
      else if (type == LAMBDA_PARAM) {
        return new RustLambdaParamImpl(node);
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
      else if (type == MATCH_EXPR) {
        return new RustMatchExprImpl(node);
      }
      else if (type == MEMBER_FN_ITEM) {
        return new RustMemberFnItemImpl(node);
      }
      else if (type == MEMBER_FN_PARAMS) {
        return new RustMemberFnParamsImpl(node);
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
      else if (type == PAT) {
        return new RustPatImpl(node);
      }
      else if (type == PATH) {
        return new RustPathImpl(node);
      }
      else if (type == PATH_GLOB) {
        return new RustPathGlobImpl(node);
      }
      else if (type == PATH_ITEM) {
        return new RustPathItemImpl(node);
      }
      else if (type == PATS) {
        return new RustPatsImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new RustPlusExprImpl(node);
      }
      else if (type == RANGE_EXPR) {
        return new RustRangeExprImpl(node);
      }
      else if (type == RECORD_STRUCT_ATTR) {
        return new RustRecordStructAttrImpl(node);
      }
      else if (type == RECORD_STRUCT_BODY) {
        return new RustRecordStructBodyImpl(node);
      }
      else if (type == REF_EXPR) {
        return new RustRefExprImpl(node);
      }
      else if (type == RETURN_EXPR) {
        return new RustReturnExprImpl(node);
      }
      else if (type == SELF_PARAM) {
        return new RustSelfParamImpl(node);
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
      else if (type == STATEMENT_LIKE_EXPR) {
        return new RustStatementLikeExprImpl(node);
      }
      else if (type == STATIC_ITEM) {
        return new RustStaticItemImpl(node);
      }
      else if (type == STMT) {
        return new RustStmtImpl(node);
      }
      else if (type == STRUCT_EXPR) {
        return new RustStructExprImpl(node);
      }
      else if (type == STRUCT_FIELD) {
        return new RustStructFieldImpl(node);
      }
      else if (type == STRUCT_ITEM) {
        return new RustStructItemImpl(node);
      }
      else if (type == TUPLE_EXPR) {
        return new RustTupleExprImpl(node);
      }
      else if (type == TUPLE_STRUCT_ATTR) {
        return new RustTupleStructAttrImpl(node);
      }
      else if (type == TUPLE_STRUCT_BODY) {
        return new RustTupleStructBodyImpl(node);
      }
      else if (type == TY) {
        return new RustTyImpl(node);
      }
      else if (type == TYPE_PATH) {
        return new RustTypePathImpl(node);
      }
      else if (type == TYPE_PATH_SEGMENT) {
        return new RustTypePathSegmentImpl(node);
      }
      else if (type == TY_PARAM) {
        return new RustTyParamImpl(node);
      }
      else if (type == TY_SUM) {
        return new RustTySumImpl(node);
      }
      else if (type == UNARY_MIN_EXPR) {
        return new RustUnaryMinExprImpl(node);
      }
      else if (type == USE_ITEM) {
        return new RustUseItemImpl(node);
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
