package sec2;

public class Example2 {

	public static void main(String[] args) {
		//자동 형변환 : 작은 -> 큰
		byte a = 10;
		short b = a;
		int c = b;
		float d = c;
		// long e = d; -> 실수는 정수로 형변환 할 수 없음 (이때는 강제형변환을 해야함)
		long e = (long) d; //강제형변환 : 데이터 유실 가능성 있음
		double f = e;
		//강제 형변환은 형변환 연산자로 함
	}

}
