/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0110;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int hora=0;
        int minuto=0;
        int segundo=0;
        Hora horita1, horita2;
        System.out.println("ESTE PROGRAMA REALIZA LA SUMA DE 2 TIEMPOS");
        do{
            
            try{
                System.out.println("Ingrese la Hora del PRIMER Tiempo");
                hora = input.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Usuario debe ingresar numeros del 0 al 23");
            }catch(Exception e){
                System.out.println("Hubo un error en el sistema");
            }
            if(hora < 0 || hora > 23){
                System.out.println("La Hora debe ser en formato de 0 - 23");
            }
        }while(hora < 0 || hora > 23);
        do{
            System.out.println("Ingrese el minuto del PRIMER Tiempo");
            minuto = input.nextInt();
            if(minuto < 0 || minuto > 59){
                System.out.println("El minuto debe ser en formato de 0 - 59");
            }
        }while(minuto < 0 || minuto > 59);
        do{
            System.out.println("Ingrese el segundo del PRIMER Tiempo");
            segundo = input.nextInt();
            if(segundo < 0|| segundo > 59){
                System.out.println("El segundo debe ser en formato de 0 - 59");
            }
        }while(segundo < 0 || segundo > 59);
        
        horita1 = new Hora(hora, minuto, segundo);
        
        do{
            System.out.println("Ingrese la Hora del SEGUNDO Tiempo");
            hora=input.nextInt();
            if(hora < 0 || hora > 23){
                System.out.println("La Hora debe ser en formato de 0 - 23");
            }
        }while(hora < 0 || hora > 23);
        do{
            System.out.println("Ingrese el minuto del SEGUNDO Tiempo");
            minuto = input.nextInt();
            if(minuto < 0 || minuto > 59){
                System.out.println("El minuto debe ser en formato de 0 - 59");
            }
        }while(minuto < 0 || minuto > 59);
        do{
            System.out.println("Ingrese el segundo del SEGUNDO Tiempo");
            segundo = input.nextInt();
            if(segundo < 0|| segundo > 59){
                System.out.println("El segundo debe ser en formato de 0 - 59");
            }
        }while(segundo < 0 || segundo > 59);
        
        horita2 = new Hora(hora, minuto, segundo);
        System.out.println(horita1.toString());
        System.out.println(horita2.toString());
        System.out.println(horita1.sumarTiempo(horita2));
        
    }
}
