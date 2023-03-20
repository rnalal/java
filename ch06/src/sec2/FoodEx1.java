package sec2;

public class FoodEx1 {

	public static void main(String[] args) {
		//생성자 합수 : 클래스 이름과 같으며, 오버로딩을 통하여 여러 형태로 정의한 후 사용할 수 있으며,
		//해당 매개변수의 개수 만큼 다양한 방법으로 객체를 생성할 수 있다.
		Food f0 = new Food();
		Food f1 = new Food("불고기덮밥");
		Food f2 = new Food("부대찌개", 520);
		Food f3 = new Food("치즈돈까스", 570, 9000);
		
		System.out.println(f0.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());

	}

}
