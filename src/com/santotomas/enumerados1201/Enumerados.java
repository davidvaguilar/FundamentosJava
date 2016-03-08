/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.enumerados1201;

/**
 *
 * @author David
 */
enum instrumentos{ 
   GUITARRA, TROMPETA, BATERIA, BAJO
};
 
public class Enumerados {
 
   public Enumerados() {
   }
 
   public static void main (String[] args){
      instrumentos in = instrumentos.BATERIA; 
      System.out.println(in);
      EnumDentroClase edc = new EnumDentroClase();
      edc.tamano = EnumDentroClase.TamanoDeCafe.CHICO;
      System.out.println(edc.tamano);
   }
}
 
class EnumDentroClase{
   enum TamanoDeCafe {GRANDE,MEDIANO,CHICO};
   TamanoDeCafe tamano;
}