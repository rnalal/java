package sec2;

public class Example2 {

	public static void main(String[] args) {
		
		//바깥 for문의 카운트 변수 증가는 안 for문이 모두 끝나면, 이루어지며,
		//안 for문은 초기값 부터 다시 시작하여 반복된다.
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+","+j+"\t");
			}
			System.out.println();  //줄 띄우기
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			} System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i=4;i>=1;i--) {
			for(int j=4;j<=i;i++) {
				System.out.print("*");
			}System.out.println("\n");
		}
		
		
	}

}
