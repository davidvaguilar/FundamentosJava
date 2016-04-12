/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejercicio101;

/**
 *
 * @author David
 */
public class Cuenta {
    private Integer cueSaldo;
    private Persona persona;

    public Cuenta() {
        this.cueSaldo = 0;
    }
        
    public Cuenta(Integer cueSaldo, Persona per) {
        this.cueSaldo = cueSaldo;
        this.persona = per;
    }
    
    public String consultarTitular(){
        return (this.persona.toString());
    }
    
    public Boolean depositar(Integer valor){
        if( valor > 0 ){
            this.cueSaldo=cueSaldo+valor;
            return true;
        }else{
            System.out.println("El valor a depositar debe ser mayor a 0");
        }        
        return false;
    }
    
    public Integer girar(Integer valor){
        if( valor > 0 ){
            if(this.cueSaldo >= valor){
                this.cueSaldo=this.cueSaldo-valor;
                return this.cueSaldo;
            }else{
                System.out.println("El saldo es insuficiente para el valor que desea girar");
            }
            
        }else{
            System.out.println("Su cuenta tiene 0 pesos");
        }
        return this.cueSaldo;
    }
    
    public Integer getCueSaldo() {
        return cueSaldo;
    }

    public void setCueSaldo(Integer cueSaldo) {
        this.cueSaldo = cueSaldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    @Override
    public String toString() {
        return ("El saldo de la Cuenta es: "+this.cueSaldo);
    }

    @Override
    public boolean equals(Object obj) {
        if( (obj != null) && (obj instanceof Cuenta) ) {
            Cuenta temp = (Cuenta)obj;
            if(this.cueSaldo.equals(temp.cueSaldo)){
                return( true );
            }
        }
        return ( false );  
    }
}
