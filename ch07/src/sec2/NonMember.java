package sec2;

public class NonMember extends Customer {
	private String tempId;
	private int orderNum;
	private String temppw;
	
	public NonMember() { }
	public NonMember(String name) {
		super(name);
	}
	public NonMember(String name, String tel){
		super(name, tel);
	}
	public NonMember(String name, String tel, String email){
		super(name, tel, email);
	}
	public NonMember(String name, String tel, String email, String addr){
		super(name, tel, email, addr);
	}
	public NonMember(String name, String tel, String email, String addr, int age){
		super(name, tel, email, addr, age);
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId){
		super(name, tel, email, addr, age);
		this.tempId = tempId;
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId, int orderNum){
		super(name, tel, email, addr, age);
		this.tempId = tempId;
		this.orderNum = orderNum;
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId, int orderNum, String temppw){
		super(name, tel, email, addr, age);
		this.tempId = tempId;
		this.orderNum = orderNum;
		this.temppw = temppw;
	}
	
	public String getTempId() {
		return tempId;
	}
	public void setTempId(String tempId) {
		this.tempId = tempId;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getTemppw() {
		return temppw;
	}
	public void setTemppw(String temppw) {
		this.temppw = temppw;
	}
	@Override
	public void getCustom() {
		System.out.println("비회원고객님 감사합니다.");;
	}
	
	
	
	
}
