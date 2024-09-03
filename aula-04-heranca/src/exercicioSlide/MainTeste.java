package exercicioSlide;

import java.util.Scanner;

public class MainTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Fixo v1 = new Fixo("Joana","1234",2150.,0.,0.0);
		Fixo v2 = new Fixo("Maria","123456",2000.,0.0,0.);
		Double valorVenda;
		Double totalVendas = 0.;
		String encerrar;
		int opcao;
		
		do {
			System.out.println("Vendedores: \n1- Joana \n2- Maria \nEscolha o vendedor: ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o valor da venda: ");
				valorVenda = scan.nextDouble();
				totalVendas += valorVenda;
				v1.calcularSalario(valorVenda);
				break;
			case 2:
				System.out.println("Digite o valor da venda: ");
				valorVenda = scan.nextDouble();
				totalVendas += valorVenda;
				v2.calcularSalario(valorVenda);
				break;
			}
			System.out.println("Deseja encerrar o programa? (S/N) ");
			encerrar = scan.next();
			
		 }while("N".equals(encerrar));
		
		scan.close();
		System.out.println("-------Salário dos Vendedores:--------");
		System.out.println("Nome: Joana\nSalário Bruto: "+ v1.getSalarioBruto());
		System.out.println("Nome: Maria\nSalário Bruto: "+ v2.getSalarioBruto());
		System.out.println("------------Total Vendido:------------");
		System.out.println("Total: "+totalVendas);
	}
		
}