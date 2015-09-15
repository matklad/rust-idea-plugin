// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustEnumMember extends PsiElement {

  @NotNull
  RustOuterAttrs getOuterAttrs();

  @Nullable
  RustRecordStructBody getRecordStructBody();

  @Nullable
  RustTupleStructBody getTupleStructBody();

  @Nullable
  RustVisibility getVisibility();

  @NotNull
  PsiElement getIdent();

}
