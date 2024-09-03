package exercicios;

public class CalculadoraSalario {

	public static void main(String[] args) {
		double salario = 2930;

		if (salario <= 1751.81) {
			salario = salario * 0.92;
		} else if (salario <= 2912.72) {
			salario = salario * 0.91;
		} else if (salario < 5839.45) {
			salario = salario * 0.9;
		} else {
			salario = salario * 0.89;
	}
		System.out.println("Salário com desconto: " + salario);
	}
}
