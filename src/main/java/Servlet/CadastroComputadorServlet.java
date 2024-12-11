package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ComputadorDAO;
import Entidades.Colaboradores;
import Entidades.Computador;

/**
 * Servlet implementation class CadastroComputadorServlet
 */
@WebServlet("/CadastroComputador")
public class CadastroComputadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroComputadorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Colaboradores colab = new Colaboradores();
		Computador computador = new Computador();
	
	    // Configure o colaborador diretamente com o nome recebido
	    String colaboradorNome = request.getParameter("colaborador"); // Nome já enviado
	    colab.setNome(colaboradorNome);

	    // Configure o computador
	    computador.setModelo(request.getParameter("modelo"));
	    computador.setMarca(request.getParameter("marca"));
	    computador.setProcessador(request.getParameter("processador"));
	    computador.setArmazenamento(Integer.parseInt(request.getParameter("armazenamento")));
	    computador.setRam(Integer.parseInt(request.getParameter("ram")));
	    computador.setColaboradores(colab);
	    new ComputadorDAO().Cadastrar(computador);
		response.sendRedirect("index.html");
		
	}

}
