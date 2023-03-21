package sec5;

// 현재 MixEx1과 Mix는 같은 클래스에 존재함
// 같은 패키지에 존재하는 Mix의 멤버 중에서 public, protected, default의 접근제한을 가진 멤버는 접근이 가능함.
public class MixEx1 {
	public static void main(String[] args) {
		Mix mix1 = new Mix();
		
		//필드의 접근
		mix1.field1 = 10;	//public
		mix1.field2 = 20;	//protected
		mix1.field3 = 30;	//default
		//mix1.field4 = 40;	//private -> 정보 은닉
		
		//method에는 절대 private를 걸지 않기!
		
		mix1.method1();		//public
		mix1.method2(); 	//protected
		mix1.method3(); 	//default
		//mix1.method4();	//private -> 정보 은닉
	}

}
