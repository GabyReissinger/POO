package exercicios;

public class Casting {
	public static void main(String[] args) {
		double a = 10.5;
		double b = 2;
		double soma = a + b;
		System.out.println("Soma: " + soma);

		double divisão = (double) (a + b) / 2;
		System.out.println(divisão);
	}

}
