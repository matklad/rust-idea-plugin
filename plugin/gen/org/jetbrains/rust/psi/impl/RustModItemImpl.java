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

public class RustModItemImpl extends ASTWrapperPsiElement implements RustModItem {

  public RustModItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitModItem(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RustAttrsAndVis getAttrsAndVis() {
    return findNotNullChildByClass(RustAttrsAndVis.class);
  }

  @Override
  @Nullable
  public RustExternCrateItem getExternCrateItem() {
    return findChildByClass(RustExternCrateItem.class);
  }

  @Override
  @Nullable
  public RustItemConst getItemConst() {
    return findChildByClass(RustItemConst.class);
  }

  @Override
  @Nullable
  public RustItemFn getItemFn() {
    return findChildByClass(RustItemFn.class);
  }

  @Override
  @Nullable
  public RustItemMod getItemMod() {
    return findChildByClass(RustItemMod.class);
  }

  @Override
  @Nullable
  public RustItemStatic getItemStatic() {
    return findChildByClass(RustItemStatic.class);
  }

  @Override
  @Nullable
  public RustUseItem getUseItem() {
    return findChildByClass(RustUseItem.class);
  }

}
