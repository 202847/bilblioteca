package br.edu.unisep.evento.model;

public class Autor {
    private int id;
    private String nome_autor;

    public Autor(int id, String nome) {
        this.id = id;
        this.nome_autor = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome) {
        this.nome_autor = nome_autor;
    }
}
