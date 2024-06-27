package StringsEjercicios;

public class PrimaveraCorteIngles {

	public static void main(String[] args) {
		System.out.println(descuento(1600));
		System.out.println(descuento(1000));
	}
	public static double descuento (double compra) {
		if (compra >= 1400) {
			compra= compra*0.15;
			return compra;
		}else {
			return compra;
		}
	}
}
