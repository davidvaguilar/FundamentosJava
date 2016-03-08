/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.internamiembro1102;

/**
 *
 * @author David
 */
public class Externa {
    int a=10;
    Externa(){
        InternaMiembro primeraClaseIntMiembro=new InternaMiembro();
        primeraClaseIntMiembro.metodo();
        Externa.InternaMiembro segundaClaseIntMiembro=new Externa.InternaMiembro();
        segundaClaseIntMiembro.metodo();
        primeraClaseIntMiembro.saludar();
    }
    class InternaMiembro{
        void metodo(){
            System.out.println(a); 
        }
        void saludar(){
            System.out.println("HOLA MUNDO");
        }
    }
    public static void main(String[] args) {
        Externa nuevaClaseExterna=new Externa();
        
    }
}


