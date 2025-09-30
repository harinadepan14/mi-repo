/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author juane
 */
public class humano extends Animal implements Mamifero{
    
    public humano(String nombre, String tipo) {
        super(nombre, tipo);
    }
    
    @Override
    public void respirar(){
        System.out.println("El humano esta respirando");
    }
    
    public void hablar(){
        System.out.println("El humano esta hablando");
    }

    @Override
    public void caminar() {
       System.out.println("El humano esta caminando");
    }
    
}
