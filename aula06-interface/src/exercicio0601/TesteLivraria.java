package exercicio0601;

public class TesteLivraria {

	public static void main(String[] args) {
		Livro l1 = new Livro("Colleen Hoover", "É assim que acaba", 85.);
		Livro l2 = new Livro("John Green", "Quem é você, Alasca?", 98.);
		Operacao op1 = new Operacao("Venda", l1);
		Operacao op2 = new Operacao("Empréstimo", l2);
		
		l1.Reajuste(l1.getValor());
		op1.venderLivro(l1.getValor());
		op2.emprestarLivro(l2.getValor());
		

		System.out.println(l1);
		System.out.println(op1);
		System.out.println(l2);
		System.out.println(op2);
	}

}
