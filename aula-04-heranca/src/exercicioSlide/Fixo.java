package exercicioSlide;

public class Fixo extends Vendedor {
	private Double salarioBase;
	private Double salarioBruto;
	private Double comissao;

	public Fixo(String nome, String cpf, Double salarioBase, Double salarioBruto, Double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.salarioBruto = salarioBruto;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Fixo [salarioBase=" + salarioBase + ", salarioBruto=" + salarioBruto + ", comissao=" + comissao + "]";
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double valorVenda) {
		salarioBruto = salarioBase + (valorVenda * 0.12);
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public void calcularSalario(Double valorVenda) {
		salarioBruto = salarioBase + (valorVenda * 0.12);
	}

}
