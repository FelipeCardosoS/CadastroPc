package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	// Instância única do Singleton
	private static ConnectionFactory instance;

	// Configurações de conexão com o banco de dados Oracle
	private static final String URL = "jdbc:sqlserver://51.81.167.10:1433;databaseName=mlegate;encrypt=true;trustServerCertificate=true";
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String USERNAME = "timesheet";
	private static String PASSWORD = "2024$#@Naoerromas";

	// Construtor privado para impedir a criação de múltiplas instâncias
	private ConnectionFactory() {}

	// Método que retorna a única instância da ConnectionFactory
	public static ConnectionFactory getInstance() {
		if (instance == null) {
			synchronized (ConnectionFactory.class) {
				if (instance == null) {
					instance = new ConnectionFactory();
				}
			}
		}
		return instance;
	}

	// Método para obter uma conexão com o banco de dados Oracle
	public Connection getConnection() {
		Connection connection = null;
		try {			
			// Registrar o driver Oracle
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao conectar na base de dados\n" + e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Erro ao carregar o driver de conexão\n" + e);			
		}
		return connection;
	}
}
