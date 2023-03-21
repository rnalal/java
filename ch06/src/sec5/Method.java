package sec5;

public class Method {
	public int field;
	public String field2;
	
	public void method1(){	//반환X, 매개변수X
		System.out.println("메소드1을 호출하였습니다.");
	}
	public void method2(int field1, String field2){	//반환X, 매개변수O
		System.out.println("메소드2를 호출하였습니다.");
		System.out.println("입력값: "+field1);
	
	}
}
