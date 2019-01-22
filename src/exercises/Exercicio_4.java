package exercises;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantide de números positivos que deseja: ");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.println("Número não positivo, digite novamente: ");
			n = sc.nextInt();
		}

		int superior = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.print("Valor #" + i + ": ");
			int x = sc.nextInt();
			if (x > superior) {
				superior = x;
			}

		}

		System.out.println("Superior = " + superior);
		sc.close();
	}

}
