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
public class Estudiante extends Persona{
    /**
     * @param nombre
     * @param apellido
     * @param rut
     */
    Curso curso;
    private Fecha matricula;
    
    private class Fecha{
        protected int dia;
        protected int mes;
        protected int anno;
        
        private Fecha(int dia, int mes, int anno){
            this.dia=dia;
            this.mes=mes;
            this.anno=anno;
        }
    }
    
    public Estudiante(String nombre, String apellido, String rut,
            Curso curso, int dia, int mes, int anno){
        this.nombre=nombre;
        this.apellido=apellido;
        this.rut=rut;
        this.curso=curso;
        matricula=new Fecha(dia, mes, anno);
        
    }
    
    protected Curso getCurso(){
        return curso;
    }
    
}
