package exercicios;

public class ExArrow {

	public static void main(String[] args) {
		String time = "Flamengo";
		String resultado = switch (time) {
		case "Flamengo", "Vasco", "Botafogo", "Fluminese" -> "Rio de Janeiro";
		case "Cruzeiro", "Atletico" -> "Mina Gerais";
		default -> "Outro Estado";
		};
		System.out.println(resultado);
	}

}
