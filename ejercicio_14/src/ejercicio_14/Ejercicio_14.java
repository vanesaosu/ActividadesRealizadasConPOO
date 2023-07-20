
package ejercicio_14;


public class Ejercicio_14 {

   
    public static void main(String[] args) {
        Movil celular = new Movil();
        celular.cargarCelular();

        System.out.println("El celular ingresado es:");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Precio: " + celular.getPrecio());
    }
    
}
