/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danieljr
 */
public class Estoque {

    private int quantidade;
    private static Estoque instance = null;
    private List<Peca> pecas;

    private Estoque() {
        pecas = new ArrayList<>();
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

    public boolean addPeca(Peca p) {
        if (buscaPeca(p.getId()) == null) {
            return pecas.add(p);
        }
        return false;
    }

    public Peca buscaPeca(long id) {
        for (Peca a : pecas) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

    public Opcional buscarOpcional(String nome) {
        for (Peca p : pecas) {
            Opcional o = p.buscarOpcional(nome);
            if (o != null) {
                return o;
            }
        }
        return null;
    }
}
