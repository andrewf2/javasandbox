package myMVC;

public class DVD {
	private String title;
	private int cost;
	
	public DVD(String name, int price){
		this.title = name;
		this.cost = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
