/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comando;

import interfacegrafica.CadastraModelo;

/**
 *
 * @author Lorena
 */
public class ComandoCadastraModelo implements Comando{

    private CadastraModelo cm;
    
    public ComandoCadastraModelo() {
        cm = new CadastraModelo();
    } 
   
    @Override
    public void executar() {
        cm.setVisible(true);
    }
    
    
}
