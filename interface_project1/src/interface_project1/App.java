package interface_project1;

public class App {
	
	public static void main(String args[]) {
		
		
		Shape s1=new Circle(4);
		System.out.println("Area of the circle is "+ s1.getArea());
		
		Shape s2=new Triangle(6,7);
		System.out.println("Area of the Triangle is "+ s2.getArea());

		Shape s3=new Rectangle(4,3);
		System.out.println("Area of the Rectangle is "+ s3.getArea());	
		
		
	}

}


