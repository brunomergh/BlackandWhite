/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.Cafe;

/**
 *
 * @author 20131bsi0033
 */
public class FabricaCafe {
    
    public static Cafe criarCafe(String nome) {
        Fabrica fabrica;
        
        if(nome.equals("normal")) {
            fabrica = new FabricaCafeNormal();
        }else if(nome.equals("zero cafeina")) {
            fabrica = new FabricaCafeSemCafeina();            
        }else {
            fabrica = new FabricaCafeCappucino();                        
        }
        
        Cafe cafe = fabrica.criarCafe();
        cafe.setIngredientes(fabrica.criarIngrediente());
        return cafe;
    } 
}
