/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import interfacegrafica.CadastraFornecedor;

/**
 *
 * @author danieljr
 */
public class ComandoCadastraFornecedor implements Comando {

    private CadastraFornecedor f;

    public ComandoCadastraFornecedor() {
        f = new CadastraFornecedor();
    }

    @Override
    public void executar() {
        f.setVisible(true);
    }

}
