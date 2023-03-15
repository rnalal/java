package sec1;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int money;
		int balance=0;
		String id;
		
		boolean ps = true;
		while(ps) {
			System.out.println("작업 번호[1:입금, 2:출금, 3:조회, 4:가입, 0:종료] :");
			int su = sc.nextInt();  //0~4
			
			switch (su) {
			case 0:
				System.out.println("종료");
				ps = false;
				break;
			case 1:
				System.out.println("입금 업무를 선택하였습니다.");
				System.out.println("입금할 금액을 입력하세요:");
				money = sc.nextInt();
				balance+=money;
				break;
			case 2:
				System.out.println("인출 업무를 선택하였습니다.");
				System.out.println("인출할 금액을 입력하세요:");
				money = sc.nextInt();
				balance-=money;
				break;
			case 3:
				System.out.println("조회 업무를 선택하였습니다.");
				System.out.println("현재 잔액: "+balance);
				break;
			case 4:
				System.out.println("예금가입을 선택하였습니다.");
				System.out.println("가입할 계좌 번호 입력:");
				id = sc2.nextLine();
				System.out.println("\n가입한 계좌 번호:"+id);
				break;	
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;			
			}
		}	
	}

}
