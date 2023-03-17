
//석차 구하기

package sec4;

public class Quiz6 {

	public static void main(String[] args) {
		//석차 구할때는 모든 사람의 석차를 1등으로 가정함
		
		int[] score = {90, 80, 70, 85, 75, 95, 80, 75};
		int[] rank = {1, 1, 1, 1, 1, 1, 1, 1};
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score.length;j++){
				if(score[i]<score[j]) rank[i]++;
			}
			System.out.printf("점수: %d, 석차: %d\n", score[i], rank[i]);
		}

	}

}
