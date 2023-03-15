package sec3;

public class Quiz2 {

	public static void main(String[] args) {
		String grade = "B"; //grade 값 입력
		
		int score1 = 0; //score 초기화
		switch (grade) {  //grade가
		case "A":         //"A" 이면
			score1 = 100; //score는 100
			break;
		case "B":		//"B"이면
			int result = 100-20; //score는 80
			score1 = result;
			break; 
			default: //나머지는
				score1 = 60;  //score 60
		}

	}

}
