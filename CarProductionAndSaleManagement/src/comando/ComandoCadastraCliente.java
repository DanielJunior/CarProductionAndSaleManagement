/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.CadastraCliente;

/**
 *
 * @author danieljr
 */
public class ComandoCadastraCliente implements Comando {

    CadastraCliente c;

    public ComandoCadastraCliente() {
        c = new CadastraCliente();

    }

    @Override
    public void executar() {
        c.setVisible(true);
    }

}
