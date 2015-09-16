package org.jetbrains.rust.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import gnu.trove.THashMap
import org.jetbrains.rust.parser.lexer.RustLexer
import org.jetbrains.rust.psi.RustTypes


public open class RustHighlighter() : SyntaxHighlighterBase() {

    public override fun getHighlightingLexer(): Lexer {
        return RustLexer()
    }

    public override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return SyntaxHighlighterBase.pack(tokenMap.get(tokenType))
    }


    private val tokenMap: Map<IElementType, TextAttributesKey> = initTokenMap()
}

private fun initTokenMap(): Map<IElementType, TextAttributesKey> {
    val result = THashMap<IElementType, TextAttributesKey>()
    val keywords = arrayOf(
            RustTypes.AS,
            RustTypes.CONST,
            RustTypes.CRATE,
            RustTypes.ELSE,
            RustTypes.ENUM,
            RustTypes.EXTERN,
            RustTypes.FALSE,
            RustTypes.FN,
            RustTypes.FOR,
            RustTypes.IF,
            RustTypes.IMPL,
            RustTypes.IN,
            RustTypes.LET,
            RustTypes.LOOP,
            RustTypes.MATCH,
            RustTypes.MOD,
            RustTypes.MUT,
            RustTypes.PUB,
            RustTypes.REF,
            RustTypes.RETURN,
            RustTypes.SELF,
            RustTypes.STATIC,
            RustTypes.STRUCT,
            RustTypes.TRAIT,
            RustTypes.TRUE,
            RustTypes.TYPE,
            RustTypes.USE,
            RustTypes.WHERE,
            RustTypes.WHILE
    );
    val rust_keyword =
            TextAttributesKey.createTextAttributesKey("RUST_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)

    for (kw in keywords) {
        result[kw] = rust_keyword
    }

    result[RustTypes.LIT_STRING] =
            TextAttributesKey.createTextAttributesKey("RUST_STRING", DefaultLanguageHighlighterColors.STRING)

    result[RustTypes.LIT_INTEGER] =
            TextAttributesKey.createTextAttributesKey("RUST_NUMBEr", DefaultLanguageHighlighterColors.NUMBER)


    return result;
}
