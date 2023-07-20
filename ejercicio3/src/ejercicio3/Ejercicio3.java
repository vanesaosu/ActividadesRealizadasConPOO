
package ejercicio3;


public class Ejercicio3 {

    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        // Usando el método crearOperacion() para ingresar los números
        operacion.crearOperacion();

        // Obteniendo los números utilizando los métodos getter
        int numero1 = operacion.getNumero1();
        int numero2 = operacion.getNumero2();

        // Calculando la suma y mostrando el resultado
        int suma = operacion.sumar();
        System.out.println("La suma de los números es: " + suma);

        // Calculando la resta y mostrando el resultado
        int resta = operacion.restar();
        System.out.println("La resta de los números es: " + resta);
    }
}
    
    

