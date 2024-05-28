/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author 00256045
 */
public class Cliente {
  private int senha;
    private String nome;
    private int anoNascimento;

    public Cliente(int senha, String nome, int anoNascimento) {
        this.senha = senha;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public int getIdade() {
        return java.time.Year.now().getValue() - anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente [senha=" + senha + ", nome=" + nome + ", anoNascimento=" + anoNascimento + "]";
    }
}