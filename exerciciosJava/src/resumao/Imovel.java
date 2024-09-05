package resumao;

public class Imovel {
	protected String local;
	private Double valorImovel;

	public Imovel(String local, Double valorImovel) {
		super();
		this.local = local;
		this.valorImovel = valorImovel;
	}

	@Override
	public String toString() {
		return "\nImovel: " + local + "\nValor do Imovel: " + valorImovel;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(Double valorImovel) {
		this.valorImovel = valorImovel;
	}

	public Double calculaImpostoVenda() {
		return valorImovel * 1.275;
	}

}
