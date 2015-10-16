package animationGame;

public class DieRechtecke extends GeometricObject{
	public DieRechtecke(double w, double h, Vertex pos){
		super(w,h,pos);
	}
	public DieRechtecke(double w,double h, double x,double y){
		super(w,h,(new Vertex(x,y)));
	}
	@Override 
	public String toString() {
		return "DieRechecke ("+super. toString () +") ";
	}
	@Override
	public boolean equals(Object that) {
		 return (that instanceof SimpleOval) && super.equals(that);
	}
}
