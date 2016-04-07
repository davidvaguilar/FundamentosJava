/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0109;

/**
 *
 * @author David
 */
public class Estudiante {
    private String nombre;
    private float notaCastellano;
    private float notaHistoria;
    private float notaMatematica;

    public Estudiante(String nombre, float notaCastellano, float notaHistoria, float notaMatematica) {
        this.nombre = nombre;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
        this.notaMatematica = notaMatematica;
    }

    @Override
    public String toString() {
        return ("El alumno = "+this.nombre+"tiene las siguientes Notas: \n Castellano="+
                this.notaCastellano+"\n Matematica: "+this.notaMatematica+"\n Historia"+this.notaHistoria);
    }
    
    public double calcularPromedio(){
        double resultado=(this.notaCastellano+this.notaMatematica+this.notaHistoria)/3;
        return resultado;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(float notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public float getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(float notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public float getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(float notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    
    
}
