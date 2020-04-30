/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

/**
 *
 * @author miguel
 */
public class Pessoa {
    
    private long id;
    private String nome;
    private String cpf;
    private Pessoa casamento;

    public Pessoa getCasamento() {
        return casamento;
    }

    public void setCasamento(Pessoa casamento) {
        this.casamento = casamento;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
    
}
