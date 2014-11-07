/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comando;

import interfacegrafica.BuscaPeca;

/**
 *
 * @author Lorena
 */
public class ComandoBuscaPeca implements Comando {
    
    private BuscaPeca bp;
    
    public ComandoBuscaPeca () {
        bp = new BuscaPeca();
    }

    @Override
    public void executar() {
        bp.setVisible(true);
    }
      
}
