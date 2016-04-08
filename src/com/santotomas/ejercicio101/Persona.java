/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio101;

/**
 *
 * @author David
 */
public class Persona {
    private String perRut;
    private String perNombre;
    private Integer perEdad;

    public Persona(String perRut, String perNombre, Integer perEdad) {
        this.perRut = perRut;
        this.perNombre = perNombre;
        this.perEdad = perEdad;
    }

    @Override
    public String toString() {
        return ("Rut: "+this.perRut +"Nombre: "+this.perNombre+ "Edad: "+this.perEdad);
    }

    @Override
    public boolean equals(Object obj) {
        if( (obj != null) && (obj instanceof Persona) ) {
            Persona temp = (Persona)obj;
            if(this.perRut.equals(temp.perRut)){
                return( true );
            }
        }
        return ( false );    }

    public String getPerRut() {
        return perRut;
    }

    public void setPerRut(String perRut) {
        this.perRut = perRut;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public Integer getPerEdad() {
        return perEdad;
    }

    public void setPerEdad(Integer perEdad) {
        this.perEdad = perEdad;
    }
    
    
}
