
package ejercicio_10;

import java.util.Arrays;
import java.util.Random;


public class Ejercicio_10 {

   /*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        // Inicializar arreglo A con números aleatorios
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextDouble();
        }
        
        // Mostrar arreglo A original
        System.out.println("Arreglo A original:");
        mostrarArreglo(arregloA);
        
        // Ordenar arreglo A de menor a mayor
        Arrays.sort(arregloA);
        
        // Copiar los primeros 10 números ordenados al arreglo B
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        
        // Rellenar los 10 últimos elementos de arreglo B con el valor 0.5
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        // Mostrar arreglo A ordenado
        System.out.println("Arreglo A ordenado:");
        mostrarArreglo(arregloA);
        
        // Mostrar arreglo B combinado
        System.out.println("Arreglo B combinado:");
        mostrarArreglo(arregloB);
    }
    
    public static void mostrarArreglo(double[] arreglo) {
        for (double elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
    
    

