package strategyDesignPattern;

public class Passengervehicle extends Vehicle {

	Passengervehicle() {
		super(new NormalDriveStrategyClass());
		// TODO Auto-generated constructor stub
	}

}
