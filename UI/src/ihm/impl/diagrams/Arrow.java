package ihm.impl.diagrams;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 * 
 * @author Kilic FURKAN
 *
 */
public class Arrow extends JPanel
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel _src;
    private JPanel _dest;

    private int _xsrc, _ysrc, _xdest, _ydest;
    private boolean _inix=false;
    private boolean _iniy=false;

    public Arrow(JPanel src, JPanel dest)
    {
        this._src = src;
        this._dest = dest;
        this.setOpaque(false);
//        ((FlyingCase) this.src).getArrowsSource().addObject(this);
//        ((FlyingCase) this.dest).getArrowsDest().addObject(this);
    }

    public JPanel getSource() { return this._src; }
    public JPanel getDest() { return this._dest; }
    
    
    public void requestRedraw()
    {
        Rectangle r1 = this._src.getBounds();
        Rectangle r2 = this._dest.getBounds();
        int x=0 , y=0, width=0, height=0;
        if((r1.x<(r2.x+r2.width))&&((r1.x+r1.width)>r2.x)){
        	_inix=true;
        	 if(r1.x < r2.x)
               {
                   x = r1.x;
                   width = r2.x+r2.width/2-r1.x+r1.width/2;
                   _xsrc = r1.width/2;
                   _xdest = width - r1.width/2;
               }
               else
               {
                   x = r2.x;
                   width = r1.x+r1.width/2-r2.x+r2.width/2;
                   _xsrc = width - r2.width/2;
                   _xdest = r2.width/2;
               }
        }
        else{
        	_inix=false;
	        if(r1.x < r2.x)
	        {
	            x = r1.x;
	            width = r2.x-r1.x+r1.width;
	            _xsrc = r1.width;
	            _xdest = width - r1.width;
	        }
	        else
	        {
	            x = r2.x;
	            width = r1.x-r2.x+r1.width;
	            _xsrc = width - r1.width;
	            _xdest = r2.width;
	        }
        }
        if((r1.y<(r2.y+r2.height))&&((r1.y+r1.height)>r2.y)){
        	_iniy=true;
	        if(r1.y < r2.y)
	        {
	            y = r1.y;
	            height = r2.y+r2.height/2-r1.y+r1.height/2;
	            _ysrc = r1.height/2;
	            _ydest = height - r1.height/2;
	        }
	        else
	        {
	            y = r2.y;
	            height = r1.y+r1.height/2-r2.y+r2.height/2;
	            _ysrc = height - r2.height/2;
	            _ydest = r2.height/2;
	        }
        }
        else
        {    
        	_iniy=false;
        	if(r1.y < r2.y)
	        {
	            y = r1.y;
	            height = r2.y-r1.y+r1.height;
	            _ysrc = r1.height;
	            _ydest = height - r1.height;
	        }
	        else
	        {
	            y = r2.y;
	            height = r1.y-r2.y+r1.height;
	            _ysrc = height - r1.height;
	            _ydest = r2.height;
	        }
        }
        this.setBounds(x, y, width, height);
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        this.drawArrow(g2, _xsrc, _ysrc, _xdest, _ydest);

    }
    
    private void drawArrow( Graphics2D g, int x, int y, int xx, int yy )
    {
        float arrowWidth = 10.0f;
        float theta = 0.423f;
        int[] xPoints = new int[3];
        int[] yPoints = new int[3];
        float[] vecLine = new float[2];
        float[] vecLeft = new float[2];
        float fLength;
        float th;
        float ta;
        float baseX, baseY;

        xPoints[0] = xx;
        yPoints[0] = yy;
        vecLine[0] = (float)xPoints[0]-x;
        vecLine[1] = (float)yPoints[0]-y;

        vecLeft[0] = -vecLine[1];
        vecLeft[1] = vecLine[0];

        fLength = (float)Math.sqrt(vecLine[0]*vecLine[0]+vecLine[1]*vecLine[1]);
        th = arrowWidth / (2.0f*fLength);
        ta = arrowWidth / (2.0f*((float)Math.tan(theta)/2.0f)*fLength);
        baseX = ((float)xPoints[0]-ta*vecLine[0]);
        baseY = ((float)yPoints[0]-ta*vecLine[1]);

        xPoints[1] = (int)(baseX+th*vecLeft[0]);
        yPoints[1] = (int)(baseY+th*vecLeft[1]);
        xPoints[2] = (int)(baseX-th*vecLeft[0]);
        yPoints[2] = (int)(baseY-th*vecLeft[1]);
        
        if(!_inix&&!_iniy){
            g.drawLine(x,y,(int)baseX,y);
            g.drawLine((int)baseX,y,(int)baseX,(int)baseY);
        }
        else
        	g.drawLine(x,y,(int)baseX,(int)baseY);
        g.fillPolygon(xPoints,yPoints,3);
    }
}
