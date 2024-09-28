package br.edu.unisep.evento.model;

public class Usuario {
    private int id;
    private String email;
    private String senha;
    private String numero;

    public Usuario(int id, String email, String senha, String numero) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
