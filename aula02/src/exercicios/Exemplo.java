package exercicios;

public class Exemplo {

	public static void main(String[] args) {
		int qntDiasMes = 31;
		
		if (qntDiasMes < 30) {
			System.out.println("Mês é Fevereiro");
		} else {
			System.out.println("Mês é diferente de Fevereiro");
		}
		
		String a = qntDiasMes < 30 ? "Mês é Fevereiro" : "Mês diferente de Fevereiro";
		System.out.println(a);
	}

}
