package sec3;

public class Example1 {

	public static void main(String[] args) {
		//클래스에 대한 배열
		//클래스 : 인스턴스(객체)를 만들기 위한 틀 또는 설계도
		//사용자 클래스를 활용한 배열
		
		//단일객체
		//클래스명과 생성자함수명은 같음		
		//클래스명 인스턴스명 = new 생성자함수명();
		Student st1 = new Student();		//1명의 학생이 만들어짐
		
		//클래스에 대한 배열 = 배열객체
		//클래스명[] 인스턴스명 = new 생성자함수명[개수];
		Student[] st = new Student[8];		//한꺼번에 8명의 학생이 만들어짐
		
	}

}
