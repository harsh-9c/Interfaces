package interface_project3;

public class App {

	public static void main(String[] args) {
		
		Flyable airplane=new Airplane();
		airplane.fly_obj();
		
		Flyable spacecraft=new Spacecraft();
		spacecraft.fly_obj();
		
		Flyable helicopter=new Helicopter();
		helicopter.fly_obj();
		
	}

}
