
public class Circle implements Shape{
	String name;
	int radius;
	double PI = 3.14;
	public Circle(int cRadius){
		radius = cRadius;
	}
	public double calculateArea() {
		double area = PI*radius*radius;
		return area;
	}

	public void setName(String shapeName) {
		name = shapeName;
	}

	public String getName() {
		return name;
	}
	

}
