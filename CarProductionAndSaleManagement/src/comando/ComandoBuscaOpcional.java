/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comando;

import interfacegrafica.BuscaOpcional;

/**
 *
 * @author Lorena
 */
public class ComandoBuscaOpcional implements Comando {

    private BuscaOpcional bo;
    
    public ComandoBuscaOpcional() {
        
        bo = new BuscaOpcional();        
    }
    
    @Override
    public void executar() {
        bo.setVisible(true);
    }
    
    
}
