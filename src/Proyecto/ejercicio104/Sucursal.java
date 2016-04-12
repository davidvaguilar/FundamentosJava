/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejercicio104;

import java.util.Iterator;

/**
 *
 * @author David
 */
public enum Sucursal {
    CASA_MATRIZ("Doña Julia",22222,"Juanito"),NORTE("Doña Julia 2",33333,"Maria"),SUR("Doña Julia 3",44444, "Pepito");

    private String sucNombre;
    private Integer sucTelefono;
    private String sucJefe;

    private Sucursal(String sucNombre, Integer sucTelefono, String sucJefe) {
        this.sucNombre = sucNombre;
        this.sucTelefono = sucTelefono;
        this.sucJefe = sucJefe;
    }

    @Override
    public String toString() {
        return "\n\t Nombre Sucursal: "+this.sucNombre+
                "\n\t Telefono Sucursal: "+this.sucTelefono+
                "\n\t Jefe de Sucursal: "+this.sucJefe;
    }
    
    public static String listar(){
        String lista;
        lista="";
        for (Sucursal i : Sucursal.values()) {
            lista= lista + i.name()+" \t - ";
        }
        return lista;
    }
    
    
    
    
}
