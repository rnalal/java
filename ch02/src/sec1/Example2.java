package sec1;

public class Example2 {

	public static void main(String[] args) {
		//java의 기본 자료형 (primitive type) 변수는 반드시 초기화 되어야 한다.
		//자바 기본자료형: byte, bool, short, int, long, float, double, char
		//엄격히 따지면 기본자료형은 아니지만, 기본자료형으로 분류하는 것 : String
		//기본자료형 : 하나의 자료만 저장할 수 있음
		byte a = 127;      //1byte (-128~127), 처음에 값을 입력하는 것을 초기화라고 함, -128보다 작은 값을 입력하면 언더플로우, 127보다 큰 값을 입력하면 오버플로우
		boolean b = true;  //true 아니면 false만 입력가능, 1byte
 		short c=128;       //2byte(-2의 15승 ~ 2의15승-1)
		int d = 65536;     //4byte(-2의31승 ~ 2의31승-1)
		long e = 655362000;     //8byte(-2의63승  ~ 2의63승-1), 천문학적 숫자를 저장할때는 long타입이 적합
		float f = 3.14f;             //4byte, 실수(소수점 이하가 있는 수), 실수일때는 숫자 뒤에 f를 붙여야함         
		double g = 3.14d;            //8byte, 실수, 숫자 뒤에 d붙여도 되고 생략도 가능
		//실수 = 부동소수점수(Floating point number), 부동소수점 수는 아주 작은 수나 큰 수에 유리, 부호부+지수부+가수부(.밑)
		//정수 = 고정소수점수 (Integer) , 속도는 고정소수점수가 부동소수점수보다 빠름
		char h = 'k';              //한 글자만 저장가능, 2byte(글자뒤에 null값이 같이 들어가기 때문), ''으로 표현
		//char 값에 숫자를 입력해도 아스키코드의 입력한 숫자에 해당하는 문자로 출격됨
		
	}

}
