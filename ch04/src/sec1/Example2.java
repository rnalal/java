package sec1;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호 입력[1-10] : ");
		int bun = sc.nextInt();
		
		System.out.println("국어 점수 입력[0-100] : ");
		int kor = sc.nextInt();

		System.out.println("영어 점수 입력[0-100] : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 입력[0-100] : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3.0f;
		
		String pan="", remark="";
		//판정(pan)은 국어, 영어, 수학의 각 과목의 점수가 60점 이상이고, 평균이 80점 이상이면, "합격"
		//아니면 "불합격"
		//if~else~ 문
		if(kor >= 60 && eng >= 60 && mat >=60 && avg >= 80) {
			pan = "합격";
		}else {
			pan = "불합격";
		}
		
		//참고(remark)는 국어, 영어, 수학 점수 중에서 하나라도 90이상이면, "과목우수", 아니면 "" 처리
		if(kor >= 90 || eng >= 90 || mat >=90) {
			remark = "과목우수";
		}else {
			remark = "";
		}
		
		//if~else if~else~ 문
		//만약, 평균이 90점 이상이면, "A", 80점 이상이면, "B", 70점 이상이면 "C", 60점 이상이면 "D"
		//60점 미만이면 "집에가"
		String hak = "";
		if(avg >= 90) {
			hak = "A";
		}else if(avg >= 80){
			hak = "B";			
		}else if(avg >= 70) {
			hak = "C";
		}else if(avg >= 60) {
			hak = "D";
		}else {
			hak = "집에가";
		}
		//번호, 국어, 영어, 수학, 총점, 평균, 판정, 참고사항, 학점을 모두 출력하시오.
		System.out.println("번호 : "+bun);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("판정 : "+pan);
		System.out.println("참고사항 : "+remark);
		System.out.println("학점 : "+hak);
		
		System.out.println("번호\t국어\t영어\t총점\t평균\t판정\t참고사항\t학점");
		System.out.println(""+bun+"\t"+kor+"\t"+eng+"\t"+tot+"\t"+avg+"\t"+pan+"\t"+remark+"\t"+hak+"");
		
		
	}

}
