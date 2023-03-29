package sec1;

//ClassNotFoundException (클래스 부재) : 해당 클래스가 존재하지 않는 경우 발생
//해당 클래스의 라이브러리를 빌드 패스에 추가해 주어야 함.

//런타임오류 :  
//신택스오류 : 
//**외부자원 접속하려면 무조건 예외처리 해야함(try~catch)

public class ExceptionEx6 {
	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		}
	}
}
