package org.jetbrains.rust.highlight;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import org.jetbrains.annotations.NotNull;

public class RustHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {

  @NotNull
  protected RustHighlighter createHighlighter() {
    return new RustHighlighter();
  }

}