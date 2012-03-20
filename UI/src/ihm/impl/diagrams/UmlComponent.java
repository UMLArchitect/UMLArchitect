package ihm.impl.diagrams;
import ihm.abstracts.AbstractBasePanel;
import ihm.impl.listeners.MouseActions;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Point;

/**
 * 
 * @author Kossi SODATONOU
 *
 */
public class UmlComponent extends AbstractBasePanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UmlComponent(Frame myFrame,int x,int y) {
		// TODO Auto-generated constructor stub
		this.setForeground(new Color(255,0,255));
		this.setBounds(x,y,100,100);
		MouseActions ma = new MouseActions();
        this.addMouseMotionListener(ma);
		ma.add(this);
        myFrame.add(this);
	}
	
	
	public Point getPosition()
	{	
		return null;		
	}
	
	public void setPosition(int x,int y)
	{
		this.setBounds(x, y, this.getWidth(), this.getHeight());
	}
	
	public void setSize(int width,int height)
	{
		this.setBounds(this.getPosition().x, this.getPosition().y, width, height);
	}
	
	public void changeColor(String myColor)
	{
		this.setBackground(Color.getColor(myColor));		
	}
}
