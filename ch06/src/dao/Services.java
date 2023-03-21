package dao;

public class Services extends Product {	//Product 클래스로 부터 상속
	public String sid = super.Pid;
	public String stage = super.style;
	public String getSid() {
		return sid;
	}
	public void setSid() {
		this.sid = super.Pid;
	}
	public String getStage() {
		return stage;
	}
	public void setStage() {
		this.stage = super.style;
	}
	//접근제한이 protected인 style 멤버 필드는 부모 클래스(super class)에 있는 속성이므로 접근이 가능함
	//super 객체러 접근이 가능함

}
