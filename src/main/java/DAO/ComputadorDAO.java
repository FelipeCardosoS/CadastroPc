package DAO;

import java.sql.SQLException;

import Entidades.Computador;

public class ComputadorDAO extends DAO {

	public ComputadorDAO() {
		connection = ConnectionFactory.getInstance().getConnection();
	}


	public void Cadastrar(Computador computador) {
			int id;
		try {
			connection.setAutoCommit(false);
			sql = "select max(id)+1 as id from InventarioMaquinas";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				id = rs.getInt("id");
			} else {
				id = 100;
			}
			

			sql = "insert into InventarioMaquinas VALUES(?,?,?,?,?,?,?)";
			
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, computador.getModelo());
			ps.setString(3, computador.getMarca());
			ps.setString(4, computador.getProcessador());
			ps.setInt(5, computador.getArmazenamento());
			ps.setInt(6, computador.getRam());
			ps.setString(7, computador.getColaboradores().getNome());
			  ps.executeUpdate();
			  System.out.println("Inserido");
		        connection.commit();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir computador no inventário " + e);
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
