package sec2;

//예외를 자바에게 떠넘기기.(내가 처리하기 귀찮으니까)
//방법: 오류난 문장에 마우스 대고 -> Add throws declaration 누르기

public class ExceptionThrows {
	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
}
