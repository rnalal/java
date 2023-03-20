package sec1;

public class CarEx1 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		//company가 private(접근제한자)일때
		System.out.println("제조사 : "+car1.getCompany());	//간접 접근 -> car.java에 getter,setter추가
		car1.setCompany("기아");		
		System.out.println("모델명 : "+car1.model);		//직접 접근
		car1.model = "그랜저";
		System.out.println("모델명 : "+car1.model);
		
		//car1의 Body 설정
		Body body1 = new Body();		//body1은 데이터를 저장하기 위해 필요
		System.out.println("기본값 : "+body1.toString());
		body1.setStyle("쿠페");
		body1.setFrendar("투섭");
		body1.setBumper("솔리드");
		car1.setBody(body1);
		
		//car1의 Body 값 불러오기
		Body body2 = new Body();	//body2는 값을 받아오기 위해 필요
		body2 = car1.getBody();
		System.out.println(body2.toString());	//Body.java에 toString 추가
		
		//car1의 Engine 설정
		Engine eng1 = new Engine();
		System.out.println("기본값: "+eng1.toString());
		eng1.setFuel("디젤");
		eng1.setCc(3500);
		eng1.setDisplace(4);
		car1.setEngine(eng1);
		
		//car1의 Engine 값 불러오기
		Engine eng2 = new Engine();
		eng2 = car1.getEngine();
		System.out.println(eng2.toString());
		
		//car1의 Tire 설정
		Tire tire1 = new Tire();
		System.out.println("기본값: "+tire1.toString());
		tire1.setName("한국타이어");
		tire1.setCount(4);
		car1.setTire(tire1);
		
		//car1의 tire 값 불러오기
		Tire tire2 = new Tire();
		tire2 = car1.getTire();
		System.out.println(tire2.toString());
	}

}




