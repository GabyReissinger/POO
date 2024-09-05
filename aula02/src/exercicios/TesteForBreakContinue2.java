package exercicios;

public class TesteForBreakContinue2 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (i >= 5 && i <= 6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
