// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustStmt extends PsiElement {

  @Nullable
  RustConstItem getConstItem();

  @Nullable
  RustEnumItem getEnumItem();

  @Nullable
  RustExpr getExpr();

  @Nullable
  RustFnItem getFnItem();

  @Nullable
  RustForeignModItem getForeignModItem();

  @Nullable
  RustImplItem getImplItem();

  @Nullable
  RustModItem getModItem();

  @Nullable
  RustPat getPat();

  @Nullable
  RustStaticItem getStaticItem();

  @Nullable
  RustStructItem getStructItem();

  @Nullable
  RustTraitItem getTraitItem();

  @Nullable
  RustTySum getTySum();

  @Nullable
  RustTypeItem getTypeItem();

}
