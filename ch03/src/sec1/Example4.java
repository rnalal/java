package sec1;

public class Example4 {

	public static void main(String[] args) {
		//비교연산자 : ==, !=, >, >=, <, <=
		//연산 결과는 true 또는 false 로 출력됨
		
		int a = 15;
		int b = 17;
		
		System.out.println("a==b : "+(a==b));
		System.out.println("a!=b : "+(a!=b));
		System.out.println("a>b : " +(a>b));
		System.out.println("a>=b : " +(a>=b));
		System.out.println("a<b : " +(a<b));
		System.out.println("a<=b : " +(a<=b));
		
		String c = "전재영";
		String d = "전재영";  //String은 객체의 문자열 비교시에는 반드시 equals()메서드 활용
		
		System.out.println("c==d : "+(c==d)); //자연비교
		System.out.println("c==d : "+(c.equals(d))); // 실제비교
		
	}

}
