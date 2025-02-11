package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ColaboradoresDAO;
import Entidades.Colaboradores;

/**
 * Servlet implementation class verificarServlet
 */
@WebServlet("/verificar")
public class verificarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verificarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ColaboradoresDAO colabDao = new ColaboradoresDAO();
		List<Colaboradores> listaColaborador = colabDao.listar();
		
		HttpSession session = request.getSession();
		System.out.println(listaColaborador);
		
		session.setAttribute("listaColaborador", listaColaborador);
		response.sendRedirect("verificar.jsp");
	}

}
