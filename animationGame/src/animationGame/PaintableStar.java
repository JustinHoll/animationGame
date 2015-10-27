package animationGame;

public class PaintableStar extends SimpleStar implements Paintable{
	
	public PaintableStar(double x, double y) { 
		super(x,y);
	}

	public void paintTo(java.awt.Graphics g){
		//g.setColor(color);
		g.fillRect((int)pos.x, (int)pos.y, (int)width, (int)height);
	}
}
