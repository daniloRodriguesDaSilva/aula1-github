package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.printf("O maior é = " + a);
		} else if (b > c) {
			System.out.printf("O maior é = " + b);
		} else {
			System.out.printf("O maior é = " + c);

			sc.close();

		}
	}
}