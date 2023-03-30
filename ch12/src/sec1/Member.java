package sec1;

//private타입이 아니면 굳이 getter,setter 할 필요없음
//private타입은 외부에서 직접접근을 못하게 하는 것이므로, getter와 setter로 접근해야하기 때문

public class Member {
	public String id;
	public String pw;
	
	public Member(){ }
	
	public Member(String id) {
		this.id = id;
	}

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public boolean equals(Object arg0) {	//override할때, boolean자리와 object arg0자리는 바꿀 수 없음.
		if(arg0 instanceof Member){
			return true;
		}
		return super.equals(arg0);
	}

	
}
