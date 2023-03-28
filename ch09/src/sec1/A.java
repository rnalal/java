package sec1;

//중첩클래스 - 인스턴스 멤버 클래스, 정적 멤버 클래스, 로컬 클래스
//인스턴스 멤버 클래스 : 외부 클래스인 A 클래스를 생성해야 객체를 생성할 수 있는 B클래스
//정적 멤버 클래스 : 외부 클래스인 A 클래스를 생성하지 않고도 객체를 생성할 수 있는 C클래스
//로컬 클래스 : 외부 클래스 A와 관계없이 멤버 메소드에 의해서 객체를 생성할 수 있는 D클래스 

public class A {
	int filed1;
	String field2;
	class B { 		//인스턴스 멤버 클래스
		
	}
	static class C {	//
		
	}
	void method1() {
		
	}
	int method2(){	
		int data=0;
		return data;
	}
	void method3(){		//로컬 클래스
		class D {
			
		}
	}
	private class E { //접근권한이 private이므로 외부 클래스인  A 클래스 안에서만 접근이 가능함		//private클래스
		
	}
	public class F { //접근권한이 public 이므로 외부 클래스의 객체 생성 후와 관계없이 접근이 가능함		//public클래스
		
	}
}
