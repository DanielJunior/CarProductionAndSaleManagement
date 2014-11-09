/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.BuscaModelo;
import interfacegrafica.Receiver;

/**
 *
 * @author lorena
 */
public class ComandoBuscaModelo implements Comando{
    
    private BuscaModelo bm;
    
    public ComandoBuscaModelo (Receiver r) {
        bm = new BuscaModelo(r);
    }

    @Override
    public void executar() {
       bm.setVisible(true);
    }
    
    
    
    
}
