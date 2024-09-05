package revisao;

public class PlanoSaude {
	protected String nome;
	protected Double valorPago = 100.;
	protected Double valorIss = 5.;

	public PlanoSaude(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nPlano de Saúde: " + nome + "\nValor Pago: " + String.format("%.2f", valorPago);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public Double getValorIss() {
		return valorIss;
	}

	public void setValorIss(Double valorIss) {
		this.valorIss = valorIss;
	}

	public Double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorIss / 100;
	}
}
