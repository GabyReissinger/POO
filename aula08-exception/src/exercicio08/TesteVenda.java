package exercicio08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteVenda {

	public static void main(String[] args) {
		Produto produto1 = new Produto(1, "TV", 3000., Categoria.ELETRONICO);
		Produto produto2 = new Produto(2, "Pneu", 800., Categoria.AUTOMOTIVO);
		Produto produto3 = new Produto(3, "Celular", 2500., Categoria.ELETRONICO);

		List<Venda> vendas = new ArrayList<>();

		Venda venda1 = new Venda(produto1, LocalDate.now(), 1);
		Venda venda2 = new Venda(produto2, LocalDate.now(), 1);
		Venda venda3 = new Venda(produto3, LocalDate.now(), 1);

		vendas.add(venda1);
		vendas.add(venda2);
		vendas.add(venda3);

		System.out.println("Resumo das Vendas:");
		for (Venda venda : vendas) {
			venda.mostrarVenda();
			System.out.println("-------------------");
		}
	}
}
