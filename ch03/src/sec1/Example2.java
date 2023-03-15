package sec1;

public class Example2 {

	public static void main(String[] args) {
		//대입 연산자
		int a = 10;
		int b = 15;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a+=3;  //a=a+3;
		b-=3;  //b=b-3;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a*=3;  //a=a*3;
		b/=3;   //b=b/3;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a%=2;      //a=a%2;
		
		int c = 40;
		int d = 40;
		c >>=2;
		d<<=2;
		System.out.println("c>>=2 : "+c);
		System.out.println("d<<=2 : "+d);

	}

}
