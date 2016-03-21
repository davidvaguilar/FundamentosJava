/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.aserciones1605;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        double m= 100.0;
        double n= m/2;
        assert n == n*2 : "Java no sabe dividir " + m + " entre 2: " + n;
    }
}
