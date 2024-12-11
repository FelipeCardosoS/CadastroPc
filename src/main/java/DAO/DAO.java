package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	protected String sql;
	protected PreparedStatement ps;
	protected ResultSet rs;
	protected Connection connection;
}
