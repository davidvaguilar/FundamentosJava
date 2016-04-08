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
    Integer valor;
    Persona per;
    Cuenta cue;
        
    public CuentaTest() {
        
    }
    
    @Test
    public void girarTestMethod() {
        System.out.println("Cuanto desea Girar");
        valor=3500;
        assertEquals(0, cue.girar(valor),0.00);
    }
    
    @Test
    public void depositoTestMethod() {
        System.out.println("Cuanto desea Depositar");
        valor=1000;
        if(!cue.depositar(valor)){
            System.out.println("Accion Denegada");
        }
        assertEquals(4500, cue.getCueSaldo(),0.00);
    }
    
    @BeforeClass
    public static void setUpClass() {
         
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
        String rut,nombre;
        Integer edad;
        System.out.println("Programa Banco");
        System.out.println("Ingresar el Rut del usuario");
        rut="1234-5";
        System.out.println("Ingresar el Nombre del usuario");
        nombre="David";
        System.out.println("Ingresar la edad del usuario");
        edad=32;
        per=new Persona(rut, nombre, edad);
        System.out.println("Ingresar un saldo inicial de apertura de Cuenta");
        cue=new Cuenta(3500, per);
    }
    
    @After
    public void tearDown() {
        System.out.println(cue.getCueSaldo());
        System.out.println("HA TERMINADO EL PROGRAMA");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}