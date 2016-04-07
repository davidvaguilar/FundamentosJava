/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0110;

/**
 *
 * @author David
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return ("La Hora es= "+this.hora+" : "+this.minuto+" : "+this.segundo);
    }
    
    public String sumarTiempo(Hora h){
        int sumaHora = 0;
        int sumaSegundo = 0;
        int sumaMinuto = 0;
        int dia=0;
        String resultadoHora;
        sumaSegundo=this.segundo+h.getSegundo();
        if(sumaSegundo>59){
            sumaSegundo = sumaSegundo - 60;
            sumaMinuto = sumaMinuto + 1;
        }
        sumaMinuto=sumaMinuto+this.minuto+h.getMinuto();
        if(sumaMinuto>59){
            sumaMinuto = sumaMinuto-60;
            sumaHora = sumaHora + 1;
        }
        sumaHora=sumaHora+this.hora+h.getHora();
        if(sumaHora>24){
            sumaHora=sumaHora-24;
            dia=dia+1;
        }
        if(dia==1){
            resultadoHora=dia+ "dias, "+sumaHora+":"+sumaMinuto+":"+sumaSegundo;
        }else{
            resultadoHora=sumaHora+":"+sumaMinuto+":"+sumaSegundo;
        }
        return (resultadoHora);
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    
}
