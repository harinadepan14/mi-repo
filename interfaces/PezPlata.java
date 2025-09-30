/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author juane
 */
public class PezPlata extends Animal implements Pez{
    
    public PezPlata(String nombre, String tipo) {
        super(nombre, tipo);
    }
    
    @Override
    public void respirar(){
        System.out.println("El pez plata esta respirando bajo el agua");
    }
    
    @Override
    public void nadar() {
        System.out.println("El pez plata esta nadando");
    }
    
}
