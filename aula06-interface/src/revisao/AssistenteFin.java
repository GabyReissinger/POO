package revisao;

public class AssistenteFin extends Assistente {
	private String cursos;

	public AssistenteFin(String nome, Double salario, String turno, String nivel, String cursos) {
		super(nome, salario, turno, nivel);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "\nCusro do Assistente: " + cursos + super.toString();
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

}
