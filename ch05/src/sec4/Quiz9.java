package sec4;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		

		int score = 0;
		int scorelist = 0;
		boolean sw = true;
		while(sw) {
			System.out.println("\n------------------------------------------");
			System.out.println("1. 학생수| 2.점수입력| 3.점수리스트| 4.분석| 5.종료");
			System.out.println("\n------------------------------------------");
			
			int num = sc.nextInt();
			switch(num) {
				case 1:
				System.out.print("학생수>");
				score = sc.nextInt();
				break;
				
				case 2:
				System.out.print("점수입력>");
				score = sc.nextInt();
				break;
				
				case 3:
				System.out.print("점수리스트>"+scorelist);
				break;
				
				case 4:
				System.out.println("분석");
				
				case 5:
				System.out.println("\n 종료");
				sw = false;

				}

		}

	}
}