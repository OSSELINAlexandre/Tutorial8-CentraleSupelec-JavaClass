package Exercise3;

public abstract class Item {

	
	private int price;
	private String name;
	
	public Item(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
