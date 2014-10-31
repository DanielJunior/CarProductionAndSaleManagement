/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author danieljr
 */
public class PecaOpcional {

    private int quantidade;
    private Opcional opcional;
    private Peca pecas;

    public PecaOpcional(int quantidade, Opcional opcional, Peca pecas) {
        this.quantidade = quantidade;
        this.opcional = opcional;
        this.pecas = pecas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Opcional getOpcional() {
        return opcional;
    }

    public void setOpcional(Opcional opcional) {
        this.opcional = opcional;
    }

    public Peca getPecas() {
        return pecas;
    }

    public void setPecas(Peca pecas) {
        this.pecas = pecas;
    }
}
