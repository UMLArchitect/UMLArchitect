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
public interface VoidVisitor<A> {

    //- Compilation Unit ----------------------------------

    public void visit(CompilationUnit n, A arg);

    public void visit(PackageDeclaration n, A arg);

    public void visit(ImportDeclaration n, A arg);

    public void visit(TypeParameter n, A arg);

    public void visit(LineComment n, A arg);

    public void visit(BlockComment n, A arg);

    //- Body ----------------------------------------------

    public void visit(ClassOrInterfaceDeclaration n, A arg);

    public void visit(EnumDeclaration n, A arg);

    public void visit(EmptyTypeDeclaration n, A arg);

    public void visit(EnumConstantDeclaration n, A arg);

    public void visit(AnnotationDeclaration n, A arg);

    public void visit(AnnotationMemberDeclaration n, A arg);

    public void visit(FieldDeclaration n, A arg);

    public void visit(VariableDeclarator n, A arg);

    public void visit(VariableDeclaratorId n, A arg);

    public void visit(ConstructorDeclaration n, A arg);

    public void visit(MethodDeclaration n, A arg);

    public void visit(Parameter n, A arg);

    public void visit(EmptyMemberDeclaration n, A arg);

    public void visit(InitializerDeclaration n, A arg);

    public void visit(JavadocComment n, A arg);

    //- Type ----------------------------------------------

    public void visit(ClassOrInterfaceType n, A arg);

    public void visit(PrimitiveType n, A arg);

    public void visit(ReferenceType n, A arg);

    public void visit(VoidType n, A arg);

    public void visit(WildcardType n, A arg);

    //- Expression ----------------------------------------

    public void visit(ArrayAccessExpr n, A arg);

    public void visit(ArrayCreationExpr n, A arg);

    public void visit(ArrayInitializerExpr n, A arg);

    public void visit(AssignExpr n, A arg);

    public void visit(BinaryExpr n, A arg);

    public void visit(CastExpr n, A arg);

    public void visit(ClassExpr n, A arg);

    public void visit(ConditionalExpr n, A arg);

    public void visit(EnclosedExpr n, A arg);

    public void visit(FieldAccessExpr n, A arg);

    public void visit(InstanceOfExpr n, A arg);

    public void visit(StringLiteralExpr n, A arg);

    public void visit(IntegerLiteralExpr n, A arg);

    public void visit(LongLiteralExpr n, A arg);

    public void visit(IntegerLiteralMinValueExpr n, A arg);

    public void visit(LongLiteralMinValueExpr n, A arg);

    public void visit(CharLiteralExpr n, A arg);

    public void visit(DoubleLiteralExpr n, A arg);

    public void visit(BooleanLiteralExpr n, A arg);

    public void visit(NullLiteralExpr n, A arg);

    public void visit(MethodCallExpr n, A arg);

    public void visit(NameExpr n, A arg);

    public void visit(ObjectCreationExpr n, A arg);

    public void visit(QualifiedNameExpr n, A arg);

    public void visit(ThisExpr n, A arg);

    public void visit(SuperExpr n, A arg);

    public void visit(UnaryExpr n, A arg);

    public void visit(VariableDeclarationExpr n, A arg);

    public void visit(MarkerAnnotationExpr n, A arg);

    public void visit(SingleMemberAnnotationExpr n, A arg);

    public void visit(NormalAnnotationExpr n, A arg);

    public void visit(MemberValuePair n, A arg);

    //- Statements ----------------------------------------

    public void visit(ExplicitConstructorInvocationStmt n, A arg);

    public void visit(TypeDeclarationStmt n, A arg);

    public void visit(AssertStmt n, A arg);

    public void visit(BlockStmt n, A arg);

    public void visit(LabeledStmt n, A arg);

    public void visit(EmptyStmt n, A arg);

    public void visit(ExpressionStmt n, A arg);

    public void visit(SwitchStmt n, A arg);

    public void visit(SwitchEntryStmt n, A arg);

    public void visit(BreakStmt n, A arg);

    public void visit(ReturnStmt n, A arg);

    public void visit(IfStmt n, A arg);

    public void visit(WhileStmt n, A arg);

    public void visit(ContinueStmt n, A arg);

    public void visit(DoStmt n, A arg);

    public void visit(ForeachStmt n, A arg);

    public void visit(ForStmt n, A arg);

    public void visit(ThrowStmt n, A arg);

    public void visit(SynchronizedStmt n, A arg);

    public void visit(TryStmt n, A arg);

    public void visit(CatchClause n, A arg);

}
