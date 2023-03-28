package creational.prototype;

public class PrototypeEx1 {
	//프로토타입(Prototype) : 샘플원형(Sample Original Type)
	//원형이 되는 객체를 복제하여 새로운 객체를 생성하는 패턴
	public static void main(String[] args) {
      ShapeCache.loadCache();

      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape.getType());		

      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());		

      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());		
   }
}
