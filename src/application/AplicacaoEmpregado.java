package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class AplicacaoEmpregado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		System.out.println("Quantos funcionários serão registrados?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new Empregado(id, nome, salario));
		}

		System.out.println();
		System.out.print("\"Digite o id do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();
		Empregado emp = (Empregado) list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("ID inexistente");
		}

		else {
			System.out.println("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.aumentarSalario(porcentagem);
		}

		System.out.println();
		System.out.println("Lista dos funcionarios: ");
		for (Empregado obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}
