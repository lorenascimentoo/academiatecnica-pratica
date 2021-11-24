package com.atp.atp53.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.atp.atp53.model.Categoria;


public class CategoriaDao {
	public int create(Categoria model) {
		int idGerado = 0;

		try (Connection conn = new ConnectionFactory().getConnection()) {
			String sql = "insert into categoria(nome,descricao)values(?,?);";
			try {
				PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				statement.setString(1, model.getNome());
				statement.setString(2, model.getDescricao());
				statement.execute();

				ResultSet ids = statement.getGeneratedKeys();

				while (ids.next()) {
					idGerado = ids.getInt("id");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idGerado;
	}

	public ArrayList<Categoria> read() {
		ArrayList<Categoria> lista = new ArrayList<Categoria>();
		try (Connection conn = new ConnectionFactory().getConnection()) {

			String sql = "SELECT * FROM CATEGORIA;";
			try {
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.execute();
				ResultSet retorno = statement.getResultSet();

				lista = createList(retorno);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public ArrayList<Categoria> read(String nome) {
		ArrayList<Categoria> lista = new ArrayList<Categoria>();
		try (Connection conn = new ConnectionFactory().getConnection()) {

			String sql = "SELECT * FROM CATEGORIA WHERE nome = ?;";
			try {
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, nome);
				statement.execute();
				ResultSet retorno = statement.getResultSet();

				lista = createList(retorno);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public int update(Categoria model) {
		int qntAlterada = 0;
		try (Connection conn = new ConnectionFactory().getConnection()) {
			String sql = "UPDATE CATEGORIA SET NOME=?,DESCRICAO=? WHERE ID=?";

			try {
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, model.getNome());
				statement.setString(2, model.getDescricao());
				statement.setInt(3, model.getId());
				statement.execute();
				qntAlterada = statement.getUpdateCount();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qntAlterada;
	}

	public int delete(int id) {
		int qntAlterada = 0;
		try (Connection conn = new ConnectionFactory().getConnection()) {
			String sql = "DELETE FROM CATEGORIA WHERE ID=?";

			try {
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setInt(1, id);
				statement.execute();
				qntAlterada = statement.getUpdateCount();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qntAlterada;
	}

	private ArrayList<Categoria> createList(ResultSet retorno) throws SQLException {
		ArrayList<Categoria> list = new ArrayList<Categoria>();

		while (retorno.next()) {
			Categoria cat = new Categoria();
			cat.setId(retorno.getInt("id"));
			cat.setNome(retorno.getString("nome"));
			cat.setDescricao(retorno.getString("descricao"));
			list.add(cat);
		}
		return list;
	}
}