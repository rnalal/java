//초기화 생략하면, 문자열은 null로 숫자는 0으로 초기화됨

package sec1;

public class Car {
	//멤버필드 - 기본형 타입	
	String company = "현대"; 	//제조사
	String model = "소나타";		//모델명
	String color = "blacd";		//색상
	int maxSpeed = 300;		//최고속도
	int speed = 0;
	
	//멤버필드 - 레퍼런스 타입
	Body body;			//몸체
	Engine engine;		//엔진
	Tire tire;			//타이어
	
	//생성자함수 생략 - 생략해도 public Car() { }이 기본으로 존재
	
	
	//멤버 메서드
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	
	
	
}
