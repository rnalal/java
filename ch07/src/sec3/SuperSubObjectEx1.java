package sec3;
//함수와 겍체의 전달
import sec2.*;
public class SuperSubObjectEx1 {
	public static void main(String[] args) {
		// 객체 선언
		Customer cus;
		cus = new Customer();	//객체생성
		cus.setName("전재영"); 
		fnc1(cus);				//함수 호출
		//fnc2(cus); 	//cus는 Customer(부모클래스이므로 자식 타입의 매개객체로 받을 수 없다.)
		//fnc3(cus);	//cus는 Customer(부모클래스이므로 자식 타입의 매개객체로 받을 수 없다.)
				
		cus = new Member();
		cus.setName("김길동");
		fnc1(cus);
		
		cus = new NonMember();
		cus.setName("김비회원");
		fnc1(cus);
		
		/*
		 그러므로, 상속된 상황에서의 함수 매개객체의 타입은 부모 타입의 매개객체로 설정해야 모두 받을 수 있다. 
		 */
		
		}
		
		public static void fnc1(Customer cus1){	//함수 오버로딩 	//fnc1(Customer cus1)여기서 Customer를 꼭 부모타입으로 설정해야 함.
			//전달객체는 항상 부모객체로 해야함 -> 단, 나중에 선언된 자식객체는 부모필드에 사용할 수 없음.
			cus1.getCustom();
			System.out.println(cus1.getName());
		}
		public static void fnc1(Member cus1){
			cus1.getCustom();
			System.out.println(cus1.getName());
		}
		public static void fnc1(NonMember cus1){
			cus1.getCustom();
			System.out.println(cus1.getName());
		}
		

	}

