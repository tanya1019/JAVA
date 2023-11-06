package jully21.CustomExceptionHandling;

public class Wallet {

	
	Integer id;
	Double balance;
	String name;
	
	
	//-----------------------Constructor-----------------------------
	
	public Wallet(Integer id, Double balance, String name) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
	}


// --------------------------Custom Exception-------------------------

	public void withdraw ( Double amount ) throws AccountException{
		if(amount <= this.balance) {
			this.balance = this.balance - amount;
		}
		else {
			throw new AccountException("Insufficent Balance, Current Balance is: " + this.balance + " " + "Please Retry");
		}
	}


// ---------------------------toString-------------------------------

	@Override
	public String toString() {
		return "Wallet [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}
	
	
	
	
}
