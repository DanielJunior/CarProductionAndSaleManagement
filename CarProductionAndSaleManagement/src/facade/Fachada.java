/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;
import models.Cliente;
import models.Fornecedor;
import models.Modelo;
import models.Opcional;
import models.Peca;
import models.Pedido;

/**
 *
 * @author danieljr
 */
public interface Fachada {
 
    public boolean cadastrarCliente(Cliente c);
    public boolean cadastrarPedido(Pedido p);
    public boolean cadastrarModelo(Modelo m);
    public boolean cadastrarFornecedor(Fornecedor f);
    public boolean cadastrarOpcional(Opcional o, Modelo m);
    
    public Cliente buscarCliente(long identificacao);
    public Opcional buscarOpcional(String nome);
    public Peca buscarPeca(long id);
    public Fornecedor buscarFornecedor(String nome);
    public Modelo buscarModelo(String nome);
    public List<Pedido> gerarRelatorio();
    public boolean alterarCliente(Cliente c);
    public void verificarEstoque();
    
}
