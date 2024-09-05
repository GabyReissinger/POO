package revisao;

public class AuxProducao extends Auxiliar {

	public AuxProducao(String nome, Double salario, String turno, String tipo) {
		super(nome, salario, turno, tipo);
	}

	@Override
	public String toString() {
		return "\nAuxProducao: " + super.toString();
	}

	@Override
	public void reajusteSalarial() {

	}

}
