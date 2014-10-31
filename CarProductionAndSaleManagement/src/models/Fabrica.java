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
public class Fabrica {

    private String nome, endereco, email;
    private long cnpj, telefone;
    private List<Cliente> clientes;
    private List<Pedido> pedidos;
    private List<Cadastro> funcionarios;
    private Estoque estoque;

    public Fabrica(String nome, String endereco, String email, long cnpj, long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cnpj = cnpj;
        this.telefone = telefone;
        clientes = new ArrayList<>();
        pedidos = new ArrayList<>();
        funcionarios = new ArrayList<>();
        estoque = Estoque.getInstance();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(new Cadastro(funcionario, this));
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

}
