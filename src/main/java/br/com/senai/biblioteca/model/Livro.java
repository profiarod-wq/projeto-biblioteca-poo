package br.com.senai.biblioteca.model;

public class Livro extends ItemBiblioteca {
    private String isbn;
    private int ano;
    private Autor autor;
    private Categoria categoria;

    public Livro(Integer id, String titulo, String isbn, int ano, Autor autor, Categoria categoria) {
        super(id, titulo);
        this.isbn = isbn;
        this.ano = ano;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getIsbn() { return isbn; }
    public int getAno() { return ano; }
    public Autor getAutor() { return autor; }
    public Categoria getCategoria() { return categoria; }

    @Override
    public String descricao() {
        return getId() + " | " + getTitulo() + " | " + isbn + " | " + ano
                + " | " + autor.getNome() + " | " + categoria.getNome();
    }
}
