package Aug3Exam;

import java.util.InputMismatchException;  // import for the inBuilt exception
import java.util.Scanner; // import for the scanner to take the input from the user


// class created for the custom exception
class DivisionByZeroException extends Exception {
    private static final long serialVersionUID = 1L;
	public DivisionByZeroException(String message) {
        super(message);
    }
}



public class Question1 {
	// condition to check the division
    public static Float divideNumbers(Float numerator, Float denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("ERROR502");
        }
        return numerator / denominator;
    }

    
    // input taken from the user 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
	        try {
	            System.out.print("Enter value in the Numerator --> ");
	            Float numerator = input.nextFloat();
	 
	            System.out.print("Enter value in the Denominator --> ");
	            Float denominator = input.nextFloat();
	 
	            Float output = divideNumbers(numerator, denominator);
	            System.out.println("The output after division is -->  " + output);
	        }
	       
	        catch (InputMismatchException e) {
	            System.out.println("ERROR501");
	        }
	        
	        // inbuilt exception other than input mismatch and division by zero exception
	        catch(Exception e) {
	          System.out.println(e.getMessage());
	        }
	    } 

	}







