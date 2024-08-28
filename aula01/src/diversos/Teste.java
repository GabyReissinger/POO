package diversos;

import javax.swing.JOptionPane;

public class Teste {
	 public static void main(String[] args) {
		 final int valor = 1000;
		 //'final' - constante e 'int' - inteiro
		 double calculo = 0;
		 //'double' ou 'float' - real 
		 boolean achei = false;
		 //'boolean' - mostra se é verdadeiro ou falso
		 char estadoCivil = 'S';
		 //'char' ou 'string' - cadeia
		String nome = "Gabriela";
		System.out.println ("Hello World!");
		System.out.println("Java! " + nome);
		JOptionPane.showMessageDialog(null, "Hello World!");
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null, nome);
	}
}
