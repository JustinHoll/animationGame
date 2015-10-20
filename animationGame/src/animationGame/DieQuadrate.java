package animationGame;

public class DieQuadrate extends GeometricObject{
	public DieQuadrate(double w, double h, Vertex pos){
		super(w,h,pos);
	}
	public DieQuadrate(double w, double h, double x, double y){
		super(w,h,new Vertex(x,y));
	}
	@Override 
	public String toString() {
		return "DieQuadrate ("+super. toString () +") ";
	}
	@Override
	public boolean equals(Object that) {
		 return (that instanceof DieQuadrate) && super.equals(that);
	}
}
