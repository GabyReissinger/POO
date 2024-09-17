package numerador;

public interface CalculoIR {
	Double ALIQUOTAIR0 = 0.0; // até 2259.00
	Double DEDUCAOIR0 = 0.; // até 2259.00

	Double ALIQUOTAIR1 = 0.075; // De 2259.01 até 2826.65
	Double DEDUCAOIR1 = 169.44; // De 2259.01 até 2826.65

	Double ALIQUOTAIR2 = 0.15; // De 2826.66 até 3751.05
	Double DEDUCAOIR2 = 381.44;// De 2826.66 até 3751.05

	Double ALIQUOTAIR3 = 0.225; // Acima de 3751.06 até 4664.68
	Double DEDUCAOIR3 = 662.77;// Acima de 3751.06 até 4664.68

	Double ALIQUOTAIR4 = 0.275; // Acima de 4664.69
	Double DEDUCAOIR4 = 896.00;// Acima de 4664.69

	void calculoIR(Double valor);
}
