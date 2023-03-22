package sec3;

public class FinalEx1 extends Parent {

	public static void main(String[] args) {
		Parent m1 = new Parent();
		m1.getPrint();
		m1.output();
		System.out.println();
		
		m1 = new Child();
		m1.getPrint();
		m1.output();
		//Child는 final 클래스이므로 형 변환된 경우 멤버 필드 값을 추가할 수 없다.
		//m1.setJob("개발자");
		System.out.println();
		
		m1 = new Descendant();

	}

}
