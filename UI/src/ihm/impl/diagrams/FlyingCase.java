package ihm.impl.diagrams;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import ihm.utils.Dictionary;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ihm.utils.Array;

public class FlyingCase extends JPanel
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Color kNormalColor = Color.LIGHT_GRAY;
    public static final Color kSelectedColor = Color.RED;
    public static final String kFrameKey = "frame";
    public static final String kValueKey = "value";
    
    private Array<Arrow> arrowsSource;
    private Array<Arrow> arrowsDest;

    private JTextField textField;
    private JPanel internalPanel;
    private Color savedColor;

    public FlyingCase(String title)
    {
        this.setLayout(null);
        this.internalPanel = new JPanel();
        this.internalPanel.setLayout(new BorderLayout());
        this.textField = new JTextField(title);
        //this.internalPanel.add(this.textField);
        this.add(this.internalPanel);
        this.arrowsSource = new Array<Arrow>();
        this.arrowsDest = new Array<Arrow>();
        this.setBackground( (this.savedColor = FlyingCase.kNormalColor) );
    }

    public Array<Arrow> getArrowsSource() { return this.arrowsSource; }
    public Array<Arrow> getArrowsDest() { return this.arrowsDest; }
    public String getText() { return this.textField.getText(); }

    @Override
    public void setBounds(Rectangle r)
    {
        super.setBounds(r);
        this.internalBounds();
    }
    
    @Override
    public void setBounds(int x, int y, int width, int height)
    {
        super.setBounds(x, y, width, height);
        this.internalBounds();
    }

    public void setSavedBackgroundColor(Color c) { this.savedColor = c; }
    public Color getSavedBackgroundColor() { return this.savedColor; }
    public void restoreSavedBackgroundColor() { this.setBackground(this.savedColor); }

    private void internalBounds()
    {
        Rectangle r = this.getBounds();
        this.internalPanel.setBounds(15, 15, r.width-30, r.height-30);
        this.repaint();
    }

    public Dictionary getDictionary()
    {
        Dictionary d = new Dictionary();
        Rectangle r = this.getBounds();
        Array<String> frame = new Array<String>();
        frame.addObject(Integer.toString(r.x));
        frame.addObject(Integer.toString(r.y));
        frame.addObject(Integer.toString(r.width));
        frame.addObject(Integer.toString(r.height));
        d.setObjectForKey(frame, FlyingCase.kFrameKey);
        d.setObjectForKey(this.textField.getText(), FlyingCase.kValueKey);
        return d;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof FlyingCase)
        {
            FlyingCase fc = (FlyingCase)o;
            Rectangle r = this.getBounds();
            Rectangle r2 = fc.getBounds();
            if(r.equals(r2))
                if(this.textField.equals(fc.textField))
                    return true;
        }
        return false;
    }
}
