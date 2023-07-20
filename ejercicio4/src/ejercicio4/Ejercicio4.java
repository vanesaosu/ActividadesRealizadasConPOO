
package ejercicio4;


public class Ejercicio4 {

   
    public static void main(String[] args) {
         Rectangulo rectangulo = new Rectangulo(4.5, 3.2);
        
        double superficie = rectangulo.calcularSuperficie();
        double perimetro = rectangulo.calcularPerimetro();
        
        System.out.println("Superficie: " + superficie);
        System.out.println("Perímetro: " + perimetro);
        
        rectangulo.dibujarRectangulo();
    }
    }
    

