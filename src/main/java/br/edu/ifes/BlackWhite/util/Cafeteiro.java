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
public class Cafeteiro implements Director{
    
    
    
    @Override
    public Cafe criarCafe(Builder ajudante) {
        
        Cafe cafe = null;
        
        ajudante.preparaAcucar();
        ajudante.preparaAgua();
        ajudante.preparaBicarbonato();
        ajudante.preparaCanela();
        ajudante.preparaChocolatePo();
        ajudante.preparaLeite();
        ajudante.preparaLeitePo();
        ajudante.preparaSoluvel();
        ajudante.preparaZeroCafeina();
        cafe = ajudante.ColocaCafeCafeteira();
        
        return cafe;
    }
    
  
}