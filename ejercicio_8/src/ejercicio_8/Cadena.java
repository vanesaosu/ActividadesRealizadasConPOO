
package ejercicio_8;


public class Cadena {
    private String frase;
    private int longitud;

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void mostrarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < frase.length(); i++) {
            if (vocales.contains(Character.toString(frase.charAt(i)))) {
                contador++;
            }
        }

        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public void invertirFrase() {
        StringBuilder fraseInvertida = new StringBuilder(frase);
        fraseInvertida.reverse();
        System.out.println("Frase invertida: " + fraseInvertida);
    }

    public void vecesRepetido(String letra) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }

        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(String otraFrase) {
        int otraLongitud = otraFrase.length();

        if (longitud == otraLongitud) {
            System.out.println("Las frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases tienen longitudes diferentes.");
        }
    }

    void unirFrases(String otraFrase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void reemplazar(String reemplazo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean contiene(String buscarLetra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    