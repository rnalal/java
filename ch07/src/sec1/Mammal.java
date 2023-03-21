package sec1;

//척추동물

public class Mammal extends Animal {	//extends Animal: Animal.java에서 상속받음
	private String foods;		//먹이-새로 추가된 멤버
	private String birthType;	//난생/태생/반태생
	
/*
 	상속 받은 멤버 필드
	private String type;
	private String name;
	private String color;
	private boolean spine;
	private int legs;
	
	 상속 받은 메소드
	 getter/setter/cry
 */
	
	public String getFoods() {
		return foods;
	}

	public void setFoods(String foods) {
		this.foods = foods;
	}

	public String getBirthType() {
		return birthType;
	}

	public void setBirthType(String birthType) {
		this.birthType = birthType;
	}	
}
