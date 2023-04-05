package sec2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//
//인덱스가 없으므로 순서 유지를 보장하지 못한다.
public class HashSetEx1 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(80);
		set1.add(90);
		set1.add(80);
		set1.add(100);
		set1.add(90);
		System.out.println("set에서 80이 존재하는가? "+set1.contains(80));
		for(Integer s : set1){
			System.out.println(s);
		}
		set1.add(70);
		set1.remove(100);	//remove(값) - 요소 제거
		
		System.out.println();
		Iterator<Integer> it = set1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println(set1.toString());
		/*
		 get(인덱스)에 의한 접근이 불가
		 for(int i=0;i<set1.size();i++){
		 	System.out.println(set1.get(i));
		 }	
		*/		
	}
}








