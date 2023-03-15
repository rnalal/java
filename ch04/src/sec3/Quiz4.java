package sec3;

public class Quiz4 {

	public static void main(String[] args) {
		
		//주사위 합이 5가 나오면 멈추고, 아니면 계속 주사위를 던지기
		while(true) {
			int dice1 = (int) (Math.random()*6)+1;
			int dice2 = (int) (Math.random()*6)+1;
			System.out.println("("+dice1+","+dice2+")");
			if(dice1+dice2==5) break;
		}
	}
}
