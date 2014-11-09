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
public class Fornecedor {

    private String nome, email;
    private long telefone;
    private List<Peca> catalagoPecas;
    private List<PecaPedida> pedidosDePeca;
    private List<PecaFornecida> fornecimentos;

    public Fornecedor(String nome, String email, long telefone, List<Peca> catalago_pecas, List<PecaPedida> pedidos_de_peca) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.catalagoPecas = catalago_pecas;
        this.pedidosDePeca = pedidos_de_peca;
    }

    public Fornecedor(String nome, String email, long telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        catalagoPecas = new ArrayList<>();
        pedidosDePeca = new ArrayList<>();
        fornecimentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public List<PecaFornecida> getFornecimentos() {
        return fornecimentos;
    }

    public void setFornecimentos(List<PecaFornecida> fornecimentos) {
        this.fornecimentos = fornecimentos;
    }

    public List<Peca> getCatalagoPecas() {
        return catalagoPecas;
    }

    public void setCatalagoPecas(List<Peca> catalagoPecas) {
        this.catalagoPecas = catalagoPecas;
    }

    public List<PecaPedida> getPedidosDePeca() {
        return pedidosDePeca;
    }

    public void setPedidosDePeca(List<PecaPedida> pedidosDePeca) {
        this.pedidosDePeca = pedidosDePeca;
    }
}
