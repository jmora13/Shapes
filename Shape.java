
public interface Shape {
	double calculateArea();
	void setName(String shapeName);
	String getName();


public static void main(String[] args) {
	Circle c = new Circle(5);
	Octagon o = new Octagon(0,0,0); 
	c.setName("CIRCLE");
	o.setNumVertices(8);
	o.setNumEdges(8);
	o.setWidth(10);
	System.out.println(c.calculateArea());
	System.out.println(c.getName());
	System.out.println(o.getNumVertices());
	System.out.println(o.getNumEdges());
	System.out.println(o.getWidth());
	}
}