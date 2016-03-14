/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.internametodo1103;

public class Externa {
    int a=10;
    static int b=5;
    public void metodo(){
        final int x=0;
      
        class InternaMetodo{
            void metodo(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(x);
            }
            void saludar(){
                System.out.println("HOLA MUNDO");
            }
        }
        InternaMetodo claseIntMetodo=new InternaMetodo();
        claseIntMetodo.metodo();
        claseIntMetodo.saludar();
    }
    public static void main(String[] args) {
        Externa nuevaClase= new Externa();
        nuevaClase.metodo();
    }
    
}
