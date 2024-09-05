package exercicio0602;

public class Atleta implements Olimpiadas {
	String nomeAtleta;
	double peso;
	String modalidade;
	int totalParticipantes;
	private Pais nomePais;

	public Atleta(String nomeAtleta, double peso, Pais nomePais) {
		this.nomeAtleta = nomeAtleta;
		this.peso = peso;
		this.nomePais = nomePais;
	}

	@Override
	public String toString() {
		return "\nAtleta: " + nomeAtleta + "\nPeso: " + peso + "\nModalidade: " + modalidade;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public void setTotalParticipantes(int totalParticipantes) {
		this.totalParticipantes = totalParticipantes;
	}

	@Override
	public String verificarSituacao() {
		if (peso >= 90) {
			setModalidade("Peso Pesado");
			totalParticipantes++;
			return " poderá participar da categoria Peso Pesado! :)";
		} else if (peso >= 60 && peso < 90) {
			setModalidade("Peso Médio");
			totalParticipantes++;
			return " poderá participar da categoria Peso Médio! :)";
		} else {
			return " não poderá participar de nenhuma categoria! :(";
		}
	}

	public String totalParticipantes() {
		String m = "\nTotal de Participantes: " + this.totalParticipantes;
		return m;
	}

}
