package sec4;

public class Quiz5 {

	public static void main(String[] args) {
		//int[] arr = {70, 50, 90, 80, 40, 60}
		//=> {40, 50, 60, 70, 80, 90} 오름차순
		//=> {90, 80, 70, 60, 50, 40} 내림차순
		//오름차순으로 그 결과를 정렬하여 출력
		//자리 맞교환이 안되므로 임시기억장소 활용 -> 선택정렬(selection sort)
		
		int[] arr = {70, 50, 90, 80, 40, 60};
		int n = arr.length;		int tmp;
		System.out.println("정렬 전 : ");
		for(int i=0;i<n;i++){
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					tmp=arr[i]; arr[i]=arr[j]; arr[j]=tmp;
				}
			}
		}
		System.out.println("정렬 후 : ");
		for(int i=0;i<n;i++){
			System.out.printf("%d\t", arr[i]);
		}

	}

}
