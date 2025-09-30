/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author juane
 */
public class Rana extends Animal implements Anfibio  {
    
    public Rana(String nombre, String tipo) {
        super(nombre, tipo);
    }
    
    
    @Override
    public void respirar(){
        System.out.println("La rana esta respirando");
    }
    
    @Override
    public void nadar() {
        System.out.println("La rana esta nadando ");
    }

    @Override
    public void caminar() {
        System.out.println("La rana esta caminando");
    }
    
}
