/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejercicio103;

/**
 *
 * @author David
 */
public class Persona {
    private String perRut;
    private String perNombre;
    private FechaNacimiento fechaNacimiento;

    public Persona(String perRut, String perNombre, FechaNacimiento fechaNacimiento) {
        this.perRut = perRut;
        this.perNombre = perNombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    private class FechaNacimiento{
        private String fecNacDia;
        private String fecNacMes;
        private String fecNacAnno;

        public FechaNacimiento(String fecNacDia, String fecNacMes, String fecNacAnno) {
            this.fecNacDia = fecNacDia;
            this.fecNacMes = fecNacMes;
            this.fecNacAnno = fecNacAnno;
        }

        public String calcularEdad(){
            Integer edad, annoActual=2016;
            edad=annoActual-Integer.parseInt(this.fecNacAnno);
            return edad.toString();
        }
        
        public Boolean actualizar(String dia, String mes, String anno){
            this.fecNacDia=dia;
            this.fecNacMes=mes;
            this.fecNacAnno=anno;
            return true;
        }
        
        @Override
        public String toString() {
            return ("\n\t "+this.fecNacDia+" / "+this.fecNacMes+" / "+this.fecNacAnno);
        }        
    }
    
    public Boolean actualizarDatos(String nombre, String dia, String mes, String anno){
        this.perNombre=nombre;
        fechaNacimiento.actualizar(dia, mes, anno);
        return true;
    }
    
         
}

