/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author 00256045
 */
public class Fila {
    private Queue<String> fila;
    private final int capacidadeMaxima;

    public Fila() {
        this.fila = new LinkedList<>();
        this.capacidadeMaxima = 20;
    }

    public void adicionarPaciente(String nome) {
        if (fila.size() < capacidadeMaxima) {
            fila.add(nome);
            System.out.println("Paciente " + nome + " adicionado à fila.");
        } else {
            System.out.println("A fila já está cheia. Não é possível adicionar mais pacientes hoje.");
        }
    }

    public void chamarProximoPaciente() {
        if (fila.isEmpty()) {
            System.out.println("Não há pacientes na fila.");
        } else {
            String proximoPaciente = fila.poll();
            System.out.println("Próximo paciente: " + proximoPaciente);
        }
    }
}

