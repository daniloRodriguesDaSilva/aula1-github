package exercises;

public class Retangulo {

	double altura;
	double largura;

	public double area() {
		return altura * largura;
	}

	public double perimetro() {
		return 2 * (altura + largura);
	}
	public double diagonal() {
		return Math.sqrt(altura*altura+largura*largura);
	}
	}
	