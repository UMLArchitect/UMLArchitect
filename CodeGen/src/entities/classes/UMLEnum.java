package uml.entities.classes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import uml.entities.interfaces.IUMLObject;

public class UMLEnum implements IUMLObject {

	private String identifier;
	private List<String> modifiers;
    private List<String> implements_;
    private List<String> entries;
    private List<IUMLObject> members;
    
    public UMLEnum()
    {
    	modifiers= new ArrayList<String>();
    	implements_= new ArrayList<String>();
    	entries= new ArrayList<String>();
    }
    
	@Override
	public String getIdentifier() {
		return identifier;
	}

	@Override
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void setEntries(String entries) {
		this.entries.add(entries);
	}

	public List<String> getEntries() {
		return entries;
	}

	public void setImplementsList(String implements_) {
		this.implements_.add(implements_);
	}

	public List<String> getImplements_() {
		return implements_;
	}

	public void setModifiers(String modifiers) {
		this.modifiers.add(modifiers);
	}

	public List<String> getModifiers() {
		return modifiers;
	}

	@Override
	public Type getType() {
		return this.getClass();
	}
	
	@Override
	public String toString()
	{
		StringBuffer b = new StringBuffer();
		
		if (modifiers.size()>0)
		{
		b.append("[ ");
		for (String modifier : modifiers) {
			b.append (" "+modifier+" ");
		}
		b.append(" ]");
		}
		
		b.append(" "+ identifier +":enum");
		
		for (String entry : entries) {
			b.append("->"+ entry);
		}
		
		if (!members.isEmpty())
		{
			b.append("\n");
			for (IUMLObject entry : members) {
				b.append(entry.toString()+"\n");
			}
		}
	
		return b.toString();
	}

	public void setMembers(List<IUMLObject> members) {
		this.members = members;
	}

	public void setMember(IUMLObject member) {
		this.members.add(member);
	}
	
	public List<IUMLObject> getMembers() {
		return members;
	}

}
