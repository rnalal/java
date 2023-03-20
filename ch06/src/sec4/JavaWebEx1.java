package sec4;

public class JavaWebEx1 {

	public static void main(String[] args) {
		JavaWeb j1 = new JavaWeb();
		JavaWeb j2 = new JavaWeb();
		JavaWeb j3 = new JavaWeb();		
		j1.dm = "도도도";		//dm은 정적멤버이기 때문에, 같은 메모리를 공유한다. 그래서, 3개 다 맨 마지막에 입력한 미미미로 출력됨.
		j2.dm = "레레레";
		j3.dm = "미미미";
		
		j1.partName = "C언어";
		j2.partName = "자바";
		j3.partName = "파이썬";
		
		System.out.println("j1 :"+j1.dm+","+j1.partName);
		System.out.println("j1 :"+j2.dm+","+j2.partName);
		System.out.println("j1 :"+j3.dm+","+j3.partName);
		System.out.println("j0 :"+JavaWeb.dm);

		

	}

}
