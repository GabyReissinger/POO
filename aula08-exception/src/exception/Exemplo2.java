package exception;

public class Exemplo2 {

	public static void main(String[] args) {
		int vetor[] = { 5, 10, 20 };
		int i = 10, j = 5, resultado = 0;
		String texto = null;

		try {
			resultado = i / j;
			System.out.println(vetor[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro indice fora de faixa");
			e.printStackTrace();
		} catch (ArrayStoreException e) {
			System.err.println("Divisão por zero!");
		} catch (NullPointerException e) {
			System.err.println("Alores nulos!");
		}
	}

}
