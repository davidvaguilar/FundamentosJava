/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0111;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int var1=0, var2=0;
        int opcion=0;
        Calculadora cal;
        
        System.out.println("Esta calculadora realiza la suma, resta, multiplicacion o division");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("Ingrese la opcion:");
        opcion=input.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese primer numero");
                var1=input.nextInt();
                System.out.println("Ingrese segundo numero");
                var2=input.nextInt();
                cal = new Calculadora(var1, var2);
                System.out.println(cal.sumar());
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Opcion ingresada no valida");
        }
        
        
        
    }
}
