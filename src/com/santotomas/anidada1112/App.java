/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.anidada1112;

/**
 *
 * @author David
 */
public class App {
    
    public App(String saludo){
        Saludo obj=new Saludo(saludo);
        obj.saludar();
    }
    
    private interface Saludador{
        public void saludar();
    }
    
    private class Saludo implements Saludador{
        String saludo;
        public Saludo(String s){
            this.saludo=s;
        }

        @Override
        public void saludar() {
            System.out.println(saludo);
        }
    }
    
}
