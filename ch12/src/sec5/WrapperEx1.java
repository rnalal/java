package sec5;
//References : Wrapper(Integer, Float, Double, Long, Byte..)
//Wrapper은 References에 포함됨
//대문자로 시작하는 건 모두 References
//소문자로 시작하는 건 기본형
//래퍼형은 기본형이 아니고, 참조형!

public class WrapperEx1 {
	public static void main(String[] args) {
		//Boxing(Wrapping) : 기본형을 래퍼형으로 바꿀 경우
		int a = 1004;	//기본형
		Integer b = a;	//래퍼형
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		float f1 = 3.14f;	//기본형
		Float f2 = f1;		//래퍼형
		
		//Unboxing : 래퍼형을 기본형으로 바꿀 경우
		int c = b;
		float f3 = f2;
		Integer d = 1004;
		
		System.out.println("비교: "+(a==b));	//기본형 값 비교
		System.out.println("비교: "+(b==d));	//래퍼형 주소 비교
		System.out.println("비교: "+(b.equals(d)));	//래퍼형 값 비교
	}
}
