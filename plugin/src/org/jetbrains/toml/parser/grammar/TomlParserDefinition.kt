package org.jetbrains.toml.parser.grammar

import com.intellij.lang.ASTNode
import com.intellij.lang.Language
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.jetbrains.toml.TomlLanguage
import org.jetbrains.toml.grammar.TomlParser
import org.jetbrains.toml.parser.lexer.TomlLexer
import org.jetbrains.toml.psi.TomlFile
import org.jetbrains.toml.psi.TomlTypes

public class TomlParserDefinition : ParserDefinition {
    override fun createParser(project: Project?): PsiParser =
            TomlParser()

    override fun createFile(viewProvider: FileViewProvider): PsiFile =
            TomlFile(viewProvider)

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements? {
        return ParserDefinition.SpaceRequirements.MAY
    }

    override fun getStringLiteralElements(): TokenSet =
            TokenSet.EMPTY;

    override fun getWhitespaceTokens(): TokenSet =
            WHITE_SPACES


    override fun getCommentTokens(): TokenSet =
            COMMENTS

    override fun getFileNodeType(): IFileElementType? =
            FILE

    override fun createLexer(project: Project?): Lexer =
            TomlLexer()

    override fun createElement(node: ASTNode?): PsiElement =
            TomlTypes.Factory.createElement(node)

    companion object {
        val FILE: IFileElementType = IFileElementType(Language.findInstance<TomlLanguage>(javaClass<TomlLanguage>()))
        val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE);
        val COMMENTS: TokenSet = TokenSet.EMPTY;
    }

}


