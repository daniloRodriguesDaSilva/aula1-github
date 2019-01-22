package exercises;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoEmpregado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + emp);
		System.out.println();
		System.out.print("Qual a porcentagem que vai acrescentar no salario? ");
		double porcentagem = sc.nextDouble();
		emp.novoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Atualizar dados: " + emp);
		sc.close();

	}

}
