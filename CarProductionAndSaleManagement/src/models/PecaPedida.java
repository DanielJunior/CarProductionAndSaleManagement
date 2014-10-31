/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author danieljr
 */
public class PecaPedida {

    private int quantidade;
    private Date data;
    private Peca peca;
    private Fornecedor fornecedor;

    public PecaPedida(int quantidade, Date data, Peca peca, Fornecedor fornecedor) {
        this.quantidade = quantidade;
        this.data = data;
        this.peca = peca;
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

}
