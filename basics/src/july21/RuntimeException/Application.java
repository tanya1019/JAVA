package july21.RuntimeException;

public class Application {

	
	void functionA() {
		
		functionB();
		
		// this is the one method that we can use
//		try {
//			int value = 9/0;
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
	}
	
	
	void functionB() {
		int value = 9/0;
	}
	
}
