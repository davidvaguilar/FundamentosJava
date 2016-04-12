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
public class Liquidacion {
    private Integer liqSueldo;
    private String liqDia;
    private String liqMes;
    private String liqAnno;

    public Liquidacion(Integer liqSueldo, String liqDia, String liqMes, String liqAnno) {
        this.liqSueldo = liqSueldo;
        this.liqDia = liqDia;
        this.liqMes = liqMes;
        this.liqAnno = liqAnno;
    }
    
    @Override
    public String toString() {
        return ("\n\t Sueldo: "+this.liqSueldo+
                "\n\t Fecha de Liquidacion: "+this.liqDia+"/"+this.liqMes+"/"+this.liqAnno);
    }
    
    public Boolean actualizarSueldo(Integer sueldo){
        this.liqSueldo=sueldo;
        return true;
    }
    
}
