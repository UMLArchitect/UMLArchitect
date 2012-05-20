package ihm.impl.diagrams.utils;

import ihm.abstracts.AbstractBasePanel;
import ihm.impl.diagrams.utils.adapters.PointNoir_Adapter;

import java.awt.Color;


public class PointNoir extends AbstractBasePanel{

    
	  /**
	 * 
	 */
	private static final long serialVersionUID = -2186260495567063322L;

	public PointNoir(){
		  super();
		  this.setBackground(Color.BLACK);
		  this.setAdapter(new PointNoir_Adapter());
	  }
	  
	    public void setBounds(int x, int y, int width, int height)
	    {
	        super.setBounds(x, y, width, height);
	    }


}