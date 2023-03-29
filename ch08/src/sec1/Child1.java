package sec1;

public class Child1 extends Abstract1{
	//Child1은 추상 클래스인 Abstract1의 자식 클래스이므로 Abstract1에서 선언했던 내용을 
	//반드시 오버라이딩하여 그 구현 내용을 기술해야한다. 
	@Override
	public String method1() {
		return "자식클래스 메소드1";
	}
}
