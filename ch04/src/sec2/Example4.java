package sec2;

public class Example4 {

	public static void main(String[] args) {
		//while
		//while ( ) {
		//반복실행문장1;
		//증감식;
		//반복실행문장2;
		// } -> 식에 따라 반복실행문장1,2의 결과값이 달라짐
		
		//while문을 활용한 1~100의 합계
		int i = 0;
		int sum1=0, sum2=0;
		while(i<=100) {
			sum1+=i;
			i++;
			sum2+=i;
		}
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);

	}

}
