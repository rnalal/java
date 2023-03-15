package sec1;

public class Example6 {

	public static void main(String[] args) {
		/*
		String data = "C";		
		
		java 12이상 버전의 추가된 switch문  ->는 yield 라고 함
		 
		int num = switch(data) {
			case "A"  -> 100;
			case "B"  -> 60;
			case "C"  -> 100;
			case "D"  -> 100;
		}
        */
		float num1 = (float) Math.random(); //0-1의 실수를 구하는 메소드
		int num = (int) (Math.random()*6)+1;      //1-6을 무작위(랜덤) 임의의 수를 대입
		System.out.println("임의의 수[1-6] : "+num);
		
		if(num==1 || num==2) {
			System.out.println("하위수");
		}else if(num==3 || num==4) {
			System.out.println("중위수");
		}else {
			System.out.println("상위수");
		}
		
		switch (num) {
			case 1:
			case 2:
				System.out.println("하위수");
				break;
			case 3:
			case 4:
				System.out.println("중위수");
			case 5:
			case 6:
				System.out.println("상위수");
		}
		
		
	}

}
