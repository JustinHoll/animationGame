package animationGame;

public class SimpleStar extends GeometricObject{
	Vertex pos;
	
	
	int[] xPoints = {(int) (30+pos.x), (int) (80+pos.x), (int) (95+pos.x), (int) (110+pos.x), (int) (160+pos.x), (int) (115+pos.x), (int) (130+pos.x), (int) (95+pos.x), (int) (65+pos.x), (int) (78+pos.x)};
    int[] yPoints = {(int) (60+pos.y), (int) (58+pos.y), (int) (8+pos.y), (int) (58+pos.y), (int) (60+pos.y), (int) (80+pos.y), (int) (120+pos.y), (int) (90+pos.y), (int) (120+pos.y), (int) (78+pos.y)};
    int nPoints = xPoints.length;
	
	
	public SimpleStar(Vertex pos){
		super(pos);
	}
	public SimpleStar(double x, double y){
		super(new Vertex(x,y));
	}
	@Override 
	public String toString() {
		return "Stern ("+super. toString () +") ";
	}
	@Override
	public boolean equals(Object that) {
		 return (that instanceof SimpleStar) && super.equals(that);
	}
}
