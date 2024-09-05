package relacao;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList();

	public Contato(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Contato: " + nome + telefones + endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefone() {
		return telefones;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefones = telefone;
	}

	public void adicionarTelefone(List<Telefone> tels ) {
		telefones.addAll(tels);
	}

	public void listarTelefone() {
		for (Telefone v : telefones) {
			System.out.println(v.getNumero());

		}

	}

}
