/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author juane
 */
public class Lagarto extends Animal implements Reptil{
    
    public Lagarto(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void nadar() {
        System.out.println("El lagarto esta nadando");
    }
    
    @Override
    public void respirar(){
        System.out.println("El lagarto esta respirando");
    }

    @Override
    public void caminar() {
       System.out.println("El lagarto esta caminando");
    }
    
    
}
