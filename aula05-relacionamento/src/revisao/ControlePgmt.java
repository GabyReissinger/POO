package revisao;

public class ControlePgmt {
	private Double totalPago = 0.0;

	public Double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}

	public void calcularTotal(PlanoSaude ps) {
		totalPago = totalPago + ps.getValorPago();
	}

}
