package sec2;
//클래스로 부터 상속 받을 경우 클래스: extends, 인터페이스로 부터 상속 받을 경우 클래스 : implements
//인터페이스로 부터 상속 받을 경우 인터페이스 : extends
//클래스로 부터 상속 받은 경우 인터페이스 : 불가능
//클래스(구현체), 인터페이스(추상체)
//다중 상속 : 여러 인터페이스로 부터 상속 받은 인터페이스 - extends
public class Member implements User {
	@Override
	public String method1() {
		return "회원";
	}

	@Override
	public int method2() {
		return 2;
	}
}
