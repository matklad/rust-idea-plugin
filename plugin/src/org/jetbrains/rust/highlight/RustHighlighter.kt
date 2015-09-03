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
        return SyntaxHighlighterBase.pack(tokenMap.get(tokenType))
    }


    private val tokenMap: MutableMap<IElementType, TextAttributesKey>

    init {
        tokenMap = THashMap<IElementType, TextAttributesKey>()
        tokenMap[RustLexerTokens.KW_AS] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_BREAK] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_CONST] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_CRATE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_ELSE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_ENUM] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_EXTERN] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_FALSE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_FN] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_FOR] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_IF] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_IMPL] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_IN] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_LET] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_LOOP] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_MATCH] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_MOD] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_MUT] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_PRIV] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_PROC] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_MOVE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_PUB] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_REF] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_RETURN] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_SELF] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_STATIC] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_STRUCT] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_SUPER] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_TRUE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_TRAIT] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_TYPE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_UNSAFE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_USE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_WHILE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_CONTINUE] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_BOX] = RUST_KEYWORD
        tokenMap[RustLexerTokens.KW_WHERE] = RUST_KEYWORD
    }

}
