package july20.interfaces;

public class Driver {

	public static void main(String[] args) {
		Calculator calculator;  // reference variable
//		calculator = new Calculator() // cannot instantiate the abstract variable
		
		calculator = new  Casio();
		calculator.powerOn();
		System.out.println(calculator.add(10, 20));
		calculator.powerOff();
		
	}

}
