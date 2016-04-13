/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Long dimension;
        String color, calle, numero, poblacion, opcMaterial;
        
        Casa casita;
        Material mat=null;
        
        System.out.println("Ingrese las Dimensiones");
        dimension=input.nextLong();
        System.out.println("Ingrese el Color");
        color=input.next();
        System.out.println("Ingrese la Calle");
        calle=input.next();
        System.out.println("Ingrese el Numero de la Casa");
        numero=input.next();
        System.out.println("Ingrese la Poblacion");
        poblacion=input.next();
        
        System.out.println("Elija uno de los materiales ");
        System.out.println(Material.lista());
        opcMaterial=input.next();
        
        switch (opcMaterial){
            case "LADRILLO":
                mat=Material.LADRILLO;
                break;
            case "BLOQUETA":
                mat=Material.BLOQUETA;
                break;
            case "MADERA":
                mat=Material.MADERA;
                break;
            case "CARTON":
                mat=Material.CARTON;
                break;
            default: 
                System.out.println("OPCION NO VALIDA");
        }
        
        casita=new Casa(dimension, color, calle,numero,poblacion, mat);
        
        System.out.println(casita.toString());
        
        System.out.println("ACTUALIZAR DATOS DE LA CASA");
        System.out.println("Ingrese nuevos Datos de la Casa");
        System.out.println("Ingrese nuevo Color");
        color=input.next();
        System.out.println("Ingresar nueva Calle");
        calle=input.next();
        System.out.println("Ingresar nuevo Numero");
        numero=input.next();
        System.out.println("Ingresar nueva Poblacion");
        poblacion=input.next();
        
        casita.actualizar(color, calle, numero, poblacion);
        
        System.out.println(casita.toString());
    }
}
