/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.estaticainterna1101;

/**
 *
 * @author David
 */
public class Externa {

    int a=10;
    static int b=5;
    
        static class AnidadaEstatica{
            AnidadaEstatica(){
                Externa nuevaClaseExterna=new Externa();
                System.out.println(nuevaClaseExterna.a);
                System.out.println(b);
            }         
            void saludar(){
                System.out.println("HOLA MUNDO");
            }
        }
   
    public static void main(String[] args) {
        new Externa.AnidadaEstatica().saludar();
    }
    
}
