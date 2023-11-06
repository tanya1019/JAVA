package july21.RuntimeException;

public class ExceptionDriver {

	public static void main(String[] args) {
	
		
		// all these exceptions JVM is throwing this is called as runtime exception
		
		
		// ArrayIndexOutOfBoundException
		Integer [] dataArray = {1,2,3,4,5};
//		System.out.println(dataArray[5]);
//		System.out.println("Thank you!");  // it does not reach the end it gets terminated up
		
		//NullPointerException
		String name = null;
//		name.toLowerCase();
		
		//ArithematicException  / by zero
//		int value = 9/0;
//		System.out.println(value);
		
		// mechanism to write error handling logic
		//there can be nested try catch block
		// the exception should be handled by the caller
		
		try {
			int value = 9/0;
			System.out.println(value);
			System.out.println(dataArray[5]);
			name.toLowerCase();
			System.out.println("I am innseide try block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Specific Array Block Exception" + e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Specific Catch Block " + e.getMessage());
		}
		catch (Exception e){
			System.out.println("Main Catch Block" + e.getMessage());
		}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("Thank you!");
		
		
		//flow of exception object
		
		Application exp = new Application();
		
		//this is  the another method for exception handling
		try {
			exp.functionA();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
