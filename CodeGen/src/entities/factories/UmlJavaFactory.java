/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.entities.factories;

import java.util.ArrayList;
import java.util.List;

import uml.entities.classes.UMLClass;
import uml.entities.classes.UMLField;
import uml.entities.classes.UMLMethod;
import uml.entities.classes.UMLPackage;
import uml.java.modeling.body.ClassOrInterfaceDeclaration;
import uml.java.modeling.body.FieldDeclaration;
import uml.java.modeling.body.MethodDeclaration;
import uml.java.modeling.body.ModifierSet;
import uml.java.modeling.body.Parameter;
import uml.java.modeling.body.Variable;
import uml.java.modeling.compilation.ImportDeclaration;
import uml.java.modeling.interfaces.IMembers;
import uml.java.parser.cup.CompilationUnit;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating UML objects from Java objects.
 * A set of methods to map java.modeling objects to standard UML objects.
 */
public class UmlJavaFactory {

	
	/**
	 * Convert a java class object or an interface java object.
	 *
	 * @param javaClsOrInt the java class or interface
	 * @return an UMLClass object
	 */
	public static UMLClass toUMLClass (ClassOrInterfaceDeclaration javaClsOrInt)
	{
		UMLClass clsOrInt = new UMLClass();
		List<UMLMethod> methods = new ArrayList<UMLMethod>();
		List<UMLField> fields = new ArrayList<UMLField>();
		List<String> modifiers = new ArrayList<String>();
		
		if (javaClsOrInt.isInterface())
		{
			clsOrInt.setIsInterface(true);
		}
		
		clsOrInt.setIdentifier(javaClsOrInt.getName());
		
		for (String modifiers_ : ModifierSet.modifierToString(javaClsOrInt.getModifiers()).trim().split(" ")) {
			modifiers.add(modifiers_);
		} 
		
		clsOrInt.setModifiers(modifiers);
		
		for (String extends_ : javaClsOrInt.getExtends()) {
			clsOrInt.setHeritage(extends_);
		}
		
		for (String extends_ : javaClsOrInt.getImplements()) {
			clsOrInt.setImplementations(extends_);
		}

		for (IMembers classMembers : javaClsOrInt.getMembersList()) {
			
			if (classMembers.getMemberClass().equals(MethodDeclaration.class))
			{
				methods.add(toUMLMethod((MethodDeclaration) classMembers));
			}
			else if  (classMembers.getMemberClass().equals(FieldDeclaration.class))
			{
				
				for (UMLField field : toUMLField((FieldDeclaration) classMembers)) {
					fields.add(field);
				}
			}
		}
		
		for (UMLMethod method : methods) {
			clsOrInt.addMethod(method);
		}
		
		for (UMLField field : fields) {
			clsOrInt.setFields(field);
		}

		return clsOrInt;
		
	}

	/**
	 * Convert a java method object.
	 *
	 * @param javaMethod the java method
	 * @return an UML method
	 */
	public static UMLMethod toUMLMethod (MethodDeclaration javaMethod)
	{
		UMLMethod method = new UMLMethod();
		List<String> modifiers = new ArrayList<String>();
		List<UMLField> parameters = new ArrayList<UMLField>();
		
		method.setIdentifier(javaMethod.getName());
		
		for (String modifiers_ : ModifierSet.modifierToString(javaMethod.getModifiers()).trim().split(" ")) {
			modifiers.add(modifiers_);
		} 
		
		method.setModifiers(modifiers);
		
		for (Parameter parameter : javaMethod.getParameters()) {
			parameters.add(toUMLParameter(parameter));
		}
		
		method.setParameters(parameters);
		
		method.setReturnType(javaMethod.getType());
		
		return method;
	}
	

	/**
	 * Convert the java field object.
	 *
	 * @param javaField the java field
	 * @return a list of UML Field. Each Field represent a java Variable object 
	 */
	public static List<UMLField> toUMLField (FieldDeclaration javaField)
	{
		List<UMLField> fields = new ArrayList<UMLField>();
		List<String> modifiers = new ArrayList<String>();
		
		for (String modifiers_ : ModifierSet.modifierToString(javaField.getModifiers()).trim().split(" ")) {
			modifiers.add(modifiers_);
		} 

		for (Variable variable : javaField.getVariables()) {
			
			UMLField field = new UMLField();
			field.setIdentifier(variable.getName());
			field.setModifiers(modifiers);
			field.setType(javaField.getType());
			field.setValue(javaField.getValue());
			field.setIsArray(variable.isArray());
			field.setArrayCount(variable.getArrayCount());
			fields.add(field);
		}
		
		
		return fields;
	}
	

	/**
	 * Convert a java parameter.
	 *
	 * @param javaField the java field object
	 * @return a UMLField object
	 */
	public static UMLField toUMLParameter (Parameter javaField)
	{
		UMLField parameter = new UMLField();
		parameter.setIdentifier(javaField.getId());
		parameter.setType(javaField.getType());
		
		return parameter;
	}
	

	/**
	 * Convert an Java Package Object.
	 *
	 * @param javaCompilationUnit the java compilation unit
	 * @return an UML Package Object
	 */
	public static UMLPackage toUMLPackage (CompilationUnit javaCompilationUnit)
	{
		UMLPackage pack = new UMLPackage();
		List<String> imports = new ArrayList<String>();

		
		pack.setIdentifier(javaCompilationUnit.getPackage().getPackage());
		
		for (ImportDeclaration import_ : javaCompilationUnit.getImports()) {
			imports.add(import_.getImport());
		}
		
		for (IMembers clsOrInt : javaCompilationUnit.getTypes()) {
			
			if (clsOrInt.getMemberClass()==ClassOrInterfaceDeclaration.class)
			{
				UMLClass class_ = toUMLClass((ClassOrInterfaceDeclaration)clsOrInt);
				class_.setPackage(pack);
				class_.setInclude(imports);
				pack.addClass(class_);
			}
		}

		return pack;
	}
	
}
