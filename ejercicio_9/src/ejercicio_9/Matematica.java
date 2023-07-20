
package ejercicio_9;


public class Matematica {
     private double numero1;
    private double numero2;
    
    public Matematica() {
        // Constructor vacío
    }
    
    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double getNumero1() {
        return numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double devolverMayor() {
        return Math.max(numero1, numero2);
    }
    
    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = Math.min(numero1, numero2);
        return Math.pow(Math.round(mayor), Math.round(menor));
    }

    String calcularRaiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
    
