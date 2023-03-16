package sec2;

public class Example1 {

	public static void main(String[] args) {
		//문자열과 문자 배열
		String strl = "java program";
		char[] c_arr = {'j','a','v','a',' ','p','r','o','g','r','a','m'};
		
		//기본출력
		System.out.println(strl);
		System.out.println(c_arr);
			//System.out.printf("%s\n", c_arr);
		System.out.println();
		
		//strl.length() : 문자열의 글자수
		//c_arr.length() : 배열의 개수
		
		//개별 문자요소 접근
		for(char data : c_arr){		//문자 배열 요소 접근
			System.out.print(data);
		}
		System.out.println();
		for(int i=0;i<strl.length();i++){	//문자열의 개별요소 접근
			System.out.print(strl.charAt(i));			
		}
		System.out.println();
		
		//문자열인 주민번호의 성별코드를 이용한 성별 구하기
		String jumin = "791225-1247114";
		char m = jumin.charAt(7); //index는 0부터 세기 시작함, 8번째 글자면 index는 7. 
		System.out.println(m);		//charAt() : 특정 인덱스의 문자를 1글자 뽑아낼 때 사용.
		switch(m){
			case '1':    //타입이 string이 아니고 char이기 때문에 ''사용함.
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			default:
				System.out.println("외국인");
		}
		
	}

}
