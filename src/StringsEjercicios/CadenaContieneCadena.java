package StringsEjercicios;

public class CadenaContieneCadena {
//METODOS DE LAS CADENAS YA DADOS POR JAVA
	public static void main(String[] args) {
		System.out.println(bcontenidoA("mundo", "hola mundo"));
		System.out.println(aFinalizaConb("mundos", "hola mundo"));
		System.out.println(aEmpiezaConb("holas", "hola mundo"));
	}
	public static boolean bcontenidoA (String b, String a) {
		if (a.contains(b)) {
			
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean aFinalizaConb (String b, String a) {
		if (b.endsWith(a)) {
			
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean aEmpiezaConb (String b, String a) {
		if (a.startsWith(b)) {
			
			return true;
		}
		else {
			return false;
		}
	}
}
