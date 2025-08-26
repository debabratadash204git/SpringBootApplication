package strategyDesignPattern;

public class Vehicle {
	
	DriveStrategy drive;
	
	Vehicle(DriveStrategy ds){
		this.drive = ds;
	}
	
	public void drive() {
		
		drive.drive();
		
	}

}
