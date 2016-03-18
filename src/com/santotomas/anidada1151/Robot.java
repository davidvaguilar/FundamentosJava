/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.anidada1151;

/**
 *
 * @author David
 */
public class Robot {
    private int x;
    private DescripcionRobot descripcion;
    
    public Robot (int x){
        this.x = x;
        this.descripcion = new DescripcionRobot();
    }
    
    public class DescripcionRobot{
        private String nombre, color;
        public DescripcionRobot(){
            if(x>0){
                this.nombre="A";
                this.color="blanco";
            }else{
                this.nombre="B";
                this.color="rojo";
            }
        }
    }
    
    public void avanzar(int d){
        this.x+=d;
    }
    
    public int valorX(){
        return this.x;
    }
    
    public void asignarX(int x){
        this.x=x;
    }
    
    public String toString(){
        return "Robot ("+this.x+")"+"\ntiene nombre : "+descripcion.nombre+
                "\ntiene color : "+descripcion.color;
    }    
}
