package DAO;

import MODEL.MODEL_Atendente;
import TO.TO_Atendente;

import java.sql.*;
import java.util.ArrayList;

import Factory.ConnectionFactory;

public class DAO_Atendente {

	// Consultar por Codigo
<<<<<<< HEAD
	public TO_Atendente Consultar(String Nome,int Senha) {

		PreparedStatement pst;
		String sql = "select * from  TabelaAtendente where Nome =? and Senha =?";
=======
	public TO_Atendente Consultar(int Codigo) {

		PreparedStatement pst;
		String sql = "select * from  TabelaAtendente where Codigo =?";
>>>>>>> origin/master
		TO_Atendente Atendente = null;
		try {
			Connection conn = ConnectionFactory.obtemConexao();

			pst = conn.prepareStatement(sql);
<<<<<<< HEAD
			pst.setString(1, Nome);
			pst.setInt(1, Senha);
=======
			pst.setInt(1, Codigo);
>>>>>>> origin/master
			ResultSet resultSet = pst.executeQuery();
			if (resultSet.next()) {

				Atendente = new TO_Atendente();
<<<<<<< HEAD
				
				Atendente.setNome(resultSet.getString("Nome"));
				Atendente.setSenha(resultSet.getInt("Senha"));
=======
				Atendente.setCodigo(resultSet.getInt("Codigo"));
				Atendente.setNome(resultSet.getString("Nome"));
>>>>>>> origin/master

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Atendente;
	}

}
