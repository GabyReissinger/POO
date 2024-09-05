package revisao;

import java.time.LocalDate;

public class Cavalo extends Mamifefo implements AnimalCompeticao {
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	@Override
	public void trocarFerradura() {

	}

	@Override
	public void viajar() {

	}

	@Override
	public void amamentar() {

	}

	@Override
	public String emitirSom() {
		return null;
	}

}
