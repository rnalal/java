package sec2;

public class Example6 {

	public static void main(String[] args) {
		//continue,  break
		//break : 무한루프 상에서 더 이상 실행을 하지 않으려고 할 경우의 중지
		//continue : 해당 카운트 변수의 값을 실행하지 않고 건너뛸 경우 사용

		int n = 0;
		int sum = 0;
		for(;;) {
			n++;
			sum+=n;
			if(n>=100) break;
		}
		System.out.println("0~100의 합계: "+sum);
		
		sum = 0;
		//3의 배수가 아닌 값의 합계
		for(int i=0;i<=100;i++) {
			if(i % 3 == 0) continue;
			sum+=1;
		}
		System.out.println("3의 배수가 아닌 값의 합계 : "+sum);
		


	}
}