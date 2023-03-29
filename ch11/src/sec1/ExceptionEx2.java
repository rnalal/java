package sec1;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int[] arr = new int[3];		//arr[0]~arr[2]
//ArrayIndexOutOfBoundsException
//인덱스의 범위가 
			for(int i=0;i<=3;i++){
				try {
				arr[i] = i; 		//arr[0]~arr[3]
				System.out.println(arr[i]);
				} catch(ArrayIndexOutOfBoundsException e){
					break;
					//e.printStackTrace();
				}
			}
	}
}
