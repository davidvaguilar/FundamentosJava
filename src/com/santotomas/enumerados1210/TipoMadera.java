/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.enumerados1210;

/**
 *
 * @author David
 */
public enum TipoMadera {
    ROBLE ("Castaño verdoso", 8000), //Separamos ,
    CAOBA ("Marrón oscuro", 7700),
    NOGAL("Marrón rojizo", 8200),
    CEREZO ("Marrón cereza", 7900),
    BOJ ("Marrón negruzco", 6750);  //Cerrar;
 
    //Variables   
    private final String color; //Color de la madera
    private final int pesoEspecifico; //Peso específico de la madera
 
    /**
     * Constructor. Al asignarle uno de los valores posibles a una variable del tipo enumerado el constructor asigna 
        automáticamente valores de los campos
     */ 
    private TipoMadera (String color, int pesoEspecifico) { 
        this.color = color;
        this.pesoEspecifico = pesoEspecifico;
    } //Cierre del constructor
 
    //Métodos de la clase tipo Enum
    public String getColor() { return color; }
    public int getPesoEspecifico() { return pesoEspecifico; }
}
