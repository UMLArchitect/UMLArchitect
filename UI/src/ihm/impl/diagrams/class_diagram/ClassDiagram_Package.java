package ihm.impl.diagrams.class_diagram;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * 
 * @author Kilic FURKAN
 *
 */
public class ClassDiagram_Package extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel internalPanel;
	JPanel c ;
	JPanel h;
	JPanel hg;
    private JTextField textField;
    
	  public ClassDiagram_Package(){
		  super();
		  this.setLayout(null);
	      this.internalPanel = new JPanel();
	      this.internalPanel.setLayout(new BorderLayout());
	      
		  h = new JPanel();
		  hg = new JPanel();
		  JPanel hd = new JPanel();
		  c = new JPanel();

        this.textField = new JTextField("Package");
		  
		  h.setLayout(new BorderLayout());
		  hg.setBackground(Color.cyan);

		  hg.setBorder(BorderFactory.createLineBorder(Color.black));
		  hd.setBackground(Color.white);
		  c.setBackground(Color.cyan);
		  c.setLayout(new BorderLayout());
		  h.add(hg,BorderLayout.WEST);
		  h.add(hd,BorderLayout.CENTER);
		  h.setBackground(Color.white);
		  this.internalPanel.add(h,BorderLayout.NORTH);
		  c.add(this.textField,BorderLayout.NORTH);
		  c.setBorder(BorderFactory.createLineBorder(Color.black));
		  this.internalPanel.add(c,BorderLayout.CENTER);
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
			h.setBounds(0, 0,(int) r.getWidth(), 10);
			hg.setBounds(0,0,(int)r.getWidth()/2,10);
	        c.setBounds(0,10,(int) r.getWidth(), (int) r.getHeight()-10);
	        internalPanel.repaint();
	        this.repaint();
		}
}