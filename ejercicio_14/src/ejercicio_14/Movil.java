
package ejercicio_14;

import java.util.Scanner;


public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    public Movil() {
        // Constructor por defecto
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    // Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    // Método para cargar los datos de un celular desde la entrada del usuario
    public void cargarCelular() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la marca del celular:");
        marca = scanner.nextLine();

        System.out.println("Ingrese el precio del celular:");
        precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de leer el precio

        System.out.println("Ingrese el modelo del celular:");
        modelo = scanner.nextLine();

        System.out.println("Ingrese la memoria RAM del celular:");
        memoriaRam = scanner.nextInt();

        System.out.println("Ingrese el almacenamiento del celular:");
        almacenamiento = scanner.nextInt();

        codigo = new int[7];
        System.out.println("Ingrese el código de 7 números del celular:");
        for (int i = 0; i < 7; i++) {
            codigo[i] = scanner.nextInt();
        }
    }

    // Método para ingresar el código completo de un celular
    public void ingresarCodigo() {
        Scanner scanner = new Scanner(System.in);

        codigo = new int[7];
        System.out.println("Ingrese el código de 7 números del celular:");
        for (int i = 0; i < 7; i++) {
            codigo[i] = scanner.nextInt();
        }
    }

}
