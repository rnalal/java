package sec1;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		String sw = "B";
		
		switch (sw) {
			case "a":
			case "A":
				System.out.println("당신의 혈액형은 A형 입니다.");
				break;
			case "B":
			case "b":
				System.out.println("당신의 혈액형은 B형 입니다.");
				break;
			case "ab":
			case "AB":
			case "Ab":
			case "aB":
				System.out.println("당신의 혈액형은 AB형 입니다.");
				break;
			case "o":
			case "O":
				System.out.println("당신의 혈액형은 O형 입니다.");
				break;
		}

	}

}
