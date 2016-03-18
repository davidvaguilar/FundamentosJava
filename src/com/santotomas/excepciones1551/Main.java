/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.excepciones1551;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        String str=" 12  ";
        int numero;
        try{
            numero=Integer.parseInt(str);
            System.out.println(numero);
        }catch(NumberFormatException ex){
            System.out.println(ex);
            System.out.println("No es un numero");
        }
    }
}
