/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.aserciones1604;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan", "Perez", 100000, "Developer");
        asignarOficina(emp);
        masCosas(emp);
        assert emp.getSupervisor() != null : "Supervisor no puede ser null";
        asignarTarea(emp);
    }
    
    static void asignarOficina(Object emp){
        System.out.println("Asignado una oficina");
    }
    
    static void masCosas(Object emp){
        System.out.println("Muchas cosas más");
    }
    
    static void asignarTarea(Object emp){
        System.out.println("Asignando una nueva tarea");
        System.out.println("Tarea Asignada");
    }
}
