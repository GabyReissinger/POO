package exercicio0601;

public class Livro {
	String autor;
	String titulo;
	double valor;

	public Livro(String autor, String titulo, double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "\nLivro: " + titulo + "\nAutor: " + autor;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValor() {
		return valor;
	}

	public void Reajuste(double valor) {
		this.valor = valor * 1.06;
	}

}
