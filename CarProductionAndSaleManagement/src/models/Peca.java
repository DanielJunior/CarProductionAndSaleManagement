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
public class Peca {

    private long id;
    private String nome, descricao;
    private List<PecaModelo> modelos;
    private List<PecaPedida> pedidosDefornecedores;
    private List<PecaFornecida> fornecedores;
    private List<PecaOpcional> opcionais;

    public Peca(long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        modelos = new ArrayList<>();
        pedidosDefornecedores = new ArrayList<>();
        fornecedores = new ArrayList<>();
        opcionais = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<PecaModelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<PecaModelo> modelos) {
        this.modelos = modelos;
    }

    public List<PecaPedida> getPedidosDefornecedores() {
        return pedidosDefornecedores;
    }

    public void setPedidosDefornecedores(List<PecaPedida> pedidosDefornecedores) {
        this.pedidosDefornecedores = pedidosDefornecedores;
    }

    public List<PecaFornecida> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<PecaFornecida> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public List<PecaOpcional> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(List<PecaOpcional> opcionais) {
        this.opcionais = opcionais;
    }
}
