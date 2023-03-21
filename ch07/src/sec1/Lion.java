package sec1;

//Mammal의 모든 멤버를 상속 받음 -> extends : class 자식클래스명 extends 부모클래스명 { }
//1:1 상속밖에 안됨 -> 하나의 부모한테서만 받을 수 있음(친부모는 한명)
//오버라이딩(override) : 상속 받은 메소드에 대하여 처리할 내용을 새로 기술하는 것

public class Lion extends Mammal {
	
	private String gender; 		//새로 추가된 멤버

	@Override
	public void getcry(String type) {
		System.out.println("사자 울음소리");
	}


	
	
		
}
