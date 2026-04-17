/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exampleTDD.demo;

/**
 *
 * @author eiler
 */
public class Ejercicio1 {

    public String saludar(String nombre) {
        
        if(nombre.equalsIgnoreCase("")){
             return "Hola, amigo";
        }

        if (nombre.equals(nombre.toUpperCase())) {
            return "HOLA, " + nombre;
        }

        return "Hola, " + nombre;
    }
}