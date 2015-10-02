/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.Cafe;
import br.edu.ifes.BlackWhite.cdp.Ingrediente;
import java.util.ArrayList;

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
        
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        
        ingredientes.add(fabrica.criarAgua());
        ingredientes.add(fabrica.criarAcucar());
        ingredientes.add(fabrica.criarBicarbonato());
        ingredientes.add(fabrica.criarCanela());
        ingredientes.add(fabrica.criarLeitePo());
        ingredientes.add(fabrica.criarLeite());
        ingredientes.add(fabrica.criarSoluvel());
        ingredientes.add(fabrica.criarZeroCafeina());

        cafe.setIngredientes(ingredientes);

        return cafe;
    } 
}
