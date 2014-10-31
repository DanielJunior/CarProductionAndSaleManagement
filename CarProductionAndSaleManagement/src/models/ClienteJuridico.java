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
public class ClienteJuridico extends Cliente {

    private long cnpj;

    public ClienteJuridico(long cnpj, String nome, String endereco, String email, long telefone) {
        super(nome, endereco, email, telefone);
        this.cnpj = cnpj;
    }

    @Override
    public long getIdentificacao() {
        return cnpj;
    }

    @Override
    public void setIdentificacao(long identificacao) {
        cnpj = identificacao;
    }
}
