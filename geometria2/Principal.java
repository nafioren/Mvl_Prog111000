/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.geometria2;

/**
 *
 * @author Natalia Fioren
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Rectangulo r1 = new Rectangulo(3,2);
        System.out.println("Los datos del Rectángulo son:");
        System.out.println("Base = "+r1.getBase()+" cms.");
        System.out.println("Altura = "+r1.getAltura()+" cms.");
        System.out.println("El Área del Rectángulo es: "+r1.calcularArea()+" cms.");
        
        Triangulo t1 = new Triangulo();
        t1.setBase((float) 5);
        t1.setAltura((float) 7);
        System.out.println("Los datos del Triángulo son:");
        System.out.println("Base = "+t1.getBase()+" cms.");
        System.out.println("Altura = "+t1.getAltura()+" cms.");
        System.out.println("El Área del Triángulo es: "+t1.calcularArea()+" cms.");
   
        
        Cuadrado c1 = new Cuadrado();
        c1.setLado(4);
        System.out.println("Los datos del Cuadrado son:");
        System.out.println("Lado = "+c1.getLado()+" cms.");
        System.out.println("El Área del Cuadrado es: "+c1.calcularArea()+" cms.");
        
        
        Trapecio trap1 = new Trapecio();
        trap1.setBaseMayor(8);
        trap1.setBaseMenor(4);
        trap1.setAltura(6);
        System.out.println("Los datos del Trapecio son:");
        System.out.println("Base Inferior = "+trap1.getBaseMayor()+" cms.");
        System.out.println("Base Superior = "+trap1.getBaseMenor()+" cms.");
        System.out.println("Altura = "+trap1.getAltura()+" cms.");
        System.out.println("El Área del Trapecio es: "+trap1.calcularArea()+" cms.");
        
        
    }
    
}
