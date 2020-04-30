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
public class Uso {
    
    private int id;
    private Projeto projeto;
    private Computador computador;
    private Tecnico tecnico;

    @Override
    public String toString() {
        return "Uso{" + "id=" + id + ", projeto=" + projeto + ", computador=" + computador + ", tecnico=" + tecnico + '}';
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the projeto
     */
    public Projeto getProjeto() {
        return projeto;
    }

    /**
     * @param projeto the projeto to set
     */
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    /**
     * @return the computador
     */
    public Computador getComputador() {
        return computador;
    }

    /**
     * @param computador the computador to set
     */
    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    /**
     * @return the tecnico
     */
    public Tecnico getTecnico() {
        return tecnico;
    }

    /**
     * @param tecnico the tecnico to set
     */
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    
    
}
