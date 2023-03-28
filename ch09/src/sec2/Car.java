package sec2;

public class Car {
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {	//익명의 자식 객체
		@Override
		public void roll() {
			System.out.println("이름이 없는 타이어가 굴러갑니다.");
		}		
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire3 = new Tire(){	//로컬 변수이므로 내부에서만 접근이 가능하다.
			@Override
			public void roll() {
				System.out.println("이름없는 메소드에 의한 익명 객체");
			}			
		};
	}
	
	public void run3(){
		//tire3.roll();		//tire3는 run2() 메소드 안에 있는 로컬(지역)객체이므로 외부에서 접근이 불가
	}
}
