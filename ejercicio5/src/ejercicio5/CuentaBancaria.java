
package ejercicio5;

import java.util.Scanner;


public class CuentaBancaria {
    public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;

    // Constructor por defecto
    public Cuenta() {
    }

    // Constructor con parámetros
    public Cuenta(long dniCliente, int saldoActual, int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    // Métodos getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Método para crear un objeto Cuenta pidiendo los datos al usuario
    public static Cuenta crearCuentaDesdeConsola(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo actual:");
        int saldoActual = scanner.nextInt();

        return new Cuenta(dniCliente, saldoActual, numeroCuenta);
    }

    // Método ingresar
    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

    // Método retirar
    public void retirar(double retiro) {
        if (retiro <= saldoActual) {
            saldoActual -= retiro;
        } else {
            saldoActual = 0;
        }
    }

    // Método extraccionRapida
    public void extraccionRapida() {
        double limiteExtraccion = saldoActual * 0.2;
        if (limiteExtraccion > 0) {
            saldoActual -= limiteExtraccion;
        }
    }

    // Método consultarSaldo
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldoActual);
    }

    // Método consultarDatos
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
    }

