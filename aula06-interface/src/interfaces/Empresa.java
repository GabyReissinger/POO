package interfaces;

public class Empresa implements Tributos {
	private String razaosocial;
	private Double rendimentos;

	public Empresa(String razaosocial, Double rendimentos) {
		super();
		this.razaosocial = razaosocial;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "\nRazão Social: " + razaosocial + "\nRendimentos=" + rendimentos;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public Double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(Double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public double calcularIR() {
		return rendimentos * IRPESSOAJURIDICA;
	}

	@Override
	public Double calcularICMS() {
		return rendimentos * ICMS;
	}

}
