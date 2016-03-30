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
        resto = this.numero % 5;
        if(resto != 0){
            return false;
        }else{
            return true;
        }
        
    }
    
    public String determinarEquivalencia(Numero objetoNumero){
        if(this.numero==objetoNumero.getNumero()){
            return ( "El numero = "+this.numero+", es igual al numero = "+objetoNumero.getNumero() );
        }else if(this.numero > objetoNumero.getNumero()){
            return ("El numero = "+this.numero+", es mayor al numero = "+objetoNumero.getNumero());
        }else{
            return ("El numero = "+this.numero+", es menor al numero = "+objetoNumero.getNumero());
        }
    }
    
    public boolean esDivisible(Numero objeto){
        int resto;
        resto = this.numero % objeto.getNumero();
        if(resto != 0){
            return false;
        }else{
            return true;
        }
    }
    
    
    
    public void obtenerDigito(){
        int resto, acum, valor = this.numero;
        while(this.numero > 0){
            resto = this.numero % 10;
            System.out.println( resto );
            this.numero = this.numero/10;
        }
        
    }
    
    public int sumaDigito(){
        int resto, acum = 0, valor = this.numero;
        while(valor > 0){
            resto = valor%10;
            System.out.println( resto );
            acum = acum + resto;
            valor = valor / 10;
        }
        return acum;
    }
    
    @Override
    public String toString() {
        return ("El numero es: "+this.numero);
    }
    
    
}
