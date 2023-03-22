package sec2;

public class CustomEx1 {
	public static void main(String[] args) {
		Customer cus1 = new Customer();		//선언과 생성
		Member mem1 = new Member();
		NonMember non1 = new NonMember();
		
		cus1.setName("김고객");
		mem1.setName("회원고객");
		non1.setName("비회원고객");
		
		System.out.println(cus1.getName());
		cus1.getCustom();
		System.out.println(mem1.getName());
		mem1.getCustom();
		System.out.println(non1.getName());
		non1.getCustom();
	}

}
