package resumao;

public class MainSistema {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Imovel imovel = new Imovel("25680-090", 250000.98);
		System.out.println(imovel.getLocal() + imovel.calculaImpostoVenda());
		Proprietario proprietario = new Proprietario("Gabriela", imovel);
		System.out.println(proprietario.getNome() + proprietario.getImovel().getLocal());

	}

}
