/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;
import models.Cliente;
import models.Fabrica;
import models.Fornecedor;
import models.Modelo;
import models.Opcional;
import models.Peca;
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
            return new Sistema();
        }
        return instance;
    }
    
    @Override
    public boolean cadastrarCliente(Cliente c) {
        return fabrica.addCliente(c);
    }
    
    @Override
    public boolean cadastrarPedido(Pedido p) {
        return fabrica.cadastrarPedido(p);
    }
    
    @Override
    public boolean cadastrarModelo(Modelo m) {
        return fabrica.cadastrarModelo(m);
    }
    
    @Override
    public boolean cadastrarFornecedor(Fornecedor f) {
        return fabrica.cadastrarFornecedor(f);
    }
    
    @Override
    public boolean cadastrarOpcional(Opcional o, Modelo m) {
        return fabrica.cadastrarOpcional(o, m);
    }
    
    @Override
    public Cliente buscarCliente(long identificacao) {
        return fabrica.buscarCliente(identificacao);
    }
    
    @Override
    public Opcional buscarOpcional(String nome) {
        return fabrica.buscarOpcional(nome);
    }
    
    @Override
    public Fornecedor buscarFornecedor(String nome) {
        return fabrica.buscarFornecedor(nome);
    }
    
    @Override
    public Peca buscarPeca(long id) {
        return fabrica.buscarPeca(id);
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
    public boolean alterarCliente(Cliente c) {
        return fabrica.alterarCliente(c);
    }
    
    @Override
    public void verificarEstoque() {
        fabrica.verificarEstoque();
    }
    
    @Override
    public boolean autenticar(String text, char[] password) {
        return fabrica.autenticar(text, new String(password));
    }
    
}
