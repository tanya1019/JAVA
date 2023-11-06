package july20.interfaces;

public class Casio implements Calculator {

	
	@Override
	public void powerOn() {
		System.out.println("Power on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Power off");
		
	}

	@Override
	public Integer add(int i, int j) {
	int  c= i + j;
		return c;
	}

	@Override
	public Integer subtract(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}
	
	
	public Double square(Double i) {
		
		Double c= i*i;
		
		return c ;
	}
	
}
