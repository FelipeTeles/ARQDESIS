package DAO;

import MODEL.MODEL_Atendente;
import TO.TO_Atendente;

import java.sql.*;
import java.util.ArrayList;

import Factory.ConnectionFactory;

public class DAO_Atendente {

	// Consultar por Codigo
	public TO_Atendente Consultar(String Nome,int Senha) {

		PreparedStatement pst;
		String sql = "select * from  TabelaAtendente where Nome =? and Senha =?";
		TO_Atendente Atendente = null;
		try {
			Connection conn = ConnectionFactory.obtemConexao();

			pst = conn.prepareStatement(sql);
			pst.setString(1, Nome);
			pst.setInt(1, Senha);
			ResultSet resultSet = pst.executeQuery();
			if (resultSet.next()) {

				Atendente = new TO_Atendente();
				
				Atendente.setNome(resultSet.getString("Nome"));
				Atendente.setSenha(resultSet.getInt("Senha"));

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Atendente;
	}

}
