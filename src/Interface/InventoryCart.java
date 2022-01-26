package Interface;

import java.util.ArrayList;

public class InventoryCart {
	protected ArrayList<amount> a = new ArrayList<>();
	public ArrayList<amount> getA() {
		return a;
	}
	public void setA(ArrayList<amount> a) {
		this.a = a;
	}
	public void add(Food f,int n) {
		for (amount amount2 : a) {
			if(amount2.getFood()==f) {
				amount2.setNum(amount2.getNum()+n);
				break;
			}
		}
		amount amount3 = new amount(n,f);
		a.add(amount3);
	}
	public void remove() {
		a.removeAll(a);
	}
}
