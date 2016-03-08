/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternaAnonima;

/**
 *
 * @author David
 */
public class Externa {
  
      public void ej( ){
         System.out.println("clase Ejemplo");
      }
   }
   class Anonima{
      Externa ej = new Externa( ){ //esto no es una referencia a una instancia de Ejemplo, sino una referencia 
                                                    //a una subclase de Ejemplo (anónima)
         public void ej( ){
            System.out.println("clase Ejemplo anónima");
         }
      }; //¡acaba con un punto y coma!
   
}
