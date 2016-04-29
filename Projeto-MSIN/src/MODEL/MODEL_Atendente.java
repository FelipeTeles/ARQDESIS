package MODEL;

import DAO.DAO_Atendente;

public class MODEL_Atendente {

	private int Codigo,Senha;
	private String Nome;
	// Classe DAO_Aluno
	DAO_Atendente AtendenteDAO = new DAO_Atendente();

	public MODEL_Atendente() {

	}

	public MODEL_Atendente(int Codigo, String Nome,int Senha) {

		this.Codigo = Codigo;
		this.Nome = Nome;
		this.Senha = Senha;

	}

	public void setCodigo(int Codigo) {

		this.Codigo = Codigo;

	}

	public void setNome(String Nome) {

		this.Nome = Nome;

	}

	public void setSenha(int Senha) {

		this.Senha = Senha;

	}

	public int getCodigo() {
		return Codigo;
	}

	public String getNome() {
		return Nome;
	}

	public int getSenha() {
		return Senha;
	}

	public void Consultar_Atendente(String Nome,int Senha) {

		AtendenteDAO.Consultar(Nome,Senha);

	}

}
