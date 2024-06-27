package StringsEjercicios;
/*
Tienes que clasificar los exámenes de un montón de alumnos. Dichos exámenes tienen una nota numérica del 0 al 10. El mínimo para aprobar está en un 7.

Crea una función passes_test que recibe una nota numérica y devuelve True si es igual o superior a 7 y Falseen caso contrario.

*/

public class TestIfElse {

	public static void main(String[] args) {
		
		System.out.println(clasificarNotas(0));
	}
	public static boolean clasificarNotas(double notaMedia) {
		if (notaMedia >=7){
			//return "felicidades, has aprobado el curso";
			return true;
		}else {
			//return "tienes que estudiar este verano";
			return false;
		}
		
	}
}
