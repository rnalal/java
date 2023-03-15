package sec2;

public class Example1 {

	public static void main(String[] args) {
		//반복실행문: 특정 조건이 만족하는 동안 반복 실행하는 문장 -> 반복실행문부터는 로직
		//for~, while~, do~while
		//for,while,dowhile 모두 초기값,증감식(증가 또는 감소),계산문(실행할 문장)
		//어떤 문제를 해결하기 위한 방안 = 알고리즘
		//i는 카운트변수 / 카운트변수에 대한 초기값을 설정해야함
		//for문 예시: for(i=0; i<=10; i++;) { 
		// sum+=i (sum=1+sum) . =는 대입.
		// }
		
		/*
		
		for(초기값;조건식;증감식) {
			반복할 실행문장들;
		}	
		 
		*/
		
		int sum = 0; //계산 결과
		for(int i=0;i<=100;i++) {  //i:카운트 변수 - 유효범위(반복문 안에서만 유효)
			sum+=i;
			System.out.println("i="+i);
		}
		System.out.println("0~100합계:"+sum);
		
		sum=0;
		for(int i=0;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("0~100의 짝수의 합계1:"+sum);
		
		sum=0;
		for(int i=0;i<=100;i+=2) {
			if (i % 2 == 0) sum+=i;
		}
		System.out.println("0~100의 짝수의 합계2:"+sum);

		
		sum=0;
		for(int i=1;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("0~100의 홀수의 합계1:"+sum);
		
		sum=0;
		for(int i=1;i<=100;i+=2) {
			if (i % 2 !=0) sum+=i;
		}
		System.out.println("0~100의 홀수의 합계2:"+sum);
		
		sum=0;
		for(int i=0;i<=100;i+=3) {
			sum+=i;
		}
		System.out.println("0~100의 3의배수의 합계 :"+sum);
		
	}

}
