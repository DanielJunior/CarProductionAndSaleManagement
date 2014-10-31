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
public class Fornecedor {

    private String nome, email;
    private long telefone;
    private List<Peca> catalago_pecas;
    private List<PecaPedida> pedidos_de_peca;
    private List<PecaFornecida> fornecimentos;

    public Fornecedor(String nome, String email, long telefone, List<Peca> catalago_pecas, List<PecaPedida> pedidos_de_peca) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.catalago_pecas = catalago_pecas;
        this.pedidos_de_peca = pedidos_de_peca;
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

    public List<Peca> getCatalago_pecas() {
        return catalago_pecas;
    }

    public void setCatalago_pecas(List<Peca> catalago_pecas) {
        this.catalago_pecas = catalago_pecas;
    }

    public List<PecaPedida> getPedidos_de_peca() {
        return pedidos_de_peca;
    }

    public void setPedidos_de_peca(List<PecaPedida> pedidos_de_peca) {
        this.pedidos_de_peca = pedidos_de_peca;
    }

    public List<PecaFornecida> getFornecimentos() {
        return fornecimentos;
    }

    public void setFornecimentos(List<PecaFornecida> fornecimentos) {
        this.fornecimentos = fornecimentos;
    }
}
