package sec5;

public class SingletonEx1 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		//그러나 s1 = s2
		System.out.println(s1==s2);

	}

}
