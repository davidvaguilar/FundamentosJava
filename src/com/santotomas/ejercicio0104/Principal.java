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
        int variable;
        System.out.println("Ingresa un numero");
        variable=input.nextInt();
        numerito1=new Numero(variable);
        
        if(numerito1.esPositivo()){
            System.out.println("Tu numero es positivo");
        }else{
            System.out.println("Tu Numero es negativo");
        }
        
    }
}
