package org.jetbrains.toml

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import org.jetbrains.toml.highlight.TomlHighlighter


public class TomlLanguage : Language("TOML", "text/toml") {

    companion object {
        public val INSTANCE: TomlLanguage = TomlLanguage();
    }
}
