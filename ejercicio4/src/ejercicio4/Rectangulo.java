
package ejercicio4;


public class Rectangulo {
    private double base;
    private double altura;
    
    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Getter y Setter para la base
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    // Getter y Setter para la altura
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para calcular la superficie del rectángulo
    public double calcularSuperficie() {
        return base * altura;
    }
    
    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
    
    // Método para dibujar el rectángulo
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

