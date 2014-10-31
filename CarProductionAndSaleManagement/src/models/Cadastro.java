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
public class Cadastro {

    private Funcionario funcionario;
    private Fabrica fabrica;
    private long cpf, ctps;
    private String nome, senha;

    public Cadastro(Funcionario funcionario, Fabrica fabrica) {
        this.funcionario = funcionario;
        this.fabrica = fabrica;
        this.cpf = funcionario.getCpf();
        this.ctps = funcionario.getCtps();
        this.nome = funcionario.getNome();
        this.senha = funcionario.getSenha();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCtps() {
        return ctps;
    }

    public void setCtps(long ctps) {
        this.ctps = ctps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
