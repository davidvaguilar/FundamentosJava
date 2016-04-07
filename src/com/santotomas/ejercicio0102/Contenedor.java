/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santotomas.ejercicio0102;

/**
 *
 * @author David
 */
public class Contenedor {
    private Circulo circulito;
    private Triangulo triangulito;

    public Contenedor(float radio) {
        this.circulito = new Circulo(radio);
        
    }

    public Contenedor(float base, float altura) {
        this.triangulito = new Triangulo(base, altura);
    }

    public void setCirculito(Circulo circulito) {
        this.circulito = circulito;
    }

    public Circulo getCirculito() {
        return circulito;
    }

    public Triangulo getTriangulito() {
        return triangulito;
    }
    
    public class Triangulo{
        private float base;
        private float altura;

        public Triangulo(float base, float altura){
            this.base = base;
            this.altura = altura;
        }

        public float getBase() {
            return base;
        }

        public float getAltura() {
            return altura;
        }

        public void setBase(float base) {
            this.base = base;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public double calcularArea(){
            double area;
            area= this.base*this.altura/2;
            return area;
        }

       @Override
        public String toString() {
            return "Este triangulo tiene como base"+this.base+
                    ", la altura es:"+this.altura;
        }
        
        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Triangulo) {
                Triangulo temp = (Triangulo)obj;
                if(this.base==temp.getBase()&&this.altura==temp.getAltura()){
                return( true );
                }
            }   
            return false;
        }
    }
    
    public class Circulo{
        private float radio;
        private final double PI = 3.14;

        public Circulo(float radio){
            this.radio = radio;
        }

        public float getRadio() {
            return radio;
        }

        public void setRadio(float radio) {
            this.radio = radio;
        }        

        public double calcularArea(){
            double area = PI*radio*radio;
            return area;
        }

       @Override
        public String toString() {
            return "Este circulo tiene como radio" + this.radio;
        }

        @Override
        public boolean equals(Object obj) {
            if( (obj != null) && (obj instanceof Circulo) ) {
                Circulo temp = (Circulo)obj;
                if(this.radio==temp.radio){
                    return( true );
                }
            }
            return ( false );
        }
        
        
    }
}
