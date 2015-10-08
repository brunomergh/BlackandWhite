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
 * @author Bruno Dell'Orto
 */
public abstract class BuilderAbstrato implements Builder{
    
    protected Cafe cafe = new Cafe();
    
    ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        
    protected Fabrica fabrica;
    
    
    @Override
    public void preparaAcucar() {
        ingredientes.add(fabrica.criarAcucar());
    }

    @Override
    public void preparaAgua() {
        ingredientes.add(fabrica.criarAgua());
    }

    @Override
    public void preparaBicarbonato() {
        ingredientes.add(fabrica.criarBicarbonato());
    }

    @Override
    public void preparaCanela() {
        ingredientes.add(fabrica.criarCanela());
    }

    @Override
    public void preparaChocolatePo() {
        ingredientes.add(fabrica.criarChocolatePo());
    }

    @Override
    public void preparaLeite() {
        ingredientes.add(fabrica.criarLeite());
    }

    @Override
    public void preparaLeitePo() {
        ingredientes.add(fabrica.criarLeitePo());
    }

    @Override
    public void preparaSoluvel() {
        ingredientes.add(fabrica.criarSoluvel());
    }

    @Override
    public void preparaZeroCafeina() {
        ingredientes.add(fabrica.criarZeroCafeina());
    }

    @Override
    public Cafe ColocaCafeCafeteira() {
        cafe.setIngredientes(ingredientes);
        return cafe;
    }

    
    
}
