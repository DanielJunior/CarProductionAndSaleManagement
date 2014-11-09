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
    private List<PecaEstoque> pecas;

    private Estoque() {
        pecas = new ArrayList<>();
    }
    
    public static Estoque getInstance() {
        if (instance == null) {
            instance = new Estoque();
            return instance;
        }
        return instance;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public PecaEstoque buscaPeca(long id) {
        for (PecaEstoque a : pecas) {
            if (a.getPeca().getId() == id) {
                return a;
            }
        }
        return null;
    }
    
    public void adicionarPecaEstoque(PecaEstoque peca) {
        PecaEstoque p = buscaPeca(peca.getPeca().getId());
        if (p != null) {
            p.setQuantidade(p.getQuantidade() + peca.getQuantidade());
        } else {
            pecas.add(peca);
        }
    }
    
    public void adicionarPecasCompradas(List<PecaFornecida> lista){
        for(PecaFornecida p : lista){
            adicionarPecaEstoque(new PecaEstoque(p.getPeca(), 1));
        }
        System.out.println(pecas.toString());
    }
    
    public List<PecaEstoque> getPecas() {
        return pecas;
    }

    public void setPecas(List<PecaEstoque> pecas) {
        this.pecas = pecas;
    }
}
