package sec1;

import java.util.ArrayList;
import java.util.Arrays;

public class CastingListEx2 {
//배열을 ArrayList로 변환(Casting)	
	public static void main(String[] args) {
		String[] arr1 = {"도도도", "레레레", "미미미", "파파파"};
		for(String a : arr1){
			System.out.println(a);
		}
		System.out.println();
		ArrayList<String> arrayList1 = new ArrayList<>();
		for(String a : arr1){		//요소마다 접근하여 하나씩 추가
			arrayList1.add(a);
		}
		System.out.println(arrayList1.toString());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		//Arrays 클래스의 asList()를 활용하여 배열요소를 List로 변환
		ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(arr1));
		System.out.println(arrayList2.toString());
		System.out.println("*******************************************");
	}
}
