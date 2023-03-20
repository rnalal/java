package sec3;

public class Shape {
	private int shapeType;		//0-원, 3-삼각형, 4-사각형
	private int length;
	private int height;
	public int getShapeType() {
		return shapeType;
	}
	public void setShapeType(int shapeType) {
		if(shapeType == 0 || shapeType == 3 || shapeType == 4){
			this.shapeType = shapeType;
		} else {
			System.out.println("계산할 수 있는 도형이 아닙니다.");
		}
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double calcArea(int length){		//메소드 오버로딩: 메소드 이름과 반환타입이 같고,
		//매개변수의 개수나 타입만 다르게 표현
		return length*length*3.14;
	}
	public double calcArea(int length, int height){
		if(this.shapeType==3){
			return length*height/2;
		} else {
			return length*height;
		}
	}
	
}
