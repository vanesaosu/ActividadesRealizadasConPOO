
package ejercicio6;


public class Cafetera {
     private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado
    public Cafetera() {
    }

    // Constructor con capacidad máxima y cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.min(capacidadMaxima, cantidadActual);
    }

    // Métodos getters y setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Método llenarCafetera
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    // Método servirTaza
    public void servirTaza(int tamanoTaza) {
        if (cantidadActual >= tamanoTaza) {
            cantidadActual -= tamanoTaza;
            System.out.println("Se ha llenado la taza.");
        } else {
            System.out.println("No se pudo llenar la taza. Quedó con " + cantidadActual + " unidades de café.");
            cantidadActual = 0;
        }
    }

    // Método vaciarCafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    // Método agregarCafe
    public void agregarCafe(int cantidad) {
        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }

}
