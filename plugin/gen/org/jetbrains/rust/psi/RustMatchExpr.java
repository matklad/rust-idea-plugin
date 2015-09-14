// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustMatchExpr extends RustExpr {

  @NotNull
  List<RustExpr> getExprList();

  @NotNull
  List<RustPats> getPatsList();

}
