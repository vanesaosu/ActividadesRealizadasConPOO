
package ejerciciodeegg;

import java.util.Scanner;


public class Libro {
    //public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor con todos los atributos pasados por parámetro
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Constructor vacío
    public Libro() {
    }

    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ISBN del libro: ");
        ISBN = scanner.nextLine();

        System.out.print("Ingrese el título del libro: ");
        titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas del libro: ");
        numPaginas = scanner.nextInt();
    }

    // Método para informar los datos del libro
    public void informarLibro() {
        System.out.println("Número de ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }

    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.cargarLibro();
        System.out.println("\nInformación del libro:");
        libro.informarLibro();
    }
}


