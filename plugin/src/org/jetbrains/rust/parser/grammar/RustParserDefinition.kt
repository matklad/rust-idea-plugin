package org.jetbrains.rust.parser.grammar

import com.intellij.lang.ParserDefinition
import com.intellij.lang.ASTNode
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
import org.jetbrains.rust.RustLanguage
import org.jetbrains.rust.fileType.RustFile
import org.jetbrains.rust.grammar.RustParser
import org.jetbrains.rust.parser.lexer.RustLexer
import org.jetbrains.rust.psi.RustTypes

public class RustParserDefinition : ParserDefinition {
    override fun createParser(project: Project?): PsiParser =
            RustParser()

    override fun createFile(viewProvider: FileViewProvider): PsiFile =
            RustFile(viewProvider)

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
            RustLexer()

    override fun createElement(node: ASTNode?): PsiElement =
            RustTypes.Factory.createElement(node)

    companion object {
        val FILE: IFileElementType = IFileElementType(RustLanguage.INSTANCE)
        val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE);
        val COMMENTS: TokenSet = TokenSet.create(RustTypes.LINE_COMMENT, RustTypes.BLOCK_COMMENT);
    }
}




