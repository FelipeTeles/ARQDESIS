package MODEL;

import DAO.DAO_Atendente;

<<<<<<< HEAD
public class MODEL_Atendente {

	private int Codigo,Senha;
=======

public class MODEL_Atendente {

	private int Codigo;
>>>>>>> origin/master
	private String Nome;
	// Classe DAO_Aluno
	DAO_Atendente AtendenteDAO = new DAO_Atendente();

	public MODEL_Atendente() {

	}

<<<<<<< HEAD
	public MODEL_Atendente(int Codigo, String Nome,int Senha) {

		this.Codigo = Codigo;
		this.Nome = Nome;
		this.Senha = Senha;
=======
	public MODEL_Atendente(int Codigo, String Nome) {

		this.Codigo = Codigo;
		this.Nome = Nome;
>>>>>>> origin/master

	}

	public void setCodigo(int Codigo) {

		this.Codigo = Codigo;

	}
<<<<<<< HEAD
=======
	
>>>>>>> origin/master

	public void setNome(String Nome) {

		this.Nome = Nome;

	}

<<<<<<< HEAD
	public void setSenha(int Senha) {

		this.Senha = Senha;

	}

=======
>>>>>>> origin/master
	public int getCodigo() {
		return Codigo;
	}

	public String getNome() {
		return Nome;
	}

<<<<<<< HEAD
	public int getSenha() {
		return Senha;
	}

	public void Consultar_Atendente(String Nome,int Senha) {

		AtendenteDAO.Consultar(Nome,Senha);
=======
	public void Consultar_Atendente(int Codigo) {

		AtendenteDAO.Consultar(Codigo);
>>>>>>> origin/master

	}

}
