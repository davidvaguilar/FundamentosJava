/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.aserciones1604;

/**
 *
 * @author David
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int sueldo;
    private String cargo;
    private String supervisor;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int sueldo, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.cargo = cargo;
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
     * @return the sueldo
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @return the supervisor
     */
    public String getSupervisor() {
        return supervisor;
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
     * @param sueldo the sueldo to set
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
    
    
}
