/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.cdp;

import java.util.ArrayList;

/**
 *
 * @author 20131bsi0033
 */
public class Cafe {
    protected double preco;
    protected String name;
    protected ArrayList<Ingrediente> ingredientes;
    
    public Cafe() {
    }

    public Cafe(double preco, String name) {
        this.preco = preco;
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Cafe(int preco, ArrayList<Ingrediente> ingrediente){
        this.preco = preco;
        this.ingredientes = ingrediente;

    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
