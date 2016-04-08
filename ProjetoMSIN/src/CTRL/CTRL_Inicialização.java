package CTRL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MODEL.MODEL_Atendente;
import TO.TO_Atendente;;

/**
 * Servlet implementation class CTRL_Curso
 */
@WebServlet("/Inicializacao.do")
public class CTRL_Inicialização extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pCodigo = request.getParameter("Codigo");
		String pNome = request.getParameter("Nome");
		String pacao = request.getParameter("acao");

		int Codigo;

		try {
			Codigo = Integer.parseInt(pCodigo);

		} catch (NumberFormatException e) {
			Codigo = 0;

			e.printStackTrace();
		}

		MODEL_Atendente MODELAtendente = new MODEL_Atendente(Codigo, pNome);

		if (pacao.equals("Entrar")) {
			MODELAtendente.Consultar_Atendente(Codigo);

		}

	}

}