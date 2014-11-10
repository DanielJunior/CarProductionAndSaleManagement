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
import models.PecaEstoque;
import models.PecaFornecida;
import models.Pedido;

/**
 *
 * @author danieljr
 */
public interface Fachada {
 
    public boolean cadastrarCliente(String nome,long identificacao, String endereco, String email, long telefone, byte tipo);
    public boolean cadastrarPedido(Pedido p);
    public boolean cadastrarModelo(String nome, String descricao, int ano, double valor);
    public boolean cadastrarFornecedor(String nome, String email, long telefone);
    public boolean cadastrarOpcional(String nome, String descricao, double valor, String nomeModelo);
    public void adicionarPecasCompradas(List<PecaFornecida> lista);
    public List<PecaFornecida> listarPecasFornecidas();
    public PecaEstoque buscarPecaEstoque(long id);
    public List<PecaEstoque> listarPecasEstoque();
    
    public Cliente buscarCliente(long identificacao);
    public Opcional buscarOpcional(String nome);
    public Peca buscarPeca(long id);
    public Fornecedor buscarFornecedor(String nome);
    public Modelo buscarModelo(String nome);
    public List<Pedido> gerarRelatorio();
    public boolean alterarCliente(Cliente c);
    public boolean verificarEstoque(Peca p);
    public boolean verificarEstoque(Opcional o);

    public boolean autenticar(String text, char[] password);
}
