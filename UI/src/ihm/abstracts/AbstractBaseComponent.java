package ihm.abstracts;

import ihm.interfaces.IBaseAdapter;

import java.awt.Component;

public abstract class AbstractBaseComponent extends Component {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IBaseAdapter adapter;
	
	public IBaseAdapter getAdapter() {
		return adapter;
	}
	public void setAdapter(IBaseAdapter a) {
		adapter = a;
	}
}
