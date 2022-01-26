package Interface;

import java.util.ArrayList;

public class Bank {
	protected ArrayList<Account> account = new ArrayList<>();

	public ArrayList<Account> getAccount() {
		return account;
	}

	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}
	
	
}
