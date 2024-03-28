package com.academy.bibliotecauniversitaria;

public class BibliotecaUniversitaria {

    public static void main(String[] args) {
        //NOTA: Eu quis fazer com que apenas o funcionario pudesse cadastrar um livro.
        Usuario user = new Usuario();
        Livros book = new Livros();
        
        user.CadastroUser();
        if(user.tipoUsuario.equals("funcionario")){
            book.CadastroLivro();
        }
        else if (user.tipoUsuario.equals("professor") || user.tipoUsuario.equals("aluno")){
            user.UserSelection();
        }
    }
}
