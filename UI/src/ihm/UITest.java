package ihm;


import ihm.impl.diagrams.arrows.Arrow;
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
		ClassDiagram_Class panel3 = new ClassDiagram_Class();
		ClassDiagram_Class panel4 = new ClassDiagram_Class();
		panel.setBounds(100, 100, 100, 100);
		panel2.setBounds(500, 500, 100, 100);
		panel3.setBounds(100, 500, 100, 100);
		panel4.setBounds(500, 100, 100, 100);
		
		Arrow arr= new Arrow(panel,panel2);
		Arrow arr2= new Arrow(panel,panel3,3);
		Arrow arr3= new Arrow(panel2,panel3,7);
		Arrow arr4= new Arrow(panel2,panel4,8);
		
		ui.add(panel);
		ui.add(panel2);
		ui.add(panel3);
		ui.add(panel4);
		
		ui.add(arr);
		ui.add(arr2);
		ui.add(arr3);
		ui.add(arr4);
		
		ui.setSize(800, 800);
		ui.setVisible(true);
		ui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	

}
