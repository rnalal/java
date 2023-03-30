package sec1;
//모든 class는 Object 클래스로부터 묵시적으로 상속 받는다.
public class ProductEx1 {
	public static void main(String[] args) {
		Product pro1 = new Product(1,"스킨");
		Product pro2 = new Product(2,"로션");
		Product pro3;
	
		try {
			pro3 = pro1.clone();	//깊은 복제
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		Product pro4 = pro1;		//얕은 복제
		
		System.out.println("pro1과 pro2가 같나요?"+pro1.equals(pro2));
		System.out.println(pro1.hashCode());
		System.out.println(pro1.toString());
		
		try {
			pro1.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
