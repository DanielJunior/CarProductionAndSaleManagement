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
public class Modelo {

    private String nome, descricao;
    private int ano;
    private double valor;
    private List<Opcional> opcionais;
    private List<PecaModelo> pecas;

    public Modelo(String nome, String descricao, int ano, double valor, List<Opcional> opcionais, List<PecaModelo> pecas) {
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
        this.valor = valor;
        this.opcionais = opcionais;
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

    public List<Opcional> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(List<Opcional> opcionais) {
        this.opcionais = opcionais;
    }

    public Opcional buscarOpcional(String nome) {
        for (Opcional o : opcionais) {
            if (o.getNome().compareToIgnoreCase(nome) == 0) {
                return o;
            }
        }
        return null;
    }

    public boolean cadastrarOpcional(Opcional o) {
        if (buscarOpcional(o.getNome()) == null) {
            return opcionais.add(o);
        }
        return false;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<PecaModelo> getPecas() {
        return pecas;
    }

    public void setPecas(List<PecaModelo> pecas) {
        this.pecas = pecas;
    }
}
