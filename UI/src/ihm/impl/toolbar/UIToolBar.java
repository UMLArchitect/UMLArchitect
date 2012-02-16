package ihm.impl.toolbar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class UIToolBar extends JToolBar{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GridBagConstraints c = new GridBagConstraints();	
	public UIToolBar(String title, int location, String diagramType) // default constructor
	{
		//System.out.println("Taille de la fenetre pricipale: " + this.getParent().getName());
		this.setSize(new Dimension(100, 500)); // Toolbar Size
		this.setBackground(new Color(115,151,198));
		this.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		fillToolBar(diagramType);
	}
	
	private void fillToolBar(String diagramType)
	{
		if(diagramType == "ClassDiagram")
		{
			ArrayList<JButton> myButtonList = new ArrayList<JButton>();
			myButtonList.add(new JButton("Bouton Class"));
			myButtonList.add(new JButton("Boouton class 2"));
			myButtonList.add(new JButton("3eme Bouton"));

			for(int i=0;i< myButtonList.size();i++)
			{
				c.gridx = 0;
				c.gridy = i;
				this.add((JButton)myButtonList.get(i),c);
			}
		}
	}
	
}
