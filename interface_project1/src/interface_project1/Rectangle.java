package interface_project1;

public class Rectangle implements Shape {
	
	private double l;
	private double w;
	
	
	
	public Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}



	@Override
	public double getArea() {
		return l*w;
	}

	

}
