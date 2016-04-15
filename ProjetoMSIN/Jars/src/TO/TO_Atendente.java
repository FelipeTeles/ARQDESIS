package TO;

import MODEL.MODEL_Atendente;
import DAO.DAO_Atendente;

public class TO_Atendente {

	private int Codigo;
	private String Nome;
	// Classe DAO_Aluno
	DAO_Atendente AtendenteDAO = new DAO_Atendente();

	public TO_Atendente() {

	}

	public TO_Atendente(int Codigo, String Nome) {

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

}
