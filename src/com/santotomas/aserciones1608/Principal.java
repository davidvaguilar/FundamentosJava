/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.aserciones1608;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String[] args) {
        double pi=3.1;
        int dos=2;
        double radio;
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el radio de un circulo");
        radio=input.nextDouble();
        assert radio>=0: "Error, Variable radio tomo un valor negativo";
        double area=pi*radio*radio;
        System.out.println("El area de un circulo es:"+area);
    }
}
