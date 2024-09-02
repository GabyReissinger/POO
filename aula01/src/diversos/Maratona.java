package diversos;

import javax.swing.JOptionPane;

/*Fazer a leitura de dois valores - altura e idade
	 * Se idade > = 18 ou altura maior que 1.70
	 * Participará da Maratona
	 * Senão
	 * Não participará
	 */
public class Maratona {
	public static void main(String[] args) {
		double altura, idade;
		altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura? "));
		idade = Double.parseDouble(JOptionPane.showInputDialog("Qual sua idade? "));
		
		/*if (altura >= 1.70 || idade >= 18) {
			System.out.println("Você pode participar da Maratona :)");
		}else{
			System.out.println("Você não pode participar da Maratona :(");
		}*/
		
		String res = (altura >= 1.60 || idade >= 18 ? "Você pode participar da Maratona :)" :"Você não pode participar da Maratona :(");
		System.out.println(res);
		//syso
	}
}
