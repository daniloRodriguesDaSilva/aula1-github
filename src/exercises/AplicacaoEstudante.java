package exercises;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoEstudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante est = new Estudante();
		
		est.nome = sc.nextLine();
		est.nota1 = sc.nextDouble();
		est.nota2 = sc.nextDouble();
		est.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", est.notaFinal());
		
		if (est.notaFinal() < 60.0) {
			System.out.println("FALHOU");
			System.out.printf("Falta %.2 pontos%n", est.faltaPontos());
		}
		else {
			System.out.println("Passou!");
		}
		sc.close();

	}

}
