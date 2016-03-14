/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.enumerados1204;

/**
 *
 * @author David
 */
public class Main {
    
    public enum Opcion {UNO, DOS, TRES, CUATRO,CINCO}  
 
    public static void main(String[] args) {
        Opcion a =Opcion.CUATRO;
        Opcion b=Opcion.DOS;
        if(b.name().equals("DOS")){
            System.out.println("Son iguales");
        }
        for(Opcion i :Opcion.values()){
            System.out.println(i.name());
        }
       
    }
    
}
