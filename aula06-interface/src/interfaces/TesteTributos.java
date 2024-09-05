package interfaces;

public class TesteTributos {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria", 98000.);
		Empresa e = new Empresa("ABC Ltda", 288500.);
		TotalTributos t = new TotalTributos();
		t.totalizarTributos(e);
		t.totalizarTributos(p);

		System.out.println("IR: " + p.getNome() + " - " + p.calcularIR());
		System.out.println("ICSM: " + p.getNome() + " - " + p.calcularICMS());

		System.out.println("IR: " + e.getRazaosocial() + " - " + e.calcularIR());
		System.out.println("ICMS: " + e.getRazaosocial() + " - " + e.calcularICMS());

		System.out.println("Total Geral: " + t.getTotalGeral());

	}
}
