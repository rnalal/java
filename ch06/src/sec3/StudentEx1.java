package sec3;

public class StudentEx1 {

	public static void main(String[] args) {
		Student st0 = new Student();
		st0.setName("전재영");
		st0.setAge(8);
		st0.setPg(100);
		st0.setDb(90);
		st0.setUi(100);
		st0.setTot(); 	//총점 계산
		st0.setAvg(); 	//평균 계산
		System.out.println("이름: "+st0.getName());
		System.out.println("총점: "+st0.getTot());
		System.out.println("평균: "+st0.getAvg());
		System.out.println("학점: "+st0.getHak());
		
		Student st1 = new Student("도도");
		st1.setAge(25);
		st1.setPg(90);
		st1.setDb(90);	
		st1.setUi(90);
		st1.setTot(); 	//총점 계산
		st1.setAvg(); 	//평균계산
		System.out.println("이름:"+st1.getName());
		System.out.println("총점:"+st1.getTot());
		System.out.println("평균:"+st1.getAvg());
		System.out.println("학점:"+st1.getHak());
		
		Student st2 = new Student("레레", 25);
		st2.setPg(90);
		st2.setDb(90);
		st2.setUi(90);
		st2.setTot(); 	//총점 계산
		st2.setAvg();	//평균 계산
		System.out.println("이름:"+st2.getName());
		System.out.println("총점:"+st2.getTot());
		System.out.println("평균:"+st2.getAvg());
		System.out.println("학점:"+st2.getHak());

		
		Student st3 = new Student("미미", 25, 90);
		st3.setDb(90);
		st3.setUi(90);
		st3.setTot(); 	//총점 계산
		st3.setAvg();	//평균 계산
		System.out.println("이름:"+st3.getName());
		System.out.println("총점:"+st3.getTot());
		System.out.println("평균:"+st3.getAvg());
		System.out.println("학점:"+st3.getHak());
		
		Student st4 = new Student("파파", 25, 90, 90);
		st4.setUi(90);
		st4.setTot(); 	//총점 계산
		st4.setAvg();	//평균 계산
		System.out.println("이름:"+st4.getName());
		System.out.println("총점:"+st4.getTot());
		System.out.println("평균:"+st4.getAvg());
		System.out.println("학점:"+st4.getHak());
		
		Student st5 = new Student("솔솔", 25, 90, 90, 100);
		st5.setTot(); 	//총점 계산
		st5.setAvg();	//평균 계산
		System.out.println("이름:"+st5.getName());
		System.out.println("총점:"+st5.getTot());
		System.out.println("평균:"+st5.getAvg());
		System.out.println("학점:"+st5.getHak());
		
	}

}
