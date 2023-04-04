package sec1;

import java.util.ArrayList;
//컬렉션 프레임워크: 객체의 모음을 처리하기 위한 자료구조인 자바 클래스
//List : 목록과 같은 데이터를 저장하기에 적합 -> ArrayList, Vector, LinkedList
public class ArrayListEx2 {
	public static void main(String[] args) {
		//stArr은 Student의 집합체(목록)이므로 개별 요소 객체는 Student로 부터 만들어진 객체이어야함
		ArrayList<Student> stArr = new ArrayList<>();
		
		//개별 요소인 Student의 객체를 생성하여 각 요소에 해당하는 값을 저장한다.
		Student st1 = new Student();
		st1.setNo(1);
		st1.setName("도도도");
		st1.setKor(100);
		st1.setEng(70);
		st1.setMat(65);
		stArr.add(st1);
		
		Student st2 = new Student();
		st2.setNo(2);
		st2.setName("레레레");
		st2.setKor(90);
		st2.setEng(100);
		st2.setMat(80);
		stArr.add(st2);
		
		Student st3 = new Student();
		st3.setNo(3);
		st3.setName("미미미");
		st3.setKor(85);
		st3.setEng(95);
		st3.setMat(100);
		stArr.add(st3);
		
		Student st4 = new Student();
		st4.setNo(4);
		st4.setName("파파파");
		st4.setKor(80);
		st4.setEng(75);
		st4.setMat(95);
		stArr.add(st4);
		
		for(int i=0;i<stArr.size();i++){
			Student s = stArr.get(i);
			System.out.println(s.toString());
		}
		System.out.println("---------------------------------------------");
		for(Student s : stArr){
			System.out.println(s.toString());
		}
	}
}
