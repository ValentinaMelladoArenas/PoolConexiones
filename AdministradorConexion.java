package cl.talentoDigital.procesaConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AdministradorConexion {

	protected static Connection con = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;

	protected Connection generaPoolConexion() {
		Context initContext;
		try {
			initContext = new InitialContext();
			DataSource ds =(DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			try {
				
				con=ds.getConnection();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
}
