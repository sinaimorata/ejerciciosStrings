package StringsEjercicios;

public class TemperaturaChirrido {

	public static void main(String[] args) {
		
	System.out.println(saberTemperatura(450));	
	
	}
	public static double saberTemperatura (double frecuencia) {
		double temperatura = 10+frecuencia-407;
		return temperatura;	
	}
	
}
