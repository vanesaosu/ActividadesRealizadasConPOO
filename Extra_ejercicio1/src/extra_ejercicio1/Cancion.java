
package extra_ejercicio1;


public class Cancion {
    private String titulo;
    private String autor;
    
    // Constructor vacío
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }
    
    // Constructor con parámetros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Getter para el título
    public String getTitulo() {
        return titulo;
    }
    
    // Setter para el título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // Getter para el autor
    public String getAutor() {
        return autor;
    }
    
    // Setter para el autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

}


