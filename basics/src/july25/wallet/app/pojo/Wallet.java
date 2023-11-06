package july25.wallet.app.pojo;

public class Wallet {

	private Integer id;
	private Double balance;
	private String name;
	
	//----------------constructor--------------------
	public Wallet() {
		super();
	}
	//------------paramaterised constructor------------
	
	public Wallet(Integer id, Double balance, String name) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
	}

	//--------------getters and setters----------------
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

	// ----------------toString----------------------
	@Override
	public String toString() {
		return "Wallet [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}
	
	
	
}
