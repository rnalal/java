package creational.abstractfactory;

public class RoundedRectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("모서리 둥근 사각형을 그립니다.");
	}	
}
