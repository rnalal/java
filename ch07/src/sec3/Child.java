package sec3;

public final class Child extends Parent{		//final 클래스 = 상속할 수 없는 클래스
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void getPrint() {
		System.out.println("자식1");
	}
	/* 부모 클래스에서 final로 선언했기 때문에 오버라이딩 불가
	 
	 @Override
	public final void output() {
		System.out.println("부모2");
	}
	  
	 */	
}
