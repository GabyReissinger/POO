package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploSuperExtends {

	public static void main(String[] args) {
		List<Integer> ListaNumeros = Arrays.asList(10, 20, 40, 9, 50);
		List<String> ListaStrings = Arrays.asList("Sansung", "Apple", "LG");
		List<Object> ListaObjetos = new ArrayList<>();

		// imprimirListas(ListaNumeros);
		// imprimirListas(ListaStrings);
		copiarLista(ListaNumeros, ListaObjetos);
		imprimirListas(ListaObjetos);
	}

	public static void imprimirListas(List<?> lista) {
		for (Object o : lista) {
			System.out.println(o);
		}
	}

	public static void copiarLista(List<? extends Number> origem, List<? super Number> destino) {
		for (Number numero : origem) {
			destino.add(numero);

		}
	}
}
