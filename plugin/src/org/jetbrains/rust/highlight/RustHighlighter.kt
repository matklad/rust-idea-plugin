package org.jetbrains.rust.highlight

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.util.Pair
import com.intellij.psi.tree.IElementType
import gnu.trove.THashMap
import org.jetbrains.rust.parser.RustTokenType
import org.jetbrains.rust.parser.lexer.RustLexer
import org.jetbrains.rust.parser.token.RustLexerTokens


public open class RustHighlighter() : SyntaxHighlighterBase() {

    companion object {

        public val RUST_KEYWORD: TextAttributesKey
                = TextAttributesKey.createTextAttributesKey("RUST_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
    }

    public override fun getHighlightingLexer(): Lexer {
        return RustLexer()
    }

    public override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return SyntaxHighlighterBase.pack(keys1.get(tokenType))
    }


    private val keys1: MutableMap<IElementType, TextAttributesKey>

    init {
        keys1 = THashMap<IElementType, TextAttributesKey>()
        keys1[RustLexerTokens.KW_AS] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_BREAK] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_CONST] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_CRATE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_ELSE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_ENUM] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_EXTERN] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_FALSE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_FN] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_FOR] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_IF] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_IMPL] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_IN] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_LET] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_LOOP] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_MATCH] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_MOD] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_MUT] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_PRIV] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_PROC] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_MOVE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_PUB] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_REF] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_RETURN] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_SELF] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_STATIC] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_STRUCT] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_SUPER] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_TRUE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_TRAIT] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_TYPE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_UNSAFE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_USE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_WHILE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_CONTINUE] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_BOX] = RUST_KEYWORD
        keys1[RustLexerTokens.KW_WHERE] = RUST_KEYWORD
    }

}
