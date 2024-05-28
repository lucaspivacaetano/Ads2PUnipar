/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author 00256045
 */
public class FilaAtendimento {
private Queue<Cliente> filaPrioritaria;
    private Queue<Cliente> filaNormal;
    private int contadorPrioritario;

    public FilaAtendimento() {
        this.filaPrioritaria = new LinkedList<>();
        this.filaNormal = new LinkedList<>();
        this.contadorPrioritario = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (cliente.getIdade() > 65) {
            filaPrioritaria.add(cliente);
            System.out.println("Cliente " + cliente.getNome() + " adicionado à fila prioritária.");
        } else {
            filaNormal.add(cliente);
            System.out.println("Cliente " + cliente.getNome() + " adicionado à fila normal.");
        }
    }

    /**
     *
     */
    public void chamarCliente() {
        if (!filaPrioritaria.isEmpty() && (contadorPrioritario < 2 || filaNormal.isEmpty())) {
            Cliente cliente = filaPrioritaria.poll();
            contadorPrioritario++;
            System.out.println("Chamando cliente prioritário: " + cliente);
        } else if (!filaNormal.isEmpty()) {
            Cliente cliente = filaNormal.poll();
            contadorPrioritario = 0; // Resetar o contador após atender um cliente normal
            System.out.println("Chamando cliente normal: " + cliente);
        } else if (!filaPrioritaria.isEmpty()) {
            Cliente cliente = filaPrioritaria.poll();
            contadorPrioritario++;
            System.out.println("Chamando cliente prioritário: " + cliente);
        } else {
            System.out.println("Não há clientes na fila.");
        }
    }

    public void Cliente() {
       
    }
}
