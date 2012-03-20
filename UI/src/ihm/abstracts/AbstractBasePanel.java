package ihm.abstracts;

import ihm.interfaces.IBaseAdapter;

import javax.swing.JPanel;

/**
 * This abstract class will be the base class every composant of each diagram.
 * @author Henri DESOBRY
 *
 */
public abstract class AbstractBasePanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Adapter attached to the panel to handle the event raised on the panel
	 */
	private IBaseAdapter _adapter;
	
	/**
	 * Return the adapter attached to the Panel
	 * @return The adapter
	 */
	public IBaseAdapter getAdapter() {
		return _adapter;
	}
	
	/**
	 * Set the adapter which will be attached to the Panel
	 * @param a the adapter to set
	 */
	public void setAdapter(IBaseAdapter a) {
		_adapter = a;
	}
}
