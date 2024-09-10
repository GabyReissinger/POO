package exercicio08;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
	Produto produto;
	LocalDate dataCompra;
	int quantidade;
	static double totalVenda;

	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
		calcularVenda();
	}

	@Override
	public String toString() {
		return "Venda: " + produto.getDescricao() + "\nData da Compra: " + dataCompra 
				+ "\nQuantidade: " + quantidade + "\nTotal: R$" + totalVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public static double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		this.totalVenda = produto.getValor() * quantidade;
	}

	public void mostrarVenda() {
		System.out.println("Produto: " + produto.getDescricao());
		System.out.println("Categoria: " + produto.getCategoria());
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Data da compra: " + dataCompra);
		System.out.println("Total da venda: R$ " + totalVenda);
	}
}
