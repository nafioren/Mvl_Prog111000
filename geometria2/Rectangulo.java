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
public class Rectangulo implements Calculo{
    //Atributos
private int base;
private int altura;
//Constructor

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //Metodos

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        float resultado;
        resultado = base * altura;
        return resultado; 
    }
    
}
