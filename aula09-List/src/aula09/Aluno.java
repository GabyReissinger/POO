package aula09;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;

	public Aluno(String nome, double nota1, double nota2) throws AlunoException {
		this.nome = nome;
		setNota1(nota1);
		setNota2(nota2);
	}

	public String getNome() {
		return nome;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota1(double nota1) throws AlunoException {
		if (nota1 < 0 || nota1 > 10) {
			throw new AlunoException("Nota 1 inválida! :(\n");
		}
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) throws AlunoException {
		if (nota2 < 0 || nota2 > 10) {
			throw new AlunoException("Nota 2 inválida! :(\n");
		}
		this.nota2 = nota2;
	}

	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}

}