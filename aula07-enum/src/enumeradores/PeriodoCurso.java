package enumeradores;

public enum PeriodoCurso {
	NOTURNO("Terça e Quarta", 2500., 40), INTEGARL("Segunda e Sexta", 1800., 20), TARDE("Quinta e Sexta", 3200., 80);

	private String dias;
	private Double valor;
	private Integer cargahoraria;

	private PeriodoCurso(String dias, Double valor, Integer cargahoraria) {
		this.dias = dias;
		this.valor = valor;
		this.cargahoraria = cargahoraria;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(Integer cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

}
