package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nº para gerar a tabuada: ");
		int numero = scanner.nextInt();
		System.out.println("\n---------- Resultado ----------\n" + numero);
		int resultado = 0;
		for (int i = 0; i <=10 ; i++) {
			resultado = numero * i;
			System.out.println(numero + "x" + i + "=" + resultado);
		}
		scanner.close();
	}

}
