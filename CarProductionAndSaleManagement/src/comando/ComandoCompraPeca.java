/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.CompraPeca;
import interfacegrafica.Receiver;

/**
 *
 * @author danieljunior
 */
public class ComandoCompraPeca implements Comando {

    private CompraPeca c;

    public ComandoCompraPeca(Receiver r) {
        c = new CompraPeca(r);
    }

    @Override
    public void executar() {
        c.setVisible(true);
    }

}
