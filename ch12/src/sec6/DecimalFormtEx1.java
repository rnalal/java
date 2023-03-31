package sec6;

import java.text.DecimalFormat;

public class DecimalFormtEx1 {
	public static void main(String[] args) {
		int a = 12345678;
		double b = 45678.123456789;
		int c = -12345678;
		
		/*
		 표시형식코드 : 해당 데이터를 틀정 형식으로 출력하기 위한 코드 -> DecimalFormat(" ")에서 " "사이에 들어가는게 표시형식코드
		 0 : 10진수, 값이 없어도 무조건 자리를 채움
		 # : 10진수, 값이 없으면 표시하지 않음
		 . : 소수점
		 - : 음수 부호
		 , : 천단위 구분
		 E : 지수형태로 표시
		 % : 백분율 부호
		 기타문자 : 문자로 취급
		 */
		DecimalFormat f1 = new DecimalFormat("000000000.00000");
		DecimalFormat f2 = new DecimalFormat("#########.#####");
		DecimalFormat f3 = new DecimalFormat("\\#,##0");	//""안에 \표시는 꼭 2개로!!
		DecimalFormat f4 = new DecimalFormat("#,##0원");
		DecimalFormat f5 = new DecimalFormat("흑자 #,##0 원;적자 #,##0원");
		
		String si1 = f1.format(a);
		String si2 = f2.format(a);
		String si3 = f3.format(a);
		String si4 = f4.format(a);
		String si5 = f5.format(a);
		String si6 = f5.format(c); 
		
		String sf1 = f1.format(b);
		String sf2 = f2.format(b);
		String sf3 = f3.format(b);
		String sf4 = f4.format(b);
		
		System.out.println(si1);
		System.out.println(si2);
		System.out.println(si3);
		System.out.println(si4);
		System.out.println(si5);
		System.out.println(si6);
		System.out.println();
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
		System.out.println(sf4);
	}
}
