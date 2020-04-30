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
public class Computador {
 
    private int id;
    private String modelo;
    private ArrayList<Uso> usos;

    public void add(Uso uso){
      if (usos == null){
          usos = new ArrayList<Uso>();
      }
      usos.add(uso);
   }

    
    @Override
    public String toString() {
        return "Computador{" + "id=" + id + ", modelo=" + modelo + '}';
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
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
}
