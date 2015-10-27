package animationGame;

public class SimpleStar extends GeometricObject{
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
