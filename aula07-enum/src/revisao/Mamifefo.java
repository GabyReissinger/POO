package revisao;

import java.time.LocalDate;

public abstract class Mamifefo extends Animal {
	protected String raca;
	

	public Mamifefo(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}
	public abstract void amamentar();
}


