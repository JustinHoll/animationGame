package animationGame;

public class DieGleichseitigenDreiecke extends GeometricObject{
	public DieGleichseitigenDreiecke(double w, double h, Vertex pos){
		super(w,h,pos);
	}
	
	public DieGleichseitigenDreiecke(double w,double h, double x,double y){
		super(w,h,(new Vertex(x,y)));
	}
	
	@Override 
	public String toString() {
		return "DieGleichseitigenDreiecke ("+super. toString () +") ";
	}
	
	@Override
	public boolean equals(Object that) {
		 return (that instanceof DieGleichseitigenDreiecke) && super.equals(that);
	}
	
	@Override
	public double area() {
		 return width*height/2;
	}
	
}
