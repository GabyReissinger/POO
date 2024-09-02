package diversos;

import javax.swing.JOptionPane;

public class Calculo {
	public static void main(String[] args) {
		//Criar duas variaveis atribuir valores e retornar a média
		double num1, num2;
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		calcular (num1, num2);
	}
	
	public static void calcular(double num1, double num2){
		JOptionPane.showMessageDialog(null, (num1 + num2) / 2);
	}
}
