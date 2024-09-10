package enumeradores;

public class TesteTurma {

	public static void main(String[] args) {
		Turma t = new Turma(123, PeriodoCurso.INTEGARL);
		
		System.out.println("Curso: " + t.getNumero());
		System.out.println("Dias: " + t.getPeriodocurso().getDias());
		System.out.println("Carga Horária: " + t.getPeriodocurso().getCargahoraria());
		System.out.println("Valor do Curso: " + t.getPeriodocurso().getValor());
	}

}
