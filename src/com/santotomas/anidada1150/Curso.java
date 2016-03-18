/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.anidada1150;

/**
 *
 * @author David
 */
public class Curso {
    String curNombre;

    public Curso(String curNombre) {
        this.curNombre = curNombre;
    }

    public String getCurNombre() {
        return curNombre;
    }

    @Override
    public String toString() {
        return "El curso del Alumno es : "+curNombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
