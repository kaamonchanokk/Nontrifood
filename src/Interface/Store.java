package Interface;

import java.util.ArrayList;

public class Store {
	protected String name;
	protected Orange orange; 
	protected ArrayList<Food> food = new ArrayList<>();
	
	public Store(String name,Orange orange) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.orange = orange;
		this.orange.getStore().add(this);
	}
	
	public void allfood() {
		for (Food food2 : food) {
			System.out.println(food2.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Orange getOrange() {
		return orange;
	}

	public void setOrange(Orange orange) {
		this.orange = orange;
	}

	public ArrayList<Food> getFood() {
		return food;
	}

	public void setFood(ArrayList<Food> food) {
		this.food = food;
	}
	
}
