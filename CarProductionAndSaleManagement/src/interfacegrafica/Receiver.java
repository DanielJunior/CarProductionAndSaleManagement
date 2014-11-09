/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import java.util.List;
import models.Cliente;
import models.Fornecedor;
import models.Modelo;
import models.PecaEstoque;
import models.PecaFornecida;

/**
 *
 * @author danieljunior
 */
public interface Receiver {
    
    public void receberCliente(Cliente c);
    public void receberFornecedor(Fornecedor f);
    public void receberModelo(Modelo m);
    public void receberPecasCompradas(List<PecaFornecida> lista);
    public void receberPecaEstoque(PecaEstoque p);
    
}
