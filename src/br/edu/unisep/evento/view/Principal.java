package br.edu.unisep.evento.view;

import br.edu.unisep.evento.model.*;

import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor(1, "Bruno");

        Livro livro = new Livro(1, "Livro Aventura", "Um livro onde o que existe é aventura", autor);

        Usuario usuario = new Usuario(1, "bruno@teste.com", "123", "999999999");

        Emprestimo emprestimo = new Emprestimo(1, "Emprestimo Bruno", Calendar.getInstance(), Calendar.getInstance(), livro, usuario);

        System.out.println("Boa tarde " +  emprestimo.getUsuario().getEmail() + ", um emprestimo foi feito, com o livro "
                + emprestimo.getLivro().getTitulo() + " - " + emprestimo.getLivro().getDescricao() + "\n" +
                "Volte sempre!"
        );
    }
}