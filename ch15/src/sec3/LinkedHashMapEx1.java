package sec3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx1 {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("guest", "도도도");
		map1.put("member", "레레레");
		map1.put("administrator", "미미미");
		System.out.println("HashMap");
		for (Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("\nLinkedHashMap");
		LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
		map2.put("guest", "도도도");
		map2.put("member", "레레레");
		map2.put("administrator", "미미미");
		for (Map.Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		map2.put("nomember", "파파파");
		map2.remove("guest");
		boolean b1 = map2.containsValue("도도도");
		boolean b2 = map2.containsKey("member");
		//for (Map.Entry<String, String>)
	}
}
