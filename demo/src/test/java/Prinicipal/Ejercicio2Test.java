/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prinicipal;

/**
 *
 * @author eiler
 */
import com.exampleTDD.demo.Ejercicio2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    @Test
    public void DeberiaDevolver_1_Con_Entrada_I() {
        
        Ejercicio2 ej2 = new Ejercicio2();
        assertEquals(1, ej2.convertirDeRomanoADecimal("I"));
    }

    @Test
    public void DeberiaDevolver_5_Con_entrada_V() {
        
        Ejercicio2 ej2 = new Ejercicio2();
        assertEquals(5, ej2.convertirDeRomanoADecimal("V"));
    }

    @Test
    public void DeberiaDevolver_6_ConEntrada_VI() {
        
        Ejercicio2 ej2 = new Ejercicio2();
        assertEquals(6, ej2.convertirDeRomanoADecimal("VI"));
    }

    @Test
    public void DeberiaDevolver_2006_Con_Entrada_MMVI() {
        
        Ejercicio2 ej2 = new Ejercicio2();
        assertEquals(2006, ej2.convertirDeRomanoADecimal("MMVI"));
    }
    
    @Test
    public void DeberiaDevolver_1944_ConENtrada_MCMXLIV(){
        Ejercicio2 ej2 = new Ejercicio2();
        assertEquals(1944, ej2.convertirDeRomanoADecimal("MCMXLIV"));
    }
    
    @Test
    public void debeLanzarExcepcionSiHayCaracterInvalido() {
        Ejercicio2 ej2 = new Ejercicio2();
        assertThrows(NullPointerException.class, () -> {ej2.convertirDeRomanoADecimal("A");
        });
    }
    
    @Test
    public void DeberiaConvertirCadenaVaciaA0(){
        Ejercicio2 ej2 = new Ejercicio2();
        assertEquals(0, ej2.convertirDeRomanoADecimal(""));
    }
    
   

}
