package sec1;

public class AbstractEx1 {
	public static void main(String[] args) {
		//추상 클래스는 추상화되어 있어 구현할 내용할 내용이 없으므로 객체를 생성할 수 없음
		//Abstract1 ab1 = new Abstract1(); 
		//추상 클래스로 부터 객체를 생성하기 위해 추상화된 메소드에 대하여 그 구현 내용을 오버라이딩을 통해 기술하여 객체를 생성함
		//익명의 클래스
		Abstract1 ab1 = new Abstract1(){ //익명의 클래스를 직접 구현	
			@Override
			public String method1() {
				return "익명 클래스의 메소드1";
			}			
		};
		ab1.method1(); 
		method2();	//메소드를 호출하면, 추상 클래스를 이용한 객체
	}
	
	static void method2() {	//익명의 클래스를 만들기 위한 메소드
		Abstract1 ab1 = new Abstract1(){	
			@Override
			public String method1() {
				return "익명 클래스의 메소드1";
			}			
		};
		ab1.method1();
	}
	
	static void method3(Abstract1 ab1){ //익명의 클래스를 매개변수로 대입하기 위한 메소드
		ab1.method1();
	}
	//추상 클래스를 이용하여 객체를 생성하기 위해서는 추상 메소드에 대한 구현 내용을 기술하면 만들 수 있다.
}
