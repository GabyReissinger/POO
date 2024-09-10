package aula09;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> nome = new ArrayList<>();
		nome.add("Maria");
		nome.add("Carlos");
		nome.add("Matheus");
		nome.add("Gabriela");

		if (nome.contains("Matheus")) {
			nome.remove(nome.indexOf("Matheus"));
		}

		for (String nomes : nome) {
			System.out.println(nomes);
		}
	}

}
