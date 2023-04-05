package sec3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

//HashTable은 키와 값을 1:1형태로 가져가며,
//HashMap에서는 값으로 null이 입력이 가능하지만 HashTable에서는 null 입력이 불가능함

public class HashtableEx1 {
	public static void main(String[] args) {
		Map<String, String> table1 = new Hashtable<String,String>();
		table1.put("bno", "1"); 	//요소 추가
		table1.put("title", "제목");
		table1.put("content", "내용입니다.");
		table1.put("author", "관리자");
		//Entry를 사용한 요소 접근
		for(Entry<String, String> entry : table1.entrySet()) {
			System.out.println("[Key]:" + entry.getKey() + "[Value]:" + entry.getValue());
		}
		System.out.println();
		//keySet()을 사용한 요소 접근
		for(String i : table1.keySet()){
			System.out.println("[Key]:" + i + "[Value]:" + table1.get(i));
		}
		System.out.println("--------------------------------------------");
		
		Map<Integer,String> table2 = new Hashtable<>();
		table2.put(0, "도도도");	//요소 추가
		table2.put(1, "레레레");
		table2.put(2, "미미미");
		table2.put(3, "파파파");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
