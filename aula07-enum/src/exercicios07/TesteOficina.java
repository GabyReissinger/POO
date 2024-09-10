package exercicios07;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Gabriela Reissinger");
		Carro carro = new Carro("Civic", LocalDate.of(2024, 9, 7), proprietario, "Sedan");

		carro.trocaOleo();
		carro.revisao();

		System.out.println("Proprietário: " + proprietario.getNome());
		System.out.println("Carro: " + carro.getCategoria());
		System.out.println("Valor total cobrado: " + carro.getValorCobrado());
	}

}
