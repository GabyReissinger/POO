package exercicio09;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("ID do cliente: ");
			int id = sc.nextInt();

			if (id < 0) {
				;
				break;
			}
			sc.nextLine();
			System.out.println("Cliente: ");
			String nome = sc.nextLine();

			System.out.println("Idade: ");
			int idade = sc.nextInt();

			sc.nextLine();
			System.out.println("Telefone: ");
			int telefone = sc.nextInt();

			Cliente cliente = new Cliente(id, nome, idade, telefone);
			clientes.add(cliente);
		}
		System.out.println("\n----- Lista de Clientes -----");
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		sc.close();
	}
}
