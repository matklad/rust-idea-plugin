package org.jetbrains.toml.highlight

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory

public class TomlHighlighterFactory : SingleLazyInstanceSyntaxHighlighterFactory() {

    override fun createHighlighter(): TomlHighlighter {
        return TomlHighlighter()
    }

}

