package org.jetbrains.rust

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import org.jetbrains.rust.highlight.RustHighlighter

public class RustLanguage : Language("Rust", "text/rust") {

    init {
        SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, object : SingleLazyInstanceSyntaxHighlighterFactory() {
            override fun createHighlighter(): SyntaxHighlighter {
                return RustHighlighter()
            }
        })
    }

    companion object {
        public val INSTANCE: RustLanguage = RustLanguage()
    }
}