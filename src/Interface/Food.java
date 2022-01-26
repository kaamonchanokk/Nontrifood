package Interface;

public class Food {
	protected String name;
	protected double price;
	Store store;
	protected amount a;
	public amount getA() {
		return a;
	}

	public void setA(amount a) {
		this.a = a;
	}

	public Food(String name,double price,Store store) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.store = store;
		this.store.getFood().add(this);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
}
