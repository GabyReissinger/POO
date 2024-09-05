package relacao;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gabriela", "gabriela@gmail.com");
		Pessoa p2 = new Pessoa("Adriana", "adriana@gmail.com");
		Imovel i1 = new Imovel("Casa", 188000., p2);
		Imovel i2 = new Imovel("Apartamento", 250000., p1);

		System.out.println(i1);
		System.out.println(i2);
	}

}
