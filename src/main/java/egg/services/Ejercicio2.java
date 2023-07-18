package egg.services;

import java.time.Duration;
import java.time.LocalTime;

/*
 * Ejercicio 2
 * Crear un objeto LocalTime para representar una hora específica, 
 * luego usar ese objeto para calcular cuántas horas, minutos y 
 * segundos quedan hasta la medianoche.
 */

public class Ejercicio2 {
    
    public static void iniciar(){
        
        //Ejercicio 2
        LocalTime tiempoEjercicio2 = LocalTime.of(17, 45, 15);
        LocalTime lasDoce = LocalTime.of(23,59,59);
        Duration duracion = Duration.between(tiempoEjercicio2, lasDoce);
        // DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(
            "Quedan " + 
            duracion.toHoursPart() + ":" + 
            duracion.toMinutesPart() + ":" + 
            duracion.toSecondsPart() +
            " para las doce.");

    }
}
