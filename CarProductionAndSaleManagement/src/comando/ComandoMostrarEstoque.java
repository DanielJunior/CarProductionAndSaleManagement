/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.MostrarEstoque;

/**
 *
 * @author danieljunior
 */
public class ComandoMostrarEstoque implements Comando {
    
    private MostrarEstoque m;
    
    public ComandoMostrarEstoque() {
        m = new MostrarEstoque();
    }
    
    @Override
    public void executar() {
        m.setVisible(true);
    }
    
}
