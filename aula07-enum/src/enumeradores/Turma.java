package enumeradores;

public class Turma {
	private Integer numero;
	private PeriodoCurso periodocurso;

	public Turma(Integer numero, PeriodoCurso periodocurso) {
		this.numero = numero;
		this.periodocurso = periodocurso;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {   
		this.numero = numero;
	}

	public PeriodoCurso getPeriodocurso() {
		return periodocurso;
	}

	public void setPeriodocurso(PeriodoCurso periodocurso) {
		this.periodocurso = periodocurso;
	}

}
