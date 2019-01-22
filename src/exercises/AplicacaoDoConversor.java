package exercises;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoDoConversor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preco do dolar ?");
		double precoDoDolar = sc.nextDouble();
		System.out.println("Qual a quantidade de dolares que serao comprados?");
		double quantidade = sc.nextDouble();
		double resultado = ConversorDeMoeda.dolarParaReal(quantidade, precoDoDolar);
		System.out.printf("Valor a ser pagaos em reais = %.2f%n", resultado);
		
		sc.close();

	}

}
