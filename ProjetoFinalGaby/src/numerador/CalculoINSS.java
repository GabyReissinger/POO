package numerador;

public interface CalculoINSS {
	Double ALIQUOTAINSS = 0.075; // até 1412.00
	Double DEDUCAO = 0.;// 1412.00

	Double ALIQUOTAINSS1 = 0.09; // De 1412.01 até 2666.68
	Double DEDUCAO1 = 21.18;// De 1412.01 até 2666.68

	Double ALIQUOTAINSS2 = 0.12; // De 2666.69 até 4000.03
	Double DEDUCAO2 = 101.18;// De 2666.69 até 4000.03

	Double ALIQUOTAINSS3 = 0.14; // Acima de 4000.04
	Double DEDUCAO3 = 181.18;// Acima de 4000.04

	void calculoInss(Double valor);

}
