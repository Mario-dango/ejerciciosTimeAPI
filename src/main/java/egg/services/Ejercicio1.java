package egg.services;

import java.time.LocalTime;

/*
 * Ejercicio 1
 * Crear un objeto LocalTime representando la hora actual y 
 * obtener la cantidad de segundos que han pasado desde el 
 * inicio del día.
 */

public class Ejercicio1 {
    public static void iniciar(){
        
        // Ejercicio 1
        LocalTime tiempoLocal = LocalTime.now();
        System.out.println(
            "La hora es: " + tiempoLocal.getHour() + "\n" +
            "Los minutos son: " + tiempoLocal.getMinute() + "\n" +
            "Los segundos son: " + tiempoLocal.getSecond() + "\n"
        );

        System.out.println(
            "Los segundos pasados son: " + (
                    tiempoLocal.getHour()*3600 + 
                    tiempoLocal.getMinute() * 60 +
                    tiempoLocal.getSecond()
                )
        );

        long segundos = tiempoLocal.toSecondOfDay();
        System.out.println(segundos);

    }
}
