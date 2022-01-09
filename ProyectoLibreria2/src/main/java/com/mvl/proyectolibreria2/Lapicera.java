/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.proyectolibreria2;

/**
 *
 * @author Natalia Fioren
 */
public class Lapicera {
    
    private String marca;
    private int modelo;
    private String color;

    public Lapicera(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Lapicera() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    public String mostrarPorPantalla() {
        return "Lapicera{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
}
