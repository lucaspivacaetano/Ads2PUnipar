
package com.mycompany.main;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila filaDePacientes = new Fila();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Chamar próximo paciente");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do paciente: ");
                    String nome = scanner.nextLine();
                    filaDePacientes.adicionarPaciente(nome);
                    break;
                case 2:
                    filaDePacientes.chamarProximoPaciente();
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
