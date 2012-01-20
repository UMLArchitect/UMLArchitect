package esgi.al.plugin.platform.model.type;

import esgi.al.plugin.platform.interfaces.IFinalizable;
import esgi.al.plugin.platform.interfaces.IProperty;


public class Property extends Variable implements IProperty, IFinalizable {

	public Property(String key, String name) {
		super(key, name);
	}

	public Property(String name) {
		super(name);
	}

	private Visibility _visibility;
	
	private boolean _isFinal;
	
	public boolean isFinal() {
		
		return _isFinal;
	};
	
	public Visibility getVisibility() {
		return _visibility;
	}
	
	public void setVisibility(Visibility visibility) {
		this._visibility = visibility;
	}
}
