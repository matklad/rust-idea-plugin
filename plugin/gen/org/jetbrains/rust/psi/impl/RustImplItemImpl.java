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

public class RustImplItemImpl extends ASTWrapperPsiElement implements RustImplItem {

  public RustImplItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitImplItem(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustGenericParams getGenericParams() {
    return findChildByClass(RustGenericParams.class);
  }

  @Override
  @NotNull
  public List<RustImplMember> getImplMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustImplMember.class);
  }

  @Override
  @NotNull
  public List<RustInnerAttr> getInnerAttrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustInnerAttr.class);
  }

  @Override
  @NotNull
  public List<RustTySum> getTySumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustTySum.class);
  }

  @Override
  @NotNull
  public List<RustVisibility> getVisibilityList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustVisibility.class);
  }

  @Override
  @Nullable
  public RustWhereClause getWhereClause() {
    return findChildByClass(RustWhereClause.class);
  }

}
