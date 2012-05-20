package ihm.impl.diagrams.utils.adapters;

import ihm.abstracts.AbstractBasePanel;
import ihm.impl.diagrams.arrows.Arrow;
import ihm.interfaces.IBaseAdapter;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


/**
 * this class is the adapter for
 * @author Furkan KILIC
 * @version 1.0
 * @created at 16/02/2012
 */
public class PointNoir_Adapter implements IBaseAdapter {
	

	@Override
	public void mouseClicked(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
	}

	@Override
	public void mouseReleased(ArrayList<AbstractBasePanel> all, AbstractBasePanel c, MouseEvent e) {
	}

	@Override
	public void mouseDragged(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		 c.setBounds(c.getX() - c.getWidth()/2+ e.getX(),c.getY()- c.getHeight()/2+ e.getY(), c.getWidth(), c.getHeight());
		  //System.out.println(c.getX()+"   "+c.getY()+"   et   "+arg0.getX()+"  "+arg0.getY());
	  for(Component b : all){
		  if(b instanceof Arrow)
			  ((Arrow) b).requestRedraw();
		  else
			  b.repaint();
	  }
	}

	@Override
	public void mouseMoved(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	

}
