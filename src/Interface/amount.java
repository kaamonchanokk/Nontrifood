package Interface;

public class amount{
	protected int num;
	protected Food food;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public amount(int n,Food f) {
		this.food = f;
		this.num = n;
	}
}
