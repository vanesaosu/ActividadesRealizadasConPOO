/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

import java.util.Scanner;


public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para crear una persona ingresando los valores desde el usuario
    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese el sexo (H - hombre, M - mujer, O - otro): ");
        sexo = scanner.next().charAt(0);

        System.out.print("Ingrese el peso en kg: ");
        peso = scanner.nextDouble();

        System.out.print("Ingrese la altura en metros: ");
        altura = scanner.nextDouble();
    }

    // Método para calcular el IMC y devolver el resultado
    public int calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return -1; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0;  // En el peso ideal
        } else {
            return 1;  // Sobrepeso
        }
    }

    // Método para verificar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}
