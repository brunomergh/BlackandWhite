
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.Cafe;
import java.util.HashMap;

/**
 *
 * @author 20131bsi0033
 */
public class FabricaCafeMagic {
    private HashMap<String,Builder> builders = new HashMap<>();
    
    private static FabricaCafeMagic fabricaCafeMagic;
    
    private FabricaCafeMagic(){
        builders.put("normal", new CafeNormalBuilder());
        builders.put("zero cafeina", new CafeSemCafeinaBuilder());
        builders.put("cappucino", new CafeCappucinoBuilder());
    }
    
    public static synchronized FabricaCafeMagic getInstance(){
        
        if (fabricaCafeMagic == null) {
            fabricaCafeMagic = new FabricaCafeMagic();
        }        
        return fabricaCafeMagic;
    }
    
    public synchronized Cafe criarCafe(String nome) {

        Cafeteiro atendente = new Cafeteiro();
        Builder builder = builders.get(nome);
        Cafe cafe = atendente.criarCafe(builder);
       
        return cafe;
    }    
}
