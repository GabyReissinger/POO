package aula14;

import java.io.Serializable;
import java.util.Objects;

public class Fornecedor implements Serializable {
	/**
	 * @author Gabriela Reissinger
	 * @since Classe criada em setembro de 2024
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * o cnpj é o identificador de uma empresa
	 */
	private String cnpj;
	private String nome;

	/**
	 * @author Admin
	 * @param valor
	 * @return o valor pago
	 * @throws IllegalArgumentException caso tenha um valor invalido
	 */
	public double pagamentoFornecedor(Double valor) throws IllegalArgumentException {
		return 0.0;
	}

	public Fornecedor(String cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "cnpj: " + cnpj + "\nnome: " + nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(nome, other.nome);
	}

}
