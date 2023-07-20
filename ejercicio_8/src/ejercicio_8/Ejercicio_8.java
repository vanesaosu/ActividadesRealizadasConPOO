
package ejercicio_8;

import java.util.Scanner;


public class Ejercicio_8 {

   
   public void unirFrases(String otraFrase) {
       String frase = null;
        String fraseUnida = frase + " " + otraFrase;
        System.out.println("Frase resultante: " + fraseUnida);
    }

    public void reemplazar(String letra) {
        char caracter = letra.charAt(0);
        String nuevaFrase = frase.replace('a', caracter);
        System.out.println("Frase resultante: " + nuevaFrase);
    }

    public boolean contiene(String letra) {
        return frase.contains(letra);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadena cadena = new Cadena();

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        cadena.setFrase(frase);

        cadena.mostrarVocales();

        cadena.invertirFrase();

        System.out.print("Ingrese un carácter: ");
        String letra = scanner.nextLine();
        cadena.vecesRepetido(letra);

        System.out.print("Ingrese otra frase: ");
        String otraFrase = scanner.nextLine();
        cadena.compararLongitud(otraFrase);

        cadena.unirFrases(otraFrase);

        System.out.print("Ingrese un carácter para reemplazar la letra 'a': ");
        String reemplazo = scanner.nextLine();
        cadena.reemplazar(reemplazo);

        System.out.print("Ingrese una letra a buscar en la frase: ");
        String buscarLetra = scanner.nextLine();
        if (cadena.contiene(buscarLetra)) {
            System.out.println("La frase contiene la letra '" + buscarLetra + "'.");
        } else {
            System.out.println("La frase no contiene la letra '" + buscarLetra + "'.");
        }
    }

    private static class frase {

        private static String replace(char c, char caracter) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static boolean contains(String letra) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public frase() {
        }
    }
}
        
    
           
        
    

