package interface_project1;

public class Circle implements Shape {
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14f*radius*radius;
	}
	

}
