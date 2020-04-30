/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.math.BigDecimal;

/**
 *
 * @author miguel
 */
public class ItemPedido {
    
    private Pedido pedido;
    private Peca peca;
    private long qtd;
    private BigDecimal vrUnitario;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public long getQtd() {
        return qtd;
    }

    public void setQtd(long qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getVrUnitario() {
        return vrUnitario;
    }

    public void setVrUnitario(BigDecimal vrUnitario) {
        this.vrUnitario = vrUnitario;
    }
    
    
}
