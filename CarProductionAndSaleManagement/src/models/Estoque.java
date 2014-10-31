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
public class Estoque {

    private int quantidade;
    private static Estoque instance = null;

    private Estoque() {
    }

    public static Estoque getInstance() {
        if (instance == null) {
            return new Estoque();
        }
        return instance;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
