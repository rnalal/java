package sec1;

import java.util.ArrayList;

//ArrayList를 배열로 배열을 ArrayList로 변환
public class CastingListEx1 {	
	public static void main(String[] args) {
		//ArrayList => 배열
		ArrayList<String> arrayList1 = new ArrayList<>();	//List 선언
		arrayList1.add("도도도");
		arrayList1.add("레레레");
		arrayList1.add("미미미");
		System.out.println(arrayList1.toString());
		System.out.println("-------------------------------------");
		String[] arr1 = new String[arrayList1.size()];
		int i = 0;
		for(String tmp : arrayList1){
			arr1[i++]=tmp;
		}
		for(String a : arr1){
			System.out.println(a);
		}
		System.out.println("**************************************");
		String[] arr2 = arrayList1.toArray(new String[arrayList1.size()]);
		for(String a : arr2){
			System.out.println(a);
		}
	}
}
