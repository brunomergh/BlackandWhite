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
public class CafeNormalBuilder extends BuilderAbstrato{
    

    
    public CafeNormalBuilder()
    {
        cafe.setPreco(2.0);
        cafe.setName("normal");
        this.fabrica = new FabricaCafeNormal();
    }
    
}
