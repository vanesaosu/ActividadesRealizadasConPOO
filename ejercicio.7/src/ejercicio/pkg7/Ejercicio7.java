/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

/**
 *
 * @author USER
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear 4 objetos de tipo Persona
        Persona persona1 = new Persona("Juan", 25, 'H', 70.5, 1.75);
        Persona persona2 = new Persona("María", 32, 'M', 63.8, 1.62);
        Persona persona3 = new Persona("Carlos", 19, 'H', 80.2, 1.80);
        Persona persona4 = new Persona();

        // Llenar el objeto persona4 mediante el método crearPersona()
        persona4.crearPersona();

        // Calcular el IMC y verificar si es mayor de edad para cada objeto
        int imcPersona1 = persona1.calcularIMC();
        boolean mayorEdadPersona1 = persona1.esMayorDeEdad();

        int imcPersona2 = persona2.calcularIMC();
        boolean mayorEdadPersona2 = persona2.esMayorDeEdad();
    }
    
}
