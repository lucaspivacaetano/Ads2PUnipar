
package com.mycompany.ex3;

import java.util.Stack;

public class Biblioteca {
   private Stack<Livro> pilhaDeLivros;

    public Biblioteca() {
        this.pilhaDeLivros = new Stack<>();
    }

    public void adicionarLivro(Livro livro) {
        pilhaDeLivros.push(livro);
        System.out.println("Livro adicionado à pilha: " + livro);
    }

    public void listarLivros() {
        if (pilhaDeLivros.isEmpty()) {
            System.out.println("A pilha de livros está vazia.");
        } else {
            System.out.println("Livros na pilha:");
            for (int i = pilhaDeLivros.size() - 1; i >= 0; i--) {
                System.out.println(pilhaDeLivros.get(i));
            }
        }
    }

    public void retirarLivro() {
        if (pilhaDeLivros.isEmpty()) {
            System.out.println("A pilha de livros está vazia. Não há livros para retirar.");
        } else {
            Livro livroRemovido = pilhaDeLivros.pop();
            System.out.println("Livro removido da pilha: " + livroRemovido);
        }
    }
}