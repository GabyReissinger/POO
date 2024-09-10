package aula09;

import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		// Set - Uma interface
		// HashSet - Não aceita elementos duplicados
		// TreeSet - Mostra em ordem alfabética
		Set<String> lista = new TreeSet<>();

		lista.add("Flamengo");
		lista.add("Vasco");
		lista.add("Botafogo");
		lista.add("Botafogo");
		lista.add("Fluminense");

		System.out.println(lista);
	}

}
