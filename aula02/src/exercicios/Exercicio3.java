package exercicios;

public class Exercicio3 {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = 10;

		if ((a > 5) && (c > b)) {
			System.out.println("&& - Somente primeira expressão avaliativa");
		}
		if ((b == 5) || (c == 0)) {
			System.out.println("|| - Somente primeira expressão avaliada");
		}
		if ((a > 5) & (c > b)) {
			System.out.println("& - As duas expressões são avaliadas");
		}
		if ((b == 5) | (c == 0)) {
			System.out.println("| - As duas expressões são avaliadas");
		}
	}

}
