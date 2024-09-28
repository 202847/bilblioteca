package br.edu.unisep.evento.model;

import java.util.Calendar;

public class Emprestimo {
    private int id;
    private String descricao;
    private Calendar inicio;
    private Calendar fim;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(int id, String descricao, Calendar inicio, Calendar fim, Livro livro, Usuario usuario) {
        this.id = id;
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        this.livro = livro;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
