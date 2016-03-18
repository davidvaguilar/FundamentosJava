/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.excepciones1501;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {
    public static int numerador;
    public static Integer denominador;
    public static float division;
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       
        try{
            System.out.println("Ingrese el numerador:");
            numerador=input.nextInt();
            System.out.println("Ingrese el denominador");
            denominador=input.nextInt();
            System.out.println("ANTES DE HACER LA DIVISION");
            division=numerador/denominador;
            System.out.println("el resultado es:"+division);
            System.out.println("DESPUES DE HACER LA DIVISION");
        }catch(ArithmeticException david){
            System.out.println("La division por 0 no es valida");
            
        }catch(InputMismatchException david){
            System.out.println("Debe ingresar solamente numeros");
          
        }catch(Exception david){
            System.out.println("Upp, contacte con su programador");
        }finally{
            System.out.println("El programa ha terminado");
        }
    }
}
