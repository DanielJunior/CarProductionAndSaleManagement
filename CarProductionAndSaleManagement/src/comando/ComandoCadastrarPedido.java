/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comando;

import interfacegrafica.CadastraPedido;

/**
 *
 * @author Lorena
 */
public class ComandoCadastrarPedido implements Comando {

    private CadastraPedido cp;
    
    public ComandoCadastrarPedido() {
        cp = new CadastraPedido();
    }
    @Override
    public void executar() {
       cp.setVisible(true);
    }
    
    
    
}
