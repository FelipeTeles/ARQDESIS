package Projeto3MSIN;

import java.sql.*;
import java.util.ArrayList;

public class DAO_Matricula extends DataBase_Connect {

	// Insert
	public void Insert(TO_Matricula Matricula) {

		PreparedStatement pst;
		String sql = "insert into TabelaMatricula (Matricula,DataMatricula,CodigoCurso,Valor,RaAluno,StatusMatricula,StatusFinanceiro) values (?, ?, ?,?, ?,?,?)";

		try {
			Connection conn = ConnectionFactory.obtemConexao();

			pst = conn.prepareStatement(sql);
			int autoGeneratedID = Matricula.getMatricula();
			pst.setInt(1, autoGeneratedID);
			pst.setString(2, Matricula.getDataMatricula());
			pst.setInt(3, Matricula.getCodigoCurso());
			pst.setFloat(4, Matricula.getValor());
			pst.setInt(5, Matricula.getRaAluno());
			pst.setString(6, Matricula.getStatusMatricula());
			pst.setString(7, Matricula.getStatusFinanceiro());
			pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		closeConnection();
	}

	// Alterar
	public void Update(TO_Matricula Matricula) {

		PreparedStatement pst;
		String sql = "update TabelaMatricula set DataMatricula=?,CodigoCurso=?,Valor=?,RaAluno=?,StatusMatricula=?,StatusFinanceiro=? where Matricula=?";

		try {
			Connection conn = ConnectionFactory.obtemConexao();
			pst = conn.prepareStatement(sql);

			pst.setInt(7, Matricula.getMatricula());
			pst.setString(1, Matricula.getDataMatricula());
			pst.setInt(2, Matricula.getCodigoCurso());
			pst.setFloat(3, Matricula.getValor());
			pst.setInt(4, Matricula.getRaAluno());
			pst.setString(5, Matricula.getStatusMatricula());
			pst.setString(6, Matricula.getStatusFinanceiro());
			pst.executeUpdate();

			pst.executeUpdate();
			pst.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// Excluir
	public void Excluir(int Matricula) {

		PreparedStatement pst;

		String sql = "delete from TabelaMatricula where Matricula=?";

		try {
			Connection conn = ConnectionFactory.obtemConexao();

			pst = conn.prepareStatement(sql);
			pst.setInt(1, Matricula);

			pst.executeUpdate();
			pst.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// Consultar por Codigo
	public TO_Matricula Consultar(int Matricula) {

		PreparedStatement pst;
		String sql = "select * from  TabelaMatricula where Matricula =?";

		TO_Matricula TMatricula = null;

		try {
			Connection conn = ConnectionFactory.obtemConexao();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, Matricula);
			ResultSet resultSet = pst.executeQuery();
			if (resultSet.next()) {

				TMatricula = new TO_Matricula();
				TMatricula.setMatricula(resultSet.getInt("Matricula"));
				TMatricula.setDataMatricula(resultSet
						.getString("DataMatricula"));
				TMatricula.setCodigoCurso(resultSet.getInt("CodigoCurso"));
				TMatricula.setValor(resultSet.getFloat("Valor"));
				TMatricula.setRaAluno(resultSet.getInt("RaAluno"));
				TMatricula.setStatusMatricula(resultSet
						.getString("StatusMatricula"));
				TMatricula.setStatusFinanceiro(resultSet
						.getString("StatusFinanceiro"));

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return TMatricula;
	}

	public ArrayList<TO_Matricula> consuAll() {

		PreparedStatement pst;
		String sql = "select * from  TabelaMatricula";

		ArrayList<TO_Matricula> Matricula = new ArrayList<TO_Matricula>();

		try {
			Connection conn = ConnectionFactory.obtemConexao();

			pst = conn.prepareStatement(sql);

			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {

				TO_Matricula TMatricula = new TO_Matricula();

				TMatricula.setMatricula(resultSet.getInt("Matricula"));
				TMatricula.setDataMatricula(resultSet
						.getString("DataMatricula"));
				TMatricula.setCodigoCurso(resultSet.getInt("CodigoCurso"));
				TMatricula.setValor(resultSet.getFloat("Valor"));
				TMatricula.setRaAluno(resultSet.getInt("RaAluno"));
				TMatricula.setStatusMatricula(resultSet
						.getString("StatusMatricula"));
				TMatricula.setStatusFinanceiro(resultSet
						.getString("StatusFinanceiro"));

				Matricula.add(TMatricula);

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Matricula;
	}

	public ArrayList<TO_Matricula> consuAllAtivas() {

		PreparedStatement pst;
		String sql = "select * from  TabelaMatricula where StatusMatricula like '%A'";

		ArrayList<TO_Matricula> Matricula = new ArrayList<TO_Matricula>();

		try {
			Connection conn = ConnectionFactory.obtemConexao();
			pst = conn.prepareStatement(sql);

			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {

				TO_Matricula TMatricula = new TO_Matricula();

				TMatricula.setMatricula(resultSet.getInt("Matricula"));
				TMatricula.setDataMatricula(resultSet
						.getString("DataMatricula"));
				TMatricula.setCodigoCurso(resultSet.getInt("CodigoCurso"));
				TMatricula.setValor(resultSet.getFloat("Valor"));
				TMatricula.setRaAluno(resultSet.getInt("RaAluno"));
				TMatricula.setStatusMatricula(resultSet
						.getString("StatusMatricula"));
				TMatricula.setStatusFinanceiro(resultSet
						.getString("StatusFinanceiro"));

				Matricula.add(TMatricula);

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Matricula;
	}

	public ArrayList<TO_Matricula> consuAllCanceladas() {

		PreparedStatement pst;
		String sql = "select * from  TabelaMatricula where StatusMatricula like '%C'";

		ArrayList<TO_Matricula> Matricula = new ArrayList<TO_Matricula>();

		try {
			Connection conn = ConnectionFactory.obtemConexao();
			pst = conn.prepareStatement(sql);

			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {

				TO_Matricula TMatricula = new TO_Matricula();

				TMatricula.setMatricula(resultSet.getInt("Matricula"));
				TMatricula.setDataMatricula(resultSet
						.getString("DataMatricula"));
				TMatricula.setCodigoCurso(resultSet.getInt("CodigoCurso"));
				TMatricula.setValor(resultSet.getFloat("Valor"));
				TMatricula.setRaAluno(resultSet.getInt("RaAluno"));
				TMatricula.setStatusMatricula(resultSet
						.getString("StatusMatricula"));
				TMatricula.setStatusFinanceiro(resultSet
						.getString("StatusFinanceiro"));

				Matricula.add(TMatricula);

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Matricula;
	}

	public ArrayList<TO_Matricula> consuAllRa(int RaAluno) {

		PreparedStatement pst;
		String sql = "select * from  TabelaMatricula where RaAluno= ?";

		ArrayList<TO_Matricula> Matricula = new ArrayList<TO_Matricula>();

		try {
			Connection conn = ConnectionFactory.obtemConexao();

			pst = conn.prepareStatement(sql);
			pst.setInt(1, RaAluno);

			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {

				TO_Matricula TMatricula = new TO_Matricula();

				TMatricula.setMatricula(resultSet.getInt("Matricula"));
				TMatricula.setDataMatricula(resultSet
						.getString("DataMatricula"));
				TMatricula.setCodigoCurso(resultSet.getInt("CodigoCurso"));
				TMatricula.setValor(resultSet.getFloat("Valor"));
				TMatricula.setRaAluno(resultSet.getInt("RaAluno"));
				TMatricula.setStatusMatricula(resultSet
						.getString("StatusMatricula"));
				TMatricula.setStatusFinanceiro(resultSet
						.getString("StatusFinanceiro"));

				Matricula.add(TMatricula);

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Matricula;
	}

	public ArrayList<TO_Matricula> consultarDataA(String DataMatricula) {

		PreparedStatement pst;
		String sql = "select * from  TabelaMatricula where DataMatricula= ?and  StatusMatricula like'%A'";

		ArrayList<TO_Matricula> Matricula = new ArrayList<TO_Matricula>();

		try {
			Connection conn = ConnectionFactory.obtemConexao();
			pst = conn.prepareStatement(sql);
			pst.setString(1, DataMatricula);

			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {

				TO_Matricula TMatricula = new TO_Matricula();

				TMatricula.setMatricula(resultSet.getInt("Matricula"));
				TMatricula.setDataMatricula(resultSet
						.getString("DataMatricula"));
				TMatricula.setCodigoCurso(resultSet.getInt("CodigoCurso"));
				TMatricula.setValor(resultSet.getFloat("Valor"));
				TMatricula.setRaAluno(resultSet.getInt("RaAluno"));
				TMatricula.setStatusMatricula(resultSet
						.getString("StatusMatricula"));
				TMatricula.setStatusFinanceiro(resultSet
						.getString("StatusFinanceiro"));

				Matricula.add(TMatricula);

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Matricula;
	}

	public ArrayList<TO_Matricula> consultarDataC(String DataMatricula) {

		PreparedStatement pst;
		String sql = "select * from  TabelaMatricula where DataMatricula= ?and  StatusMatricula like'%C'";

		ArrayList<TO_Matricula> Matricula = new ArrayList<TO_Matricula>();

		try {
			Connection conn = ConnectionFactory.obtemConexao();
			pst = conn.prepareStatement(sql);
			pst.setString(1, DataMatricula);

			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {

				TO_Matricula TMatricula = new TO_Matricula();

				TMatricula.setMatricula(resultSet.getInt("Matricula"));
				TMatricula.setDataMatricula(resultSet
						.getString("DataMatricula"));
				TMatricula.setCodigoCurso(resultSet.getInt("CodigoCurso"));
				TMatricula.setValor(resultSet.getFloat("Valor"));
				TMatricula.setRaAluno(resultSet.getInt("RaAluno"));
				TMatricula.setStatusMatricula(resultSet
						.getString("StatusMatricula"));
				TMatricula.setStatusFinanceiro(resultSet
						.getString("StatusFinanceiro"));

				Matricula.add(TMatricula);

			}
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Matricula;
	}

}
