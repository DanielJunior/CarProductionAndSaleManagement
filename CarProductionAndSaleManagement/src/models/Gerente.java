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
public class Gerente extends Funcionario {

    public Gerente(long cpf, long ctps, String nome, String senha) {
        super(cpf, ctps, nome, senha);
    }

    public boolean temPermissao(String nome, String senha) {
        if ((getNome().compareToIgnoreCase(nome) == 0) && (getSenha().compareToIgnoreCase(senha) == 0)) {
            return true;
        }
        return false;
    }

}
