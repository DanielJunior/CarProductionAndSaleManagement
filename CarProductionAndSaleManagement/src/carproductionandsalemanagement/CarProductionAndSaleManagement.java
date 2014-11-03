/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproductionandsalemanagement;

import interfacegrafica.MenuPrincipal;
import interfacegrafica.PluginLogin;
import javax.swing.JFrame;

/**
 *
 * @author danieljr
 */
public class CarProductionAndSaleManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MenuPrincipal mp = new MenuPrincipal();
        mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mp.setSize(650, 200);
        mp.setResizable(false);
        mp.setVisible(true);

    }

}