package sec1;

public class GenericEx1 {
	public static void main(String[] args) {
		Generic<User> u1 = new Generic<>();
		//uname, uno, uid
		User obj1 = new User();
		obj1.setUname("재영");
		obj1.setUid("jy");
		obj1.setUno(23);
		u1.obj = obj1;
		System.out.println(u1.obj.toString());
		
		Generic<Administrator> a1 = new Generic<>();
		//grade, ano, name
		Administrator obj2 = new Administrator();
		obj2.setGrade("1등급");
		obj2.setName("최고관리자");
		obj2.setAno(1);
		a1.obj = obj2;
		System.out.println(a1.obj.toString());
	}
}
