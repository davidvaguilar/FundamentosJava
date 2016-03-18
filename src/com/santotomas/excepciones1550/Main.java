/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.excepciones1550;

/**
 *
 * @author David
 */
public class Main {
    public static int valor,x;
    public static void main(String[] args) {
        try{
            for(x=0,valor=100;x<100;x++){
                valor=valor/x;
            }
        }catch(ArithmeticException ex){
            System.out.println("Error: "+ex.getMessage());
        }catch(Exception e){
            System.out.println("Se ha producido un error");
        }
    }
}
