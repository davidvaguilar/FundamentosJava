/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.santotomas.ejercicio0101.Circulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
      @Test
    public void testMethod() {
        Circulo circulito=new Circulo(1.6);
        double resultado=circulito.calcularArea();
        assertEquals(0, resultado, 0.00);
    }
    
    @Test
    public void test2() {
        Circulo circulito=new Circulo(7);
        assertEquals(7, circulito.getRadio(),0.00);
    }
    
  
 
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
