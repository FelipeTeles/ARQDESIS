package CTRL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MODEL.MODEL_Aluno;
import TO.TO_Aluno;

/**
 * Servlet implementation class CTRL_Aluno
 */
@WebServlet("/ManterAluno.do")
public class CTRL_Aluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pRa = request.getParameter("Ra");
		String pNome = request.getParameter("Nome");
		String pEndereco = request.getParameter("Endereco");
		String pEmail = request.getParameter("Email");
		String pTelefone = request.getParameter("Telefone");
		String pRG = request.getParameter("RG");
		String pCPF = request.getParameter("CPF");
		String pacao = request.getParameter("acao");

		int Ra;

		try {
			Ra = Integer.parseInt(pRa);
		} catch (NumberFormatException e) {
			Ra = 0;
			e.printStackTrace();
		}

		MODEL_Aluno Aluno = new MODEL_Aluno(Ra, pNome, pEndereco, pEmail, pTelefone, pRG, pCPF);

		if (pacao.equals("Cadastrar")) {
			Aluno.Cadastrar_Aluno();
		} else if (pacao.equals("Alterar")) {
			Aluno.Alterar_Aluno();
		} else if (pacao.equals("Excluir")) {
			Aluno.Excluir_Aluno(Ra);
		} else if (pacao.equals("Consultar")) {
			Aluno.Consultar_Aluno();
		}
		

		Aluno.Consultar_Aluno();

		TO_Aluno to = new TO_Aluno();
		to.setRa(Aluno.getRa());
		to.setNome(Aluno.getNome());
		to.setEndereco(Aluno.getEndereco());
		to.setEmail(Aluno.getEmail());
		to.setTelefone(Aluno.getTelefone());
		to.setRG(Aluno.getRG());
		to.setCPF(Aluno.getCPF());

		request.setAttribute("aluno", to);

		RequestDispatcher view = 
					request.getRequestDispatcher("Aluno.jsp");
		view.forward(request, response);
	}

}
