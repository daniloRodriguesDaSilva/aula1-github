package application;

import java.util.Scanner;

import entities.Aluguel;

public class AplicacaoAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect  = new Aluguel[10];
		System.out.println("Quantos quartos ser�o alugados? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ",");
			System.out.println("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel(nome,email);
		}
		
			System.out.println();
			System.out.println("Quartos ocupados:");
			for (int i=0; i<10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				}
			}
			
		
		sc.close();

	}

}
