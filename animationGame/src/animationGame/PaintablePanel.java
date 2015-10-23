package animationGame;

public class PaintablePanel extends SizedPanel{
	
	Paintable pa;
	
	public static void main(String args[]){
		ShowInFrame.show(new PaintablePanel(new PaintableOval(100, 50, 30, 50)));
		ShowInFrame.show(new PaintablePanel(new PaintableRectangle(100, 50, 30, 50)));
	}
	
	public PaintablePanel(Paintable pa){
		this.pa = pa;
	}
	
	public void PaintComponent(java.awt.Graphics g){
		pa.paintTo(g);
	}
}
	

