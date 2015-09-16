// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.grammar;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.jetbrains.rust.psi.RustTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RustParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ABI) {
      r = abi(b, 0);
    }
    else if (t == ARRAY_EXPR) {
      r = array_expr(b, 0);
    }
    else if (t == ARRAY_REF_EXPR) {
      r = expr(b, 0, 13);
    }
    else if (t == ASSIGN_EXPR) {
      r = expr(b, 0, -1);
    }
    else if (t == ATTRS_AND_VIS) {
      r = attrs_and_vis(b, 0);
    }
    else if (t == BAND_EXPR) {
      r = expr(b, 0, 6);
    }
    else if (t == BIN_OP) {
      r = bin_op(b, 0);
    }
    else if (t == BLOCK_EXPR) {
      r = block_expr(b, 0);
    }
    else if (t == BOR_EXPR) {
      r = expr(b, 0, 4);
    }
    else if (t == BORROW_EXPR) {
      r = borrow_expr(b, 0);
    }
    else if (t == BOX_EXPR) {
      r = box_expr(b, 0);
    }
    else if (t == BXOR_EXPR) {
      r = expr(b, 0, 5);
    }
    else if (t == CALL_EXPR) {
      r = expr(b, 0, 13);
    }
    else if (t == CAST_EXPR) {
      r = expr(b, 0, 10);
    }
    else if (t == CONST_ITEM) {
      r = const_item(b, 0);
    }
    else if (t == DEREF_EXPR) {
      r = deref_expr(b, 0);
    }
    else if (t == DIV_EXPR) {
      r = expr(b, 0, 9);
    }
    else if (t == ENUM_BODY) {
      r = enum_body(b, 0);
    }
    else if (t == ENUM_ITEM) {
      r = enum_item(b, 0);
    }
    else if (t == ENUM_MEMBER) {
      r = enum_member(b, 0);
    }
    else if (t == EQ_EXPR) {
      r = expr(b, 0, 3);
    }
    else if (t == EXPR) {
      r = expr(b, 0, -1);
    }
    else if (t == EXPR_PATH) {
      r = expr_path(b, 0);
    }
    else if (t == EXPR_PATH_SEGMENT) {
      r = expr_path_segment(b, 0);
    }
    else if (t == EXTERN_CRATE_ITEM) {
      r = extern_crate_item(b, 0);
    }
    else if (t == FN_ITEM) {
      r = fn_item(b, 0);
    }
    else if (t == FN_PARAM) {
      r = fn_param(b, 0);
    }
    else if (t == FOR_EXPR) {
      r = for_expr(b, 0);
    }
    else if (t == FOREIGN_ITEM) {
      r = foreign_item(b, 0);
    }
    else if (t == FOREIGN_MOD_ITEM) {
      r = foreign_mod_item(b, 0);
    }
    else if (t == GENERIC_PARAMS) {
      r = generic_params(b, 0);
    }
    else if (t == GENERIC_VALUES) {
      r = generic_values(b, 0);
    }
    else if (t == GEQ_EXPR) {
      r = expr(b, 0, 3);
    }
    else if (t == GT_EXPR) {
      r = expr(b, 0, 3);
    }
    else if (t == IF_EXPR) {
      r = if_expr(b, 0);
    }
    else if (t == IMPL_ITEM) {
      r = impl_item(b, 0);
    }
    else if (t == IMPL_MEMBER) {
      r = impl_member(b, 0);
    }
    else if (t == INNER_ATTR) {
      r = inner_attr(b, 0);
    }
    else if (t == ITEM_WITH_ATTRS) {
      r = item_with_attrs(b, 0);
    }
    else if (t == LAMBDA_EXPR) {
      r = lambda_expr(b, 0);
    }
    else if (t == LAMBDA_PARAM) {
      r = lambda_param(b, 0);
    }
    else if (t == LAND_EXPR) {
      r = expr(b, 0, 2);
    }
    else if (t == LEQ_EXPR) {
      r = expr(b, 0, 3);
    }
    else if (t == LIT) {
      r = lit(b, 0);
    }
    else if (t == LITERAL_EXPR) {
      r = literal_expr(b, 0);
    }
    else if (t == LOOP_EXPR) {
      r = loop_expr(b, 0);
    }
    else if (t == LOR_EXPR) {
      r = expr(b, 0, 1);
    }
    else if (t == LT_EXPR) {
      r = expr(b, 0, 3);
    }
    else if (t == MACRO_EXPR) {
      r = macro_expr(b, 0);
    }
    else if (t == MATCH_EXPR) {
      r = match_expr(b, 0);
    }
    else if (t == MEMBER_FN_ITEM) {
      r = member_fn_item(b, 0);
    }
    else if (t == MEMBER_FN_PARAMS) {
      r = member_fn_params(b, 0);
    }
    else if (t == META_ITEM) {
      r = meta_item(b, 0);
    }
    else if (t == MINUS_EXPR) {
      r = expr(b, 0, 8);
    }
    else if (t == MOD_EXPR) {
      r = expr(b, 0, 9);
    }
    else if (t == MOD_ITEM) {
      r = mod_item(b, 0);
    }
    else if (t == MUL_EXPR) {
      r = expr(b, 0, 9);
    }
    else if (t == NEQ_EXPR) {
      r = expr(b, 0, 3);
    }
    else if (t == NOT_EXPR) {
      r = not_expr(b, 0);
    }
    else if (t == OUTER_ATTR) {
      r = outer_attr(b, 0);
    }
    else if (t == OUTER_ATTRS) {
      r = outer_attrs(b, 0);
    }
    else if (t == PAREN_EXPR) {
      r = paren_expr(b, 0);
    }
    else if (t == PAT) {
      r = pat(b, 0);
    }
    else if (t == PAT_FIELD) {
      r = pat_field(b, 0);
    }
    else if (t == PATH) {
      r = path(b, 0);
    }
    else if (t == PATH_GLOB) {
      r = path_glob(b, 0);
    }
    else if (t == PATH_ITEM) {
      r = path_item(b, 0);
    }
    else if (t == PATS) {
      r = pats(b, 0);
    }
    else if (t == PLUS_EXPR) {
      r = expr(b, 0, 8);
    }
    else if (t == RANGE_EXPR) {
      r = expr(b, 0, 0);
    }
    else if (t == RECORD_STRUCT_BODY) {
      r = record_struct_body(b, 0);
    }
    else if (t == RECORD_STRUCT_MEMBER) {
      r = record_struct_member(b, 0);
    }
    else if (t == REF_EXPR) {
      r = expr(b, 0, 13);
    }
    else if (t == RETURN_EXPR) {
      r = return_expr(b, 0);
    }
    else if (t == SELF_PARAM) {
      r = self_param(b, 0);
    }
    else if (t == SHL_EXPR) {
      r = expr(b, 0, 7);
    }
    else if (t == SHR_EXPR) {
      r = expr(b, 0, 7);
    }
    else if (t == SIMPLE_REF_EXPR) {
      r = simple_ref_expr(b, 0);
    }
    else if (t == STATEMENT_LIKE_EXPR) {
      r = statement_like_expr(b, 0);
    }
    else if (t == STATIC_ITEM) {
      r = static_item(b, 0);
    }
    else if (t == STMT) {
      r = stmt(b, 0);
    }
    else if (t == STRUCT_EXPR) {
      r = struct_expr(b, 0);
    }
    else if (t == STRUCT_FIELD) {
      r = struct_field(b, 0);
    }
    else if (t == STRUCT_ITEM) {
      r = struct_item(b, 0);
    }
    else if (t == TRAIT_BODY) {
      r = trait_body(b, 0);
    }
    else if (t == TRAIT_ITEM) {
      r = trait_item(b, 0);
    }
    else if (t == TRAIT_MEMBER) {
      r = trait_member(b, 0);
    }
    else if (t == TUPLE_EXPR) {
      r = tuple_expr(b, 0);
    }
    else if (t == TUPLE_STRUCT_BODY) {
      r = tuple_struct_body(b, 0);
    }
    else if (t == TUPLE_STRUCT_MEMBER) {
      r = tuple_struct_member(b, 0);
    }
    else if (t == TY) {
      r = ty(b, 0);
    }
    else if (t == TY_PARAM) {
      r = ty_param(b, 0);
    }
    else if (t == TY_PARAM_BOUND) {
      r = ty_param_bound(b, 0);
    }
    else if (t == TY_PARAM_BOUNDS) {
      r = ty_param_bounds(b, 0);
    }
    else if (t == TY_SUM) {
      r = ty_sum(b, 0);
    }
    else if (t == TYPE_ITEM) {
      r = type_item(b, 0);
    }
    else if (t == TYPE_PATH) {
      r = type_path(b, 0);
    }
    else if (t == TYPE_PATH_SEGMENT) {
      r = type_path_segment(b, 0);
    }
    else if (t == UNARY_MIN_EXPR) {
      r = unary_min_expr(b, 0);
    }
    else if (t == UNSAFE_BLOCK_EXPR) {
      r = unsafe_block_expr(b, 0);
    }
    else if (t == USE_ITEM) {
      r = use_item(b, 0);
    }
    else if (t == VISIBILITY) {
      r = visibility(b, 0);
    }
    else if (t == WHERE_CLAUSE) {
      r = where_clause(b, 0);
    }
    else if (t == WHILE_EXPR) {
      r = while_expr(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return rustFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY_EXPR, ARRAY_REF_EXPR, ASSIGN_EXPR, BAND_EXPR,
      BLOCK_EXPR, BORROW_EXPR, BOR_EXPR, BOX_EXPR,
      BXOR_EXPR, CALL_EXPR, CAST_EXPR, DEREF_EXPR,
      DIV_EXPR, EQ_EXPR, EXPR, FOR_EXPR,
      GEQ_EXPR, GT_EXPR, IF_EXPR, LAMBDA_EXPR,
      LAND_EXPR, LEQ_EXPR, LITERAL_EXPR, LOOP_EXPR,
      LOR_EXPR, LT_EXPR, MACRO_EXPR, MATCH_EXPR,
      MINUS_EXPR, MOD_EXPR, MUL_EXPR, NEQ_EXPR,
      NOT_EXPR, PAREN_EXPR, PLUS_EXPR, RANGE_EXPR,
      REF_EXPR, RETURN_EXPR, SHL_EXPR, SHR_EXPR,
      SIMPLE_REF_EXPR, STATEMENT_LIKE_EXPR, STRUCT_EXPR, TUPLE_EXPR,
      UNARY_MIN_EXPR, UNSAFE_BLOCK_EXPR, WHILE_EXPR),
  };

  /* ********************************************************** */
  // lit_string
  public static boolean abi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abi")) return false;
    if (!nextTokenIs(b, LIT_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIT_STRING);
    exit_section_(b, m, ABI, r);
    return r;
  }

  /* ********************************************************** */
  // outer_attrs [visibility]
  public static boolean attrs_and_vis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrs_and_vis")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attrs and vis>");
    r = outer_attrs(b, l + 1);
    r = r && attrs_and_vis_1(b, l + 1);
    exit_section_(b, l, m, ATTRS_AND_VIS, r, false, null);
    return r;
  }

  // [visibility]
  private static boolean attrs_and_vis_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attrs_and_vis_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '+' | '-' | '*' | '/' | '%' | '<<' | '>>' | '|' | '&'
  public static boolean bin_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bin_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<bin op>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "<<");
    if (!r) r = consumeToken(b, ">>");
    if (!r) r = consumeToken(b, PIPE);
    if (!r) r = consumeToken(b, AMPERSAND);
    exit_section_(b, l, m, BIN_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' stmt* [expr] '}'
  public static boolean block_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_expr")) return false;
    if (!nextTokenIs(b, CURLY_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_LEFT);
    r = r && block_expr_1(b, l + 1);
    r = r && block_expr_2(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, BLOCK_EXPR, r);
    return r;
  }

  // stmt*
  private static boolean block_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // [expr]
  private static boolean block_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_expr_2")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // fn_item
  //                      | mod_item
  //                      | struct_item
  //                      | enum_item
  //                      | impl_item
  //                      | trait_item
  //                      | foreign_mod_item
  static boolean block_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fn_item(b, l + 1);
    if (!r) r = mod_item(b, l + 1);
    if (!r) r = struct_item(b, l + 1);
    if (!r) r = enum_item(b, l + 1);
    if (!r) r = impl_item(b, l + 1);
    if (!r) r = trait_item(b, l + 1);
    if (!r) r = foreign_mod_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<param>> ( ',' <<param>> ) * [',']
  public static boolean comma_separated_list(PsiBuilder b, int l, final Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && comma_separated_list_1(b, l + 1, _param);
    r = r && comma_separated_list_2(b, l + 1);
    exit_section_(b, m, COMMA_SEPARATED_LIST, r);
    return r;
  }

  // ( ',' <<param>> ) *
  private static boolean comma_separated_list_1(PsiBuilder b, int l, final Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!comma_separated_list_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "comma_separated_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' <<param>>
  private static boolean comma_separated_list_1_0(PsiBuilder b, int l, final Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean comma_separated_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_separated_list_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // const ident ':' ty '=' expr ';'
  public static boolean const_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_item")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONST, IDENT);
    r = r && consumeToken(b, COLON);
    r = r && ty(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, CONST_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // '{' <<comma_separated_list enum_member>> '}'
  public static boolean enum_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body")) return false;
    if (!nextTokenIs(b, CURLY_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_LEFT);
    r = r && comma_separated_list(b, l + 1, enum_member_parser_);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, ENUM_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // enum ident [generic_params] enum_body
  public static boolean enum_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_item")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENUM, IDENT);
    r = r && enum_item_2(b, l + 1);
    r = r && enum_body(b, l + 1);
    exit_section_(b, m, ENUM_ITEM, r);
    return r;
  }

  // [generic_params]
  private static boolean enum_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_item_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // outer_attrs [visibility] ident [record_struct_body | tuple_struct_body]
  public static boolean enum_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum member>");
    r = outer_attrs(b, l + 1);
    r = r && enum_member_1(b, l + 1);
    r = r && consumeToken(b, IDENT);
    r = r && enum_member_3(b, l + 1);
    exit_section_(b, l, m, ENUM_MEMBER, r, false, null);
    return r;
  }

  // [visibility]
  private static boolean enum_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  // [record_struct_body | tuple_struct_body]
  private static boolean enum_member_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_3")) return false;
    enum_member_3_0(b, l + 1);
    return true;
  }

  // record_struct_body | tuple_struct_body
  private static boolean enum_member_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = record_struct_body(b, l + 1);
    if (!r) r = tuple_struct_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr_path_segment ("::" expr_path_segment)*
  public static boolean expr_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_path_segment(b, l + 1);
    r = r && expr_path_1(b, l + 1);
    exit_section_(b, m, EXPR_PATH, r);
    return r;
  }

  // ("::" expr_path_segment)*
  private static boolean expr_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expr_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_path_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "::" expr_path_segment
  private static boolean expr_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && expr_path_segment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident ["::" generic_values]
  public static boolean expr_path_segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_segment")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && expr_path_segment_1(b, l + 1);
    exit_section_(b, m, EXPR_PATH_SEGMENT, r);
    return r;
  }

  // ["::" generic_values]
  private static boolean expr_path_segment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_segment_1")) return false;
    expr_path_segment_1_0(b, l + 1);
    return true;
  }

  // "::" generic_values
  private static boolean expr_path_segment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_path_segment_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && generic_values(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // extern crate ident [as ident] ';'
  public static boolean extern_crate_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_crate_item")) return false;
    if (!nextTokenIs(b, EXTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXTERN, CRATE, IDENT);
    r = r && extern_crate_item_3(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, EXTERN_CRATE_ITEM, r);
    return r;
  }

  // [as ident]
  private static boolean extern_crate_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_crate_item_3")) return false;
    parseTokens(b, 0, AS, IDENT);
    return true;
  }

  /* ********************************************************** */
  // fn ident [generic_params] fn_params [ret_ty] [where_clause] block_expr
  public static boolean fn_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_item")) return false;
    if (!nextTokenIs(b, FN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FN, IDENT);
    r = r && fn_item_2(b, l + 1);
    r = r && fn_params(b, l + 1);
    r = r && fn_item_4(b, l + 1);
    r = r && fn_item_5(b, l + 1);
    r = r && block_expr(b, l + 1);
    exit_section_(b, m, FN_ITEM, r);
    return r;
  }

  // [generic_params]
  private static boolean fn_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_item_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // [ret_ty]
  private static boolean fn_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_item_4")) return false;
    ret_ty(b, l + 1);
    return true;
  }

  // [where_clause]
  private static boolean fn_item_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_item_5")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // pat ':' ty_sum
  public static boolean fn_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fn param>");
    r = pat(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ty_sum(b, l + 1);
    exit_section_(b, l, m, FN_PARAM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' [ <<comma_separated_list fn_param>> ] ')'
  static boolean fn_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_params")) return false;
    if (!nextTokenIs(b, PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && fn_params_1(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ <<comma_separated_list fn_param>> ]
  private static boolean fn_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_params_1")) return false;
    comma_separated_list(b, l + 1, fn_param_parser_);
    return true;
  }

  /* ********************************************************** */
  // for pat in expr block_expr
  public static boolean for_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_expr")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && pat(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && expr(b, l + 1, -1);
    r = r && block_expr(b, l + 1);
    exit_section_(b, m, FOR_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // outer_attrs [visibility] fn ident [generic_params] fn_params [ret_ty] [where_clause] ';'
  public static boolean foreign_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreign item>");
    r = outer_attrs(b, l + 1);
    r = r && foreign_item_1(b, l + 1);
    r = r && consumeTokens(b, 0, FN, IDENT);
    r = r && foreign_item_4(b, l + 1);
    r = r && fn_params(b, l + 1);
    r = r && foreign_item_6(b, l + 1);
    r = r && foreign_item_7(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, FOREIGN_ITEM, r, false, null);
    return r;
  }

  // [visibility]
  private static boolean foreign_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_item_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  // [generic_params]
  private static boolean foreign_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_item_4")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // [ret_ty]
  private static boolean foreign_item_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_item_6")) return false;
    ret_ty(b, l + 1);
    return true;
  }

  // [where_clause]
  private static boolean foreign_item_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_item_7")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // extern [abi] '{' inner_attr*  foreign_item* '}'
  public static boolean foreign_mod_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_mod_item")) return false;
    if (!nextTokenIs(b, EXTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTERN);
    r = r && foreign_mod_item_1(b, l + 1);
    r = r && consumeToken(b, CURLY_LEFT);
    r = r && foreign_mod_item_3(b, l + 1);
    r = r && foreign_mod_item_4(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, FOREIGN_MOD_ITEM, r);
    return r;
  }

  // [abi]
  private static boolean foreign_mod_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_mod_item_1")) return false;
    abi(b, l + 1);
    return true;
  }

  // inner_attr*
  private static boolean foreign_mod_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_mod_item_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!inner_attr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "foreign_mod_item_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // foreign_item*
  private static boolean foreign_mod_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_mod_item_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!foreign_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "foreign_mod_item_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '<' [lifetime] [<<comma_separated_list ty_param>>] '>'
  public static boolean generic_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_params")) return false;
    if (!nextTokenIs(b, LESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS);
    r = r && generic_params_1(b, l + 1);
    r = r && generic_params_2(b, l + 1);
    r = r && consumeToken(b, GREATER);
    exit_section_(b, m, GENERIC_PARAMS, r);
    return r;
  }

  // [lifetime]
  private static boolean generic_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_params_1")) return false;
    consumeToken(b, LIFETIME);
    return true;
  }

  // [<<comma_separated_list ty_param>>]
  private static boolean generic_params_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_params_2")) return false;
    comma_separated_list(b, l + 1, ty_param_parser_);
    return true;
  }

  /* ********************************************************** */
  // '<' <<comma_separated_list (ident '=' ty | ty_sum | lifetime)>> '>'
  public static boolean generic_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_values")) return false;
    if (!nextTokenIs(b, LESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS);
    r = r && comma_separated_list(b, l + 1, generic_values_1_0_parser_);
    r = r && consumeToken(b, GREATER);
    exit_section_(b, m, GENERIC_VALUES, r);
    return r;
  }

  // ident '=' ty | ty_sum | lifetime
  private static boolean generic_values_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_values_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_values_1_0_0(b, l + 1);
    if (!r) r = ty_sum(b, l + 1);
    if (!r) r = consumeToken(b, LIFETIME);
    exit_section_(b, m, null, r);
    return r;
  }

  // ident '=' ty
  private static boolean generic_values_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_values_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && consumeToken(b, ASSIGN);
    r = r && ty(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if (let pat '=' expr | expr) block_expr [else (if_expr | block_expr)]
  public static boolean if_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && if_expr_1(b, l + 1);
    r = r && block_expr(b, l + 1);
    r = r && if_expr_3(b, l + 1);
    exit_section_(b, m, IF_EXPR, r);
    return r;
  }

  // let pat '=' expr | expr
  private static boolean if_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_expr_1_0(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // let pat '=' expr
  private static boolean if_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && pat(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [else (if_expr | block_expr)]
  private static boolean if_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_3")) return false;
    if_expr_3_0(b, l + 1);
    return true;
  }

  // else (if_expr | block_expr)
  private static boolean if_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && if_expr_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if_expr | block_expr
  private static boolean if_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_expr(b, l + 1);
    if (!r) r = block_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [unsafe] impl [generic_params] ty_sum [for ty_sum] [where_clause]
  //               '{' inner_attr* ([visibility] impl_member)* '}'
  public static boolean impl_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item")) return false;
    if (!nextTokenIs(b, "<impl item>", IMPL, UNSAFE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<impl item>");
    r = impl_item_0(b, l + 1);
    r = r && consumeToken(b, IMPL);
    r = r && impl_item_2(b, l + 1);
    r = r && ty_sum(b, l + 1);
    r = r && impl_item_4(b, l + 1);
    r = r && impl_item_5(b, l + 1);
    r = r && consumeToken(b, CURLY_LEFT);
    r = r && impl_item_7(b, l + 1);
    r = r && impl_item_8(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, l, m, IMPL_ITEM, r, false, null);
    return r;
  }

  // [unsafe]
  private static boolean impl_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_0")) return false;
    consumeToken(b, UNSAFE);
    return true;
  }

  // [generic_params]
  private static boolean impl_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // [for ty_sum]
  private static boolean impl_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_4")) return false;
    impl_item_4_0(b, l + 1);
    return true;
  }

  // for ty_sum
  private static boolean impl_item_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && ty_sum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [where_clause]
  private static boolean impl_item_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_5")) return false;
    where_clause(b, l + 1);
    return true;
  }

  // inner_attr*
  private static boolean impl_item_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!inner_attr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "impl_item_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ([visibility] impl_member)*
  private static boolean impl_item_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!impl_item_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "impl_item_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // [visibility] impl_member
  private static boolean impl_item_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = impl_item_8_0_0(b, l + 1);
    r = r && impl_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [visibility]
  private static boolean impl_item_8_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_item_8_0_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type ident '=' ty_sum ';'
  //               | const ident ':' ty_sum '=' expr ';'
  //               | member_fn_item
  public static boolean impl_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<impl member>");
    r = impl_member_0(b, l + 1);
    if (!r) r = impl_member_1(b, l + 1);
    if (!r) r = member_fn_item(b, l + 1);
    exit_section_(b, l, m, IMPL_MEMBER, r, false, null);
    return r;
  }

  // type ident '=' ty_sum ';'
  private static boolean impl_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_member_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, IDENT);
    r = r && consumeToken(b, ASSIGN);
    r = r && ty_sum(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // const ident ':' ty_sum '=' expr ';'
  private static boolean impl_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_member_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONST, IDENT);
    r = r && consumeToken(b, COLON);
    r = r && ty_sum(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr
  static boolean index_expr(PsiBuilder b, int l) {
    return expr(b, l + 1, -1);
  }

  /* ********************************************************** */
  // '#!' '[' meta_item ']'
  public static boolean inner_attr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_attr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<inner attr>");
    r = consumeToken(b, "#!");
    r = r && consumeToken(b, BRACKET_LEFT);
    r = r && meta_item(b, l + 1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, l, m, INNER_ATTR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stmt_item
  //                | use_item
  //                | extern_crate_item
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt_item(b, l + 1);
    if (!r) r = use_item(b, l + 1);
    if (!r) r = extern_crate_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attrs_and_vis item
  public static boolean item_with_attrs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_with_attrs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<item with attrs>");
    r = attrs_and_vis(b, l + 1);
    r = r && item(b, l + 1);
    exit_section_(b, l, m, ITEM_WITH_ATTRS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // pat [":" ty_sum]
  public static boolean lambda_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lambda param>");
    r = pat(b, l + 1);
    r = r && lambda_param_1(b, l + 1);
    exit_section_(b, l, m, LAMBDA_PARAM, r, false, null);
    return r;
  }

  // [":" ty_sum]
  private static boolean lambda_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_param_1")) return false;
    lambda_param_1_0(b, l + 1);
    return true;
  }

  // ":" ty_sum
  private static boolean lambda_param_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_param_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && ty_sum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lit_byte
  //       | lit_char
  //       | lit_integer
  //       | lit_float
  //       | lit_string
  //       | lit_byte_string
  //       | '()'
  //       | true
  //       | false
  //       | str
  public static boolean lit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lit>");
    r = consumeToken(b, LIT_BYTE);
    if (!r) r = consumeToken(b, LIT_CHAR);
    if (!r) r = consumeToken(b, LIT_INTEGER);
    if (!r) r = consumeToken(b, LIT_FLOAT);
    if (!r) r = consumeToken(b, LIT_STRING);
    if (!r) r = consumeToken(b, LIT_BYTE_STRING);
    if (!r) r = consumeToken(b, "()");
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, STR);
    exit_section_(b, l, m, LIT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // loop block_expr
  public static boolean loop_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_expr")) return false;
    if (!nextTokenIs(b, LOOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOOP);
    r = r && block_expr(b, l + 1);
    exit_section_(b, m, LOOP_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // match expr '{'
  //     (pats [if expr] '=>' (block_expr [',']| expr ','))*
  //     [pats [if expr] '=>' expr]
  // '}'
  public static boolean match_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr")) return false;
    if (!nextTokenIs(b, MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATCH);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, CURLY_LEFT);
    r = r && match_expr_3(b, l + 1);
    r = r && match_expr_4(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, MATCH_EXPR, r);
    return r;
  }

  // (pats [if expr] '=>' (block_expr [',']| expr ','))*
  private static boolean match_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!match_expr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "match_expr_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // pats [if expr] '=>' (block_expr [',']| expr ',')
  private static boolean match_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pats(b, l + 1);
    r = r && match_expr_3_0_1(b, l + 1);
    r = r && consumeToken(b, FAT_ARROW);
    r = r && match_expr_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [if expr]
  private static boolean match_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_3_0_1")) return false;
    match_expr_3_0_1_0(b, l + 1);
    return true;
  }

  // if expr
  private static boolean match_expr_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_expr [',']| expr ','
  private static boolean match_expr_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_3_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = match_expr_3_0_3_0(b, l + 1);
    if (!r) r = match_expr_3_0_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_expr [',']
  private static boolean match_expr_3_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_3_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_expr(b, l + 1);
    r = r && match_expr_3_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean match_expr_3_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_3_0_3_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // expr ','
  private static boolean match_expr_3_0_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_3_0_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // [pats [if expr] '=>' expr]
  private static boolean match_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_4")) return false;
    match_expr_4_0(b, l + 1);
    return true;
  }

  // pats [if expr] '=>' expr
  private static boolean match_expr_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pats(b, l + 1);
    r = r && match_expr_4_0_1(b, l + 1);
    r = r && consumeToken(b, FAT_ARROW);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [if expr]
  private static boolean match_expr_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_4_0_1")) return false;
    match_expr_4_0_1_0(b, l + 1);
    return true;
  }

  // if expr
  private static boolean match_expr_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_expr_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // fn ident [generic_params] member_fn_params [ret_ty] [where_clause] block_expr
  public static boolean member_fn_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_item")) return false;
    if (!nextTokenIs(b, FN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FN, IDENT);
    r = r && member_fn_item_2(b, l + 1);
    r = r && member_fn_params(b, l + 1);
    r = r && member_fn_item_4(b, l + 1);
    r = r && member_fn_item_5(b, l + 1);
    r = r && block_expr(b, l + 1);
    exit_section_(b, m, MEMBER_FN_ITEM, r);
    return r;
  }

  // [generic_params]
  private static boolean member_fn_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_item_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // [ret_ty]
  private static boolean member_fn_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_item_4")) return false;
    ret_ty(b, l + 1);
    return true;
  }

  // [where_clause]
  private static boolean member_fn_item_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_item_5")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' ')'
  //                    | '(' self_param [','] ')'
  //                    | '(' self_param ',' <<comma_separated_list fn_param>> ')'
  //                    | '(' <<comma_separated_list fn_param>> ')'
  public static boolean member_fn_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_params")) return false;
    if (!nextTokenIs(b, PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_fn_params_0(b, l + 1);
    if (!r) r = member_fn_params_1(b, l + 1);
    if (!r) r = member_fn_params_2(b, l + 1);
    if (!r) r = member_fn_params_3(b, l + 1);
    exit_section_(b, m, MEMBER_FN_PARAMS, r);
    return r;
  }

  // '(' ')'
  private static boolean member_fn_params_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_params_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' self_param [','] ')'
  private static boolean member_fn_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_params_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && self_param(b, l + 1);
    r = r && member_fn_params_1_2(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean member_fn_params_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_params_1_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // '(' self_param ',' <<comma_separated_list fn_param>> ')'
  private static boolean member_fn_params_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_params_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && self_param(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && comma_separated_list(b, l + 1, fn_param_parser_);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' <<comma_separated_list fn_param>> ')'
  private static boolean member_fn_params_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_fn_params_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && comma_separated_list(b, l + 1, fn_param_parser_);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident '=' lit
  //             | ident '(' <<comma_separated_list meta_item>> ')'
  //             | ident
  public static boolean meta_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meta_item")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = meta_item_0(b, l + 1);
    if (!r) r = meta_item_1(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, m, META_ITEM, r);
    return r;
  }

  // ident '=' lit
  private static boolean meta_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meta_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && consumeToken(b, ASSIGN);
    r = r && lit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ident '(' <<comma_separated_list meta_item>> ')'
  private static boolean meta_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meta_item_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && consumeToken(b, PAR_LEFT);
    r = r && comma_separated_list(b, l + 1, meta_item_parser_);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // mod ident ('{' inner_attr* item_with_attrs* '}' | ';')
  public static boolean mod_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item")) return false;
    if (!nextTokenIs(b, MOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MOD, IDENT);
    r = r && mod_item_2(b, l + 1);
    exit_section_(b, m, MOD_ITEM, r);
    return r;
  }

  // '{' inner_attr* item_with_attrs* '}' | ';'
  private static boolean mod_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mod_item_2_0(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' inner_attr* item_with_attrs* '}'
  private static boolean mod_item_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_LEFT);
    r = r && mod_item_2_0_1(b, l + 1);
    r = r && mod_item_2_0_2(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // inner_attr*
  private static boolean mod_item_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!inner_attr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mod_item_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // item_with_attrs*
  private static boolean mod_item_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mod_item_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_with_attrs(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mod_item_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '#' '[' meta_item ']'
  public static boolean outer_attr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outer_attr")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && consumeToken(b, BRACKET_LEFT);
    r = r && meta_item(b, l + 1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, OUTER_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // outer_attr *
  public static boolean outer_attrs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outer_attrs")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<outer attrs>");
    int c = current_position_(b);
    while (true) {
      if (!outer_attr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "outer_attrs", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, OUTER_ATTRS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // '_'
  //       | '&' pat
  //       | mut ident
  //       | ref [mut] ident
  //       | '(' <<comma_separated_list pat>> ')'
  //       | '[' <<comma_separated_list pat>> ']'
  //       | path '(' <<comma_separated_list pat>> ')'
  //       | path '{' <<comma_separated_list pat_field>> ['..']'}'
  //       | path
  //       | lit
  public static boolean pat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pat>");
    r = consumeToken(b, "_");
    if (!r) r = pat_1(b, l + 1);
    if (!r) r = parseTokens(b, 0, MUT, IDENT);
    if (!r) r = pat_3(b, l + 1);
    if (!r) r = pat_4(b, l + 1);
    if (!r) r = pat_5(b, l + 1);
    if (!r) r = pat_6(b, l + 1);
    if (!r) r = pat_7(b, l + 1);
    if (!r) r = path(b, l + 1);
    if (!r) r = lit(b, l + 1);
    exit_section_(b, l, m, PAT, r, false, null);
    return r;
  }

  // '&' pat
  private static boolean pat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AMPERSAND);
    r = r && pat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ref [mut] ident
  private static boolean pat_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REF);
    r = r && pat_3_1(b, l + 1);
    r = r && consumeToken(b, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [mut]
  private static boolean pat_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_3_1")) return false;
    consumeToken(b, MUT);
    return true;
  }

  // '(' <<comma_separated_list pat>> ')'
  private static boolean pat_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && comma_separated_list(b, l + 1, pat_parser_);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' <<comma_separated_list pat>> ']'
  private static boolean pat_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_LEFT);
    r = r && comma_separated_list(b, l + 1, pat_parser_);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // path '(' <<comma_separated_list pat>> ')'
  private static boolean pat_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path(b, l + 1);
    r = r && consumeToken(b, PAR_LEFT);
    r = r && comma_separated_list(b, l + 1, pat_parser_);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // path '{' <<comma_separated_list pat_field>> ['..']'}'
  private static boolean pat_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path(b, l + 1);
    r = r && consumeToken(b, CURLY_LEFT);
    r = r && comma_separated_list(b, l + 1, pat_field_parser_);
    r = r && pat_7_3(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['..']
  private static boolean pat_7_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_7_3")) return false;
    consumeToken(b, DOT_DOT);
    return true;
  }

  /* ********************************************************** */
  // ident ':' pat | [ref] [mut] ident
  public static boolean pat_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pat field>");
    r = pat_field_0(b, l + 1);
    if (!r) r = pat_field_1(b, l + 1);
    exit_section_(b, l, m, PAT_FIELD, r, false, null);
    return r;
  }

  // ident ':' pat
  private static boolean pat_field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_field_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && consumeToken(b, COLON);
    r = r && pat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ref] [mut] ident
  private static boolean pat_field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_field_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat_field_1_0(b, l + 1);
    r = r && pat_field_1_1(b, l + 1);
    r = r && consumeToken(b, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ref]
  private static boolean pat_field_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_field_1_0")) return false;
    consumeToken(b, REF);
    return true;
  }

  // [mut]
  private static boolean pat_field_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_field_1_1")) return false;
    consumeToken(b, MUT);
    return true;
  }

  /* ********************************************************** */
  // ident ("::" ident)*
  public static boolean path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && path_1(b, l + 1);
    exit_section_(b, m, PATH, r);
    return r;
  }

  // ("::" ident)*
  private static boolean path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "path_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "::" ident
  private static boolean path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && consumeToken(b, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // path_item ["::" (path_glob | "*")]
  //             | '{' [<<comma_separated_list path_item>>] '}'
  public static boolean path_glob(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_glob")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<path glob>");
    r = path_glob_0(b, l + 1);
    if (!r) r = path_glob_1(b, l + 1);
    exit_section_(b, l, m, PATH_GLOB, r, false, null);
    return r;
  }

  // path_item ["::" (path_glob | "*")]
  private static boolean path_glob_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_glob_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path_item(b, l + 1);
    r = r && path_glob_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["::" (path_glob | "*")]
  private static boolean path_glob_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_glob_0_1")) return false;
    path_glob_0_1_0(b, l + 1);
    return true;
  }

  // "::" (path_glob | "*")
  private static boolean path_glob_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_glob_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && path_glob_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // path_glob | "*"
  private static boolean path_glob_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_glob_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path_glob(b, l + 1);
    if (!r) r = consumeToken(b, "*");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' [<<comma_separated_list path_item>>] '}'
  private static boolean path_glob_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_glob_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_LEFT);
    r = r && path_glob_1_1(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<comma_separated_list path_item>>]
  private static boolean path_glob_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_glob_1_1")) return false;
    comma_separated_list(b, l + 1, path_item_parser_);
    return true;
  }

  /* ********************************************************** */
  // ident | self
  public static boolean path_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_item")) return false;
    if (!nextTokenIs(b, "<path item>", IDENT, SELF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<path item>");
    r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, SELF);
    exit_section_(b, l, m, PATH_ITEM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // pat ('|' pat)*
  public static boolean pats(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pats")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pats>");
    r = pat(b, l + 1);
    r = r && pats_1(b, l + 1);
    exit_section_(b, l, m, PATS, r, false, null);
    return r;
  }

  // ('|' pat)*
  private static boolean pats_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pats_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!pats_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pats_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '|' pat
  private static boolean pats_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pats_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && pat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' <<comma_separated_list record_struct_member>> '}'
  public static boolean record_struct_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_struct_body")) return false;
    if (!nextTokenIs(b, CURLY_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_LEFT);
    r = r && comma_separated_list(b, l + 1, record_struct_member_parser_);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, RECORD_STRUCT_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // [visibility] ident ':' ty_sum
  public static boolean record_struct_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_struct_member")) return false;
    if (!nextTokenIs(b, "<record struct member>", IDENT, PUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<record struct member>");
    r = record_struct_member_0(b, l + 1);
    r = r && consumeToken(b, IDENT);
    r = r && consumeToken(b, COLON);
    r = r && ty_sum(b, l + 1);
    exit_section_(b, l, m, RECORD_STRUCT_MEMBER, r, false, null);
    return r;
  }

  // [visibility]
  private static boolean record_struct_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_struct_member_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '->' ('!' | ty)
  static boolean ret_ty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ret_ty")) return false;
    if (!nextTokenIs(b, THIN_ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIN_ARROW);
    r = r && ret_ty_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!' | ty
  private static boolean ret_ty_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ret_ty_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BANG);
    if (!r) r = ty(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inner_attr* item_with_attrs *
  static boolean rustFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rustFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rustFile_0(b, l + 1);
    r = r && rustFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // inner_attr*
  private static boolean rustFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rustFile_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!inner_attr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rustFile_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // item_with_attrs *
  private static boolean rustFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rustFile_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_with_attrs(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rustFile_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ['&' [lifetime]] [mut] self
  public static boolean self_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<self param>");
    r = self_param_0(b, l + 1);
    r = r && self_param_1(b, l + 1);
    r = r && consumeToken(b, SELF);
    exit_section_(b, l, m, SELF_PARAM, r, false, null);
    return r;
  }

  // ['&' [lifetime]]
  private static boolean self_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_param_0")) return false;
    self_param_0_0(b, l + 1);
    return true;
  }

  // '&' [lifetime]
  private static boolean self_param_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_param_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AMPERSAND);
    r = r && self_param_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [lifetime]
  private static boolean self_param_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_param_0_0_1")) return false;
    consumeToken(b, LIFETIME);
    return true;
  }

  // [mut]
  private static boolean self_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_param_1")) return false;
    consumeToken(b, MUT);
    return true;
  }

  /* ********************************************************** */
  // static [mut] ident ':' ty '=' expr ';'
  public static boolean static_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_item")) return false;
    if (!nextTokenIs(b, STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STATIC);
    r = r && static_item_1(b, l + 1);
    r = r && consumeToken(b, IDENT);
    r = r && consumeToken(b, COLON);
    r = r && ty(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, STATIC_ITEM, r);
    return r;
  }

  // [mut]
  private static boolean static_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_item_1")) return false;
    consumeToken(b, MUT);
    return true;
  }

  /* ********************************************************** */
  // stmt_item
  //        | let pat [':' ty_sum] ['=' expr] ';'
  //        | statement_like_expr
  //        | expr ';'
  //        | ';'
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stmt>");
    r = stmt_item(b, l + 1);
    if (!r) r = stmt_1(b, l + 1);
    if (!r) r = statement_like_expr(b, l + 1);
    if (!r) r = stmt_3(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    exit_section_(b, l, m, STMT, r, false, null);
    return r;
  }

  // let pat [':' ty_sum] ['=' expr] ';'
  private static boolean stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && pat(b, l + 1);
    r = r && stmt_1_2(b, l + 1);
    r = r && stmt_1_3(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // [':' ty_sum]
  private static boolean stmt_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1_2")) return false;
    stmt_1_2_0(b, l + 1);
    return true;
  }

  // ':' ty_sum
  private static boolean stmt_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && ty_sum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' expr]
  private static boolean stmt_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1_3")) return false;
    stmt_1_3_0(b, l + 1);
    return true;
  }

  // '=' expr
  private static boolean stmt_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr ';'
  private static boolean stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // static_item
  //                     | const_item
  //                     | type_item
  //                     | block_item
  static boolean stmt_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_item(b, l + 1);
    if (!r) r = const_item(b, l + 1);
    if (!r) r = type_item(b, l + 1);
    if (!r) r = block_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident ':' expr
  public static boolean struct_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_field")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && consumeToken(b, COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, STRUCT_FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // struct ident [generic_params] ( [where_clause] ';'
  //                                               | tuple_struct_body [where_clause] ';'
  //                                               | [where_clause] record_struct_body)
  public static boolean struct_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item")) return false;
    if (!nextTokenIs(b, STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRUCT, IDENT);
    r = r && struct_item_2(b, l + 1);
    r = r && struct_item_3(b, l + 1);
    exit_section_(b, m, STRUCT_ITEM, r);
    return r;
  }

  // [generic_params]
  private static boolean struct_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // [where_clause] ';'
  //                                               | tuple_struct_body [where_clause] ';'
  //                                               | [where_clause] record_struct_body
  private static boolean struct_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_item_3_0(b, l + 1);
    if (!r) r = struct_item_3_1(b, l + 1);
    if (!r) r = struct_item_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [where_clause] ';'
  private static boolean struct_item_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_item_3_0_0(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // [where_clause]
  private static boolean struct_item_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_3_0_0")) return false;
    where_clause(b, l + 1);
    return true;
  }

  // tuple_struct_body [where_clause] ';'
  private static boolean struct_item_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_struct_body(b, l + 1);
    r = r && struct_item_3_1_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // [where_clause]
  private static boolean struct_item_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_3_1_1")) return false;
    where_clause(b, l + 1);
    return true;
  }

  // [where_clause] record_struct_body
  private static boolean struct_item_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_3_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_item_3_2_0(b, l + 1);
    r = r && record_struct_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [where_clause]
  private static boolean struct_item_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_item_3_2_0")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' (outer_attrs trait_member) * '}'
  public static boolean trait_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_body")) return false;
    if (!nextTokenIs(b, CURLY_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_LEFT);
    r = r && trait_body_1(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, TRAIT_BODY, r);
    return r;
  }

  // (outer_attrs trait_member) *
  private static boolean trait_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_body_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!trait_body_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_body_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // outer_attrs trait_member
  private static boolean trait_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = outer_attrs(b, l + 1);
    r = r && trait_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // trait ident [generic_params] [':' ty_param_bounds] [where_clause] trait_body
  public static boolean trait_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item")) return false;
    if (!nextTokenIs(b, TRAIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TRAIT, IDENT);
    r = r && trait_item_2(b, l + 1);
    r = r && trait_item_3(b, l + 1);
    r = r && trait_item_4(b, l + 1);
    r = r && trait_body(b, l + 1);
    exit_section_(b, m, TRAIT_ITEM, r);
    return r;
  }

  // [generic_params]
  private static boolean trait_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // [':' ty_param_bounds]
  private static boolean trait_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_3")) return false;
    trait_item_3_0(b, l + 1);
    return true;
  }

  // ':' ty_param_bounds
  private static boolean trait_item_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && ty_param_bounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [where_clause]
  private static boolean trait_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_item_4")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type ty_param ';'
  //                | fn ident [generic_params] member_fn_params [ret_ty] [where_clause] (';' | block_expr )
  public static boolean trait_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_member")) return false;
    if (!nextTokenIs(b, "<trait member>", FN, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trait member>");
    r = trait_member_0(b, l + 1);
    if (!r) r = trait_member_1(b, l + 1);
    exit_section_(b, l, m, TRAIT_MEMBER, r, false, null);
    return r;
  }

  // type ty_param ';'
  private static boolean trait_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_member_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && ty_param(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // fn ident [generic_params] member_fn_params [ret_ty] [where_clause] (';' | block_expr )
  private static boolean trait_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_member_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FN, IDENT);
    r = r && trait_member_1_2(b, l + 1);
    r = r && member_fn_params(b, l + 1);
    r = r && trait_member_1_4(b, l + 1);
    r = r && trait_member_1_5(b, l + 1);
    r = r && trait_member_1_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [generic_params]
  private static boolean trait_member_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_member_1_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // [ret_ty]
  private static boolean trait_member_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_member_1_4")) return false;
    ret_ty(b, l + 1);
    return true;
  }

  // [where_clause]
  private static boolean trait_member_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_member_1_5")) return false;
    where_clause(b, l + 1);
    return true;
  }

  // ';' | block_expr
  private static boolean trait_member_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_member_1_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    if (!r) r = block_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <<comma_separated_list tuple_struct_member>> ')'
  public static boolean tuple_struct_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_struct_body")) return false;
    if (!nextTokenIs(b, PAR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && comma_separated_list(b, l + 1, tuple_struct_member_parser_);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, TUPLE_STRUCT_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // outer_attrs [visibility] ty
  public static boolean tuple_struct_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_struct_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<tuple struct member>");
    r = outer_attrs(b, l + 1);
    r = r && tuple_struct_member_1(b, l + 1);
    r = r && ty(b, l + 1);
    exit_section_(b, l, m, TUPLE_STRUCT_MEMBER, r, false, null);
    return r;
  }

  // [visibility]
  private static boolean tuple_struct_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_struct_member_1")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' ty_sum ')'
  //      | '()'
  //      | '(' <<comma_separated_list ty>> ')'
  //      | '*' ptr
  //      | '[' ty_sum ']'
  //      | '[' ty_sum ';' expr ']'
  //      | '&' [lifetime] [mut] ty
  //      | bare_fn
  //      | type_path
  public static boolean ty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ty>");
    r = ty_0(b, l + 1);
    if (!r) r = consumeToken(b, "()");
    if (!r) r = ty_2(b, l + 1);
    if (!r) r = ty_3(b, l + 1);
    if (!r) r = ty_4(b, l + 1);
    if (!r) r = ty_5(b, l + 1);
    if (!r) r = ty_6(b, l + 1);
    if (!r) r = consumeToken(b, BARE_FN);
    if (!r) r = type_path(b, l + 1);
    exit_section_(b, l, m, TY, r, false, null);
    return r;
  }

  // '(' ty_sum ')'
  private static boolean ty_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && ty_sum(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' <<comma_separated_list ty>> ')'
  private static boolean ty_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && comma_separated_list(b, l + 1, ty_parser_);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' ptr
  private static boolean ty_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && consumeToken(b, PTR);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' ty_sum ']'
  private static boolean ty_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_LEFT);
    r = r && ty_sum(b, l + 1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' ty_sum ';' expr ']'
  private static boolean ty_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_LEFT);
    r = r && ty_sum(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&' [lifetime] [mut] ty
  private static boolean ty_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AMPERSAND);
    r = r && ty_6_1(b, l + 1);
    r = r && ty_6_2(b, l + 1);
    r = r && ty(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [lifetime]
  private static boolean ty_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_6_1")) return false;
    consumeToken(b, LIFETIME);
    return true;
  }

  // [mut]
  private static boolean ty_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_6_2")) return false;
    consumeToken(b, MUT);
    return true;
  }

  /* ********************************************************** */
  // ident [':' ty_param_bounds]
  public static boolean ty_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_param")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && ty_param_1(b, l + 1);
    exit_section_(b, m, TY_PARAM, r);
    return r;
  }

  // [':' ty_param_bounds]
  private static boolean ty_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_param_1")) return false;
    ty_param_1_0(b, l + 1);
    return true;
  }

  // ':' ty_param_bounds
  private static boolean ty_param_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_param_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && ty_param_bounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lifetime | type_path
  public static boolean ty_param_bound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_param_bound")) return false;
    if (!nextTokenIs(b, "<ty param bound>", IDENT, LIFETIME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ty param bound>");
    r = consumeToken(b, LIFETIME);
    if (!r) r = type_path(b, l + 1);
    exit_section_(b, l, m, TY_PARAM_BOUND, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ty_param_bound ('+' ty_param_bound)*
  public static boolean ty_param_bounds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_param_bounds")) return false;
    if (!nextTokenIs(b, "<ty param bounds>", IDENT, LIFETIME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ty param bounds>");
    r = ty_param_bound(b, l + 1);
    r = r && ty_param_bounds_1(b, l + 1);
    exit_section_(b, l, m, TY_PARAM_BOUNDS, r, false, null);
    return r;
  }

  // ('+' ty_param_bound)*
  private static boolean ty_param_bounds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_param_bounds_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ty_param_bounds_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ty_param_bounds_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+' ty_param_bound
  private static boolean ty_param_bounds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_param_bounds_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && ty_param_bound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ty ['+' ty_param_bounds]
  public static boolean ty_sum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_sum")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ty sum>");
    r = ty(b, l + 1);
    r = r && ty_sum_1(b, l + 1);
    exit_section_(b, l, m, TY_SUM, r, false, null);
    return r;
  }

  // ['+' ty_param_bounds]
  private static boolean ty_sum_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_sum_1")) return false;
    ty_sum_1_0(b, l + 1);
    return true;
  }

  // '+' ty_param_bounds
  private static boolean ty_sum_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ty_sum_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && ty_param_bounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type ident [generic_params] [where_clause] '=' ty_sum ';'
  public static boolean type_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_item")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, IDENT);
    r = r && type_item_2(b, l + 1);
    r = r && type_item_3(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && ty_sum(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, TYPE_ITEM, r);
    return r;
  }

  // [generic_params]
  private static boolean type_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_item_2")) return false;
    generic_params(b, l + 1);
    return true;
  }

  // [where_clause]
  private static boolean type_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_item_3")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type_path_segment ("::" type_path_segment)*
  public static boolean type_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_path_segment(b, l + 1);
    r = r && type_path_1(b, l + 1);
    exit_section_(b, m, TYPE_PATH, r);
    return r;
  }

  // ("::" type_path_segment)*
  private static boolean type_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!type_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_path_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "::" type_path_segment
  private static boolean type_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && type_path_segment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident [generic_values | '(' [<<comma_separated_list ty_sum>>] ')' [ret_ty]]
  public static boolean type_path_segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_segment")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && type_path_segment_1(b, l + 1);
    exit_section_(b, m, TYPE_PATH_SEGMENT, r);
    return r;
  }

  // [generic_values | '(' [<<comma_separated_list ty_sum>>] ')' [ret_ty]]
  private static boolean type_path_segment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_segment_1")) return false;
    type_path_segment_1_0(b, l + 1);
    return true;
  }

  // generic_values | '(' [<<comma_separated_list ty_sum>>] ')' [ret_ty]
  private static boolean type_path_segment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_segment_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_values(b, l + 1);
    if (!r) r = type_path_segment_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' [<<comma_separated_list ty_sum>>] ')' [ret_ty]
  private static boolean type_path_segment_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_segment_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_LEFT);
    r = r && type_path_segment_1_0_1_1(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    r = r && type_path_segment_1_0_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<comma_separated_list ty_sum>>]
  private static boolean type_path_segment_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_segment_1_0_1_1")) return false;
    comma_separated_list(b, l + 1, ty_sum_parser_);
    return true;
  }

  // [ret_ty]
  private static boolean type_path_segment_1_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_path_segment_1_0_1_3")) return false;
    ret_ty(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // unsafe block_expr
  public static boolean unsafe_block_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsafe_block_expr")) return false;
    if (!nextTokenIs(b, UNSAFE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNSAFE);
    r = r && block_expr(b, l + 1);
    exit_section_(b, m, UNSAFE_BLOCK_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // use path_glob ';'
  public static boolean use_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_item")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && path_glob(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, USE_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // pub
  public static boolean visibility(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility")) return false;
    if (!nextTokenIs(b, PUB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUB);
    exit_section_(b, m, VISIBILITY, r);
    return r;
  }

  /* ********************************************************** */
  // where <<comma_separated_list (ty ':' ty_param_bounds)>>
  public static boolean where_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause")) return false;
    if (!nextTokenIs(b, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && comma_separated_list(b, l + 1, where_clause_1_0_parser_);
    exit_section_(b, m, WHERE_CLAUSE, r);
    return r;
  }

  // ty ':' ty_param_bounds
  private static boolean where_clause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ty(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ty_param_bounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // while (let pat '=' expr | expr) block_expr
  public static boolean while_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_expr")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && while_expr_1(b, l + 1);
    r = r && block_expr(b, l + 1);
    exit_section_(b, m, WHILE_EXPR, r);
    return r;
  }

  // let pat '=' expr | expr
  private static boolean while_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = while_expr_1_0(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // let pat '=' expr
  private static boolean while_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && pat(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(assign_expr)
  // 1: BINARY(range_expr)
  // 2: BINARY(lor_expr)
  // 3: BINARY(land_expr)
  // 4: BINARY(eq_expr) BINARY(neq_expr) BINARY(lt_expr) BINARY(gt_expr) BINARY(leq_expr) BINARY(geq_expr)
  // 5: BINARY(bor_expr)
  // 6: BINARY(bxor_expr)
  // 7: BINARY(band_expr)
  // 8: BINARY(shl_expr) BINARY(shr_expr)
  // 9: BINARY(plus_expr) BINARY(minus_expr)
  // 10: BINARY(mul_expr) BINARY(div_expr) BINARY(mod_expr)
  // 11: POSTFIX(cast_expr)
  // 12: PREFIX(box_expr) PREFIX(unary_min_expr) PREFIX(deref_expr) PREFIX(not_expr) PREFIX(borrow_expr)
  // 13: ATOM(macro_expr)
  // 14: POSTFIX(ref_expr) POSTFIX(array_ref_expr) POSTFIX(call_expr)
  // 15: ATOM(struct_expr) ATOM(simple_ref_expr) ATOM(literal_expr) PREFIX(paren_expr) PREFIX(tuple_expr) ATOM(array_expr) PREFIX(lambda_expr) ATOM(return_expr) ATOM(statement_like_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = unary_min_expr(b, l + 1);
    if (!r) r = deref_expr(b, l + 1);
    if (!r) r = box_expr(b, l + 1);
    if (!r) r = not_expr(b, l + 1);
    if (!r) r = borrow_expr(b, l + 1);
    if (!r) r = macro_expr(b, l + 1);
    if (!r) r = struct_expr(b, l + 1);
    if (!r) r = simple_ref_expr(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    if (!r) r = tuple_expr(b, l + 1);
    if (!r) r = array_expr(b, l + 1);
    if (!r) r = lambda_expr(b, l + 1);
    if (!r) r = return_expr(b, l + 1);
    if (!r) r = statement_like_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && assign_expr_0(b, l + 1)) {
        r = expr(b, l, -1);
        exit_section_(b, l, m, ASSIGN_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, DOT_DOT)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, RANGE_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, PIPE_PIPE)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, LOR_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, AMPERSAND_AMPERSAND)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, LAND_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, EQUAL_EQUAL)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, EQ_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, "!=")) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, NEQ_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, LESS)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, LT_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, GREATER)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, GT_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, LESS_EQUAL)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, LEQ_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, GREATER_EQUAL)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, GEQ_EXPR, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, PIPE)) {
        r = expr(b, l, 5);
        exit_section_(b, l, m, BOR_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, "^")) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, BXOR_EXPR, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, AMPERSAND)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, BAND_EXPR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, "<<")) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, SHL_EXPR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, ">>")) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, SHR_EXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, PLUS)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, PLUS_EXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, MINUS)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, MINUS_EXPR, r, true, null);
      }
      else if (g < 10 && consumeTokenSmart(b, "*")) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, MUL_EXPR, r, true, null);
      }
      else if (g < 10 && consumeTokenSmart(b, "/")) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, DIV_EXPR, r, true, null);
      }
      else if (g < 10 && consumeTokenSmart(b, "%")) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, MOD_EXPR, r, true, null);
      }
      else if (g < 11 && cast_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CAST_EXPR, r, true, null);
      }
      else if (g < 14 && ref_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, REF_EXPR, r, true, null);
      }
      else if (g < 14 && array_ref_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ARRAY_REF_EXPR, r, true, null);
      }
      else if (g < 14 && call_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // [bin_op] '='
  private static boolean assign_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assign_expr_0_0(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // [bin_op]
  private static boolean assign_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_expr_0_0")) return false;
    bin_op(b, l + 1);
    return true;
  }

  public static boolean unary_min_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_min_expr")) return false;
    if (!nextTokenIsFast(b, MINUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, MINUS);
    p = r;
    r = p && expr(b, l, 12);
    exit_section_(b, l, m, UNARY_MIN_EXPR, r, p, null);
    return r || p;
  }

  public static boolean deref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deref_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, "*");
    p = r;
    r = p && expr(b, l, 12);
    exit_section_(b, l, m, DEREF_EXPR, r, p, null);
    return r || p;
  }

  // 'as' ty
  private static boolean cast_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "as");
    r = r && ty(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean box_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "box_expr")) return false;
    if (!nextTokenIsFast(b, BOX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, BOX);
    p = r;
    r = p && expr(b, l, 12);
    exit_section_(b, l, m, BOX_EXPR, r, p, null);
    return r || p;
  }

  public static boolean not_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_expr")) return false;
    if (!nextTokenIsFast(b, BANG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, BANG);
    p = r;
    r = p && expr(b, l, 12);
    exit_section_(b, l, m, NOT_EXPR, r, p, null);
    return r || p;
  }

  public static boolean borrow_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "borrow_expr")) return false;
    if (!nextTokenIsFast(b, AMPERSAND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = borrow_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 12);
    exit_section_(b, l, m, BORROW_EXPR, r, p, null);
    return r || p;
  }

  // '&' [mut]
  private static boolean borrow_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "borrow_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, AMPERSAND);
    r = r && borrow_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [mut]
  private static boolean borrow_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "borrow_expr_0_1")) return false;
    consumeTokenSmart(b, MUT);
    return true;
  }

  // ident '!' '(' [<<comma_separated_list expr>>] ')'
  public static boolean macro_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expr")) return false;
    if (!nextTokenIsFast(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENT);
    r = r && consumeToken(b, BANG);
    r = r && consumeToken(b, PAR_LEFT);
    r = r && macro_expr_3(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, MACRO_EXPR, r);
    return r;
  }

  // [<<comma_separated_list expr>>]
  private static boolean macro_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expr_3")) return false;
    comma_separated_list(b, l + 1, expr_parser_);
    return true;
  }

  // '.' (ident | lit_integer)
  private static boolean ref_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOT);
    r = r && ref_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ident | lit_integer
  private static boolean ref_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_expr_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENT);
    if (!r) r = consumeTokenSmart(b, LIT_INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' index_expr ']'
  private static boolean array_ref_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_ref_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BRACKET_LEFT);
    r = r && index_expr(b, l + 1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["::" generic_values] '(' [<<comma_separated_list expr>>] ')'
  private static boolean call_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = call_expr_0_0(b, l + 1);
    r = r && consumeToken(b, PAR_LEFT);
    r = r && call_expr_0_2(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["::" generic_values]
  private static boolean call_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0_0")) return false;
    call_expr_0_0_0(b, l + 1);
    return true;
  }

  // "::" generic_values
  private static boolean call_expr_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "::");
    r = r && generic_values(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<comma_separated_list expr>>]
  private static boolean call_expr_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0_2")) return false;
    comma_separated_list(b, l + 1, expr_parser_);
    return true;
  }

  // expr_path '{' <<comma_separated_list struct_field>> ['..' expr]'}'
  public static boolean struct_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_expr")) return false;
    if (!nextTokenIsFast(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_path(b, l + 1);
    r = r && consumeToken(b, CURLY_LEFT);
    r = r && comma_separated_list(b, l + 1, struct_field_parser_);
    r = r && struct_expr_3(b, l + 1);
    r = r && consumeToken(b, CURLY_RIGHT);
    exit_section_(b, m, STRUCT_EXPR, r);
    return r;
  }

  // ['..' expr]
  private static boolean struct_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_expr_3")) return false;
    struct_expr_3_0(b, l + 1);
    return true;
  }

  // '..' expr
  private static boolean struct_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOT_DOT);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr_path | self
  public static boolean simple_ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_ref_expr")) return false;
    if (!nextTokenIsFast(b, IDENT, SELF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<simple ref expr>");
    r = expr_path(b, l + 1);
    if (!r) r = consumeTokenSmart(b, SELF);
    exit_section_(b, l, m, SIMPLE_REF_EXPR, r, false, null);
    return r;
  }

  // lit
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal expr>");
    r = lit(b, l + 1);
    exit_section_(b, l, m, LITERAL_EXPR, r, false, null);
    return r;
  }

  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIsFast(b, PAR_LEFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = paren_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, consumeToken(b, PAR_RIGHT)) && r;
    exit_section_(b, l, m, PAREN_EXPR, r, p, null);
    return r || p;
  }

  // &('(' expr ')') '('
  private static boolean paren_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paren_expr_0_0(b, l + 1);
    r = r && consumeToken(b, PAR_LEFT);
    exit_section_(b, m, null, r);
    return r;
  }

  // &('(' expr ')')
  private static boolean paren_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = paren_expr_0_0_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // '(' expr ')'
  private static boolean paren_expr_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PAR_LEFT);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean tuple_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expr")) return false;
    if (!nextTokenIsFast(b, PAR_LEFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, PAR_LEFT);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, tuple_expr_1(b, l + 1)) && r;
    exit_section_(b, l, m, TUPLE_EXPR, r, p, null);
    return r || p;
  }

  // ',' [<<comma_separated_list expr>>] ')'
  private static boolean tuple_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tuple_expr_1_1(b, l + 1);
    r = r && consumeToken(b, PAR_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<comma_separated_list expr>>]
  private static boolean tuple_expr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expr_1_1")) return false;
    comma_separated_list(b, l + 1, expr_parser_);
    return true;
  }

  // '[' expr ';' expr ']'
  //              | '[' [<<comma_separated_list expr>>] ']'
  public static boolean array_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr")) return false;
    if (!nextTokenIsFast(b, BRACKET_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_expr_0(b, l + 1);
    if (!r) r = array_expr_1(b, l + 1);
    exit_section_(b, m, ARRAY_EXPR, r);
    return r;
  }

  // '[' expr ';' expr ']'
  private static boolean array_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BRACKET_LEFT);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' [<<comma_separated_list expr>>] ']'
  private static boolean array_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BRACKET_LEFT);
    r = r && array_expr_1_1(b, l + 1);
    r = r && consumeToken(b, BRACKET_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<comma_separated_list expr>>]
  private static boolean array_expr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1_1")) return false;
    comma_separated_list(b, l + 1, expr_parser_);
    return true;
  }

  public static boolean lambda_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expr")) return false;
    if (!nextTokenIsFast(b, PIPE, PIPE_PIPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = lambda_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, -1);
    exit_section_(b, l, m, LAMBDA_EXPR, r, p, null);
    return r || p;
  }

  // ('||' | '|' [<<comma_separated_list lambda_param>>] '|') [ret_ty]
  private static boolean lambda_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lambda_expr_0_0(b, l + 1);
    r = r && lambda_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '||' | '|' [<<comma_separated_list lambda_param>>] '|'
  private static boolean lambda_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PIPE_PIPE);
    if (!r) r = lambda_expr_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '|' [<<comma_separated_list lambda_param>>] '|'
  private static boolean lambda_expr_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expr_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PIPE);
    r = r && lambda_expr_0_0_1_1(b, l + 1);
    r = r && consumeToken(b, PIPE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<comma_separated_list lambda_param>>]
  private static boolean lambda_expr_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expr_0_0_1_1")) return false;
    comma_separated_list(b, l + 1, lambda_param_parser_);
    return true;
  }

  // [ret_ty]
  private static boolean lambda_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expr_0_1")) return false;
    ret_ty(b, l + 1);
    return true;
  }

  // return [expr]
  public static boolean return_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_expr")) return false;
    if (!nextTokenIsFast(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, RETURN);
    r = r && return_expr_1(b, l + 1);
    exit_section_(b, m, RETURN_EXPR, r);
    return r;
  }

  // [expr]
  private static boolean return_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_expr_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  // block_expr
  //                       | unsafe_block_expr
  //                       | if_expr
  //                       | while_expr
  //                       | loop_expr
  //                       | match_expr
  //                       | for_expr
  public static boolean statement_like_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_like_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<statement like expr>");
    r = block_expr(b, l + 1);
    if (!r) r = unsafe_block_expr(b, l + 1);
    if (!r) r = if_expr(b, l + 1);
    if (!r) r = while_expr(b, l + 1);
    if (!r) r = loop_expr(b, l + 1);
    if (!r) r = match_expr(b, l + 1);
    if (!r) r = for_expr(b, l + 1);
    exit_section_(b, l, m, STATEMENT_LIKE_EXPR, r, false, null);
    return r;
  }

  final static Parser enum_member_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return enum_member(b, l + 1);
    }
  };
  final static Parser expr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return expr(b, l + 1, -1);
    }
  };
  final static Parser fn_param_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return fn_param(b, l + 1);
    }
  };
  final static Parser generic_values_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return generic_values_1_0(b, l + 1);
    }
  };
  final static Parser lambda_param_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return lambda_param(b, l + 1);
    }
  };
  final static Parser meta_item_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return meta_item(b, l + 1);
    }
  };
  final static Parser pat_field_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return pat_field(b, l + 1);
    }
  };
  final static Parser pat_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return pat(b, l + 1);
    }
  };
  final static Parser path_item_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return path_item(b, l + 1);
    }
  };
  final static Parser record_struct_member_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return record_struct_member(b, l + 1);
    }
  };
  final static Parser struct_field_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return struct_field(b, l + 1);
    }
  };
  final static Parser tuple_struct_member_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return tuple_struct_member(b, l + 1);
    }
  };
  final static Parser ty_param_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ty_param(b, l + 1);
    }
  };
  final static Parser ty_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ty(b, l + 1);
    }
  };
  final static Parser ty_sum_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ty_sum(b, l + 1);
    }
  };
  final static Parser where_clause_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return where_clause_1_0(b, l + 1);
    }
  };
}
