package egg.services;

import java.time.LocalTime;
import java.util.Scanner;

/*
 * Ejercicio 4
 * Dada una cantidad de segundos ingresada por el usuario, 
 * convertirlo en un LocalTime y mostrárselo al usuario.
 */

public class Ejercicio4 {
    
    private static Scanner sc = new Scanner(System.in);

    public static void iniciar(){
        boolean condition = false;
        LocalTime elTiempoUsuario = null;
        do {            
            System.out.println("Ingrese la cantidad de segundos: ");
            int segundosUsuario = sc.nextInt();
            int hora = segundosUsuario / 3600;
            int minutos = (segundosUsuario - hora*3600) / 60;
            int segundos = ((segundosUsuario - hora*3600) - minutos*60);
            if (hora > 23){
                System.out.println("La cantidad de segundos pasan las 23:59:59, favor de ingresar otro valor");
                condition = true;
            } else {
                condition = false;
                elTiempoUsuario = LocalTime.of(hora, minutos, segundos);
            }
        } while (condition);
        System.out.println("El tiempo formateado sería: \n" + elTiempoUsuario.toString());
    }
}
