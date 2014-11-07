/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comando;

import interfacegrafica.CadastraOpcional;

/**
 *
 * @author Lorena
 */
public class ComandoCadastraOpcional implements Comando {

    private CadastraOpcional co;
    public ComandoCadastraOpcional() {
        co = new CadastraOpcional();
    }

    @Override
    public void executar() {
        co.setVisible(true);
    }  
    
}
