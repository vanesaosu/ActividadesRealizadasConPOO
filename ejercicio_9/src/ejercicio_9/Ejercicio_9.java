
package ejercicio_9;

import java.util.Random;


public class Ejercicio_9 {

    public static void main(String[] args) {
         Random random = new Random();
        double numero1 = random.nextDouble();
        double numero2 = random.nextDouble();
        
        Matematica matematica = new Matematica(numero1, numero2);
        
        System.out.println("Número 1: " + matematica.getNumero1());
        System.out.println("Número 2: " + matematica.getNumero2());
        System.out.println("Mayor valor: " + matematica.devolverMayor());
        System.out.println("Potencia del mayor elevado al menor: " + matematica.calcularPotencia());
        System.out.println("Raíz cuadrada del menor valor: " + matematica.calcularRaiz());
    }
    }
    

