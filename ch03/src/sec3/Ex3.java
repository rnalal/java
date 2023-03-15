package sec3;

public class Ex3 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println("학생 한 명이 가지는 연필 수:"+pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println("남은 연필 수:"+pencilsLeft);

	}

}
