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
public enum Material {
    LADRILLO("cod001","Solido"), BLOQUETA("cod002","Solido"),MADERA("cod003","Liviano"), CARTON("cod004","Liviano");
    
    private String matCodigo;
    private String matTipo;

    private Material(String matCodigo, String matTipo) {
        this.matCodigo = matCodigo;
        this.matTipo = matTipo;
    }

    @Override
    public String toString() {
        return "\n\tCodigo del Material : "+this.matCodigo+
                "\n\tTipo de Material : "+this.matTipo;
    }
    
    public static String lista(){
        String lista;
        lista = "";
        for( Material r : Material.values() ){
                lista = lista + r.name()+" - ";
        }
        return (lista);
    }
    
    
}
