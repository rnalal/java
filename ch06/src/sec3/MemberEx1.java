package sec3;

public class MemberEx1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("jjy");
		mem1.setPw("1234");
		mem1.setName("전재영");
		mem1.setTel("010-1234-5678");
		mem1.setEmail("jjy@naver.com");
		
		
		String str1 = mem1.toString();
		System.out.println(mem1.toString());
		System.out.println(str1);
		
		Member mem2 = new Member();
		mem2 = mem1;
		System.out.println(mem2.toString());
		
	}

}
