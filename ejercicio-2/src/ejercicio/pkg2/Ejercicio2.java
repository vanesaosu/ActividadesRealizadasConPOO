/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 *
 * @author USER
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
  /* public static void main(String[] args) {  
   }*/
    
     public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(0.0);

        circunferencia.crearCircunferencia();

        System.out.println("Área de la circunferencia: " + circunferencia.area());
        System.out.println("Perímetro de la circunferencia: " + circunferencia.perimetro());
    
    }
   
}
