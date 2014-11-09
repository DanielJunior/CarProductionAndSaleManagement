/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import java.util.List;
import models.Cliente;
import models.ClienteFisico;
import models.ClienteJuridico;
import models.Fabrica;
import models.Fornecedor;
import models.Modelo;
import models.Opcional;
import models.Peca;
import models.PecaEstoque;
import models.PecaFornecida;
import models.Pedido;

/**
 *
 * @author danieljr
 */
public class Sistema implements Fachada {

    private static Sistema instance = null;
    private Fabrica fabrica;

    private Sistema() {
        fabrica = new Fabrica("CarSale", "Avenida das Construtoras - 123", "carsale@carsale.com", 123456789, 123456789);
    }

    public static Sistema getInstance() {
        if (instance == null) {
            instance = new Sistema();
            return instance;
        }
        return instance;
    }

    @Override
    public boolean cadastrarPedido(Pedido p) {
        return fabrica.cadastrarPedido(p);
    }

    @Override
    public Cliente buscarCliente(long identificacao) {
        return fabrica.buscarCliente(identificacao);
    }

    @Override
    public Opcional buscarOpcional(String nome) {
//        return fabrica.buscarOpcional(nome);
        return null;
    }

    @Override
    public Fornecedor buscarFornecedor(String nome) {
        return fabrica.buscarFornecedor(nome);
    }

    @Override
    public Peca buscarPeca(long id) {
//        return fabrica.buscarPeca(id);
        return null;
    }

    @Override
    public Modelo buscarModelo(String nome) {
        return fabrica.buscarModelo(nome);
    }

    @Override
    public List<Pedido> gerarRelatorio() {
        return fabrica.getPedidos();
    }

    @Override
    public void verificarEstoque() {
        fabrica.verificarEstoque();
    }

    @Override
    public boolean autenticar(String text, char[] password) {
        return fabrica.autenticar(text, new String(password));
    }

    @Override
    public boolean cadastrarCliente(String nome, long identificacao, String endereco, String email, long telefone, byte tipo) {
        if (tipo == Cliente.JURIDICO) {
            return fabrica.cadastrarCliente(new ClienteJuridico(identificacao, nome, endereco, email, telefone));
        } else {
            boolean e = false;
            return fabrica.cadastrarCliente(new ClienteFisico(identificacao, nome, endereco, email, telefone));
        }
    }

    @Override
    public boolean cadastrarModelo(String nome, String descricao, int ano, double valor) {
        return fabrica.cadastrarModelo(new Modelo(nome, descricao, ano, valor, new ArrayList<>(), new ArrayList<>()));
    }

    @Override
    public boolean cadastrarFornecedor(String nome, String email, long telefone) {
        return fabrica.cadastrarFornecedor(new Fornecedor(nome, email, telefone, new ArrayList<>(), new ArrayList<>()));
    }

    @Override
    public boolean cadastrarOpcional(String nome, String descricao, double valor, String nomeModelo) {
        return fabrica.cadastrarOpcional(new Opcional(nome, descricao, valor, new ArrayList<Modelo>(), new ArrayList<>()), nomeModelo);
    }

    @Override
    public boolean alterarCliente(Cliente c) {
        return fabrica.alterarCliente(c);
    }

    @Override
    public List<PecaFornecida> listarPecasFornecidas() {
        return fabrica.listarPecasFornecedores();
    }

    @Override
    public void adicionarPecasCompradas(List<PecaFornecida> lista) {
        fabrica.getEstoque().adicionarPecasCompradas(lista);
    }

    @Override
    public PecaEstoque buscarPecaEstoque(long id) {
        return fabrica.getEstoque().buscaPeca(id);
    }

    @Override
    public List<PecaEstoque> listarPecasEstoque() {
        return fabrica.getEstoque().getPecas();
    }

}
