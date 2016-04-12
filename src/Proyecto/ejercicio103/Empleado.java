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
public class Empleado {
    private String empCodigo;
    private FechaContratacion empFechaContratacion;

    public Empleado(String empCodigo, FechaContratacion empFechaContratacion) {
        this.empCodigo = empCodigo;
        this.empFechaContratacion = empFechaContratacion;
    }
    
    public class FechaContratacion{
        private String fecConDia;
        private String fecConMes;
        private String fecConAnno;

        public FechaContratacion(String fecConDia, String fecConMes, String fecConAnno) {
            this.fecConDia = fecConDia;
            this.fecConMes = fecConMes;
            this.fecConAnno = fecConAnno;
        }

        public String calcularAnnoAntiguedad(){
            Integer fechaActual=2016;
            Integer antiguedad=fechaActual-Integer.parseInt(fecConAnno);
            return antiguedad.toString();
        }
        
        @Override
        public String toString() {
            return ("\n\t "+this.fecConDia+" / "+this.fecConMes+" / "+this.fecConAnno);
        }
              
    }
}
