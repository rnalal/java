package sec4;

import java.util.StringTokenizer;

public class StringEx3 {
	public static void main(String[] args) {
		
		String data = "도도도&레레레&미미미&파파파&솔솔솔";
		//StringTokenizer
		StringTokenizer st = new StringTokenizer(data, "&");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("\n");

		//String 배열
		String[] arr = data.split("&");
		for(String token : arr){
			System.out.println(token);
		}
	}
}
