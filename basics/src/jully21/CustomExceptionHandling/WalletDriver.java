package jully21.CustomExceptionHandling;

public class WalletDriver {

	public static void main(String[] args) {
		
		Wallet paytm = new Wallet( 1, 5000.0, "Tanya" );
		try {
			paytm.withdraw(6000.0);
		} catch (AccountException e) {
			
//			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		
		System.out.println(paytm);

	}

}
