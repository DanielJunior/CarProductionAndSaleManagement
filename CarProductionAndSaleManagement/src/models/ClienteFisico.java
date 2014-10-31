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
public class ClienteFisico extends Cliente {

    private long cpf;

    public ClienteFisico(long cpf, String nome, String endereco, String email, long telefone) {
        super(nome, endereco, email, telefone);
        this.cpf = cpf;
    }

    @Override
    public long getIdentificacao() {
        return cpf;
    }

    @Override
    public void setIdentificacao(long identificacao) {
        cpf = identificacao;
    }
}
