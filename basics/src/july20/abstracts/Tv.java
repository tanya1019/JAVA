package july20.abstracts;

public abstract class  Tv {

	Integer serialNo;
	String name;
	
	
	public void powerOn() {
		System.out.println("Power on");
	}
	
	public void powerOff() {
		System.out.println("Power Off");
	}
	
	public abstract void display();
	

}
