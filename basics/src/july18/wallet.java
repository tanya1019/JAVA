package july18;

public class wallet {

	private Integer id;
	private Double balance;
	private String name;
	private String password;
	
	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	wallet(){
		
	}
	

	public wallet(Integer id, Double balance, String name, String password) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
		this.password = password;
	}

	
	public void addFund(Double amount) {
		this.balance = balance + amount;
	}
	
	public void withdrawFund(Double amount) {
		if (amount < this.balance) {
			this.balance = balance - amount;
		}
	}
	
	public void fundTransfer(Double amount, wallet towallet) {
		if(amount < this.balance) {
			this.balance = this.balance - amount;
			Double newbalance = towallet.balance + amount;
			towallet.setBalance(newbalance);
		}
	}
	

	@Override
	public String toString() {
		return "wallet [id=" + id + ", balance=" + balance + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
