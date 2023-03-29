package sec1;
//ClassCastException (형변환) : 바꿀 수 없는 형변환을 할 경우 발생하는 예외
public class ExceptionEx4 {
	static class Animal { }
	static class Dog extends Animal { }
	static class Cat extends Animal { }
	public static void main(String[] args) {
		try {
		Dog dog = new Dog();
		changDog(dog);
		} catch(ClassCastException e){
			e.printStackTrace();
		}
		
		try {
		Cat cat = new Cat();
		changDog(cat);
		} catch(ClassCastException e){
			e.printStackTrace();
		}
	}
	//캐스팅(형변환) 함수
	public static void changDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
}
