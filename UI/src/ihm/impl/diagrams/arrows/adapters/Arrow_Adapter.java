package ihm.impl.diagrams.arrows.adapters;

import ihm.abstracts.AbstractBasePanel;
import ihm.impl.diagrams.arrows.Arrow;
import ihm.impl.diagrams.utils.PointNoir;
import ihm.impl.listeners.MouseActions;
import ihm.interfaces.IBaseAdapter;

import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import javax.swing.JPanel;

/**
 * this class is the adapter for arrows
 * 
 * @author Furkan KILIC
 * @version 1.0
 * @created at 16/02/2012
 */
public class Arrow_Adapter implements IBaseAdapter {

	private static MouseActions ma = MouseActions.getInstance();	

	@SuppressWarnings("deprecation")
	@Override
	public void mouseClicked(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		System.out.println("test");
		try {
		for (AbstractBasePanel b : all) {
			if (b instanceof Arrow) {
				if (b.getBounds().inside(c.getX() + e.getX(),c.getY() + e.getY())) {
					Line2D l = new Line2D.Float(b.getX()
							+ ((Arrow) b).getPoints()[0], b.getY()
							+ ((Arrow) b).getPoints()[1], b.getX()
							+ ((Arrow) b).getPoints()[2], b.getY()
							+ ((Arrow) b).getPoints()[3]);
					if (l.intersects(c.getX() + e.getX(), c.getY() + e.getY(),
							5, 5)) {
						PointNoir point = new PointNoir();
						point.setBounds(c.getX() + e.getX(),
								c.getY() + e.getY(), 5, 5);
						Arrow arro1 = new Arrow(
								(JPanel) ((Arrow) b).getSource(),
								(JPanel) point,((Arrow) b).style%2);
						// b.getMouseListeners()[0].
						arro1.requestRedraw();
						Arrow arro2 = new Arrow((JPanel) point,
								(JPanel) ((Arrow) b).getDest(),((Arrow) b).style);
						arro2.requestRedraw();
						point.addMouseMotionListener(ma);
						point.addMouseListener(ma);
						ma.add(point);	
						arro1.addMouseMotionListener(ma);
						arro1.addMouseListener(ma);
						ma.add(arro1);	
						arro2.addMouseMotionListener(ma);
						arro2.addMouseListener(ma);
						ma.add(arro2);
						b.getParent().add(point, 0);
						b.getParent().add(arro1);
						b.getParent().add(arro2);
						b.getParent().repaint();
						b.getParent().remove(b);
					}
				}
			}
		}
		}catch (ConcurrentModificationException exc){
			
		}
	}

	@Override
	public void mouseEntered(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
	}

	@Override
	public void mouseReleased(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
	}

	@Override
	public void mouseDragged(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
	}

	@Override
	public void mouseMoved(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
