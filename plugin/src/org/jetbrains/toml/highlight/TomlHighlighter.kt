package org.jetbrains.toml.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import gnu.trove.THashMap
import org.jetbrains.toml.parser.lexer.TomlLexer
import org.jetbrains.toml.psi.TomlTypes


class TomlHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer =
            TomlLexer()


    override fun getTokenHighlights(tokenType: IElementType?): Array<out TextAttributesKey> =
            SyntaxHighlighterBase.pack(tokenMap.get(tokenType))


    private val tokenMap: Map<IElementType, TextAttributesKey> = makeKeysl()
}

fun makeKeysl(): Map<IElementType, TextAttributesKey> {
    val result = THashMap<IElementType, TextAttributesKey>()
    result[TomlTypes.KEY] =
            TextAttributesKey.createTextAttributesKey("TOML_KEY", DefaultLanguageHighlighterColors.KEYWORD)

    result[TomlTypes.COMMENT] =
            TextAttributesKey.createTextAttributesKey("TOML_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)

    result[TomlTypes.STRING] =
            TextAttributesKey.createTextAttributesKey("TOML_STRING", DefaultLanguageHighlighterColors.STRING)

    result[TomlTypes.NUMBER] =
            TextAttributesKey.createTextAttributesKey("TOML_NUMBER", DefaultLanguageHighlighterColors.NUMBER)

    result[TomlTypes.BOOLEAN] =
            TextAttributesKey.createTextAttributesKey("TOML_BOOLEAN", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)

    return result;
}

