// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustModItem extends PsiElement {

  @NotNull
  RustAttrsAndVis getAttrsAndVis();

  @Nullable
  RustExternCrateItem getExternCrateItem();

  @Nullable
  RustItemConst getItemConst();

  @Nullable
  RustItemFn getItemFn();

  @Nullable
  RustItemMod getItemMod();

  @Nullable
  RustItemStatic getItemStatic();

  @Nullable
  RustUseItem getUseItem();

}
