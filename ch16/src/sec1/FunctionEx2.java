package sec1;
class MyFunction2 {
	int method2() {		//매개변수는 없고 반환(리턴)이 있는 함수(메소드)
		return 1004;
	}
}
public class FunctionEx2 {
	public static void main(String[] args) {
		MyFunction2 fnc2 = new MyFunction2();
		int a = fnc2.method2();
		System.out.println("당신은"+a+"이군요~!");
	}
}
