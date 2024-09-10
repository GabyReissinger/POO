package exercicios07;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double trocaOleo() {
		double desconto = 0;
		if (java.time.LocalDate.now().getDayOfWeek() == java.time.DayOfWeek.SATURDAY) {
			desconto = 50;
		}
		return valorCobrado += TipoServico.OLEO.getValorPorServico() - desconto;
	}

	@Override
	public double revisao() {
		double desconto = 0;
		if (java.time.LocalDate.now().getMonth() == java.time.Month.AUGUST) {
			desconto = TipoServico.REVISAO.getValorPorServico() * 0.10;
		}
		return valorCobrado += TipoServico.REVISAO.getValorPorServico() - desconto;
	}

}
