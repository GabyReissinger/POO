package exercicios;

import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] nomes = new String[4];
		double[] pesos = new double[4];
		double[] alturas = new double[4];

		String nomeMaiorPeso = "";
		double maiorPeso = Double.MIN_VALUE;
		String nomeMaiorAltura = "";
		double maiorAltura = Double.MIN_VALUE;
		double somaPesos = 0;
		double somaAlturas = 0;

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
			nomes[i] = scanner.nextLine();

			System.out.print("Digite o peso da pessoa " + (i + 1) + " (em kg): ");
			pesos[i] = scanner.nextDouble();

			System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
			alturas[i] = scanner.nextDouble();

			scanner.nextLine();

			somaPesos += pesos[i];
			somaAlturas += alturas[i];

			if (pesos[i] > maiorPeso) {
				maiorPeso = pesos[i];
				nomeMaiorPeso = nomes[i];
			}

			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
				nomeMaiorAltura = nomes[i];
			}
		}

		double mediaPeso = somaPesos / 4;
		double mediaAltura = somaAlturas / 4;

		System.out.println("\nNome da pessoa com maior peso: " + nomeMaiorPeso);
		System.out.println("Nome da pessoa com maior altura: " + nomeMaiorAltura);
		System.out.println("Média de peso: " + mediaPeso + " kg");
		System.out.println("Média de altura: " + mediaAltura + " metros");

		scanner.close();
	}

}
