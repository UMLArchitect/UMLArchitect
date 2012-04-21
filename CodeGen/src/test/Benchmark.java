package uml.test;

import java.io.FileInputStream;
import java.io.FileReader;
import uml.entities.classes.UMLPackage;
import uml.entities.factories.UmlJavaFactory;
import uml.java.lexer.JavaLexerJFlex;
import uml.java.parser.antlr.UMLAntlrFactory;
import uml.java.parser.cup.JavaParser;


public class Benchmark {

	public static void main(String[] args) throws Exception 
	{
		String f ="C:\\Users\\Adri1\\workspace\\UMLArchitect\\eclipse-plugin-uml\\src\\main\\java\\uml\\test\\TestParsing.java";
		//String f ="C:\\Users\\Adri1\\workspace\\UMLArchitect\\eclipse-plugin-uml\\src\\main\\java\\uml\\test\\TestIHaveFunWithEnums.java";
		//String f = "C:\\Users\\Adri1\\workspace\\UMLArchitect\\eclipse-plugin-uml\\src\\main\\java\\uml\\japa\\parser\\ASTParser.java";
		//String f = "C:\\Users\\Adri1\\workspace\\UMLArchitect\\eclipse-plugin-uml\\src\\main\\java\\uml\\bak\\PEnum.java";
		//
//	
//		System.out.println("*******************************************************************************");
//		System.out.println("******************************Dump CUP/JFlex***********************************");
//		System.out.println("****Attributs,Type génériques,enums et array en param ou return non gérés******");
//		System.out.println("*******************************************************************************");
//		System.out.println("*******************************************************************************");
//		System.out.println();
//		
//		try
//		{
//		JavaLexer sc = new JavaLexer(new FileReader(f));
//		JavaParser ps = new JavaParser(sc);
//		ps.parse();
//		UMLPackage p = UmlJavaFactory.toUMLPackage(ps.cu);
//		System.out.println(p.toString());
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
//		System.out.println("*******************************************************************************");
//		System.out.println("******************************Dump ANTLR***************************************");
//		System.out.println("*********************Type génériques et array non gérés************************");
//		System.out.println("*******************************************************************************");
//		System.out.println("*******************************************************************************");
//		System.out.println();
		
	//	try
	//	{
			UMLAntlrFactory fac = new UMLAntlrFactory(f);
			UMLPackage p1 =fac.parsePackage();
			System.out.println(p1.toString());
	//	}
	//	catch (Exception e) {
			//		System.out.println(e.getMessage());
			//	}

//		System.out.println();
//		System.out.println("*******************************************************************************");
//		System.out.println("**************************Dump javaparser (JavaCC)*****************************");
//		System.out.println("*******************************************************************************");
//		System.out.println("***********************Interface UML entities non réalisée*********************");
//		System.out.println("******************************COMPOSANT EXISTANT*******************************");
//		System.out.println("*******************************************************************************");
//		System.out.println();
//		
//		try
//		{
//			uml.japa.parser.ast.CompilationUnit cu;
//			cu = uml.japa.parser.JavaParser.parse(new FileInputStream(f));
//			System.out.println(cu.toString());
//		}
//		catch (Exception e)
//		{
//		System.out.println(e.getMessage());	
//		}

		System.exit(0);
	}

}
