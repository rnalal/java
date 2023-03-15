package sec2;

public class Example5 {

	public static void main(String[] args) {
		//do-while : 실행부터 하고, 조건식을 비교하게 되므로, 1번씩 실행을 보장함
		/*
		 초기값부여
		 do {
		 	반복실행할 문장1;
		 	증감식;
		 	반복실행할 문장2;
		 	} while(조건식);
		 */
		
		//do-while : 1번이상 실행을 보장함(실행먼저 하고, 조건식 대입하기 때문)
		int n = 0;
		int sum = 0;
		do {
			n++;
			sum+=n;
		} while(n>=10);
		System.out.println("sum="+sum);
		
		//while : 조건식에 맞지 않으면 실행되지 않음
		n = 0;
		sum = 0;
		while(n>=10) {
			n++;
			sum+=n;
		}
		System.out.println("sum="+sum);
	}

}
