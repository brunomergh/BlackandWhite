/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.app;

import br.edu.ifes.BlackWhite.cdp.Cafe;
import br.edu.ifes.BlackWhite.util.CafeCappucinoBuilder;
import br.edu.ifes.BlackWhite.util.CafeNormalBuilder;
import br.edu.ifes.BlackWhite.util.CafeSemCafeinaBuilder;
import br.edu.ifes.BlackWhite.util.Cafeteiro;
import br.edu.ifes.BlackWhite.util.FabricaCafe;
import br.edu.ifes.BlackWhite.util.Promocional;

/**
 *
 * @author Bruno
 */
public class Application {
    public static void main(String args[]) {
        
        Promocional dia = new Promocional();
        Cafe cafep = dia.Promocao("domingo");
        System.out.println("preco: " + cafep.getPreco());
        
        Cafe cafe = FabricaCafe.criarCafe("normal");
        System.out.println("cafe normal: " + cafe);
        System.out.println("preco: " + cafe.getPreco());
        
        cafe = FabricaCafe.criarCafe("zero cafeina");
        System.out.println("cafe zero cafeina: " + cafe);
        System.out.println("preco: " + cafe.getPreco());
        
        cafe = FabricaCafe.criarCafe("cappucino");
        System.out.println("cafe cappucino: " + cafe);
        System.out.println("preco: " + cafe.getPreco());
        
        Cafeteiro atendente = new Cafeteiro();
        Cafe cafe2 = atendente.criarCafe(new CafeNormalBuilder());
        Cafe cafe3 = atendente.criarCafe(new CafeSemCafeinaBuilder());
        Cafe cafe4 = atendente.criarCafe(new CafeCappucinoBuilder());
        System.out.println("cafe builder: " + cafe2);
        System.out.println("Preco builder: " + cafe2.getPreco());
        System.out.println("cafe builder: " + cafe3);
        System.out.println("Preco builder: " + cafe3.getPreco());
        System.out.println("cafe builder: " + cafe4);
        System.out.println("Preco builder: " + cafe4.getPreco());
    }
}

