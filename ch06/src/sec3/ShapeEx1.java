package sec3;

public class ShapeEx1 {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.setShapeType(0);
		double res1 = s1.calcArea(20);
		System.out.println("반지름이 20인 원의 넓이 : "+res1);
		s1.setShapeType(3);
		res1 = s1.calcArea(10,20);
		System.out.println("폭이 10이고, 높이가 20인 삼각형의 넓이 : "+res1);
		s1.setShapeType(4);
		res1 = s1.calcArea(5,8);
		System.out.println("폭이 5, 높이가 8인 사각형의 넓이 : "+res1);		
	}

}
