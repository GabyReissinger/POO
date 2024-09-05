package exercicios;

import javax.swing.JOptionPane;

public class InformacoesPessoais {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
		String email = JOptionPane.showInputDialog("Digite seu e-mail:");

		String salarioStr = JOptionPane.showInputDialog("Digite seu salário:");
		double salario = Double.parseDouble(salarioStr);

		double salarioComAcrescimo = salario * 1.10;

		String mensagem = "Nome: " + nome + "\n" + "Telefone: " + telefone + "\n" + "E-mail: " + email + "\n"
				+ "Salário com acréscimo de 10%: " + String.format("%.2f", salarioComAcrescimo);

		JOptionPane.showMessageDialog(null, mensagem, "Informações do Funcionário", JOptionPane.INFORMATION_MESSAGE);
	}
}