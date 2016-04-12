/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejercicio104;

/**
 *
 * @author David
 */
public class Almacen {
    private String almNombre;
    private Sucursal sucursal;
    private Inaguracion fecha;

    public Almacen(String almNombre, Sucursal sucursal) {
        this.almNombre = almNombre;
        this.sucursal = sucursal;
        this.fecha = new Inaguracion("11","04","2016");
    }

    @Override
    public String toString() {
        return "\n\t Nombre Almacen: "+this.almNombre+
                this.sucursal.toString()+
                this.fecha.toString();
    }
    
    public String antiguedad(){
        return this.fecha.calcularAntiguedad();
    }
    
    public class Inaguracion{
        private String ingDia;
        private String ingMes;
        private String ingAnno;

        public Inaguracion(String ingDia, String ingMes, String ingAnno) {
            this.ingDia = ingDia;
            this.ingMes = ingMes;
            this.ingAnno = ingAnno;
        }

        @Override
        public String toString() {
            return "\n\t"+this.ingDia+" / "+this.ingMes+" / "+this.ingAnno;
        }
        
        public String calcularAntiguedad(){
            Integer annoActual=2016;
            Integer antiguedad=annoActual-Integer.valueOf(this.ingAnno);
            return antiguedad.toString();
        }
        
        
    }
    
}
