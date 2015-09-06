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
import org.jetbrains.rust.psi.RustTypes


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
//        tokenMap[RustTypes.AS] = RUST_KEYWORD
//        tokenMap[RustTypes.BREAK] = RUST_KEYWORD
        tokenMap[RustTypes.CONST] = RUST_KEYWORD
//        tokenMap[RustTypes.CRATE] = RUST_KEYWORD
//        tokenMap[RustTypes.ELSE] = RUST_KEYWORD
//        tokenMap[RustTypes.ENUM] = RUST_KEYWORD
//        tokenMap[RustTypes.EXTERN] = RUST_KEYWORD
        tokenMap[RustTypes.FALSE] = RUST_KEYWORD
        tokenMap[RustTypes.FN] = RUST_KEYWORD
//        tokenMap[RustTypes.FOR] = RUST_KEYWORD
//        tokenMap[RustTypes.IF] = RUST_KEYWORD
//        tokenMap[RustTypes.IMPL] = RUST_KEYWORD
//        tokenMap[RustTypes.IN] = RUST_KEYWORD
//        tokenMap[RustTypes.LET] = RUST_KEYWORD
//        tokenMap[RustTypes.LOOP] = RUST_KEYWORD
//        tokenMap[RustTypes.MATCH] = RUST_KEYWORD
        tokenMap[RustTypes.MOD] = RUST_KEYWORD
        tokenMap[RustTypes.MUT] = RUST_KEYWORD
//        tokenMap[RustTypes.PRIV] = RUST_KEYWORD
//        tokenMap[RustTypes.PROC] = RUST_KEYWORD
//        tokenMap[RustTypes.MOVE] = RUST_KEYWORD
        tokenMap[RustTypes.PUB] = RUST_KEYWORD
//        tokenMap[RustTypes.REF] = RUST_KEYWORD
//        tokenMap[RustTypes.RETURN] = RUST_KEYWORD
//        tokenMap[RustTypes.SELF] = RUST_KEYWORD
        tokenMap[RustTypes.STATIC] = RUST_KEYWORD
//        tokenMap[RustTypes.STRUCT] = RUST_KEYWORD
//        tokenMap[RustTypes.SUPER] = RUST_KEYWORD
        tokenMap[RustTypes.TRUE] = RUST_KEYWORD
//        tokenMap[RustTypes.TRAIT] = RUST_KEYWORD
//        tokenMap[RustTypes.TYPE] = RUST_KEYWORD
//        tokenMap[RustTypes.UNSAFE] = RUST_KEYWORD
//        tokenMap[RustTypes.USE] = RUST_KEYWORD
//        tokenMap[RustTypes.WHILE] = RUST_KEYWORD
//        tokenMap[RustTypes.CONTINUE] = RUST_KEYWORD
//        tokenMap[RustTypes.BOX] = RUST_KEYWORD
        tokenMap[RustTypes.WHERE] = RUST_KEYWORD
    }

}
