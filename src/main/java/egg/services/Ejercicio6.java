package egg.services;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
/*
 * Ejercicio 6
 * Dado un objeto LocalTime ingresado por el usuario, 
 * crear un nuevo LocalTime que represente exactamente 
 * la mitad del día entre el objeto dado y la medianoche.
 */

public class Ejercicio6 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void iniciar(){
        LocalTime tiempo = null;
        System.out.println("Ingrese tiempo de la forma hh:mm:ss");
        String formato = sc.nextLine();
        String[] tiempoFormateado = formato.split(":");
        int hora = Integer.valueOf(tiempoFormateado[0]);
        int minutos = Integer.valueOf(tiempoFormateado[1]);
        int segundos = Integer.valueOf(tiempoFormateado[2]);
        tiempo = LocalTime.of(hora, minutos, segundos);
        System.out.println("El tiempo es: " + tiempo);
        LocalTime medianoche = LocalTime.MAX;
        // System.out.println(medianoche);
        Duration diferencia = Duration.between(tiempo, medianoche);
        System.out.println(            
            diferencia.toHoursPart() + ":" + 
            diferencia.toMinutesPart() + ":" + 
            diferencia.toSecondsPart()
        );

        // Calcular la mitad de la duración
        Duration mitadDuracion = diferencia.dividedBy(2);
        // Crear el nuevo LocalTime sumando la mitad de la duración a la medianoche
        LocalTime mitadDia = tiempo.plus(mitadDuracion);

        System.out.println(mitadDia);
    }
}
