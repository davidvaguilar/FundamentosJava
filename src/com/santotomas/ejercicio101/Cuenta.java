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
public class Cuenta {
    private Integer cueSaldo;
    private Persona persona;

    public Cuenta() {
        this.cueSaldo = 0;
    }
        
    public Cuenta(Integer cueSaldo, Persona per) {
        this.cueSaldo = cueSaldo;
        this.persona = per;
    }
    
    public Boolean depositar(Integer valor){
        if( valor > 0 ){
            this.cueSaldo=cueSaldo+valor;
            return true;
        }else{
            System.out.println("El valor a depositar debe ser mayor a 0");
        }        
        return false;
    }
    
    public Integer girar(Integer valor){
        if( valor > 0 ){
            if(this.cueSaldo >= valor){
                this.cueSaldo=this.cueSaldo-valor;
                return this.cueSaldo;
            }else{
                System.out.println("El saldo es insuficiente para el valor que desea girar");
            }
            
        }else{
            System.out.println("Su cuenta tiene 0 pesos");
        }
        return this.cueSaldo;
    }
    
    public Boolean depositarBasico(Integer valor){
        this.cueSaldo=this.cueSaldo+valor;
        return true;
    }
    
    public Integer girarBasico(Integer valor){
        if(valor>0){
            if(this.cueSaldo>=valor){
                this.cueSaldo=this.cueSaldo-valor;
            }else{
                System.out.println("No se puede sobre girar");
            }
            
        }else{
            System.out.println("Puede girar un valor positivo");
        }
        
        return this.cueSaldo;
    }

    public Integer getCueSaldo() {
        return cueSaldo;
    }

    public void setCueSaldo(Integer cueSaldo) {
        this.cueSaldo = cueSaldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
}
