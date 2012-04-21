/*
 * Copyright (C) 2007 Júlio Vilmar Gesser.
 * 
 * This file is part of Java 1.5 parser and Abstract Syntax Tree.
 *
 * Java 1.5 parser and Abstract Syntax Tree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Java 1.5 parser and Abstract Syntax Tree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java 1.5 parser and Abstract Syntax Tree.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 05/10/2006
 */
package uml.japa.parser.ast.visitor;

import uml.japa.parser.ast.BlockComment;
import uml.japa.parser.ast.CompilationUnit;
import uml.japa.parser.ast.ImportDeclaration;
import uml.japa.parser.ast.LineComment;
import uml.japa.parser.ast.PackageDeclaration;
import uml.japa.parser.ast.TypeParameter;
import uml.japa.parser.ast.body.AnnotationDeclaration;
import uml.japa.parser.ast.body.AnnotationMemberDeclaration;
import uml.japa.parser.ast.body.ClassOrInterfaceDeclaration;
import uml.japa.parser.ast.body.ConstructorDeclaration;
import uml.japa.parser.ast.body.EmptyMemberDeclaration;
import uml.japa.parser.ast.body.EmptyTypeDeclaration;
import uml.japa.parser.ast.body.EnumConstantDeclaration;
import uml.japa.parser.ast.body.EnumDeclaration;
import uml.japa.parser.ast.body.FieldDeclaration;
import uml.japa.parser.ast.body.InitializerDeclaration;
import uml.japa.parser.ast.body.JavadocComment;
import uml.japa.parser.ast.body.MethodDeclaration;
import uml.japa.parser.ast.body.Parameter;
import uml.japa.parser.ast.body.VariableDeclarator;
import uml.japa.parser.ast.body.VariableDeclaratorId;
import uml.japa.parser.ast.expr.ArrayAccessExpr;
import uml.japa.parser.ast.expr.ArrayCreationExpr;
import uml.japa.parser.ast.expr.ArrayInitializerExpr;
import uml.japa.parser.ast.expr.AssignExpr;
import uml.japa.parser.ast.expr.BinaryExpr;
import uml.japa.parser.ast.expr.BooleanLiteralExpr;
import uml.japa.parser.ast.expr.CastExpr;
import uml.japa.parser.ast.expr.CharLiteralExpr;
import uml.japa.parser.ast.expr.ClassExpr;
import uml.japa.parser.ast.expr.ConditionalExpr;
import uml.japa.parser.ast.expr.DoubleLiteralExpr;
import uml.japa.parser.ast.expr.EnclosedExpr;
import uml.japa.parser.ast.expr.FieldAccessExpr;
import uml.japa.parser.ast.expr.InstanceOfExpr;
import uml.japa.parser.ast.expr.IntegerLiteralExpr;
import uml.japa.parser.ast.expr.IntegerLiteralMinValueExpr;
import uml.japa.parser.ast.expr.LongLiteralExpr;
import uml.japa.parser.ast.expr.LongLiteralMinValueExpr;
import uml.japa.parser.ast.expr.MarkerAnnotationExpr;
import uml.japa.parser.ast.expr.MemberValuePair;
import uml.japa.parser.ast.expr.MethodCallExpr;
import uml.japa.parser.ast.expr.NameExpr;
import uml.japa.parser.ast.expr.NormalAnnotationExpr;
import uml.japa.parser.ast.expr.NullLiteralExpr;
import uml.japa.parser.ast.expr.ObjectCreationExpr;
import uml.japa.parser.ast.expr.QualifiedNameExpr;
import uml.japa.parser.ast.expr.SingleMemberAnnotationExpr;
import uml.japa.parser.ast.expr.StringLiteralExpr;
import uml.japa.parser.ast.expr.SuperExpr;
import uml.japa.parser.ast.expr.ThisExpr;
import uml.japa.parser.ast.expr.UnaryExpr;
import uml.japa.parser.ast.expr.VariableDeclarationExpr;
import uml.japa.parser.ast.stmt.AssertStmt;
import uml.japa.parser.ast.stmt.BlockStmt;
import uml.japa.parser.ast.stmt.BreakStmt;
import uml.japa.parser.ast.stmt.CatchClause;
import uml.japa.parser.ast.stmt.ContinueStmt;
import uml.japa.parser.ast.stmt.DoStmt;
import uml.japa.parser.ast.stmt.EmptyStmt;
import uml.japa.parser.ast.stmt.ExplicitConstructorInvocationStmt;
import uml.japa.parser.ast.stmt.ExpressionStmt;
import uml.japa.parser.ast.stmt.ForStmt;
import uml.japa.parser.ast.stmt.ForeachStmt;
import uml.japa.parser.ast.stmt.IfStmt;
import uml.japa.parser.ast.stmt.LabeledStmt;
import uml.japa.parser.ast.stmt.ReturnStmt;
import uml.japa.parser.ast.stmt.SwitchEntryStmt;
import uml.japa.parser.ast.stmt.SwitchStmt;
import uml.japa.parser.ast.stmt.SynchronizedStmt;
import uml.japa.parser.ast.stmt.ThrowStmt;
import uml.japa.parser.ast.stmt.TryStmt;
import uml.japa.parser.ast.stmt.TypeDeclarationStmt;
import uml.japa.parser.ast.stmt.WhileStmt;
import uml.japa.parser.ast.type.ClassOrInterfaceType;
import uml.japa.parser.ast.type.PrimitiveType;
import uml.japa.parser.ast.type.ReferenceType;
import uml.japa.parser.ast.type.VoidType;
import uml.japa.parser.ast.type.WildcardType;

/**
 * @author Julio Vilmar Gesser
 */
public interface GenericVisitor<R, A> {

    //- Compilation Unit ----------------------------------

    public R visit(CompilationUnit n, A arg);

    public R visit(PackageDeclaration n, A arg);

    public R visit(ImportDeclaration n, A arg);

    public R visit(TypeParameter n, A arg);

    public R visit(LineComment n, A arg);

    public R visit(BlockComment n, A arg);

    //- Body ----------------------------------------------

    public R visit(ClassOrInterfaceDeclaration n, A arg);

    public R visit(EnumDeclaration n, A arg);

    public R visit(EmptyTypeDeclaration n, A arg);

    public R visit(EnumConstantDeclaration n, A arg);

    public R visit(AnnotationDeclaration n, A arg);

    public R visit(AnnotationMemberDeclaration n, A arg);

    public R visit(FieldDeclaration n, A arg);

    public R visit(VariableDeclarator n, A arg);

    public R visit(VariableDeclaratorId n, A arg);

    public R visit(ConstructorDeclaration n, A arg);

    public R visit(MethodDeclaration n, A arg);

    public R visit(Parameter n, A arg);

    public R visit(EmptyMemberDeclaration n, A arg);

    public R visit(InitializerDeclaration n, A arg);

    public R visit(JavadocComment n, A arg);

    //- Type ----------------------------------------------

    public R visit(ClassOrInterfaceType n, A arg);

    public R visit(PrimitiveType n, A arg);

    public R visit(ReferenceType n, A arg);

    public R visit(VoidType n, A arg);

    public R visit(WildcardType n, A arg);

    //- Expression ----------------------------------------

    public R visit(ArrayAccessExpr n, A arg);

    public R visit(ArrayCreationExpr n, A arg);

    public R visit(ArrayInitializerExpr n, A arg);

    public R visit(AssignExpr n, A arg);

    public R visit(BinaryExpr n, A arg);

    public R visit(CastExpr n, A arg);

    public R visit(ClassExpr n, A arg);

    public R visit(ConditionalExpr n, A arg);

    public R visit(EnclosedExpr n, A arg);

    public R visit(FieldAccessExpr n, A arg);

    public R visit(InstanceOfExpr n, A arg);

    public R visit(StringLiteralExpr n, A arg);

    public R visit(IntegerLiteralExpr n, A arg);

    public R visit(LongLiteralExpr n, A arg);

    public R visit(IntegerLiteralMinValueExpr n, A arg);

    public R visit(LongLiteralMinValueExpr n, A arg);

    public R visit(CharLiteralExpr n, A arg);

    public R visit(DoubleLiteralExpr n, A arg);

    public R visit(BooleanLiteralExpr n, A arg);

    public R visit(NullLiteralExpr n, A arg);

    public R visit(MethodCallExpr n, A arg);

    public R visit(NameExpr n, A arg);

    public R visit(ObjectCreationExpr n, A arg);

    public R visit(QualifiedNameExpr n, A arg);

    public R visit(ThisExpr n, A arg);

    public R visit(SuperExpr n, A arg);

    public R visit(UnaryExpr n, A arg);

    public R visit(VariableDeclarationExpr n, A arg);

    public R visit(MarkerAnnotationExpr n, A arg);

    public R visit(SingleMemberAnnotationExpr n, A arg);

    public R visit(NormalAnnotationExpr n, A arg);

    public R visit(MemberValuePair n, A arg);

    //- Statements ----------------------------------------

    public R visit(ExplicitConstructorInvocationStmt n, A arg);

    public R visit(TypeDeclarationStmt n, A arg);

    public R visit(AssertStmt n, A arg);

    public R visit(BlockStmt n, A arg);

    public R visit(LabeledStmt n, A arg);

    public R visit(EmptyStmt n, A arg);

    public R visit(ExpressionStmt n, A arg);

    public R visit(SwitchStmt n, A arg);

    public R visit(SwitchEntryStmt n, A arg);

    public R visit(BreakStmt n, A arg);

    public R visit(ReturnStmt n, A arg);

    public R visit(IfStmt n, A arg);

    public R visit(WhileStmt n, A arg);

    public R visit(ContinueStmt n, A arg);

    public R visit(DoStmt n, A arg);

    public R visit(ForeachStmt n, A arg);

    public R visit(ForStmt n, A arg);

    public R visit(ThrowStmt n, A arg);

    public R visit(SynchronizedStmt n, A arg);

    public R visit(TryStmt n, A arg);

    public R visit(CatchClause n, A arg);

}
