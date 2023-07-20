
package ejercicio3;

import java.util.Scanner;


public class Operacion {
      private int numero1;
    private int numero2;

    // Constructor con todos los atributos pasados por parámetro
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Constructor sin los atributos pasados por parámetro
    public Operacion() {
        // No hace nada, ya que los atributos se asignarán luego con el método crearOperacion()
    }

    // Métodos get y set para numero1 y numero2
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // Método para solicitar los números al usuario y guardarlos en los atributos del objeto
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
    }

    // Método para calcular la suma de los números y devolver el resultado
    public int sumar() {
        return numero1 + numero2;
    }

    // Método para calcular la resta de los números y devolver el resultado
    public int restar() {
        return numero1 - numero2;
    }

}
