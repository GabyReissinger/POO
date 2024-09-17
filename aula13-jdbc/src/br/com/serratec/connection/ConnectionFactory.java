package br.com.serratec.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	String url = "jdbc:postgresql://localhost:5432/curso";
	String usuario = "postgres";
	String senha = "Gabriela@1993";

	private Connection connection;

	public Connection getConnection() {
		System.out.println("Conectando no banco de dados :) ... ");
		try {
			connection = DriverManager.getConnection(url, usuario, senha);
			if (connection != null) {
				System.out.println("Conectado com sucesso! ^-^");
			} else {
				System.out.println("Erro nos dados da conecxão! DX");
			}
		} catch (Exception e) {
			System.err.println("Não foi possível conectar ._.");
			;
		}

		return connection;
	}

}
