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
public class Estudiante extends Persona{
    /**
     * @param nombre
     * @param apellido
     * @param rut
     */
    private Curso curso;
    private Fecha matricula;
    
    private class Fecha{
        private int dia;
        private int mes;
        private int anno;
        
        private Fecha(int dia, int mes, int anno){
            this.dia=dia;
            this.mes=mes;
            this.anno=anno;
        }

        /**
         * @return the dia
         */
        public int getDia() {
            return dia;
        }

        /**
         * @return the mes
         */
        public int getMes() {
            return mes;
        }

        /**
         * @return the anno
         */
        public int getAnno() {
            return anno;
        }        
    }
    
    public Estudiante(String rut, String nombre, String apellido, 
            Curso curso, int dia, int mes, int anno){
        super(rut,nombre,apellido);
        this.curso=curso;
        matricula=new Fecha(dia, mes, anno);
    }
    
    /**
     * @return the curso
     */
    protected Curso getCurso(){
        return curso;
    }
    
    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the matricula
     */
    public Fecha getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Fecha matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Rut : "+rut+"\nNombre : "+nombre+"\nApellido : "+apellido +
                "\nCurso : "+curso.getCurNombre()+ 
                "\nFecha Matricula : "+matricula.getDia()+"/"+matricula.getMes()+"/"+matricula.getAnno(); //To change body of generated methods, choose Tools | Templates.
    }
      
}
