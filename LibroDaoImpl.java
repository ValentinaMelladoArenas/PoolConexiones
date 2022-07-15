package cl.talentoDigital.dao;

import java.util.ArrayList;

import cl.talentoDigital.modelo.Libro;
import cl.talentoDigital.procesaConexion.AdministradorConexion;

public class LibroDaoImpl extends AdministradorConexion implements ILibroDao {
	
	public LibroDaoImpl() {
		con = generaPoolConexion();
	}

	@Override
	public ArrayList<Libro> findAll() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		String sql ="select * from libro";
		
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				//int numLibro, String nomLibro, String autorLibro
				Libro libroTemp = new Libro(rs.getInt("numlibro"),rs.getString("nomlibro"),rs.getString("autorlibro"));
				libros.add(libroTemp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return libros;
	}
}
