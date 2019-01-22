package exercises;

public class ConversorDeMoeda {
	
	public static double IOF = 0.06;
	
	public static double dolarParaReal(double quantidade, double precoDoDolar) {
		return quantidade * precoDoDolar * (1.0 + IOF);
	}

}
