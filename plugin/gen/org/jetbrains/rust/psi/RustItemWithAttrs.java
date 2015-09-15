// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustItemWithAttrs extends PsiElement {

  @NotNull
  RustAttrsAndVis getAttrsAndVis();

  @Nullable
  RustConstItem getConstItem();

  @Nullable
  RustExternCrateItem getExternCrateItem();

  @Nullable
  RustFnItem getFnItem();

  @Nullable
  RustImplItem getImplItem();

  @Nullable
  RustModItem getModItem();

  @Nullable
  RustStaticItem getStaticItem();

  @Nullable
  RustStructItem getStructItem();

  @Nullable
  RustTraitItem getTraitItem();

  @Nullable
  RustUseItem getUseItem();

}
