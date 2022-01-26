package Interface;

import java.util.ArrayList;

public class Orange {
	protected ArrayList<Store> store = new ArrayList<>();
	
	public void allstore() {
		for (Store store2 : store) {
			System.out.println(store2.getName());
		}
	}
	
	public ArrayList<Store> getStore() {
		return store;
	}

	public void setStore(ArrayList<Store> store) {
		this.store = store;
	}
	
}
