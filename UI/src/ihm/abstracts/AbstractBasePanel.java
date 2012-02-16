package ihm.abstracts;

import ihm.interfaces.IBaseAdapter;

import javax.swing.JPanel;

public abstract class AbstractBasePanel extends JPanel {

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
