package ihm.utils.animations;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/**
 * This class provides the return to origin animation
 * @author Henri DESOBRY
 *
 */
public class ReturnToOriginAnimation implements ActionListener {

	/**
	 * Component on which the animation is performed
	 */
	private Component _c;
	/**
	 * Number of intermediate positions
	 */
	private float _nb_inter;
	/**
	 * Number of events already raised
	 */
	private int _nb_event = 0;
	/**
	 * Timer which provide the trigger
	 */
	private Timer _t;
	/**
	 * X interval between two intermediate positions
	 */
	private float _inter_X;
	/**
	 * Y interval between two intermediate positions
	 */
	private float _inter_Y;

	
	/**
	 * Contructor of class ReturnToOriginAnaimation
	 * @param t : Timer
	 * @param c : the component
	 * @param rect : Original position
	 * @param nb : number of intermediate position
	 * @param p : Position of the mouse
	 */
	public ReturnToOriginAnimation(Timer t, Component c, Rectangle rect, int nb, Point p)
	{
		this._t = t;
		this._c=c;
		this._nb_inter = 1;
		_inter_X = (rect.x -c.getX()-p.x)/_nb_inter;
		_inter_Y = (rect.y -c.getY()-p.y)/_nb_inter;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		_nb_event++;
		if (_nb_event == _nb_inter)
		{
			_t.stop();
		}
		_c.setBounds((int)(_c.getX()+_inter_X), (int)(_c.getY() + _inter_Y),_c.getWidth(),_c.getHeight());
		_c.getParent().repaint();
	}
}
