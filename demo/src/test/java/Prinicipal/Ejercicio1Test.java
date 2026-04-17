/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prinicipal;

/**
 *
 * @author eiler
 */
import com.exampleTDD.demo.Ejercicio1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    @Test
    public void SaludarConNOmbreNormal() {
        Ejercicio1 saludo = new Ejercicio1();
        assertEquals("Hola, Bob", saludo.saludar("Bob"));
    }

    @Test
    public void SaludarComoAmigoSiNombreEsVacio() {
        Ejercicio1 saludo = new Ejercicio1();
        assertEquals("Hola, amigo", saludo.saludar(""));
    }

    @Test
    public void SaludarSINombreEstaEnMayuscula() {
        Ejercicio1 saludo = new Ejercicio1();
        assertEquals("HOLA, JERRY", saludo.saludar("JERRY"));
    }
}