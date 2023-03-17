package sec1;

public class Human {
	
	//[접근제한자] 타입 필드명;
	private String name;		//1. 멤버 필드: 특정 속성 값을 저장하거나 설정하기 위한 멤버
	private int male;
	private int age;
	private int height;
	private int weight;
	
	//3. 생성자 함수(constructor) : 해당 클래스의 객체를 만드는 역할을 수행
	//생성자 함수를 생략하면, 기본 생성자가 존재됨.
	//생성자 함수명은 클래스명과 동일해야함.
	//[접근제한자] 함수명([매개변수타입 매개변수명,...]) { }
	//2. 멤버 메소드: 기능 구현하거나 동작을 시키기 위한 멤버
	//[접근제한자] 반환타입 메서드명([메개변수타입 메개변수명]) { }
	public String getName() {		//멤버 메소드(getter/setter)
		return name;
	}
	public int getMale() {
		return male;
	}
	public void setMale(int male) {
		this.male = male;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}

}
