
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

   
    public static void main(String[] args) {
       Cafetera cafetera = new Cafetera(1000, 500);

        cafetera.servirTaza(200); // Se llena la taza
        cafetera.servirTaza(800); // No se llena la taza por falta de café

        cafetera.llenarCafetera();
        cafetera.servirTaza(600); // Se llena la taza con lo que queda en la cafetera

        cafetera.vaciarCafetera();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de café a agregar:");
        int cantidad = scanner.nextInt();
        cafetera.agregarCafe(cantidad);
    }
}
    
    

