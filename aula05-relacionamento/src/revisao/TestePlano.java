package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Amil", "Check-up", "123456");
		Medico m = new Medico("Unimed", "José", "456");
		Anestesista a = new Anestesista("Amil", "Carlos", "123", "Geral");
		ControlePgmt cp = new ControlePgmt ();

		c.calcularPagamento();
		cp.calcularTotal(c);
		m.calcularPagamento();
		cp.calcularTotal(m);
		a.calcularPagamento();
		cp.calcularTotal(a);

		System.out.println("---------- Clínica ----------\n" + c);
		System.out.println("\n---------- Médico ----------\n" + m);
		System.out.println("\n---------- Anestesista ----------\n" + a);

		System.out.println("\n---------- Total ----------\n\nValor total pago: "
				+ (c.getValorPago() + m.getValorPago() + a.getValorPago()));

	}

}
