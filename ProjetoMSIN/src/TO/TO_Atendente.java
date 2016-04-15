package TO;

import MODEL.MODEL_Atendente;
import DAO.DAO_Atendente;

public class TO_Atendente {

<<<<<<< HEAD
	private int Codigo,Senha;
=======
	private int Codigo;
>>>>>>> origin/master
	private String Nome;
	// Classe DAO_Aluno
	DAO_Atendente AtendenteDAO = new DAO_Atendente();

<<<<<<< HEAD

=======
>>>>>>> origin/master
	public TO_Atendente() {

	}

<<<<<<< HEAD
	public TO_Atendente(int Codigo, String Nome,int Senha) {

		this.Codigo = Codigo;
		this.Nome = Nome;
		this.Senha = Senha;
=======
	public TO_Atendente(int Codigo, String Nome) {

		this.Codigo = Codigo;
		this.Nome = Nome;
>>>>>>> origin/master

	}

	public void setCodigo(int Codigo) {

		this.Codigo = Codigo;

	}
	

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
=======
>>>>>>> origin/master

}
