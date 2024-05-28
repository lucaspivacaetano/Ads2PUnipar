
package com.mycompany.ex4;

import java.util.Stack;


public class Deposito {
   private Stack<Produto> pilhaDeProdutos;
    private final int capacidadeMaxima;

    public Deposito() {
        this.pilhaDeProdutos = new Stack<>();
        this.capacidadeMaxima = 10;
    }

    public void adicionarProduto(Produto produto) {
        if (pilhaDeProdutos.size() < capacidadeMaxima) {
            pilhaDeProdutos.push(produto);
            System.out.println("Produto adicionado à pilha: " + produto);
        } else {
            System.out.println("A pilha está cheia. Não é possível adicionar mais produtos.");
        }
        listarProdutos();
    }

    public void retirarProduto() {
        if (pilhaDeProdutos.isEmpty()) {
            System.out.println("A pilha está vazia. Não há produtos para retirar.");
        } else {
            Produto produtoRemovido = pilhaDeProdutos.pop();
            System.out.println("Produto retirado da pilha: " + produtoRemovido);
        }
        listarProdutos();
    }

    public void listarProdutos() {
        if (pilhaDeProdutos.isEmpty()) {
            System.out.println("A pilha de produtos está vazia.");
        } else {
            System.out.println("Produtos na pilha:");
            for (int i = pilhaDeProdutos.size() - 1; i >= 0; i--) {
                System.out.println(pilhaDeProdutos.get(i));
            }
        }
    }
}
