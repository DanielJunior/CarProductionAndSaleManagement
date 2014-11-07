/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.BuscaCliente;

/**
 *
 * @author lorena
 */
public class ComandoBuscaCliente implements Comando{

    private BuscaCliente b;
    public ComandoBuscaCliente() {
        b = new BuscaCliente();
    }
    
    

    @Override
    public void executar() {
        b.setVisible(true);
    }
    
}
