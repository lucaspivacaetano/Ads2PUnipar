
package com.mycompany.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Deposito {
   private List<Stack<Produto>> pilhasDeProdutos;
    private final int capacidadeMaxima;

    public Deposito() {
        this.pilhasDeProdutos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            this.pilhasDeProdutos.add(new Stack<>());
        }
        this.capacidadeMaxima = 10;
    }

    public void adicionarProduto(int indicePilha, Produto produto) {
        if (indicePilha < 0 || indicePilha >= pilhasDeProdutos.size()) {
            System.out.println("Índice de pilha inválido.");
            return;
        }

        Stack<Produto> pilha = pilhasDeProdutos.get(indicePilha);
        if (pilha.size() < capacidadeMaxima) {
            pilha.push(produto);
            System.out.println("Produto adicionado à pilha " + (indicePilha + 1) + ": " + produto);
        } else {
            System.out.println("A pilha " + (indicePilha + 1) + " está cheia. Não é possível adicionar mais produtos.");
        }
        listarProdutos();
    }

    public void retirarProduto(int indicePilha) {
        if (indicePilha < 0 || indicePilha >= pilhasDeProdutos.size()) {
            System.out.println("Índice de pilha inválido.");
            return;
        }

        Stack<Produto> pilha = pilhasDeProdutos.get(indicePilha);
        if (pilha.isEmpty()) {
            System.out.println("A pilha " + (indicePilha + 1) + " está vazia. Não há produtos para retirar.");
        } else {
            Produto produtoRemovido = pilha.pop();
            System.out.println("Produto retirado da pilha " + (indicePilha + 1) + ": " + produtoRemovido);
        }
        listarProdutos();
    }

    public void listarProdutos() {
        for (int i = 0; i < pilhasDeProdutos.size(); i++) {
            Stack<Produto> pilha = pilhasDeProdutos.get(i);
            System.out.println("Pilha " + (i + 1) + ":");
            if (pilha.isEmpty()) {
                System.out.println("  (vazia)");
            } else {
                for (int j = pilha.size() - 1; j >= 0; j--) {
                    System.out.println("  " + pilha.get(j));
                }
            }
        }
    }
}
