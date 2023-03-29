package sec2;
//User+Guest=Mix
//다만, 사람들 처럼 겹사돈이 되면, 족보가 꼬이는 것 처럼, 클래스 들의 관계가 쓸 데없이 혼잡해질 수 있으므로
//자바는 다중 상속을 가급적 사용하지 않는다.
public interface Mix extends User, Guest {
	public void method5();
	public void method6();
}