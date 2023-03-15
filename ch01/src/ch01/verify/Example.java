package ch01.verify;

public class Example {

	public static void main(String[] args) {
		
		/*
		 int sum = 0;
		 if(i=1;i<=100;i+=3){
		  sum+=i;
		  } system.out.println("3의배수의합:"+sum);
		 */
		
		/*float i1 = (float)Math.random();
		int i = (int)(Math.random()*6)+1;
		float j1 = (float)Math.random();
		int j = (int)(Math.random()*6)+1;
		System.out.println("결과 : "+"("+i+","+j+")");
		
		boolean sum=true;
		while(sum){
			if(i+j==5) break;
			if(i+j!=5) continue;
		} */
		

		/*for (int x=0;x<=10;x++){
			for (int y=0;y<=12-4/5x;y++){
				System.out.print("("+x+","+y+")");
			}
		} */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");				
			}System.out.println();
		}
		
		
	}
}
