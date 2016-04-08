/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio101;

import com.santotomas.ejercicio101.Cuenta;
import com.santotomas.ejercicio101.Persona;
import java.util.Scanner;
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
public class CuentaTest {
   
    Persona p;
    Cuenta c;
    
    public CuentaTest() {
        
    }
    
    @Test
    public void depositarTestMethod() {
        
        Integer valor=0;
        c.depositar(valor);
        assertEquals(4999, c.getCueSaldo(),0.00);
    }
    
    @Test
    public void girarTestMethod() {
      
        Integer valor=-1;
        c.girarBasico(valor);
        assertEquals(5000, c.getCueSaldo(),0.00);
        
    }
       
    @BeforeClass
    public static void setUpClass() {
         
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       p=new Persona("1234-5","Pepito",20);
       c=new Cuenta(5000,p);
    }
    
    @After
    public void tearDown() {
        System.out.println("HA TERMINADO EL PROGRAMA");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
