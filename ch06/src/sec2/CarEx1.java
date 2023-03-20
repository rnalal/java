package sec2;

public class CarEx1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.company = "현대";
		car1.model = "그랜저";
		car1.cc = 3000;
		car1.startUp();
		for(int i=0;i<88;i++){
			car1.speedUp();
		}
		System.out.println("자동차의 현재속도:"+car1.speed);
		for(int i=0;i<88;i++){
			car1.speedDown();
		}
		System.out.println("자동차의 현재속도:"+car1.speed);
		car1.turnOff();
	}

}
