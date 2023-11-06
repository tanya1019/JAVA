package july18;

public class walletDriver {

	public static void main(String[] args) {
		
		wallet wallet1 = new wallet(1, 1000.0, "Tanya", "abc");
		System.out.println(wallet1);
		wallet wallet2 = new wallet(2, 2000.0, "Akanksha", "cba");
		System.out.println(wallet2);
		
		
		wallet1.addFund(1000.0);
		System.out.println(wallet1);
		
		wallet2.addFund(2000.0);
		System.out.println(wallet2);
		
		wallet1.fundTransfer(100.0, wallet2);
		System.out.println("after transfer 1--->"+ wallet1);
		System.out.println("after transfer 2--->"+ wallet2);
		
		

	}

}
