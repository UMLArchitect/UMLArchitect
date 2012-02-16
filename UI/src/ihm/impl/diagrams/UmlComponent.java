package ihm.impl.diagrams;
import java.awt.*;

import javax.swing.JPanel;

import ihm.impl.listeners.PanelMouseActions;

public class UmlComponent extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UmlComponent(Frame myFrame,int x,int y) {
		// TODO Auto-generated constructor stub
		this.setBackground(new Color(255,0,255));
		this.setBounds(x,y,100,100);
        this.addMouseMotionListener(new PanelMouseActions(myFrame));  
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
