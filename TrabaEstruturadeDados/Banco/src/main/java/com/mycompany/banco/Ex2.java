/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

import java.util.Scanner;

/**
 *
 * @author 00256045
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaAtendimento filaAtendimento = new FilaAtendimento();
        int senhaAtual = 1;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Chamar cliente");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe o ano de nascimento do cliente: ");
                    int anoNascimento = scanner.nextInt();
                    Cliente cliente = new Cliente(senhaAtual++, nome, anoNascimento);
                    filaAtendimento.adicionarCliente(cliente);
                    break;
                case 2:
                    filaAtendimento.chamarCliente();
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
