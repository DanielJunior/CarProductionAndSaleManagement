/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author danieljunior
 */
public class PecaEstoque {

    private Peca peca;
    private int quantidade;

    public PecaEstoque(Peca peca, int quantidade) {
        this.peca = peca;
        this.quantidade = quantidade;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String toString(){
    return "NOME: "+peca.getNome()+" - QTD: "+quantidade;
    }
}
