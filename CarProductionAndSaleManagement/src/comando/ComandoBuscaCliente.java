/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.BuscaCliente;
import interfacegrafica.Receiver;

/**
 *
 * @author lorena
 */
public class ComandoBuscaCliente implements Comando{

    private BuscaCliente b;
    public ComandoBuscaCliente(Receiver r) {
        b = new BuscaCliente(r);
    }
    
    

    @Override
    public void executar() {
        b.setVisible(true);
    }
    
}
