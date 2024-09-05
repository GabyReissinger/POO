package resumao;

public class Apto extends Imovel {
	private int andar;

	public Apto(String local, Double valorImovel, int andar) {
		super(local, valorImovel);
		this.andar = andar;
	}

	@Override
	public String toString() {
		return "\nApartamento: " + andar;
	}

	public int getAndar() {
		return andar;
	}

}
