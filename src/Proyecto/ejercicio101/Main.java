/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejercicio101;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String rut, nombre;
        String codigo;
        int edad, saldo, valor;
        Persona persona;
        Cuenta cuenta;
        Integer opcion=0;
        
        System.out.println("BANCO NORTE GRANDE - IQUIQUE");
        System.out.println("----------------------------");
        System.out.println("CREAR UNA CUENTA DE BANCO");
        System.out.println("Ingrese el rut del nuevo Cliente");
        rut=entrada.next();
        System.out.println("Ingrese el nombre del nuevo Cliente");
        nombre=entrada.next();
        System.out.println("Ingrese la edad del nuevo Cliente");
        edad=entrada.nextInt();
       
        System.out.println("Ingrese el saldo inicial para su cuenta");
        saldo=entrada.nextInt();
        
        persona=new Persona(rut, nombre, edad);
        cuenta=new Cuenta(saldo, persona);
        
        do{
            System.out.println("1.- Consultar el Titular de la Cuenta");
            System.out.println("2.- Hacer un Deposito de su cuenta");
            System.out.println("3.- Hacer un Giro de su cuenta");
            System.out.println("4.- Saldo de su Cuenta");
            System.out.println("0.- Salir del programa");
            opcion=entrada.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Cerrando el programa, Hasta Pronto");
                    break;
                case 1:
                    System.out.println("Resumen del Titular");
                    System.out.println("-------------------");
                    System.out.println(persona.toString());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea DEPOSITAR");
                    valor=entrada.nextInt();
                    if(cuenta.depositar(valor))
                        System.out.println("Deposito realizado su saldo actual es: "+cuenta.getCueSaldo());
                    else
                        System.out.println("¡¡¡Deposito no realizado, Error en el monto ingresado!!!");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad que desea GIRAR");
                    valor=entrada.nextInt();
                    System.out.println(cuenta.girar(valor));
                    
                    break;
                case 4:
                    System.out.println("El saldo de su Cuenta: "+cuenta.toString());
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        }while(opcion!=0);
    }
}
