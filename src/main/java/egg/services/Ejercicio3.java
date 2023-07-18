package egg.services;

import java.time.LocalTime;
import java.util.Scanner;

/*
 * Ejercicio 3
 * Dado un objeto LocalTime ingresado por el usuario, 
 * ajustalo a la próxima hora exacta.
 */

 // Se puede mejorar la lógica.
public class Ejercicio3 {

    private static Scanner sc = new Scanner(System.in);

    public static void iniciar(){
        LocalTime tiempoEjeccicio3;
        String respuesta,localTime;
        System.out.print("Ingrese la hora: ");
        respuesta = sc.nextLine();
        System.out.println();
        localTime = respuesta;
        System.out.print("Ingrese los minutos: ");
        respuesta = sc.nextLine();
        if (Integer.valueOf(respuesta) < 30){
            respuesta = "00";
        } else {
            respuesta = "00";
            Integer hora = Integer.valueOf(localTime);
            localTime = String.valueOf(hora + 1);
        }

        localTime = localTime + ":" + respuesta;
        System.out.println(localTime);
    }
}
