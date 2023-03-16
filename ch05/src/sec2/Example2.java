package sec2;

public class Example2 {

	public static void main(String[] args) {
		//문자열 길이 : length()라는 메소드 사용
		String data = "김기태는 천사";	//공백도 문자. 글자수 셀때 공백 포함해서.
		int len = data.length();
		System.out.println("data의 글자수:"+len);
		
		//문자열 전체 변경
		data = "김기태는 천재~! 너는 똥멍청이~!";
		System.out.println("data : "+data);
		
		//문자열의 일부를 변경
		data = data.replace("김기태","강하늘");
		data = data.replace("~!","");
		System.out.println("data : "+data);
		
		//문자열 잘라내기
		String ju = "791225-1247114";
		//79년 12월 25일로 출력
		String year = ju.substring(0, 2);		//문자열변수.substring(시작인덱스,끝인덱스)
		String month = ju.substring(2, 4);		//시작인덱스는 포함되고, 끝인덱스는 포함 안됨
		String day = ju.substring(4, 6);
		
		System.out.println(year+"년"+month+"월"+day+"일");
		
		//특정 문자의 위치(인덱스) 찾기
		int pos = ju.indexOf("-");
		System.out.println("-의 위치는"+pos+"입니다.");
		int pos2 = ju.indexOf("*");  //*은 주민번호 내에 없으므로 -1로 출력./ 못찾으면 -1로 출력됨
		if(pos2<0) {
			System.out.println("못 찾겠다 꾀꼬리~!");
		} else {
		System.out.println("*의 위치는:"+pos+"입니다.");
		}
		
		//문자열 분리
		String dates = "1979-12-25";
		String names = "김세종-김우주-손승기-황병준";
		//문자열의 배열로 분리 - 문자열에서 특정 구분자(token)을 기준으로 또 다른 여러 문자열로 분리
		String[] date = dates.split("-");
		String[] name = names.split("-");
		//Attay.length: 문자열 배열의 길이
		for(int i=0;i<date.length;i++){
			System.out.println(date[i]);
			
	}
	System.out.println();
	for(int i=0;i<name.length;i++){
		System.out.println(name[i]);
	}
	
}
}
