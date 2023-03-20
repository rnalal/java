package sec2;

public class Food {
	private String name;		//1. 멤버 필드 : 해당 객체가 갖고 있는 값을 저장
	private int quantity;
	private int price;		//필드에 의한 초기화
	
	//3. 생성자 함수 : 생성자 오버로딩을 통한 여러 가지 객체 생성 방법을 제공
	public Food() { }
	public Food(String name) {
		this.name = name;
	}
	public Food(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	public Food(String name, int quantity, int price) {
		this.name = name;
		this.quantity = quantity;
	}
	
	//2. 멤버 메소드 : 해당 객체의 기능이나 동작이 일어나도록 하는 멤버 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {		//Setter에 의한 초기화
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
		return "Food [name=" + name + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
}
