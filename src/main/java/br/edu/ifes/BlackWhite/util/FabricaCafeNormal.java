/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.*;

/**
 *
 * @author 20131bsi0033
 */
public class FabricaCafeNormal extends FabricaCafeAbstrata{

    public FabricaCafeNormal(){
        
        this.soluvel = new Soluvel(50);
        this.leite = new Leite(100);
        
    }

}
