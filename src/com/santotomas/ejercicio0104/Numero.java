/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0104;

/**
 *
 * @author David
 */
public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }
    
    public boolean esPositivo(){
        if(this.numero>0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean divisibleCinco(){
        int resto;
        resto=this.numero%5;
        if(resto!=0){
            return false;
        }else{
            return true;
        }
        
    }

    @Override
    public String toString() {
        return ("El numero es: "+this.numero);
    }
    
    
}
