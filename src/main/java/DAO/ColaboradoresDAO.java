package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidades.Colaboradores;

public class ColaboradoresDAO extends DAO{

	
	public ColaboradoresDAO() {
		connection = ConnectionFactory.getInstance().getConnection();
	}
	
	public List<Colaboradores> listar(){
		List<Colaboradores> lista = new ArrayList<Colaboradores>();
		
		sql = "select * from colaboradores where statusconsultor = 'A' order by nomeconsultor";
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Colaboradores colaborador = new Colaboradores();
				colaborador.setId(rs.getInt("CodConsultor"));
				colaborador.setNome(rs.getString("NomeConsultor"));
				colaborador.setCargo(rs.getString("profissaoConsultor"));
				lista.add(colaborador);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar computadores " + e);
		}
		
		return lista;
	}
}
