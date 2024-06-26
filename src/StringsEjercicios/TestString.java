package StringsEjercicios;

public class TestString {

	public static void main(String[] args) {
		String str = "My awesome String";
		
		System.out.println("Length: " +str.length());
		System.out.println("Contains: " +str.contains("aw"));
		System.out.println("Substring sólo begin: " +str.substring(11));
		System.out.println("Substring beginn y end:" +str.substring(10,13));
		System.out.println("CharAt:" +str.charAt(str.length()-1));
	}

}
