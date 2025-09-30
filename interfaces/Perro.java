/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author juane
 */
public class Perro extends Animal implements Mamifero{
    
    public Perro(String nombre, String tipo) {
        super(nombre, tipo);
    }
    
    @Override
    public void respirar(){
        System.out.println("El perro esta respirando");
    }

    @Override
    public void caminar() {
       System.out.println("El perro esta caminando");
    }
    
}
