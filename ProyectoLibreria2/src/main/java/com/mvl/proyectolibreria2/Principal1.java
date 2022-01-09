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
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Libreria MVL");
        Lapicera lapi1=new Lapicera("Bic",3,"Azul");
        Lapicera lapi2=new Lapicera("Faber Castell",32, "Azul");
        System.out.println(lapi1.toString());
        System.out.println(lapi2.toString());
        Lapicera lapi3=new Lapicera();
        lapi3.setMarca("Pilot");
        lapi3.setModelo(78);
        lapi3.setColor("Rojo");
        System.out.println("La marca de la lapicera 3 es:"+ lapi3.getMarca()+ ".Modelo nro. "+ lapi3.getModelo()+".Color: "+ lapi3.getColor()); 
        //Objeto regla
        Regla regla1 = new Regla();
        regla1.setMarca("Maped");
        regla1.setLongitud(30);
        regla1.setMaterial("Plastico");
        System.out.println("La marca de la Regla 1 es:"+ regla1.getMarca()+ ".La cantidad de cm son:"+ regla1.getLongitud()+".Material:"+ regla1.getMaterial());
        System.out.println(regla1.mostrarPorPantalla());
        
        Regla regla2 = new Regla();
        regla2.setMarca("Fligo");
        regla2.setLongitud(10);
        regla2.setMaterial("Goma eva");
        System.out.println("La marca de la Regla 2 es:"+ regla2.getMarca()+ ".La cantidad de cm son:"+ regla2.getLongitud()+".Material:"+ regla2.getMaterial());
        
        Regla regla3 = new Regla();
        regla3.setMarca("2 Banderass");
        regla3.setLongitud(50);
        regla3.setMaterial("Madera");
        System.out.println("La marca de la Regla 3 es:"+ regla3.getMarca()+ ".La cantidad de cm son:"+ regla3.getLongitud()+".Material:"+ regla3.getMaterial());
    }
    
    }
    
    

