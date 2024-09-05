package revisao;

import java.time.LocalDate;

public class Cachorro extends Mamifefo implements AnimalDomestico {
	private boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	@Override
	public boolean levarVeterinario() {
		return false;
	}

	@Override
	public boolean alimentar() {
		return false;
	}

	@Override
	public void amamentar() {

	}

	@Override
	public String emitirSom() {
		return null;
	}

}
