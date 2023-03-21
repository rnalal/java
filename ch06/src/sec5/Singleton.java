package sec5;
//싱글톤(Singleton)
//: 하나의 객체를 생성하여 이 객체로 연결되어진 모든 프로젝트나 패키지가 같이 변경되게 하기 위한 자바 디자인 패턴임 
public class Singleton {
	//private static 클래스명 singleton = new 생성자함수() - 외부에서 생성하지 못하게 private으로 설정
	private static Singleton singleton = new Singleton();
	//private 생성자함수() {} - 외부에서 생성하지 못하게 private으로 설정
	private Singleton() { }
	//public static 클래스명 getInstance() { return singleton; } 
	public static Singleton getInstance(){ return singleton;}
}
