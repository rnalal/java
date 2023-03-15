package sec1;

public class Example1 {

	public static void main(String[] args) {
		//기본형(primitive type) = 원시형 : boolean,byte,char,short,int,long,float,double
		//기본형은 데이터가 1개만 저장, 가장 처음 만들어진 데이터 타입이라 원시형이라고도 함
		//참조형(reference type) = 열거형(복수형) : 배열형, 열거형, 클래스(DAO=VO), 인터페이스(추상체)
		
		int[] arr = {1, 80, 90, 70};  //1차원배열(1줄)
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		int[][] arr2 = {{1,80,90,70},{2,100,90,95}};
		System.out.println("번호\t국어\t영어\t수학");
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
