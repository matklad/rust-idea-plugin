package org.jetbrains.rust

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import org.jetbrains.rust.highlight.RustHighlighter

public class RustLanguage : Language("Rust", "text/rust") {
    companion object {
        public val INSTANCE: RustLanguage = RustLanguage()
    }
}