/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0103;

/**
 *
 * @author David
 */
public class Division {
    private int dividendo;
    private int divisor;

    public Division(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
    
    public float calcularCuociente(){
        float cuociente;
        cuociente=this.dividendo/this.divisor;
        return cuociente;
    }

    @Override
    public String toString() {
        return this.dividendo+"/"+this.divisor+"="+
                this.calcularCuociente();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
