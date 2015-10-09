/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.BlackWhite.cdp.Cafe;
import br.edu.ifes.BlackWhite.util.Atendente;
import br.edu.ifes.BlackWhite.util.CafeCappucinoBuilder;
import br.edu.ifes.BlackWhite.util.CafeNormalBuilder;
import br.edu.ifes.BlackWhite.util.CafeSemCafeinaBuilder;
import br.edu.ifes.BlackWhite.util.Cafeteiro;
import br.edu.ifes.BlackWhite.util.FabricaCafe;
import br.edu.ifes.BlackWhite.util.Promocional;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno Dell'Orto
 */
public class Testes2 {
    
    Cafe cafe;
    Cafeteiro atendente;
    
    public Testes2() {
    }
    
    @Before
    public void setUp() {
        cafe = new Cafe();
        atendente = new Cafeteiro();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestarSegundaFeira() {
        
        Cafe cafe = Atendente.INSTANCE.Promocao("segunda-feira");
        Assert.assertEquals(1.0, cafe.getPreco());
        assertEquals("normal", cafe.toString());
    }
    
    @Test
    public void TestarTercaFeira() {
        
        Cafe cafe = Atendente.INSTANCE.Promocao("terca-feira");
        Assert.assertEquals(1.5, cafe.getPreco());
        assertEquals("zero cafeina", cafe.toString());
    }

    @Test
    public void TestarQuartaFeira() {
        
        Cafe cafe = Atendente.INSTANCE.Promocao("quarta-feira");
        Assert.assertEquals(1.0, cafe.getPreco());
        assertEquals("normal", cafe.toString());
    }
    
    @Test
    public void TestarQuintaFeira() {
        
        Cafe cafe = Atendente.INSTANCE.Promocao("quinta-feira");
        Assert.assertEquals(1.5, cafe.getPreco());
        assertEquals("zero cafeina", cafe.toString());
    }
    
    @Test
    public void TestarSextaFeira() {
        
        Cafe cafe =Atendente.INSTANCE.Promocao("sexta-feira");
        Assert.assertEquals(1.0, cafe.getPreco());
        assertEquals("normal", cafe.toString());
    }
    
    @Test
    public void TestarSabado() {
        
        Cafe cafe =Atendente.INSTANCE.Promocao("sabado");
        Assert.assertEquals(1.5, cafe.getPreco());
        assertEquals("zero cafeina", cafe.toString());
    }
    
    @Test
    public void TestarDomingo() {
        
        Cafe cafe =Atendente.INSTANCE.Promocao("domingo");
        Assert.assertEquals(2.5, cafe.getPreco());
        assertEquals("cappucino", cafe.toString());
    }
    
    @Test
    public void TestarCafeNormal() {
        cafe = FabricaCafe.criarCafe("normal");
        Assert.assertEquals(2.0, cafe.getPreco());
        assertEquals("normal", cafe.toString());
    }

    @Test
    public void TestarCafeSemCafeina() {
        cafe = FabricaCafe.criarCafe("zero cafeina");
        Assert.assertEquals(3.0, cafe.getPreco());
        assertEquals("zero cafeina", cafe.toString());
    }

    @Test
    public void TestarCafeCappucino() {
        cafe = FabricaCafe.criarCafe("cappucino");
        Assert.assertEquals(5.0, cafe.getPreco());
        assertEquals("cappucino", cafe.toString());
    }
    
    @Test
    public void TestarCafeNormalBuilder() {
        cafe = atendente.criarCafe(new CafeNormalBuilder());
        Assert.assertEquals(2.0, cafe.getPreco());
        assertEquals("normal", cafe.toString());
    }
    
    @Test
    public void TestarCafeSemCafeinaBuilder() {
        cafe = atendente.criarCafe(new CafeSemCafeinaBuilder());
        Assert.assertEquals(3.0, cafe.getPreco());
        assertEquals("zero cafeina", cafe.toString());
    }
    
   @Test
    public void TestarCafeCappucinoBuilder() {
        cafe = atendente.criarCafe(new CafeCappucinoBuilder());
        Assert.assertEquals(5.0, cafe.getPreco());
        assertEquals("cappucino", cafe.toString());
    } 
}
