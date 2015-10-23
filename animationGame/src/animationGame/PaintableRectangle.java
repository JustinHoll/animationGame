package animationGame;

public class PaintableRectangle extends SimpleRectangle implements Paintable{
	
	public PaintableRectangle(double width, double height, double x, double y) {
		super(width,height,x,y);
	}

	public void paintTo(java.awt.Graphics g){
		//g.setColor(color);
		g.fillOval((int)pos.x, (int)pos.y, (int)width, (int)height);
	}
}
