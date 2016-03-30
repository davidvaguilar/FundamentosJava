/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0104;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Numero numerito1,numerito2;
        int variable1, variable2;
        String resultado;
        System.out.println("Ingresa el primer numero");
        variable1=input.nextInt(); 
     
        numerito1 = new Numero(variable1);
      
        //numerito1.obtenerDigito();
       
        System.out.println("La suma de todos los digitos es igual a= "+numerito1.sumaDigito());
    }
}
