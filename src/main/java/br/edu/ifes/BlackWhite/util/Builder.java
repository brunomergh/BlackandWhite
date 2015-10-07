/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.*;

/**
 *
 * @author Bruno Dell'Orto
 */
public interface Builder {
    
    public void preparaAcucar();
    
    public void preparaAgua();    
    
    public void preparaBicarbonato();
    
    public void preparaCanela();
    
    public void preparaChocolatePo();
    
    public void preparaLeite();
    
    public void preparaLeitePo();
    
    public void preparaSoluvel();
    
    public void preparaZeroCafeina();
    
    public Cafe ColocaCafeCafeteira();
    
}
