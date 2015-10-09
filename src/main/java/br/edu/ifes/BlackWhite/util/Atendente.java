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
public enum Atendente {
    
    INSTANCE;
    
   public synchronized Cafe Promocao(String diaSemana){
        
        Cafe cafe = new Cafe();
        
        if ("segunda-feira".equals(diaSemana) || "quarta-feira".equals(diaSemana) || ("sexta-feira".equals(diaSemana))){
            cafe = FabricaCafe.criarCafe("normal");
            cafe.setPreco(cafe.getPreco()/2);
        }else if ("terca-feira".equals(diaSemana) || "quinta-feira".equals(diaSemana) || ("sabado".equals(diaSemana))) {
            cafe = FabricaCafe.criarCafe("zero cafeina");
            cafe.setPreco(cafe.getPreco()/2);
        }else if ("domingo".equals(diaSemana)){
            cafe = FabricaCafe.criarCafe("cappucino");
            cafe.setPreco(cafe.getPreco()/2);  
        }
        return cafe;
    }    
}
