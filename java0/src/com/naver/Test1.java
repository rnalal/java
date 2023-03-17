package com.naver;

public class Test1 {

	public static void main(String[] args) {
		/*System.out.println("Hello java");*/
		
		/*int[] array = { 1, 5, 3, 8, 2 };
		
		int sum = 0;
		for(int i=0; i<2; i++) {
			sum += array[i];
			for(int j=0;j<5;j++){
				
			}
		}
		System.out.println("총합 : "+sum);
		double avg = (double) sum / 5;
		System.out.println("평균 : "+avg); */
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
			};
		
		int sum = 0;
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				for(int z=0; z<5; z++){
					sum += array[i][j];
				}
			}
				
		}
		System.out.println("총합:"+sum);
		double avg = (double) sum/10;
		System.out.println("평균 :"+avg);

	}

}
