package exercicios;

public class ExemploArrow {

	public static void main(String[] args) {
		String day = "Domingo";
		String result = switch (day) {
		case "Segunda" -> "Dia de Semana";
		case "Terça" -> "Dia de Semana";
		case "Quarta" -> "Dia de Semana";
		case "Quinta" -> "Dia de Semana";
		case "Sexta" -> "Dia de Senama";
		case "Sábado", "Domingo" -> "Fim de Semana";
		default -> "Não é um dia valido";
		};
		System.out.println(result);
	}

}
