package exercicio0602;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("EUA");
		Atleta a1 = new Atleta("Anderson Silva", 98., p1);
		Atleta a2 = new Atleta("Jon Jone", 59., p2);
		Atleta a3 = new Atleta("Vitor Belfort", 110., p1);

		System.out.println("O atleta " + a1.getNomeAtleta() + a1.verificarSituacao());
		System.out.println("O atleta " + a2.getNomeAtleta() + a2.verificarSituacao());
		System.out.println("O atleta " + a3.getNomeAtleta() + a3.verificarSituacao());
		int n1 = (a1.getTotalParticipantes() + a2.getTotalParticipantes() + a3.getTotalParticipantes());
		System.out.println("\nTotal de Participantes: " + n1);
	}

}
