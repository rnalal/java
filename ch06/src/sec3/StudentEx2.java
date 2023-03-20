package sec3;

import java.util.Scanner;

public class StudentEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[100];
		int cnt = 0;	//카운트 변수
		//100명 이내의 이름, 나이, 프로그래밍, 데이터베이스, 화면구현의 점수를 입력 받아
		//출력하는 프로그램을 완성하시오.
		
		boolean sw = true;
		while(sw){
			System.out.println("0.프로그램 종료, 1:자료입력, 2:자료출력");
			System.out.println("작업할 번호 입력[0-2] :");
			int work = sc.nextInt();
			switch(work){
				case 0:
					sw = false;
					break;
				case 1:
					System.out.println("나이 입력 : ");
					int age = sc.nextInt();
					st[cnt].setAge(age);
					System.out.println("프로그래밍 점수 입력 : ");
					int pg = sc.nextInt();
					st[cnt].setPg(pg);
					System.out.println("데이터베이스 점수 입력 : ");
					int db = sc.nextInt();
					st[cnt].setDb(db);
					System.out.println("화면 구현 점수 입력 : ");
					int ui = sc.nextInt();
					st[cnt].setUi(ui);
					st[cnt].setTot();
					st[cnt].setAvg();
					cnt++;
					break;
				case 2:
					for(int i=0;i<cnt;i++){
						System.out.println();
						System.out.println("번호 :"+(i+1));
						System.out.println("총점 : "+st[i].getTot());
						System.out.println("평균 : "+st[i].getAvg());
						System.out.println("학점 : "+st[i].getHak());
					}
					break;
				default:
					System.out.println("작업 번호를 잘못 입력하였습니다.");
				
			}
		}
		

	}
	
}



