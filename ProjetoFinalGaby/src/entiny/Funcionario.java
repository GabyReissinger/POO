package entiny;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
	private Double salarioBruto;
	private String cargo;
	private List<Dependente> dependentes;

	public Funcionario(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto, String cargo) {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = salarioBruto;
		this.cargo = cargo;
		this.dependentes = new ArrayList<>();
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public int getNumeroDependentes() {
		return dependentes.size();
	}
}