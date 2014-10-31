/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author danieljr
 */
public class Opcional {

    private String nome, descricao;
    private double valor;
    private List<Modelo> modelos;
    private List<PecaOpcional> pecas;

    public Opcional(String nome, String descricao, double valor, List<Modelo> modelos, List<PecaOpcional> pecas) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.modelos = modelos;
        this.pecas = pecas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public List<PecaOpcional> getPecas() {
        return pecas;
    }

    public void setPecas(List<PecaOpcional> pecas) {
        this.pecas = pecas;
    }
}
