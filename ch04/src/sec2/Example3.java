package sec2;

public class Example3 {

	public static void main(String[] args) {
		// 구구단(2단~3단) - 중첩 for문 활용
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			} System.out.println();
		}
		
	}

}
