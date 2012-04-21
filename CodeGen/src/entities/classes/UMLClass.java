package uml.entities.classes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import uml.entities.interfaces.IUMLObject;


public class UMLClass implements IUMLObject {

	private String identifier;
	private List<String> modifiers;
	private List<String> implementations;
	private List<String> includes;
	private boolean isInterface;
	private String heritage;
	private List<UMLMethod> methods;
	private List<UMLField> fields;
	private List<UMLEnum> enums_;
	private UMLPackage parentPackage;
	
	public UMLClass(){
		super();
		identifier = "";
		modifiers = new ArrayList<String>();
		setIncludes(new ArrayList<String>());
		implementations = new ArrayList<String>();
		heritage = "";
		methods = new ArrayList<UMLMethod>();
		fields = new ArrayList<UMLField>();
		enums_= new ArrayList<UMLEnum>();
		isInterface = false;
	}
	
	public UMLClass(String identifier,List<String>includes, List<String> modifiers,
			List<String> implementations, String heritage,
			List<UMLMethod> methods, List<UMLField> fields,boolean isInterface) {
		super();
		this.identifier = identifier;
		this.modifiers = modifiers;
		this.setIncludes(includes);
		this.implementations = implementations;
		this.heritage = heritage;
		this.methods = methods;
		this.fields = fields;
		this.isInterface=isInterface;
	}
	
	public void setEnums(UMLEnum enum_) {
		this.enums_.add(enum_);
	}
	public List<UMLEnum> getEnums() {
		return enums_;
	} 

	public void setImplementations(String implementations) {
		this.implementations.add(implementations);
	}
	public List<String> getImplementations() {
		return implementations;
	}    
	public void setHeritage(String heritage) {
		this.heritage = heritage;
	}
	public String getHeritage() {
		return heritage;
	}
	public void setMethods(List<UMLMethod> methods) {
		this.methods = methods;
	}
	public List<UMLMethod> getMethods() {
		return methods;
	}
	public void setFields(UMLField fields) {
		this.fields.add(fields);
	}
	public List<UMLField> getFields() {
		return fields;
	}
	@Override
	public String getIdentifier() {
		return identifier;
	}
	@Override
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public List<String> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}

	public void setPackage(UMLPackage parentPackage) {
		this.parentPackage = parentPackage;
	}

	public UMLPackage getPackage() {
		return parentPackage;
	}

	public String getPath() {
		String v = "";
		if(null != parentPackage){
			v = parentPackage.generatePath()+";"; 
		} else return "";
		return v;
	}

	public void addImplementation(String implementation) {
		implementations.add(implementation);
	}

	public void removeImplementation(String implementation) {
		implementations.remove(implementation);
	}

	public void addMethod(UMLMethod method) {
		methods.add(method);
	}

	public void removeMethod(UMLMethod method) {
		methods.remove(method);
	}

	public void addModifiers(String modifier) {
		modifiers.add(modifier);
	}

	public void removeModifers(String modifier) {
		modifiers.remove(modifier);
	}

	@Override
	public String toString() {

		StringBuffer b = new StringBuffer();
		
		b.append("[@" +parentPackage.getIdentifier()+"]");
		b.append("\n");
		if (includes.size()>0)
		{
		for (String include : includes) {
			b.append("#" +include.toString());
			b.append("\n");
		}
		}
		
		b.append("[ ");
		for (String modifiers : this.modifiers) {
			b.append (" "+modifiers+" ");
		}
		
		b.append(" ]");
		
		if (isInterface)
		{
			b.append("[ interface ]");
		}
		
		else
			
		{
			b.append("[ class ]");
		}
		
		b.append(identifier);
		
		if (implementations.size()>0)
		{
		b.append(":[ ");
		for (String implements_ : this.implementations) {
			b.append (" "+implements_+" ");
		}
		b.append(" ]");
		}
		
		if(!heritage.equals(""))
			b.append("->[ " +heritage+" ]");

		b.append("\n");
		
		for (UMLEnum _enum : enums_) {
			b.append(_enum.toString());
			b.append("\n");
		}
				
		for (UMLField field : fields) {
			b.append(field.toString());
			b.append("\n");
		}
		
		for (UMLMethod method : methods) {
			b.append(method.toString());
			b.append("\n");
		}
	
		return b.toString();
		
//		String modifiers = "null";
//		String implementations = "null";
//		String methods = "null";
//		String fields = "null";
//		String parentPackage = "null";
//		if(this.modifiers != null) modifiers = this.modifiers.toString();
//		if(this.implementations != null) implementations = this.implementations.toString();
//		if(this.methods != null) methods = this.methods.toString();
//		if(this.fields != null) fields = this.fields.toString();
//		if(this.parentPackage != null) parentPackage = this.parentPackage.toString();
//		return "UMLClass [identifier=" + identifier + ", modifiers="
//				+ modifiers + ", implementations=" + implementations
//				+ ", heritage=" + heritage + ", methods=" + methods
//				+ ", fields=" + fields + ", parentPackage=" + parentPackage
//				+ "]";
	}

	public void setIncludes(List<String> includes) {
		this.includes = includes;
	}

	public List<String> getIncludes() {
		return includes;
	}
	
	public void setInclude(List<String> include) {
		includes=include;
	}

	public boolean isInterface() {
		return isInterface;
	}

	public void setIsInterface(boolean isInterface) {
		this.isInterface = isInterface;
	}

	@Override
	public Type getType() {
		return this.getClass();
	}
	
}
