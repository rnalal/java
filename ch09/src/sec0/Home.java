package sec0;

public class Home {
		//1. 인터페이스 로 맴버객체로 선언하고, 
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}		
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//2. 멤버 메소드의 안에 구현 객체를 만들고 호출하는 방법
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");				
			}			
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//3. 매개변수로 실행할 부분에서 인터페이스의 구현 내용을 받아서 실행하는 방법 
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}