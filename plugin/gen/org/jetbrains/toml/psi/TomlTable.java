// This is a generated file. Not intended for manual editing.
package org.jetbrains.toml.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TomlTable extends PsiElement {

  @NotNull
  TomlTableEntries getTableEntries();

  @NotNull
  TomlTableHeader getTableHeader();

}
