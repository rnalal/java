package sec1;

public class Example3 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		int[] arr4;
		
		//데이터 개수와 실체가 파악되어 실제 주소 배정이 이루어짐, 이 때 배정된 주소를 포인터라 함
		arr1 = new int[]{1, 90, 70, 80};
		arr2 = new int[]{1, 90, 70, 80};
		arr3 = arr2; //얕은 복제는 실제 데이터의 주소만 전달하므로 값은 가르키도록 하는 것
		System.out.println("arr1 : "+arr1);
		System.out.println("arr2 : "+arr2);
		System.out.println("arr3 : "+arr3);
		//arr4는 포인터인 실제 주소를 배정하지 않았으므로 NullPointerException 에러이다.
		//System.out.println("arr4 : "+arr4);  -> arr4는 개수와 데이터를 파악하지 않았기 때문. 예)식당예약할 때 인원 수 말안하고 예약하면 예약안되는거
		System.out.println();
		for(int data : arr1){
			System.out.print(data+"\t");
		}
		System.out.println();
		for(int data : arr2){
			System.out.print(data+"\t");
		}
		System.out.println();
		for(int data : arr3){
			System.out.print(data+"\t");
		}
		System.out.println();
		System.out.println("arr1==arr2 : "+(arr1==arr2));
		System.out.println("arr2==arr3 : "+(arr2==arr3));
		System.out.println();
		System.out.println("arr1==arr2 : "+(arr1!=arr2));
		System.out.println("arr1==arr2 : "+(arr1!=arr2));
	}

}
