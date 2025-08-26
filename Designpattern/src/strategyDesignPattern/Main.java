package strategyDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle pvehicle = new Passengervehicle();
		Vehicle svehicle = new Sportsvehicle();
		pvehicle.drive();
		svehicle.drive();

	}

}
