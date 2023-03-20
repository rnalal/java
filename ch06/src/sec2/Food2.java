package sec2;

public class Food2 {
	private String name;
	private int quantity;
	private int price;
	
	public Food2(){	
		this("백반");
	}
	public Food2(String name){
		this(name, 500);
	}
	public Food2(String name, int quantity){
		this(name, quantity, 10000);
	}
	public Food2(String name, int quantity, int price){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Food2 [name=" + name + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	
	
	
}
