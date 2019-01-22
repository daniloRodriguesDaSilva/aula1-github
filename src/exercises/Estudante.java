package exercises;

public class Estudante {
	
	public String nome;
	double nota1;
	double nota2;
	double nota3;
	
	public double notaFinal() {
		return nota1+nota2+nota3;
		
	}
	
	public double faltaPontos() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		}
		else {
			return 0.0;
		}
	}

}
