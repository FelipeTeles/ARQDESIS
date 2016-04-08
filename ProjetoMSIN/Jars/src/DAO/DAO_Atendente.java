package DAO;

import MODEL.MODEL_Atendente;
import TO.TO_Atendente;

import java.sql.*;
import java.util.ArrayList;

import Factory.ConnectionFactory;

public class DAO_Atendente {

	// Consultar por Codigo
	public TO_Atendente Consultar(int Codigo) {

		PreparedStatement pst;
		String sql = "select * from  TabelaAtendente where Codigo =?";
		TO_Atendente Atendente = null;
		try {
			Connection conn = ConnectionFactory.obtemConexao();

			pst = conn.prepareStatement(sql);
			pst.setInt(1, Codigo);
			ResultSet resultSet = pst.executeQuery();
			if (resultSet.next()) {

				Atendente = new TO_Atendente();
				Atendente.setCodigo(resultSet.getInt("Codigo"));
				Atendente.setNome(resultSet.getString("Nome"));

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Atendente;
	}

}
