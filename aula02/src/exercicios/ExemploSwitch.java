package exercicios;

public class ExemploSwitch {

	public static void main(String[] args) {
		int avaliaçao = 0;

		int avaliacao = 0;
		switch (avaliacao) {
		case 5:
			System.out.println("Exelente :D");
			break;
		case 4:
			System.out.println("Bom :)");
			break;
		case 3:
			System.out.println("Regular :|");
			break;
		case 2:
			System.out.println("Ruim :(");
			break;
		case 1:
			System.out.println("Péssimo :C");
			break;
		default:
			System.out.println("Sem resposta :/");
			break;
		}

	}

}
