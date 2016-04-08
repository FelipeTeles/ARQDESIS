package MODEL;

import DAO.DAO_Atendente;


public class MODEL_Atendente {

	private int Codigo;
	private String Nome;
	// Classe DAO_Aluno
	DAO_Atendente AtendenteDAO = new DAO_Atendente();

	public MODEL_Atendente() {

	}

	public MODEL_Atendente(int Codigo, String Nome) {

		this.Codigo = Codigo;
		this.Nome = Nome;

	}

	public void setCodigo(int Codigo) {

		this.Codigo = Codigo;

	}
	

	public void setNome(String Nome) {

		this.Nome = Nome;

	}

	public int getCodigo() {
		return Codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void Consultar_Atendente(int Codigo) {

		AtendenteDAO.Consultar(Codigo);

	}

}
