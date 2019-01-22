package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class AplicacaoConta {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o numero da Conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Voce vai depositar algum valor inicial(y/n)? ");
		char responde = sc.next().charAt(0);
		if (responde == 'y') {
		System.out.print("Digite o valor inicial: ");
		double depositoInicial = sc.nextDouble();
		conta = new Conta(numero, titular, depositoInicial);
	
		}
		
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor do deposito: ");
		double depositoInicial = sc.nextDouble();
		conta.deposito(depositoInicial);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Insira um valor de retirada: ");
		double retirarValor = sc.nextDouble();
		conta.retirarValor(retirarValor);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		
		
		sc.close();

	}

}
