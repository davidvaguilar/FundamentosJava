/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0102;

/**
 *
 * @author David
 */
public class Triangulo {
    private int base;
    private int altura;
    


    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
        double area;
        area= this.base*this.altura/2;
        return area;
    }

   @Override
    public String toString() {
        return "Este triangulo tiene como base"+this.base+
                ", la altura es:"+this.altura+"y su area es de: "+
                this.calcularArea();
    }

    
    
}
