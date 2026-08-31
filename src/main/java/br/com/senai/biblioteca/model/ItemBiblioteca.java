package br.com.senai.biblioteca.model;

public abstract class ItemBiblioteca {
    private Integer id;
    private String titulo;

    public ItemBiblioteca() {}

    public ItemBiblioteca(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public abstract String descricao();
}
