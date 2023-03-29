package sec1;
//Exception (예외) : 문법적 오류는 없지만 비정상적인 실행을 하게 되는 경우
//문법적 오류 => Syntax Error
//예외 처리 : 예외가 발생할 것을 대비하여 그 예외의 내용을 확인하고, 정상적으로 처리하기 위한 방법
//try { 실행할 구문; } catch(Exception e) { 예외상황메시지출력; }
public class ExceptionEx1 {
	public static void main(String[] args) {
		String data = null;
		//data = "전재영";
//NullPointerException : 처리할 내용이 Null인 경우 발생하는 예외		
		try {
		System.out.println(data.toString());
		} catch(NullPointerException e){
			e.printStackTrace();		//예외의 내용을 출력
		}
	}
}
