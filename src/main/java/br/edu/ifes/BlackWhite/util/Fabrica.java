/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.Acucar;
import br.edu.ifes.BlackWhite.cdp.Agua;
import br.edu.ifes.BlackWhite.cdp.Bicarbonato;
import br.edu.ifes.BlackWhite.cdp.Cafe;
import br.edu.ifes.BlackWhite.cdp.Canela;
import br.edu.ifes.BlackWhite.cdp.ChocolatePo;
import br.edu.ifes.BlackWhite.cdp.Leite;
import br.edu.ifes.BlackWhite.cdp.LeitePo;
import br.edu.ifes.BlackWhite.cdp.Soluvel;
import br.edu.ifes.BlackWhite.cdp.ZeroCafeina;

/**
 *
 * @author 20131bsi0033
 */
public interface Fabrica {
    
    public Cafe criarCafe();
    
    public Acucar criarAcucar();
    
    public Agua criarAgua();    
    
    public Bicarbonato criarBicarbonato();
    
    public Canela criarCanela();
    
    public ChocolatePo criarChocolatePo();
    
    public Leite criarLeite();
    
    public LeitePo criarLeitePo();
    
    public Soluvel criarSoluvel();
    
    public ZeroCafeina criarZeroCafeina();
    
    
    
    
    
}
