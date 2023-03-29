package sec2;
//중첩 예외 처리
public class OverlapException {
	public static void main(String[] args) {
		try {
			String data = null;
			data = "전재영";
			System.out.println(data.toString());
			try {
				int[] arr = new int[3];
				arr[3] = 30;
				try {
					String data1 = "1004";
					String data2 = "김1004";
					int val1 = Integer.parseInt(data1);
					int val2 = Integer.parseInt(data2);
					System.out.println("val1="+val1);
					System.out.println("val2="+val2);
				} catch(NumberFormatException e3){
					e3.printStackTrace();
				}
		} catch(IndexOutOfBoundsException e2){
			e2.printStackTrace();
		} 
		}catch(NullPointerException e1){
			e1.printStackTrace();
		}
 }
}
