/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.BlackWhite.cdp.Cafe;
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
        
        Promocional dia = new Promocional();
        cafe = dia.Promocao("segunda-feira");
        System.out.println("Preco Segunda: " + cafe.getPreco());
    }
    
    @Test
    public void TestarTercaFeira() {
        
        Promocional dia = new Promocional();
        cafe = dia.Promocao("terca-feira");
        System.out.println("Preco terca: " + cafe.getPreco());
    }

    @Test
    public void TestarQuartaFeira() {
        
        Promocional dia = new Promocional();
        cafe = dia.Promocao("quarta-feira");
        System.out.println("Preco quarta: " + cafe.getPreco());
    }
    
    @Test
    public void TestarQuintaFeira() {
        
        Promocional dia = new Promocional();
        cafe = dia.Promocao("quinta-feira");
        System.out.println("Preco quinta: " + cafe.getPreco());
    }
    
    @Test
    public void TestarSextaFeira() {
        
        Promocional dia = new Promocional();
        cafe = dia.Promocao("sexta-feira");
        System.out.println("Preco sexta: " + cafe.getPreco());
    }
    
    @Test
    public void TestarSabado() {
        
        Promocional dia = new Promocional();
        cafe = dia.Promocao("sabado");
        System.out.println("Preco sabado: " + cafe.getPreco());
    }
    
    @Test
    public void TestarDomingo() {
        
        Promocional dia = new Promocional();
        cafe = dia.Promocao("domingo");
        System.out.println("Preco domingo: " + cafe.getPreco());
    }
    
    @Test
    public void TestarCafeNormal() {
        cafe = FabricaCafe.criarCafe("normal");
        Assert.assertEquals(2.0, cafe.getPreco());
        //System.out.println("Cafe: " + cafe);
    }

    @Test
    public void TestarCafeSemCafeina() {
        cafe = FabricaCafe.criarCafe("zero cafeina");
        Assert.assertEquals(3.0, cafe.getPreco());
        //System.out.println("Cafe: " + cafe);
    }

    @Test
    public void TestarCafeCappucino() {
        cafe = FabricaCafe.criarCafe("cappucino");
        Assert.assertEquals(5.0, cafe.getPreco());
        //System.out.println("Cafe: " + cafe);
    }
    
    @Test
    public void TestarCafeNormalBuilder() {
        cafe = atendente.criarCafe(new CafeNormalBuilder());
        Assert.assertEquals(2.0, cafe.getPreco());
        //System.out.println("Cafe: " + cafe);
    }
    
    @Test
    public void TestarCafeSemCafeinaBuilder() {
        cafe = atendente.criarCafe(new CafeSemCafeinaBuilder());
        Assert.assertEquals(3.0, cafe.getPreco());
        //System.out.println("Cafe: " + cafe);
    }
    
   @Test
    public void TestarCafeCappucinoBuilder() {
        cafe = atendente.criarCafe(new CafeCappucinoBuilder());
        Assert.assertEquals(5.0, cafe.getPreco());
        //System.out.println("Cafe: " + cafe);
    } 
}
