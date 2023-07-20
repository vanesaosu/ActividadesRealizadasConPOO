
package extra_ejercicio1;


public class Extra_ejercicio1 {

    
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();  // Crear una canción vacía
        cancion1.setTitulo("Canción 1");
        cancion1.setAutor("Autor 1");

        System.out.println(cancion1.getTitulo());  // Imprimir el título de la canción
        System.out.println(cancion1.getAutor());   // Imprimir el autor de la canción

        Cancion cancion2 = new Cancion("Canción 2", "Autor 2");  // Crear una canción con parámetros

        System.out.println(cancion2.getTitulo());  // Imprimir el título de la canción
        System.out.println(cancion2.getAutor());   // Imprimir el autor de la canción
    }
    
}
