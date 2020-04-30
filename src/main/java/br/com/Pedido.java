/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author miguel
 */
public class Pedido {
    
    private long id;
    private Date data;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido() {
    }

    public void destruir(Peca p){
       for (ItemPedido i: getItens()){
          if (i.getPeca().equals(p)){
              remover(i);
              break;
          } 
       }
    }
    
    public void adicionar(ItemPedido p){
       getItens().add(p);
    }
    
    public void remover(ItemPedido p){
       getItens().remove(p);
    }
    
    public void criar(Peca p, long qtd){
        ItemPedido i = conectar(p, qtd);
      
        adicionar(i);
    }

    private ItemPedido conectar(Peca p, long qtd) {
        ItemPedido i = new ItemPedido();
        i.setPeca(p);
        i.setQtd(qtd);
        i.setPedido(this);
        return i;
    }
    
    public List<ItemPedido> getItens() {
        if (itens == null) itens = new ArrayList(); 
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", data=" + data + ", cliente=" + cliente + '}';
    }    
}
