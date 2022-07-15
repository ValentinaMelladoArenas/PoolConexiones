package cl.talentoDigital.sevlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.talentoDigital.dao.*;
import cl.talentoDigital.modelo.Libro;


@WebServlet("/procesaLibro")
public class ProcesaLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		ILibroDao libroDao = new LibroDaoImpl();
		
		libros = libroDao.findAll();
		
		request.setAttribute("librosAtt", libros);
		request.getRequestDispatcher("ListadoLibros.jsp").forward(request, response);
	}
}
