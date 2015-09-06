// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustItemMod extends PsiElement {

  @NotNull
  List<RustInnerAttr> getInnerAttrList();

  @NotNull
  List<RustModItem> getModItemList();

  @NotNull
  PsiElement getIdent();

}
