package sec3;

public class MemberEx1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("jjy");
		mem1.setPw("1234");
		mem1.setName("전재영");
		mem1.setTel("010-1234-5678");
		mem1.setEmail("jjy@naver.com");
		
		
		System.out.println("id :"+mem1.getId());
		System.out.println("pw :"+mem1.getPw());
		System.out.println("name :"+mem1.getName());
		System.out.println("tel :"+mem1.getTel());
		System.out.println("email :"+mem1.getEmail());
		
	}

}
