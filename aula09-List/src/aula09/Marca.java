package aula09;

public class Marca {
	private String nome;
	private Integer codigo;

	public Marca(Integer codigo, String nome) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "\nMarca: " + nome + "\nCódigo: " + codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
