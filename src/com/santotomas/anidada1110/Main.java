/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.anidada1110;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        int op=0, cont=0;
        String perRut, perNombre, perApellido;
        String curNombre;
        Scanner input= new Scanner(System.in);
        Curso cur;
        Estudiante est;
        Calendar fecha = Calendar.getInstance(); 
        int dia=fecha.get(Calendar.DAY_OF_MONTH);
        int mes=fecha.get(Calendar.MONTH)+1;
        int anno=fecha.get(Calendar.YEAR);
        do{
            cont=cont+1;
            
            System.out.println("Ingrese el Rut del Alumno");
            perRut=input.next();
            System.out.println("Ingrese Nombre del Alumno");
            perNombre=input.next();
            System.out.println("Ingrese Apellido del Alumno");
            perApellido=input.next();
            
            System.out.println("Crear un Curso");
            curNombre=input.next();
            cur=new Curso(curNombre);
            est=new Estudiante(perRut,perNombre,perApellido,cur,dia,mes,anno);
            System.out.println("Estudiante Matriculado con exito");
            System.out.println("--------------------------------------");
            System.out.println("\n\nEstudiante Matriculado No "+cont);
            System.out.println(est.toString());
            System.out.println("¿Desea ingresar otro alumno? si=1 / no=0");
            op=input.nextInt();
        }while(op!=0);
    }
}
