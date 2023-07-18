package egg.services;

import java.time.LocalTime;

/*
 * Ejercicio 5
 * Calcular la diferencia en segundos entre dos objetos LocalTime.
 */

public class Ejercicio5 {
    
    public static void iniciar(){
        LocalTime localUno = LocalTime.of(15, 30, 20);
        LocalTime localDos = LocalTime.of(15, 30, 21);
        int diferencia = Math.abs(localUno.toSecondOfDay() - localDos.toSecondOfDay());
        System.out.println("La diferencia de tiempos en segundos es: " + diferencia);
    }
}
