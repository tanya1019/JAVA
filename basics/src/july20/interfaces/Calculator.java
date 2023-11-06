package july20.interfaces;

public interface Calculator {

	
	// interface is also called as contract
	// by default implicitly interfaces are abstract and public
	// without interface the object cannot be created
	
	 void powerOn();
	 void powerOff();
	 public abstract Integer add(int i, int j);
	 public abstract Integer subtract(int i, int j);
	 public abstract Double square(Double i);
}
