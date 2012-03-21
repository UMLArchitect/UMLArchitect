package ihm;


import ihm.impl.diagrams.class_diagram.ClassDiagram_Class;
import ihm.impl.listeners.MouseActions;

import javax.swing.JFrame;

/**
 * This class provides a general container to do some visual tests
 * @author Henri DESOBRY hdesobry@gmail.com
 * @version 1.0
 * @created at 16/02/2012
 */
public class UITest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args){
		
		JFrame ui = new UITest();
		ui.setLayout(null);
		ClassDiagram_Class panel = new ClassDiagram_Class();
		ClassDiagram_Class panel2 = new ClassDiagram_Class();
		panel.setBounds(100, 100, 100, 100);
		panel2.setBounds(500, 500, 100, 100);

		ui.add(panel);
		ui.add(panel2);
		ui.setSize(800, 800);
		ui.setVisible(true);
		ui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MouseActions ma = new MouseActions();		
		panel.addMouseMotionListener(ma);
		panel.addMouseListener(ma);
		panel2.addMouseMotionListener(ma);
		panel2.addMouseListener(ma);
		ma.add(panel);
		ma.add(panel2);
		
		
		
	}
	

}
