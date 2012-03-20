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
	private JPanel _internalPanel;
	private JPanel _c ;
	private JPanel _h;
	private JPanel _hg;
    private JTextField _textField;
    
	  public ClassDiagram_Package(){
		  super();
		  this.setLayout(null);
	      this._internalPanel = new JPanel();
	      this._internalPanel.setLayout(new BorderLayout());
	      
		  _h = new JPanel();
		  _hg = new JPanel();
		  JPanel hd = new JPanel();
		  _c = new JPanel();

        this._textField = new JTextField("Package");
		  
		  _h.setLayout(new BorderLayout());
		  _hg.setBackground(Color.cyan);

		  _hg.setBorder(BorderFactory.createLineBorder(Color.black));
		  hd.setBackground(Color.white);
		  _c.setBackground(Color.cyan);
		  _c.setLayout(new BorderLayout());
		  _h.add(_hg,BorderLayout.WEST);
		  _h.add(hd,BorderLayout.CENTER);
		  _h.setBackground(Color.white);
		  this._internalPanel.add(_h,BorderLayout.NORTH);
		  _c.add(this._textField,BorderLayout.NORTH);
		  _c.setBorder(BorderFactory.createLineBorder(Color.black));
		  this._internalPanel.add(_c,BorderLayout.CENTER);
		  _internalPanel.setBackground(Color.white);
		  this.add(this._internalPanel);
		  
	  }
	  
	    public void setBounds(int x, int y, int width, int height)
	    {
	        super.setBounds(x, y, width, height);
	        this.internalBounds();
	    }

		private void internalBounds() {
			 Rectangle r = this.getBounds();
	        this._internalPanel.setBounds(0, 0, (int) r.getWidth(), (int) r.getHeight());
			_h.setBounds(0, 0,(int) r.getWidth(), 10);
			_hg.setBounds(0,0,(int)r.getWidth()/2,10);
	        _c.setBounds(0,10,(int) r.getWidth(), (int) r.getHeight()-10);
	        _internalPanel.repaint();
	        this.repaint();
		}
}