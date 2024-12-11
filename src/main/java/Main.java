import java.sql.Connection;

import DAO.ColaboradoresDAO;
import DAO.ConnectionFactory;
import Entidades.Colaboradores;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory factory = ConnectionFactory.getInstance();
        try (Connection conn = factory.getConnection()) {
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
        
        Colaboradores colab = new Colaboradores();
        ColaboradoresDAO colabDAO = new ColaboradoresDAO();
        System.out.println(colabDAO.listar());
    }
}
