package exercicio0602;

public class Pais {
	String nomePais;

	public Pais(String nomePais) {
		super();
		this.nomePais = nomePais;
	}

	@Override
	public String toString() {
		return "Pais: " + nomePais;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

}
