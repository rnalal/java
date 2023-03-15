package sec1;

public class ExampleB {

	public static void main(String[] args) {
		//boolean : 부울대수인 true 또는 false를 저장하는 자료형
		boolean a = true;
		boolean b = false;
		boolean c = !a;  		//false(a의 반대)
		boolean d = !b;			//true(b의 반대)
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.print("표현범위 : " +Boolean.TRUE+" 또는");
		System.out.print(Boolean.FALSE);

	}

}
