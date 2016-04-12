/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejercicio103;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String rut, nombre, dia;
        
        
        System.out.println("SISTEMA DE LIQUIDACION DE SUELDO");
        System.out.println("--------------------------------");
        System.out.println("Ingrese el Rut del Empleado");
        rut=input.next();
        System.out.println("Ingrese nombre del empleado");
        nombre=input.next();
        System.out.println("Ingrese Fecha de Nacimiento");
        System.out.println("Ingrese Dia");
        dia=input.next();
        System.out.println("Ingrese Mes");
        
        
    }
}
