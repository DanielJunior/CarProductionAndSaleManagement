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
    private List<Modelo> modelos;
    private List<Fornecedor> fornecedores;
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
        fornecedores = new ArrayList<>();
        modelos = new ArrayList<>();
        estoque = Estoque.getInstance();
        inicializarAtributos();

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

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public boolean addCliente(Cliente cliente) {
        return clientes.add(cliente);
    }

    public boolean addFuncionario(Funcionario f) {
        return funcionarios.add(new Cadastro(f, this));
    }

    public boolean addPedido(Pedido pedido) {
        return pedidos.add(pedido);
    }

    public Cliente buscarCliente(long identificacao) {
        for (Cliente c : clientes) {
            if (c.getIdentificacao() == identificacao) {
                return c;
            }
        }
        return null;
    }

    public Peca buscarPeca(long id) {
        return estoque.buscaPeca(id);
    }

    public Opcional buscarOpcional(String n) {
        return estoque.buscarOpcional(nome);
    }

    public Fornecedor buscarFornecedor(String nome) {
        for (Fornecedor f : fornecedores) {
            if (f.getNome().compareToIgnoreCase(nome) == 0) {
                return f;
            }
        }
        return null;
    }

    public Modelo buscarModelo(String nome) {
        for (Modelo m : modelos) {
            if (m.getNome().compareToIgnoreCase(nome) == 0) {
                return m;
            }
        }
        return null;
    }

    public boolean cadastrarCliente(Cliente c) {
        if (buscarCliente(c.getIdentificacao()) == null) {
            return clientes.add(c);
        } else {
            return false;
        }
    }

    public boolean cadastrarPedido(Pedido p) {
        return pedidos.add(p);
    }

    public boolean cadastrarModelo(Modelo m) {
        if (buscarModelo(m.getNome()) == null) {
            return modelos.add(m);
        }
        return false;
    }

    public boolean cadastrarFornecedor(Fornecedor f) {
        if (buscarFornecedor(f.getNome()) == null) {
            return fornecedores.add(f);
        }
        return false;
    }

    public boolean cadastrarOpcional(Opcional o, String nomeModelo) {
        Modelo m = buscarModelo(nome);
        if (m != null) {
            return m.cadastrarOpcional(o);
        } else {
            return false;
        }
    }

    public boolean alterarCliente(Cliente c) {
        Cliente aux = buscarCliente(c.getIdentificacao());
        boolean cond = clientes.remove(aux);
        if (cond) {
            return clientes.add(c);
        }
        return false;
    }

    public void verificarEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean autenticar(String nome, String senha) {
        for (Cadastro c : funcionarios) {
            try {
                Gerente g = (Gerente) c.getFuncionario();
                if (g.temPermissao(nome, senha)) {
                    return true;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public List<Cadastro> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Cadastro> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    private void inicializarAtributos() {
        Gerente admin = new Gerente(123, 123, "ADMIN", "ADMIN");
        funcionarios.add(new Cadastro(admin, this));
        clientes.add(new ClienteFisico(123, "Joãozinho", "Rua dos Bobos", "example@example.com", 123456789));
    }
}
