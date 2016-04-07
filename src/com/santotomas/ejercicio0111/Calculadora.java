/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0111;

/**
 *
 * @author David
 */
public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "El primer numero es: "+this.numero1+ ", el segundo numero es: "+this.numero2;
    }

    public int sumar(){
        return (this.numero1+this.numero2);
    }
    
    public int resta(){
        int resultado;
        resultado = this.numero1-this.numero2;
        return (resultado);
    }
    
    public double multiplicar(){
        int resul=this.numero1*this.numero2;
        return (resul);
    }
    
    public double dividir(){
        return this.numero1/this.numero2;
    }
    
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
}
