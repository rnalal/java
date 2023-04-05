package sec3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Map : 키(key)와 값(value)으로 이루어진 자료 구조로 키는 필드명으로 활용, 값은 그 필드의 값을 저장할 때 활용
//HashMap, Hashtable, LinkedHashMap, Properties, TreeMap => JSON 객체와 호환됨
//Map<key, value>

public class HashMapEx1 {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("name", "전재영");	//요소 추가
		map1.put("age", "25");
		map1.put("blood", "A");
		//HashMap의 순회1(Entry를 사용한 요소 접근)
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[Key]:" + entry.getKey() + " [Value]: " + entry.getValue());
		}
		System.out.println();
		//HashMap의 순회1(keySet ()을 사용한 요소 접근)
		for(String i : map1.keySet()){	//저장된 key값 확인
			System.out.println("[Key]:" + i +" [Value]:" + map1.get(i));
		}
		System.out.println("-----------------------------------------");
		
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(1, "포도");	//요소 추가
		map2.put(2, "배");
		map2.put(3, "바나나");
		//HashMap의 순회1(Entry를 사용한 요소 접근)
		for(Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println("[Key]:" + entry.getKey() + " [Value]: " + entry.getValue());
		}
		map2.put(2, "밤");	//특정 키에대한 값 변경
		map2.put(4, "파인애플");
		map2.replace(3, "망고");	//특정 키에 대한 값 변경
		map2.remove(1);		//.remove(키) - 특정 요소 제거
		System.out.println();
		//HashMap의 순회1 (keySet()을 사용한 요소 접근)
		for(Integer i : map2.keySet()){	//저장된 key값 확인
			System.out.println("[Key]:" + i + " [Value]: " + map2.get(i));
		}
		System.out.println("\nHashMap의 크기ㅣ "+map1.size());
		System.out.println("HashMap의 특정 키 확인: "+map1.containsKey("age"));
		System.out.println("HashMap의 특정 값 확인: "+map1.containsValue("A"));
		System.out.println("빈 HashMap인지 확인: "+map1.isEmpty());
		System.out.println("HashMap의 키 확인: "+map1.keySet());		
	}
}
