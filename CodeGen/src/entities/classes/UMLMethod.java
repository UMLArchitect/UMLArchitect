/**
 * 
 */
package uml.entities.classes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import uml.entities.interfaces.IUMLObject;

public class UMLMethod implements IUMLObject {
	
	private String identifier;
	private List<String> modifiers;
	private String type;
	//private boolean isStatic;
	private List<UMLField> parameters;
	private String content;
	
	public UMLMethod() {
		identifier = "";
		modifiers = new ArrayList<String>();
		type = "";
		//isStatic = false;
		parameters = new ArrayList<UMLField>();
		content = "";
	}
	public UMLMethod(String identifier, List<String> modifiers, String type,
			 List<UMLField> params, String content) {//boolean isStatic,
		super();
		this.identifier = identifier;
		this.modifiers = modifiers;
		this.type = type;
		//this.isStatic = isStatic;
		this.parameters = params;
		this.content = content;
	}
	
	public String getReturnType ()
	{
		return type;
	}
	
	public void setReturnType (String type)
	{
		this.type = type;
	}

	public List<UMLField> getParameters() {
		return parameters;
	}

	public void setParameters(List<UMLField>  parameters) {
		this.parameters = parameters;
	}

	public List<String> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}

	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		
		StringBuffer b = new StringBuffer();
		
		if (modifiers.size()>0)
		{
		b.append("[ ");
		for (String modifier : modifiers) {
			b.append (" "+modifier+" ");
		}
		b.append(" ]");
		}
		
		b.append(" "+ identifier +"() ");
		
		b.append(" :"+ type);
		
		if (parameters.size()>0)
		{
		b.append(" [ ");
		for (UMLField parameter: parameters) {
			b.append(parameter.toString());
		}
		b.append(" ]");
		}
		
		return b.toString();
		
//		String modifiers = "null";
//		String parameters = "null";
//		if(this.modifiers != null) modifiers = this.modifiers.toString();
//		if(this.parameters != null) parameters = this.parameters.toString();
//		return "UMLMethod [_identifier=" + identifier + ", _modifiers="
//				+ modifiers + ", _type=" + type //+ ", _isStatic=" + isStatic
//				+ ", _parameters=" + parameters + ", _content=" + content
//				+ "]";
	}
	@Override
	public Type getType() {
		return this.getClass();
	}
	
}
