package exercicio09;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();

		try {
			Aluno aluno1 = new Aluno("Juan", 8.5, 9.);
			alunos.add(aluno1);
			Aluno aluno2 = new Aluno("Gabriela", 10., 7.5);
			alunos.add(aluno2);
			Aluno aluno3 = new Aluno("Rhayssa", 10., 8.);
			alunos.add(aluno3);
			Aluno aluno4 = new Aluno("João", 6., 7.5);
			alunos.add(aluno4);
			Aluno aluno5 = new Aluno("Ana Luiza", 11., 7.5);
			alunos.add(aluno5);


		} catch (AlunoException e) {
			System.out.println("Erro 404: " + e.getMessage());
		}

		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Média: " + aluno.calcularMedia());
			System.out.println("-----------------------");
		}
	}

}
