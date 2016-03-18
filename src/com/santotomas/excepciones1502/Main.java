/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.excepciones1502;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Intentamos ejecutar el bloque de instrucciones:");
            System.out.println("Instrucción 1.");       
            System.out.println("Instrucción 2.");
            System.out.println("Instrucción 3, etc.");
        }
        catch (Exception e) { System.out.println("Instrucciones a ejecutar cuando se produce un error");  }
    }
}
