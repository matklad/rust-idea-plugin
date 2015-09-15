// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.jetbrains.rust.psi.RustTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jetbrains.rust.psi.*;

public class RustTraitMemberImpl extends ASTWrapperPsiElement implements RustTraitMember {

  public RustTraitMemberImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitTraitMember(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustBlockExpr getBlockExpr() {
    return findChildByClass(RustBlockExpr.class);
  }

  @Override
  @Nullable
  public RustGenericParams getGenericParams() {
    return findChildByClass(RustGenericParams.class);
  }

  @Override
  @Nullable
  public RustMemberFnParams getMemberFnParams() {
    return findChildByClass(RustMemberFnParams.class);
  }

  @Override
  @Nullable
  public RustTy getTy() {
    return findChildByClass(RustTy.class);
  }

  @Override
  @Nullable
  public RustTyParam getTyParam() {
    return findChildByClass(RustTyParam.class);
  }

  @Override
  @Nullable
  public RustWhereClause getWhereClause() {
    return findChildByClass(RustWhereClause.class);
  }

  @Override
  @Nullable
  public PsiElement getIdent() {
    return findChildByType(IDENT);
  }

}
