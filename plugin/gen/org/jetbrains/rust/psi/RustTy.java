// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustTy extends PsiElement {

  @Nullable
  RustCommaSeparatedList getCommaSeparatedList();

  @Nullable
  RustExpr getExpr();

  @Nullable
  RustPath getPath();

  @Nullable
  RustTy getTy();

  @Nullable
  RustTySum getTySum();

}
