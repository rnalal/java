package sec2;

public class BoardEx1 {
	public static void main(String[] args) {
		Board b1 = new Board();
		b1.setBno(1);
		b1.setTitle("김기태는 천사");
		b1.setContent("김기태는 계속한다.~!");
		System.out.println(b1.getBno());
		System.out.println(b1.getTitle());
		System.out.println(b1.getContent());		
	}
}
