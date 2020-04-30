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
public class Peca {

    private long id;
    private String descricao;
    private ArrayList<Peca> compostos;

    /**
     *
     * @param p
     */
    public void addComposto(Peca p) {
        getCompostos().add(p);
    }

    public ArrayList<Peca> getCompostos() {
        if (compostos == null) {
            compostos = new ArrayList();
        }

        return compostos;
    }

    public void setCompostos(ArrayList<Peca> compostos) {
        this.compostos = compostos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Peca{" + "id=" + id + ", descricao=" + descricao + '}';
    }

}
