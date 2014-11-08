/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.AlteraCliente;

/**
 *
 * @author danieljunior
 */
public class ComandoAlteraCliente implements Comando {

    private AlteraCliente a;

    public ComandoAlteraCliente() {
        a = new AlteraCliente();
    }

    @Override
    public void executar() {
        a.setVisible(true);
    }

}
