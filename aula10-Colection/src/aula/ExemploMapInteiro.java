package aula;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ExemploMapInteiro {

	public static void main(String[] args) {
		TreeMap<Integer, String> mapas = new TreeMap<>();

		mapas.put(2, "Ana");
		mapas.put(5, "Carlos");
		mapas.put(4, "Igor");
		mapas.put(1, "Adriana");

		System.out.println("-------------------------");
		for (Entry<Integer, String> ordem : mapas.entrySet()) {
			System.out.println(ordem.getKey() + " - " + ordem.getValue());
		}
		System.out.println("-------------------------");
	}
}
