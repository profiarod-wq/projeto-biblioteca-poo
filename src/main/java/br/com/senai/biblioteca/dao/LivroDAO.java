package br.com.senai.biblioteca.dao;

import br.com.senai.biblioteca.connection.ConnectionFactory;
import br.com.senai.biblioteca.model.Autor;
import br.com.senai.biblioteca.model.Categoria;
import br.com.senai.biblioteca.model.Livro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    public List<Livro> listarTodos() {
        String sql = "SELECT id, titulo, isbn, ano, autor, categoria FROM livros ORDER BY id";
        List<Livro> livros = new ArrayList<>();

        try (Connection conexao = ConnectionFactory.abrirConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                livros.add(new Livro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("isbn"),
                        rs.getInt("ano"),
                        new Autor(rs.getString("autor")),
                        new Categoria(rs.getString("categoria"))
                ));
            }

            return livros;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar livros: " + e.getMessage(), e);
        }
    }

    // TODO DA SPRINT:
    // Implementar busca parcial por título usando LIKE e PreparedStatement.
    public List<Livro> buscarPorTitulo(String termo) {
        throw new UnsupportedOperationException("TODO: implementar buscarPorTitulo");
    }
}
