/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.Cafe;

/**
 *
 * @author Bruno Dell'Orto
 */
public class CafeCappucinoBuilder extends BuilderAbstrato {
    
    
    public CafeCappucinoBuilder() {
        cafe.setPreco(5.0);
        this.fabrica = new FabricaCafeCappucino();
    }
    
}
