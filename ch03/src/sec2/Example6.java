package sec2;

public class Example6 {

	public static void main(String[] args) {
		//비트 연산자 : 2진수 연산 - &, 1, ^, ~(보수:complement), >>, <<, >>>
		int a = 40;
		int b = 25;
		
		System.out.println("a & b : "+(a & b));
		System.out.println("a | b : "+(a | b));
		System.out.println("a ^ b : "+(a ^ b));
		System.out.println("~a : "+(~a));
		System.out.println("a >> 2 : "+(a >> 2));
		System.out.println("a << 2 : "+(a << 2 ));
		System.out.println("a >>> 2 : "+(a >>> 2));
	}

}
