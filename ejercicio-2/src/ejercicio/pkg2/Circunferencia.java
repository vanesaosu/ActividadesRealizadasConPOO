
package ejercicio.pkg2;

import java.util.Scanner;


public class Circunferencia {
     private double radio;

    // Método constructor que inicializa el radio pasado como parámetro
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    Circunferencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Método getter para el atributo radio
    public double getRadio() {
        return radio;
    }

    // Método setter para el atributo radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para pedir y guardar el radio en el atributo del objeto
    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();
    }

    // Método para calcular el área de la circunferencia
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro de la circunferencia
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    
}
