package diversos;

public class Semana {
	public static void main(String[] args) {
		String dia = "Domingo";
		String resultado = switch (dia) {
		case "Domingo" -> "Final de Semana :)";
		case "Sábado" -> "Final de Semana :)";
		case "Segunda" -> "Dia util :(";
		case "Terça" -> "Dia util :(";
		case "Quarta" -> "Dia util :(";
		case "Quinta" -> "Dia util :(";
		case "Sexta" -> "Dia util :(";
		defalt -> "Dia inválido ._.";
		};
		System.out.println("Resultado: " + resultado);
	}
}
