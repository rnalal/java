package sec2;

public class Example7 {

	public static void main(String[] args) {
		//삼항 연산자(조건 ? 참 : 거짓)
		int a = 37;
		int b = 42;
		String result = "";  //String은 정확히 primitive값은 아님
		//char c = ''; -> 오류남/ primitive값은 null 올 수 없음, 반드시 초기화를 해줘야 함
		result = a>b ? "a가 더 큽니다." : "b가 더 큽니다.";
		System.out.println(result);

	}

}
