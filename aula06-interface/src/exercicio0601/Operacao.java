package exercicio0601;

public class Operacao implements Livraria {
	String tipo;
	double valorOperacao;
	Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Operação: " + tipo + "\nPreço: " + String.format("%.3f", valorOperacao);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public void emprestarLivro(Double emprestado) {
		valorOperacao = (livro.getValor() * 0.02) + Livraria.TAXAEMPRESTIMO;
	}

	@Override
	public void venderLivro(Double vendido) {
		valorOperacao = livro.getValor() * 1.09;
	}

}
