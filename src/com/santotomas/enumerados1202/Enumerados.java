/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.enumerados1202;

/**
 *
 * @author David
 */
public class Enumerados {
    
    enum Dia {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
 
    public static void main(String[] args) {
        Dia d; // declaramos una variable del tipo Dia
        d = Dia.DOMINGO; //asignamos un valor
        if (d == Dia.DOMINGO || d == Dia.SABADO)  //comparamos valores
            System.out.println("Estamos en fin de semana");
        else
            System.out.println("Aún no ha llegado el fin de semana");
        switch (d) {  //ejemplo de switch
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("Aún no ha llegado el fin de semana");
                break;
            default:
                System.out.println("Estamos en fin de semana");
        }
    }
    
}
