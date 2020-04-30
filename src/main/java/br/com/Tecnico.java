/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class Tecnico {

    private int id;
    private String nome;
   private ArrayList<Uso> usos;
   private ArrayList<Filho> filhos;

    public ArrayList<Filho> getFilhos() {
        return filhos;
    }

    public void setFilhos(ArrayList<Filho> filhos) {
        this.filhos = filhos;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "id=" + id + ", nome=" + nome;
    }
   

   

   public void add(Uso uso){
      if (usos == null){
          usos = new ArrayList<Uso>();
      }
      usos.add(uso);
   }
    
   
   /**
     * @return the usos
     */
    public ArrayList<Uso> getUsos() {
        return usos;
    }

    /**
     * @param usos the usos to set
     */
    public void setUsos(ArrayList<Uso> usos) {
        this.usos = usos;
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    void addFilho(Filho filho) {
     if (filhos == null){
          filhos = new ArrayList<Filho>();
      }
      filhos.add(filho);
    }
    
}
