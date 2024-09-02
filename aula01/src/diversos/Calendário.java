package diversos;

public class Calendário {
	public static void main(String[] args) {
		int mes = 4;
		System.out.println((mes == 1 ? "Janeiro" : mes == 2 ? "Fevereiro" : mes == 3 ? "Março" : "Abril"));

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;

		case 2:
			System.out.println("Fevereiro");
			break;

		case 3:
			System.out.println("Março");
			break;

		case 4:
			System.out.println("Abril");
			break;

		default:
			System.out.println("Mês inválido");
			break;
		}
	}
}
