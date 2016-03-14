/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.enumerados1205;

/**
 *
 * @author David
 */
public enum Precios {PRECIONORMAL(100), PRECIOVIP(80); 
     double precio;
     private Precios(double p){
         precio = p;
     }
    public double getPrecio() {
        return precio;
    }
}
     

