package exercicios;

public class Multiplo2 {

	public static void main(String[] args) {
		int total = 0;
		for (int contador = 1; contador <= 22; contador++) {
			int resto = contador % 2;
			if (resto == 0) {
				System.out.println("Java");
				total += 1;
			}
		}
		System.out.println("Total: " + total);
	}

}
