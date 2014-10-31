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
class PecaFornecida {

    private double valor;
    private Date prazoEntrega;
    private Fornecedor fornecedor;
    private Peca peca;

    public PecaFornecida(double valor, Date prazoEntrega, Fornecedor fornecedor, Peca peca) {
        this.valor = valor;
        this.prazoEntrega = prazoEntrega;
        this.fornecedor = fornecedor;
        this.peca = peca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(Date prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

}
