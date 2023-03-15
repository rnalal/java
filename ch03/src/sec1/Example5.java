package sec1;

public class Example5 {

	public static void main(String[] args) {
		//논리 연산자: &&(And), ||(Or), !(Not)
		
		int a = 27;
		int b = 24;		
		System.out.println("a<25 && b>25 :"+(a<25 && b>25));
		System.out.println("a>25 && b>25 :"+(a>25 && b>25));
		System.out.println("a<25 && b<25 :"+(a<25 && b<25));
		System.out.println("a>25 && b<25 :"+(a>25 && b<25));
		System.out.println("a<25 || b>25 :"+(a<25 || b>25));
		System.out.println("a>25 || b>25 :"+(a>25 || b>25));
		System.out.println("a<25 || b<25 :"+(a<25 || b<25));
		System.out.println("a>25 || b<25 :"+(a>25 || b<25));
		
		
		boolean c = a>25 || b>25;
		System.out.println("c="+c);
		System.out.println("!c="+(!c));
		System.out.println("!(!c)"+(!(!c)));
		System.out.println("a<25 ^ b>25 :"+(a<25 ^ b>25));
		System.out.println("a>25 ^ b>25 :"+(a>25 ^ b>25));
		System.out.println("a<25 ^ b<25 :"+(a<25 ^ b<25));
		System.out.println("a>25 ^ b<25 :"+(a>25 ^ b<25));
		
		

	}

}
