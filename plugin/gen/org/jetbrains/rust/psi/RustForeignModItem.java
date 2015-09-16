// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustForeignModItem extends PsiElement {

  @Nullable
  RustAbi getAbi();

  @NotNull
  List<RustForeignItem> getForeignItemList();

  @NotNull
  List<RustInnerAttr> getInnerAttrList();

}
