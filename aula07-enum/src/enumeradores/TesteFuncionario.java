package enumeradores;

import enumeradores.Funcionario.EstadoCivil;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Carla", EstadoCivil.CASADO);

		System.out.println(f.getNome());
		System.out.println(f.getEstadoCivil());

	}

}
