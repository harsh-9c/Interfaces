package interface_project1;

public class Triangle implements Shape{
	
	private double height;
	private double base;
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public double getArea() {
		return base*height;
	}
	

}
