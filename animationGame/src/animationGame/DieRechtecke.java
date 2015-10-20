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
		return "DieRechtecke ("+super. toString () +") ";
	}
	@Override
	public boolean equals(Object that) {
		 return (that instanceof DieRechtecke) && super.equals(that);
	}
}
