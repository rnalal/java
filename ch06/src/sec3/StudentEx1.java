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
		
		Student st1 = new Student("재영");
		st1.setAge(25);
		st1.setPg(90);
		st1.setDb(90);	
		st1.setUi(90);
		
		Student st2 = new Student("재영", 25);
		st2.setPg(90);
		st2.setDb(90);
		st2.setUi(90);
		
		Student st3 = new Student("재영", 25, 90);
		st2.setDb(90);
		st2.setUi(90);
		
		Student st4 = new Student("재영", 25, 90, 90);
		st2.setUi(90);
		
		Student st5 = new Student("재영", 25, 90, 90, 100);
		
	}

}
