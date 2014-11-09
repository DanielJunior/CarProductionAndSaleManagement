/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.BuscaFornecedor;
import interfacegrafica.Receiver;

/**
 *
 * @author lorena
 */
public class ComandoBuscaFornecedor implements Comando {
    
    private BuscaFornecedor bf;

    public ComandoBuscaFornecedor() {
        bf = new BuscaFornecedor();
    }
    
    public ComandoBuscaFornecedor(Receiver r) {
        bf = new BuscaFornecedor(r);
    }

    @Override
    public void executar() {
         bf.setVisible(true);
    }
    
   
}
