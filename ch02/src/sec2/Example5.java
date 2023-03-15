package sec2;

public class Example5 {

	public static void main(String[] args) {
		String a = "true";
		String b = "flase";
		String c = "3.14";
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(Boolean.parseBoolean(a));
		//System.out.println(Byte.parseByte(a));
		//System.out.println(Short.parseShort(a));
		//System.out.println(Integer.parseInt(a));
		//System.out.println(Long.parseLong(a));
		System.out.println(Float.parseFloat(c));
		System.out.println(Double.parseDouble(c));
	}

}
