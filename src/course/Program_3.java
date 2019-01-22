package course;

import java.util.Locale;

public class Program_3 {
	public static void main(String[] args) {

		int idade;
		double peso;
		String nome;

		idade = 21;
		peso = 69.41818;
		nome = "Danilo";

		System.out.println(idade);
		System.out.println((int) peso);
		System.out.println(peso);
		System.out.printf("%.2f%n", peso);
		System.out.printf("%.4f%n", peso);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", peso);
		System.out.printf("%s tem %d anos.", nome, idade);
	}
}
