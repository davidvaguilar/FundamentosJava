/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author David
 */
public class Casa {
    private Long casDimension;
    private String casColor;
    private Direccion direccion;
    private Material material;

    public Casa(Long casDimension, String casColor, String calle, String numero, String poblacion, Material material) {
        this.casDimension = casDimension;
        this.casColor = casColor;
        this.direccion = new Direccion(calle, numero, poblacion);
        this.material = material;
    }
    
    public Boolean actualizar (String color,String calle, String numero, String poblacion ){
        direccion.actualizar(calle, numero, poblacion);
        this.casColor=color;
        return true;
    }

    @Override
    public String toString() {
        return "\n\t Dimension de la Casa : "+this.casDimension+
                "\n\t Color de la Casa : "+this.casColor+
                direccion.toString()+
                material.toString();
    }
    
    public class Direccion{
        private String dirCalle;
        private String dirNumero;
        private String dirPoblacion;

        public Direccion(String dirCalle, String dirNumero, String dirPoblacion) {
            this.dirCalle = dirCalle;
            this.dirNumero = dirNumero;
            this.dirPoblacion = dirPoblacion;
        }

        @Override
        public String toString() {
            return "\n\t Calle : "+this.dirCalle+" N° "+this.dirNumero+
                    "\n\t Poblacion : "+this.dirPoblacion;
        }
        
        public Boolean actualizar(String calle, String numero, String poblacion){
            this.dirCalle=calle;
            this.dirNumero=numero;
            this.dirPoblacion=poblacion;
            return true;
        }
    }
    
}
