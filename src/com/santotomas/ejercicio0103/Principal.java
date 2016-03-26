/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0103;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int numero1, numero2;
        int resto;
        Division operacion1, operacion2;
        
        do{
            System.out.println("Ingresar Dividendo"); 
            numero1=input.nextInt();
            resto=numero1%2;
            if(resto!=0){
                System.out.println("El dividendo ingresado es impar. Por favor, Ingrese un numero par");
            }
        }while(resto!=0);
        System.out.println("Perfecto, ingresaste un par en el dividendo");
        
        System.out.println("Ingresar Divisor"); 
        numero2=input.nextInt();
        resto=numero2%2;
        if(resto!=0){
            System.out.println("El divisor ingresado es impar. Por favor, Ingrese un numero par");
        }
        while(resto!=0){
            System.out.println("Ingresar Divisor"); 
            numero2=input.nextInt();
            resto=numero2%2;
            if(resto!=0){
                System.out.println("El divisor ingresado es impar. Por favor, Ingrese un numero par");
            }
        }
        System.out.println("Perfecto, ingresaste un par en el divisor");
        
        
    }
}
