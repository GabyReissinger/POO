package main;

import java.time.LocalDate;

import calcs.Calcs;
import entiny.Dependente;
import entiny.Funcionario;
import numerador.Parentesco;

public class TesteMain {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("João Silva", "123.456.789-00", LocalDate.of(1985, 10, 20), 5000.,
				"Gerente");
		funcionario.getDependentes()
				.add(new Dependente("Filho 1", "987.654.321-00", LocalDate.of(2010, 5, 15), Parentesco.FILHO));
		
		System.out.println(Calcs.calculoInss(funcionario));
		System.out.println(Calcs.calculoIR(funcionario));
		
		
		
		
		
		
		
		
		
		
		
		
		

//		Funcionario funcionario = new Funcionario("João Silva", "123.456.789-00", LocalDate.of(1985, 10, 20), 5000.00,
//				"Gerente");
//		funcionario.getDependentes()
//				.add(new Dependente("Filho 1", "987.654.321-00", LocalDate.of(2010, 5, 15), Parentesco.FILHO, null));
//
//		
//
//        System.out.println("Nome: " + funcionario.getNome() + "\n"
//                + "Cargo: " + funcionario.getCargo() + "\n"
//                + "Cpf: " + funcionario.getCpf() + "\n"
//                + "Salario Bruto: " + funcionario.getSalarioBruto() + "\n"
//                + "INSS: " + (funcionario) + "\n"
//                + "IR: " + Calcs.Ir(funcionario) + "\n"
//                + "Numero de dependentes: " + funcionario.getNumeroDependentes() + "\n"
//                + "Salario Liquido: " + Calcs.SalarioLiquido(funcionario) + "\n");
//		
//		
	}
}
