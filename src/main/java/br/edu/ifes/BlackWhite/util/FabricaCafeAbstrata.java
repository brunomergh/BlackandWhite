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
public class FabricaCafeAbstrata implements Fabrica{
    
    protected Cafe cafe;
    protected Agua agua;
    protected Acucar acucar;
    protected Bicarbonato bicarbonato;
    protected Canela canela;
    protected ChocolatePo chocolatePo;
    protected Leite leite;
    protected LeitePo leitePo;
    protected Soluvel soluvel;
    protected ZeroCafeina zeroCafeina;
    
    public FabricaCafeAbstrata()
    {
        this.agua = new Agua(100);
        this.acucar = new Acucar(2);
        
    }
    
    public Cafe criarCafe(){
        return new Cafe();
    }
    
    public Agua criarAgua(){
        return agua;
    }
    
    public ChocolatePo criarChocolatePo()
    {
        return chocolatePo;
    }

    @Override
    public Acucar criarAcucar() {
        return acucar;
    }
    

    @Override
    public Bicarbonato criarBicarbonato() {
        return bicarbonato;
    }

    @Override
    public Canela criarCanela() {
        return canela;
    }

    @Override
    public Leite criarLeite() {
        return leite;
    }

    @Override
    public LeitePo criarLeitePo() {
        return leitePo;
    }

    @Override
    public Soluvel criarSoluvel() {
        return soluvel;
    }

    @Override
    public ZeroCafeina criarZeroCafeina() {
        return zeroCafeina;
    }
    
    
    
}
