package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		int quartos = sc.nextInt();
		double pProduto = sc.nextDouble();
		String sobrenome = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();

		System.out.println(name);
		System.out.println(quartos);
		System.out.println(pProduto);
		System.out.println(sobrenome);
		System.out.println(idade);
		System.out.println(altura);
		sc.close();
	}

}
