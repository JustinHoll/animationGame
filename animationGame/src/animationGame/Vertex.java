package animationGame;

public class Vertex {
	
	public double x;
	public double y;
	
	public Vertex(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		
		return "("+x+", "+y+")";
		
	}
	public double length(){
		
		return Math.sqrt(x*x+y*y);
	}
	public Vertex skalarMult(double s){ //erzeugt neues Objekt an den Koord * s
		return new Vertex(x*s, y*s);
	}
	public void skalarMultMod(double s){//verschiebt Objekt um * s
		x = x*s;
		y = y*s;
	}
	public Vertex add(double s){//erzeugt neues Objekt an den Koord + s
		return new Vertex(x+s, y+s);
	}
	public Vertex add(Vertex v){
		return new Vertex(x+v.x,y+v.y);
	}
	public void addMod(double x, double y){
		x = this.x+x;
		y = this.y+y;
	}
	public void addMod(double s){//verschiebt Objekt um + s
		x = x+s;
		y = y+s;
	}
	public Vertex sub(double s){
		return new Vertex(x-s, y-s);
	}
	public void subMod(double s){
		x = x-s;
		y= y-s;
		
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public boolean equals(Object thatObject){
		if(thatObject instanceof Vertex){
			Vertex that = (Vertex) thatObject;
			
			return that.y == this.y && that.x == this.x;
		}
		return false;
	}
	public double distance(Vertex v2){
		double xx=v2.x-this.x;
		double yy=v2.y-this.y;
		return Math.sqrt(xx*xx*yy*yy);
	}
	public void normalize(){
		double factor = this.length();
		x = x / factor;
		y = y / factor;
	}
}
