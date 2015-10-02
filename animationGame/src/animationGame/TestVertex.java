package animationGame;

public class TestVertex {
	public static void main(String[] args) {
		
		Vertex v1 = new Vertex(10, 13);
		
		Vertex v2 = new Vertex(1, 3);
		
		GeometricObject geo = new GeometricObject(30, 50, v1);
		
		System.out.println(geo.isWithin(v2));
		
	}
}
