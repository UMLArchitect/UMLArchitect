package uml.entities.classes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import uml.entities.interfaces.IUMLObject;



public class UMLPackage implements IUMLObject {

	private String identifier;
	private List<IUMLObject> members;
	//private List<UMLPackage> packages;
	private UMLPackage parentPackage;
	
	public UMLPackage()
	{
		members = new ArrayList<IUMLObject>();
	}
	
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public List<IUMLObject> getClasses() {
		return members;
	}
	public void setClasses(List<IUMLObject> members) {
		this.members = members;
	}
//	public List<UMLPackage> getPackages() {
//		return packages;
//	}
//	public void setPackages(List<UMLPackage> packages) {
//		this.packages = packages;
//	}
//	public void setPackage(UMLPackage parentPackage) {
//		this.parentPackage = parentPackage;
//	}
//	public UMLPackage getPackage() {
//		return parentPackage;
//	}
	public String generatePath() {
		if(null != parentPackage){
			return parentPackage.generatePath()+"."+identifier;
		} else {
			return identifier;
		}
	}
	public void addClass(IUMLObject member) {
		members.add(member);
	}
	public void removeClass(IUMLObject member) {
		members.remove(member);
	}
	@Override
	public String toString() {
		
		
		StringBuffer b = new StringBuffer();
		
		if (members.size()>0)
		{
			for (IUMLObject class_ : members) {
				b.append(class_.toString());
				b.append('\n');
			}
		}
		
		return b.toString();
//		String classes = "null";
//		String packages = "null";
//		String parentPackage = "null";
//		if(this.classes != null && this.classes.size() != 0) classes = this.classes.toString();
//		if(this.packages != null && this.packages.size() != 0) packages = this.packages.toString();
//		if(this.parentPackage != null) parentPackage = this.parentPackage.toString();
//		return "UMLPackage [identifier=" + identifier + ", classes="
//				+ classes + ", _packages=" + packages + ", parentPackage="
//				+ parentPackage + "]";
	}

	@Override
	public Type getType() {
		return this.getClass();
	}
}
