/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author juane
 */
public class Canario extends Animal implements Ave{
    
    public Canario(String nombre, String tipo) {
        super(nombre, tipo);
    }
    
    @Override
    public void respirar(){
        System.out.println("El canario esta respirando");
    }
    
    @Override
    public void volar() {
        System.out.println("El canario esta volando");
    }
    
}
