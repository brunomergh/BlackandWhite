/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.*;
import java.util.ArrayList;

/**
 *
 * @author 20131bsi0033
 */
public class FabricaCafeCappucino implements Fabrica {

    @Override
    public Cafe criarCafe() {
        return new Cafe();
    }

    @Override
    public ArrayList<Ingrediente> criarIngrediente() {
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        ingredientes.add(new Agua(100));
        ingredientes.add(new Soluvel(100));
        ingredientes.add(new Acucar(200));
        ingredientes.add(new LeitePo(100));        
        ingredientes.add(new Bicarbonato(1));             
        ingredientes.add(new ChocolatePo(50));        
        ingredientes.add(new Canela(1));        
        return ingredientes;
    }    
}
