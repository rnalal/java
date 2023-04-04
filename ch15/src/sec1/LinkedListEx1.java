package sec1;

import java.util.LinkedList;
import java.util.List;

//LinkedList : 검색속도는 빠르지만, 중간에 삽입할 경우에 속도는 느려짐
//중간에 삽입할때는 ArrayList가 더 빠름

public class LinkedListEx1 {
	public static void main(String[] args) {
		List<Integer> i1 = new LinkedList<>();
		
		i1.add(90);
		i1.add(80);
		i1.add(100);		//요소 추가
		
		i1.add(1, 70);		//요소 삽입
		
		i1.remove(2);		//요소 제거
		
		for(Integer d : i1){
			System.out.println(d);
		}
		
		i1.clear();
		
		List<String> i2 = new LinkedList<>();
		
		i2.add("도도도");
		i2.add("레레레");
		i2.add("미미미");		//요소 추가
		
		i2.add(0, "파파파");		//요소 삽입
		
		i2.remove(2);		//요소 제거
		
		for(String d : i2){
			System.out.println(d);
		}
		
		i2.clear();
		
		LinkedList<Student> i3 = new LinkedList<>();
		
		Student st = new Student();
		st.setNo(9);
		st.setName("jjy");
		st.setKor(90);
		st.setEng(100);
		st.setMat(80);
		i3.add(st);
		
		for(Student s : i3){
			System.out.println(s.toString());
		}
	}
}
