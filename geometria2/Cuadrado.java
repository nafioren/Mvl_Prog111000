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
public class Cuadrado implements Calculo{
    //Atributos
private float lado;

    public Cuadrado() {
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        float resultado= lado * lado;
        return resultado;
    
}
