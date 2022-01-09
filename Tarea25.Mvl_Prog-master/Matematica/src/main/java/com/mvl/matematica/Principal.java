/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.matematica;

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
        System.out.print("Matematica MVL,");
       
        Calculadora op1=new Calculadora(3,4);
        System.out.println(" Los datos de la calculadora son: ");
        System.out.println("La suma de ambos numeros es: "+op1.calcularSuma());
        System.out.println("La resta de ambos numeros es: "+op1.calcularResta());
        System.out.println("La division de ambos numeros es: "+op1.calcularDivision());
        System.out.println("La multiplicacion de ambos numeros es: "+op1.calcularMultiplicacion());
        
    }
    
}
