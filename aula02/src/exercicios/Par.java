package exercicios;


public class Par {

	public static void main(String[] args) {
		int contPar = 0;
		int contImpar = 0;
		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 0) {
				contPar += 1;
			} else {
				contImpar += 1;
			}
		}
		System.out.println("Total de números pares: " + contPar);
		System.out.println("Total de números impares: " + contImpar);
	}

}
