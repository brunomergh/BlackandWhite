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
public class FabricaCafeCappucino extends FabricaCafeAbstrata {

    public FabricaCafeCappucino(){
        
        this.soluvel = new Soluvel(100);
        this.leitePo = new LeitePo(100);   
        this.bicarbonato = new Bicarbonato(1);        
        this.chocolatePo = new ChocolatePo(50); 
        this.canela = new Canela(1); 
     
        
    }

        
}
