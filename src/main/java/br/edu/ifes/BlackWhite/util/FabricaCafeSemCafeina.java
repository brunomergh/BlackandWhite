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
public class FabricaCafeSemCafeina implements Fabrica {

    @Override
    public Cafe criarCafe() {
        return new Cafe();
    }

    @Override
    public ArrayList<Ingrediente> criarIngrediente() {
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        ingredientes.add(new Agua(100));
        ingredientes.add(new ZeroCafeina(50));
        ingredientes.add(new Acucar(2));
        ingredientes.add(new Leite(1));        
        return ingredientes;
    }  
}
