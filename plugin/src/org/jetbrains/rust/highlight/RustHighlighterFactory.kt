package org.jetbrains.rust.highlight

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory

public class RustHighlighterFactory : SingleLazyInstanceSyntaxHighlighterFactory() {

    override fun createHighlighter(): RustHighlighter {
        return RustHighlighter()
    }

}