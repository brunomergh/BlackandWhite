/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.BlackWhite.cdp.*;
import br.edu.ifes.BlackWhite.cdp.Agua;
import br.edu.ifes.BlackWhite.util.FabricaCafe;
import br.edu.ifes.BlackWhite.util.FabricaCafeCappucino;
import junit.framework.TestCase;

/**
 *
 * @author 20131bsi0033
 */
public class Testes extends TestCase {
    
   

    // TODO add test methods here. The name must begin with 'test'. For example:
    public void testAgua() {
        Agua agua = new Agua(10);
        assertEquals(agua.getQtd(), 10);
    }
    
    public void testAcucar() {
        Acucar acucar = new Acucar(10);
        assertEquals(acucar.getQtd(), 10);
    }
    
    public void testBicarbonato() {
        Bicarbonato bicarbonato = new Bicarbonato(10);
        assertEquals(bicarbonato.getQtd(), 10);
    }
    
    public void testCafe() {
        Cafe cafe = new Cafe();
        cafe.setPreco(12);
        assertEquals(cafe.getPreco(), 12.0);
    }
        
    public void testCanela() {
        Canela canela = new Canela(10);
        assertEquals(canela.getQtd(), 10);
    }
    
    public void testChocolatePo() {
        ChocolatePo chocolatePo = new ChocolatePo(10);
        assertEquals(chocolatePo.getQtd(), 10);
    }
    
    public void testLeite() {
        Leite leite = new Leite(10);
        assertEquals(leite.getQtd(), 10);
    }
    
    public void testeLeitePo() {
        LeitePo leitePo = new LeitePo(10);
        assertEquals(leitePo.getQtd(), 10);
    }
    
    public void testSoluvel() {
        Soluvel soluvel = new Soluvel(10);
        assertEquals(soluvel.getQtd(), 10);
    }
    
    public void testZeroCafeina() {
        ZeroCafeina zeroCafeina = new ZeroCafeina(10);
        assertEquals(zeroCafeina.getQtd(), 10);
    }
    
    public void testFabricaCafe() {
        FabricaCafe fabrica = new FabricaCafe();
        Cafe criarCafe = fabrica.criarCafe("normal");
        assertEquals(criarCafe.getIngredientes().get(3), null);
    }
    
    public void testFabricaCafeCappucino() {
        FabricaCafeCappucino fcc = new FabricaCafeCappucino();
        assertEquals(fcc.criarAcucar().toString(), "2 xicara de acucar");
    }
    
}
