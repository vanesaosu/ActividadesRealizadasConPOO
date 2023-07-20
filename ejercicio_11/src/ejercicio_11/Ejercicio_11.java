
package ejercicio_11;

import java.util.Date;
import java.util.Scanner;


public class Ejercicio_11 {

    
    public static void main(String[] args) {
        // Obtener día, mes y año del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt() - 1; // Se resta 1 ya que en la clase Date, los meses van de 0 a 11.
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        scanner.close();
        
        // Crear fecha con los valores proporcionados por el usuario
        Date fechaUsuario = new Date(anio - 1900, mes, dia);
        
        // Obtener fecha actual
        Date fechaActual = new Date();
        
        // Mostrar fecha ingresada por el usuario
        System.out.println("Fecha ingresada: " + fechaUsuario);
        
        // Calcular años entre la fecha ingresada y la fecha actual
        long diferenciaMilisegundos = fechaActual.getTime() - fechaUsuario.getTime();
        long anios = diferenciaMilisegundos / (1000L * 60 * 60 * 24 * 365); // Aproximación en años
        
        // Mostrar la edad actual
        System.out.println("Años de diferencia: " + anios);
    }
}
    
    

