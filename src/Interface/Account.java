package Interface;

public class Account {
	protected int ID;
	protected String name;
	protected double money;
	protected Bank bank;
	
	public Account(String n,int code,double money,Bank bank) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.ID = code;
		this.money = money;
		this.bank = bank;
		bank.getAccount().add(this);
	}
	public int getID() {
		return ID;
	}

	public void setID(int code) {
		this.ID = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
}
