/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0101;

/**
 *
 * @author David
 */
public class Circulo{
    private double radio;
    private final double PI = 3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }        

    public double calcularArea(){
        double area=0;
        if(this.radio>0){
            area = PI*radio*radio;
        }
        return area;
    }

    @Override
    public String toString() {
        return ("Este circulo tiene como radio" + this.radio);
    }

    @Override
    public boolean equals(Object obj) {
        if( (obj != null) && (obj instanceof Circulo) ) {
            Circulo temp = (Circulo)obj;
            if(this.radio==temp.radio){
                return( true );
            }
        }
        return ( false );
    }    
    
}
