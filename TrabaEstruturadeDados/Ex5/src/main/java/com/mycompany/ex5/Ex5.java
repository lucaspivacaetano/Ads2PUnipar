
package com.mycompany.ex5;

import java.util.Scanner;


public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deposito deposito = new Deposito();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Retirar produto");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Informe o índice da pilha (1-5): ");
                    int indiceAdicionar = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Informe o código do produto: ");
                    String codProduto = scanner.nextLine();
                    System.out.print("Informe a descrição do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Informe a data de entrada do produto (dd/MM/yyyy): ");
                    String dataEntrada = scanner.nextLine();
                    System.out.print("Informe a UF de origem do produto: ");
                    String ufOrigem = scanner.nextLine();
                    System.out.print("Informe a UF de destino do produto: ");
                    String ufDestino = scanner.nextLine();
                    Produto produto = new Produto(codProduto, descricao, dataEntrada, ufOrigem, ufDestino);
                    deposito.adicionarProduto(indiceAdicionar, produto);
                    break;
                case 2:
                    System.out.print("Informe o índice da pilha (1-5): ");
                    int indiceRetirar = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consumir a nova linha
                    deposito.retirarProduto(indiceRetirar);
                    break;
                case 3:
                    deposito.listarProdutos();
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
