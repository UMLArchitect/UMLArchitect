package ihm.impl.diagrams.class_diagram;

import ihm.abstracts.AbstractBasePanel;
import ihm.impl.diagrams.class_diagram.adapters.ClassDiagram_ClassAdapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClassDiagram_Class extends AbstractBasePanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel internalPanel;
	JPanel c ;
	JPanel h;
    private JTextField textField;
    
	  public ClassDiagram_Class(){
		  
		  super();
		  this.setLayout(null);
	      this.internalPanel = new JPanel();
	      this.internalPanel.setLayout(new BorderLayout());
	      setAdapter(new ClassDiagram_ClassAdapter());
	      
		  h = new JPanel();
		  c = new JPanel();

        this.textField = new JTextField("Classe");
		  textField.setBounds(0, 0, getWidth(), getHeight());
		  h.setLayout(new BorderLayout());
		  c.setBackground(Color.white);
		  h.setBackground(Color.white);
		  c.setBorder(BorderFactory.createLineBorder(Color.black));
		  h.setBorder(BorderFactory.createLineBorder(Color.black));
		  h.add(textField);

		  h.setBounds(0, 0,(int) getWidth(), (int) getHeight()/5);
		  c.setBounds(0, (int) getHeight()/5,(int) getWidth(), (int) (4*getHeight()/5));
		  this.internalPanel.add(c,BorderLayout.CENTER);
		  this.internalPanel.add(h,BorderLayout.NORTH);
		  internalPanel.setBackground(Color.white);
		  this.add(this.internalPanel);
		  
	  }
	  
	    public void setBounds(int x, int y, int width, int height)
	    {
	        super.setBounds(x, y, width, height);
	        this.internalBounds();
	    }

		private void internalBounds() {
			 Rectangle r = this.getBounds();
	        this.internalPanel.setBounds(0, 0, (int) r.getWidth(), (int) r.getHeight());
			h.setBounds(0, 0,(int) r.getWidth(), (int) r.getHeight()/5);
	        c.setBounds(0, (int) r.getHeight()/5,(int) r.getWidth(), (int) (4*r.getHeight()/5));
	        internalPanel.repaint();
	        this.repaint();
		}
}