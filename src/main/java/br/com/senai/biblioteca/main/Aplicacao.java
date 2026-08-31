package br.com.senai.biblioteca.main;

import br.com.senai.biblioteca.service.LivroService;

public class Aplicacao {
    public static void main(String[] args) {
        LivroService service = new LivroService();

        System.out.println("=== LIVROS CADASTRADOS ===");
        service.listarTodos().forEach(livro ->
                System.out.println(livro.descricao())
        );

        // TODO DA SPRINT:
        // Testar aqui a busca pelo termo "Java".
    }
}
