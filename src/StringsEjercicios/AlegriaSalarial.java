package StringsEjercicios;

public class AlegriaSalarial {

	public static void main(String[] args) {
		
		System.out.println(incrementoSalario(900,1001,1.08));
	}
	public static double  incrementoSalario (double salario,double cantidad, double porcentajeIncremento) {
		if (salario <= cantidad) {
			salario = salario*porcentajeIncremento;
			return salario;
		}else {
			return salario;
		}
	}
	
}
