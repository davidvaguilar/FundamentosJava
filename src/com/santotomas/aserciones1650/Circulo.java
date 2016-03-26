/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.aserciones1650;

/**
 *
 * @author David
 */
public class Circulo {
    private double pi=3.1416;
    private double radio;


    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return the pi
     */
    public double getPi() {
        return pi;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }


    /**
     * @param pi the pi to set
     */
    public void setPi(double pi) {
        this.pi = pi;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){

        assert this.radio>0: "RADIO de 1 CIRCULO debe ser POSITIVO";
        return pi*radio*radio;
    }
    
    
}
