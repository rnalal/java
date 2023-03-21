package dao;

public class Product {
	public String name; 	//접근제한자 : public - 상품명
	String Pid;				//접근제한자 : default - 상품코드
	protected String style;	//protected - 종류
	private int account;		//private - 상품수량
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
		Pid = pid;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}		
}
//public class는 하나만 있어야 함, public class 이름 = 자바프로젝트 이름

//default 접근 제한 타입의 클래스

