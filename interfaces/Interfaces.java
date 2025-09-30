/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

/**
 *
 * @author juane
 */
public class Interfaces {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Segio","Mamifero");
        humano humano1 = new humano("Andres","Mamifero");
        Canario canario1 = new Canario("lucas","Ave");
        Rana rana1 = new Rana("Ranita","Anfibio");
        PezPlata pez1 = new PezPlata("Nemo","Pez");
        Lagarto lagarto1 = new Lagarto("Lagartiña","Reptil");
        
        
        perro1.caminar();
        perro1.respirar();
        System.out.println("-------------------------------------------------");
        humano1.caminar();
        humano1.respirar();
        humano1.hablar();
        System.out.println("-------------------------------------------------");
        canario1.volar();
        canario1.respirar();
        System.out.println("-------------------------------------------------");
        rana1.caminar();
        rana1.respirar();
        rana1.nadar();
        System.out.println("-------------------------------------------------");
        pez1.nadar();
        pez1.respirar();
        System.out.println("-------------------------------------------------");
        lagarto1.caminar();
        lagarto1.respirar();
        lagarto1.nadar();
        
        
    }
}
