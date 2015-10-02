/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.app;

import br.edu.ifes.BlackWhite.cdp.Cafe;
import br.edu.ifes.BlackWhite.util.FabricaCafe;

/**
 *
 * @author Bruno
 */
public class Application {
    public static void main(String args[]) {
        Cafe cafe = new Cafe();
        cafe = FabricaCafe.criarCafe("normal");
        System.out.println("cafe: " + cafe);
    }
}

