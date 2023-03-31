package sec5;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		
		//로또 복권 랜덤 발생기 : 1~45 아무거나 6개 숫자를 무작위로 발생
		
		//1. Math.random 사용
		int[] lotto = new int[6];
		for(int i=0; i<6; i++){
			lotto[i] = (int) (Math.random()*45)+1;
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		int[] arr = {6, 8, 11, 23, 39, 44};	//당첨번호
		//2. Random객체 활용
		Random ran = new Random();
		for(int i=0;i<6;i++){ 
			lotto[i] = ran.nextInt(45)+1;
		}
		Arrays.sort(lotto);		//배열 정렬
		for(int i=0;i<6;i++){
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		if(Arrays.equals(arr, lotto)){	//배열끼리 비교 -> equals는 순서도 맞아야 함. 그래서 꼭 정렬하기!
			System.out.println("1등 당첨");
		} else {
			System.out.println("꽝~!");
		}
	}
}
