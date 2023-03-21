package sec5;

//다른 패키지에 있는 클래스를 사용하려면, import를 해야함
import dao.Product;		 //import 1차패키지명.2차패키지명.클래스명;
//import dao.Stuff;		//Stuff 클래스는 default 접근제한 클래스이므로 다른 클래스에서 사용할 수 없음.
import dao.Services;

public class ProductEx1 {		//Product로 부터 상속 (extends Product)
	public static void main(String[] args) {
		Product prol = new Product();
		prol.name = "라꾸라꾸침대";		//접근제한이 public이므로 다른 패키지에서도 접근이 가능함
		//prol.pid = "A001";		//접근제한이 default이므로 같은 패키지에서만 접근이 가능함
		prol.setPid("A001");
		//prol.style = "BED";		//접근제한이 protected 일 경우 상속 관계나 포함 관계일 경우 접근이 가능함
		prol.setStyle("BED");
		//prol.account = 10;		//접근제한이 private 일 경우 현재 클래스에서만 접근이 가능함
		prol.setAccount(10);
	}



	/*
 		*public : 클래스, 필드, 생성자, 메소드 - 같은 페키지나 다른 패키지에서도 import를 통하여 접근이 가능함
 		protected: 필드, 생성자, 메소드 - 같은 패키지이거나 다른 패키지에서도 상속관계에 있는 클래스에서 접근이 가능함 
 		default: 클래스, 필드, 생성자, 메소드 - 같은 패지기일 때만 접근이 가능함
 		*private: 필드, 생성자, 메소드 - 같은 클래스 내메서만 접근이 가능하고, 일반적으로는 public 타입의 getter,setter를 통하여 접근
	 	
	 	범주: public > protected > default > private (-> 정보 은폐)
	 */

	/*Services s1 = new Services();
	s1.name = "";
	s1.setStage();
	s1.setSid(); */
	
}

