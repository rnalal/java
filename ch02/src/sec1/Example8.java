package sec1;

public class Example8 {

	public static void main(String[] args) {
		//char : 문자
		char a = 'A';
		char b = 65;
		char c = '가';
		char d = 44032;
		int e = Character.MAX_VALUE; //character의 가장 작은 값
		int f = Character.MIN_VALUE; //character의 가장 큰 값
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("character의 바이트 크기 : "+ Character.BYTES);
		System.out.println(e+"~"+f);

	}

}
