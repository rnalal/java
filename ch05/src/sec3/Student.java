package sec3;

public class Student {
	//name, kor, eng, mat : student의 속성(필드)
	//setter: 속성에 값을 저장하는 것
	//getter: 속성에 저장된 값을 가져오는 것
	
	String name;
	int kor;
	int eng;
	int mat;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}


}
