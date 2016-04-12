/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejercicio104;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String opSucursal, nombre;
        Sucursal sucursal = null;
        Almacen almacen1 = null;
        System.out.println("ALMACEN REGIONAL");
        System.out.println("----------------");
        System.out.println("LISTA DE SUCURSALES");
        System.out.println(Sucursal.listar());
        System.out.println("Coloque una Sucursal");
        opSucursal=input.next();
        switch (opSucursal){
            case "CASA_MATRIZ":
                sucursal=Sucursal.CASA_MATRIZ;
                break;
            case "NORTE":
                sucursal=Sucursal.NORTE;
                break;
            case "SUR":
                sucursal=Sucursal.SUR;
                break;
            default:
                   System.out.println("OPCION NO VALIDA");                
        }
        System.out.println("Ingrese Nombre del Almacen");
        nombre=input.next();
        almacen1=new Almacen(nombre, sucursal);
        
        System.out.println("HA TERMINADO LA CREACION DEL ALMACEN");
        
        System.out.println(almacen1.toString());
         
        System.out.println("El almacen tiene de antiguedad: "+almacen1.antiguedad());
        
    }
    
            
    
}
