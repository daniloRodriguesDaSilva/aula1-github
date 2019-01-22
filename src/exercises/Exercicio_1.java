package exercises;

import java.util.Locale;

public class Exercicio_1 {

	public static void main(String[] args) {

		String produto1;
		String produto2;
		byte idade;
		int codigo;
		char genero;
		double preco1;
		double preco2;
		double medida;

		produto1 = "Computador";
		produto2 = "Mesa de escritório";
		idade = 30;
		codigo = 5290;
		genero = 'F';
		preco1 = 2100.0;
		preco2 = 650.50;
		medida = 53.234567;

		System.out.println("Produtos: ");
		System.out.printf("%s, cujo preço é de US $ = %.2f%n", produto1, preco1);
		System.out.printf("%s, que custa US $ = %.2f%n", produto2, preco2);
		System.out.printf("Registro: %d anos, codigo %d e sexo: %c%n", idade, codigo, genero);
		System.out.printf("Mede até oito casas decimais: %.8f%n", medida);
		System.out.printf("Arrendondado: %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA: %.3f%n", medida);

	}
}
