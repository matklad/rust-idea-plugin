package org.jetbrains.rust;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.rust.highlight.RustHighlighter;

public class RustLanguage extends Language {
    public static final RustLanguage INSTANCE = new RustLanguage();

    public RustLanguage() {
        super("Rust", "text/rust");
        SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
            @NotNull
            protected SyntaxHighlighter createHighlighter() {
                return new RustHighlighter();
            }
        });
    }
}