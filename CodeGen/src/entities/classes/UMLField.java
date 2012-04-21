package uml.entities.classes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import uml.entities.interfaces.IUMLObject;

public class UMLField implements IUMLObject {

	
	public List<String> arrayValues = new ArrayList<String>();
	
	private String identifier;
	private List<String> modifiers;
	private String type;
	private String value ;
	private boolean isArray;
	private int arrayCount;
	
	public UMLField() {
		super();
		identifier = "";
		modifiers = new ArrayList<String>();
		value = "";
		type="";
	}
	public UMLField(String identifier, List<String> modifiers, String value) {
		super();
		this.identifier = identifier;
		this.modifiers = modifiers;
		this.value = value;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public List<String> getModifiers() {
		return modifiers;
	}
	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		if (null!=value)
			this.value = value;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType2()
	{
		return type;
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
		
		b.append(" "+ identifier +" ");
		
		if (isArray)
		{
			if (arrayCount>0)
			{
				b.append(":"+ type+"["+ arrayCount+"]");
			}
			else if (arrayValues.size()>0)
			{
				b.append(":"+ type+"[]{ ");
				for (String item : arrayValues) {
					b.append(item+" ");
				}
				b.append("}");
			}
			else
			{
				b.append(":"+ type+"[]");
			}
				
			
			
		}
		else b.append(":"+ type);
		
		if (value!="")
			b.append("->"+ value);
		
		return b.toString();
		
//		return "UMLField [identifier=" + identifier + ", modifiers="
//				+ modifiers + ", type=" + type + ", value=" + value + "]";
	}

	public boolean isArray() {
		return isArray;
	}

	public void setIsArray(boolean isArray) {
		this.isArray = isArray;
		
	}
	public void setArrayCount(int arrayCount) {
		this.arrayCount = arrayCount;
	}
	public int getArrayCount() {
		return arrayCount;
	}
	@Override
	public Type getType() {
		return UMLField.class;
	}
}
