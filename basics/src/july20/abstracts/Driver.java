package july20.abstracts;

public class Driver {

	public static void main(String[] args) {
		
		
		Tv tv ;
		tv = new SonyTv();
		tv.display();
		tv.powerOn();
		tv.powerOff();
		
		tv = new LgTv();
		tv.display();
		tv.powerOn();
		tv.powerOff();

	}

}
