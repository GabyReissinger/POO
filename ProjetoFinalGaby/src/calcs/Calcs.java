package calcs;

import java.math.BigDecimal;

import entiny.Funcionario;

public interface Calcs {

	public static double calculoInss(Funcionario f) {
		double ALIQUOTAINSS = 0.075; // até 1412.00
		double DEDUCAO = 0.;// 1412.00

		double ALIQUOTAINSS1 = 0.09; // De 1412.01 até 2666.68
		double DEDUCAO1 = 21.18;// De 1412.01 até 2666.68

		double ALIQUOTAINSS2 = 0.12; // De 2666.69 até 4000.03
		double DEDUCAO2 = 101.18;// De 2666.69 até 4000.03

		double ALIQUOTAINSS3 = 0.14; // Acima de 4000.04
		double DEDUCAO3 = 181.18;// Acima de 4000.04

		double valorInss = 0.;
		double descontoInss = 0.;
		double salarioBruto = f.getSalarioBruto();

		if (salarioBruto <= 1412.00) { // 1306.1 para mostrar isso temos que usar 0,925
			valorInss = (salarioBruto * ALIQUOTAINSS) - DEDUCAO;
			descontoInss = valorInss;
			// passar um syso dando informação sobre o valor correto na main
		} else if (salarioBruto <= 2666.68) {

			valorInss = (salarioBruto * ALIQUOTAINSS1) - DEDUCAO1;
			descontoInss = valorInss;

		} else if (salarioBruto <= 4000.03) {

			valorInss = (salarioBruto * ALIQUOTAINSS2) - DEDUCAO2;
			descontoInss = valorInss;

		} else {

			valorInss = (7786.02 * ALIQUOTAINSS3) - DEDUCAO3;
			descontoInss = valorInss;

		}
		return descontoInss;

	}


	public static double calculoIR(Funcionario f) {
		double ALIQUOTAIR0 = 0.0; // até 2259.00
		double DEDUCAOIR0 = 0.; // até 2259.00

		double ALIQUOTAIR1 = 0.075; // De 2259.01 até 2826.65
		double DEDUCAOIR1 = 169.44; // De 2259.01 até 2826.65

		double ALIQUOTAIR2 = 0.15; // De 2826.66 até 3751.05
		double DEDUCAOIR2 = 381.44;// De 2826.66 até 3751.05

		double ALIQUOTAIR3 = 0.225; // Acima de 3751.06 até 4664.68
		double DEDUCAOIR3 = 662.77;// Acima de 3751.06 até 4664.68

		double ALIQUOTAIR4 = 0.275; // Acima de 4664.69
		double DEDUCAOIR4 = 896.00;// Acima de 4664.69

		double valorIR = 0.;
		double salarioBruto = f.getSalarioBruto();
		double descontoIR;
		double descontoInss = 0;

		double abatimentoDependentes = f.getNumeroDependentes()* 189.59;

		if (salarioBruto <= 1903.98) {
			valorIR = 0.0; // Isento de IR
			descontoIR = valorIR;

		} else if (salarioBruto <= 2826.65) {
			valorIR = (((salarioBruto - descontoInss) - abatimentoDependentes) * ALIQUOTAIR1) - DEDUCAOIR1;
			if (valorIR < 0) {
				descontoIR = 0.;
			} else {
				descontoIR = valorIR;
			}
		} else if (salarioBruto <= 3751.05) {
			valorIR = (((salarioBruto - descontoInss) - abatimentoDependentes) * ALIQUOTAIR2) - DEDUCAOIR2;
			if (valorIR < 0) {
				descontoIR = 0.;
			} else {
				descontoIR = valorIR;
			}
		} else if (salarioBruto <= 4664.68) {
			valorIR = (((salarioBruto - descontoInss) - abatimentoDependentes) * ALIQUOTAIR3) - DEDUCAOIR3;
			if (valorIR < 0) {
				descontoIR = 0.;
			} else {
				descontoIR = valorIR;
			}
		} else {
			valorIR = (((salarioBruto - descontoInss) - abatimentoDependentes) * ALIQUOTAIR4) - DEDUCAOIR4;
			if (valorIR < 0) {
				descontoIR = 0.;
			} else {
				descontoIR = valorIR;
			}
		}
		return descontoIR;
	}

	public default BigDecimal salarioLiquido(BigDecimal valorSL) {
		int salarioBruto = 0;
		int descontoIR = 0;
		int descontoInss = 0;
		valorSL = BigDecimal.valueOf((salarioBruto - descontoInss) - descontoIR);
		BigDecimal salarioLiquido = valorSL;
		return salarioLiquido;
	}

}
