/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.anidada1110;

/**
 *
 * @author David
 */
public class Persona {
    protected String rut;
    protected String nombre;
    protected String apellido;

    public Persona(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
    }
   
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }
    
}
