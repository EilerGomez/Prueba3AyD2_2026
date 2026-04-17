/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exampleTDD.demo;

/**
 *
 * @author eiler
 */
import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {

    public int convertirDeRomanoADecimal(String strRomano) {
        Map<Character, Integer> diccionario = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int resultado = 0;
        for (int i = 0; i < strRomano.length(); i++) {
            int actual = diccionario.get(strRomano.charAt(i));
            int siguiente = (i + 1 < strRomano.length())? diccionario.get(strRomano.charAt(i + 1)): 0;
            resultado += (actual < siguiente) ? -actual : actual;
        }

        return resultado;
    }
}
