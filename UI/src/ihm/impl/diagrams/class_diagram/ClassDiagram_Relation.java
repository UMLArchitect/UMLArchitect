package ihm.impl.diagrams.class_diagram;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class ClassDiagram_Relation extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel internalPanel;
    private CircleDraw c;
    
	  public ClassDiagram_Relation(){
		  super();
		  this.setLayout(null);
	      this.internalPanel = new JPanel();
	      this.internalPanel.setLayout(new BorderLayout());
	      c= new CircleDraw();
	      c.setBounds(0, 0, getWidth(), getHeight());
	      c.repaint();
	      internalPanel.add(c,BorderLayout.CENTER);
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
	        internalPanel.repaint();
	        this.repaint();
		}

		public class CircleDraw extends JPanel {
			  /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Shape circle = new Ellipse2D.Float(100.0f, 100.0f, 100.0f, 100.0f);
			  Shape square = new Rectangle2D.Double(100, 100,100, 100);
			  public void paint(Graphics g) {
			  Graphics2D ga = (Graphics2D)g;
			  ga.draw(circle);
			  ga.setPaint(Color.green);
			  ga.fill(circle);
			  ga.setPaint(Color.red);
			  ga.draw(square);
			  }
		}
}