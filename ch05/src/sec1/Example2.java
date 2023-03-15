package sec1;

public class Example2 {

	public static void main(String[] args) {
		//배열선언
		int[] i_arr;		//기본타입[] 배열명 -> 몇 개의 원소인지 부정확하므로 주소 배정이 안됨
		int i_arr2[];  		//기본타입 배열명 []
		float[] f_arr;
		float r_arr2[];
		
		//기본타입[] 배열명 = new 기본타입[개수]
		//기본타입 배열명[] = new 기본타입[개수]
		int[] io_arr = new int[8];   		//원소의 개수가 특정되면, 주소 배정이 이루어지고, 자동 초기화
		String st_arr[] = new String[5];
		
		System.out.println("io_arr="+io_arr);
		System.out.println("st_arr="+st_arr);
		
		int[] arr = {1, 80, 90, 70}; 		//몇 개의 원소가 특정되므로 주소 배정이 되고, 초기화가 됨
		int arr2[] = {2, 90, 100, 80};
		
		System.out.println("\narr 주소 : "+arr);
		System.out.println("\narr2 주소 : "+arr2);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"\t");
		}
		System.out.println("\n");
		for(int data : arr2){		//추가 향상된 for문
			System.out.println(data+"\t");
		}

	}

}
