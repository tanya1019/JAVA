package jully21.CustomExceptionHandling;

public class AccountException extends Exception {


	private static final long serialVersionUID = -6221331702190333170L;

	// constructor cannot return any value, constructor is used to initialise the object
	
	AccountException(String message){
		super(message);
		
	}
	
	
}
