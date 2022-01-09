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
public class Regla {
        
    private String marca;
    private int longitud;
    private String material;   

    public Regla(String marca, int longitud, String material) {
        this.marca = marca;
        this.longitud = longitud;
        this.material = material;
    }

    public Regla() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

  
    public String mostrarPorPantalla() {
        return "Regla{" + "marca=" + marca + ", longitud=" + longitud + ", material=" + material + '}';
    }
    
    

    
    }

    
    

   
    

