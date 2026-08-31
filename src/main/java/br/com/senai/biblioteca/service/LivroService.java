package br.com.senai.biblioteca.service;

import br.com.senai.biblioteca.dao.LivroDAO;
import br.com.senai.biblioteca.model.Livro;

import java.util.List;

public class LivroService {
    private final LivroDAO dao = new LivroDAO();

    public List<Livro> listarTodos() {
        return dao.listarTodos();
    }

    // TODO DA SPRINT:
    public List<Livro> buscarPorTitulo(String termo) {
        throw new UnsupportedOperationException("TODO: implementar busca no service");
    }
}
