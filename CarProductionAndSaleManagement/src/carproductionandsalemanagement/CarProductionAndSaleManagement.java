/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproductionandsalemanagement;

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
        // TODO code application logic here
        PluginLogin c = new PluginLogin();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(280, 140);
        c.setResizable(false);
        c.setVisible(true);
    }

}