// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustStructExpr extends RustExpr {

  @NotNull
  RustCommaSeparatedList getCommaSeparatedList();

  @Nullable
  RustExpr getExpr();

  @NotNull
  RustExprPath getExprPath();

}
