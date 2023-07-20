
package ejercicio8;


public class Cadena {
     private String frase;
    private int longitud;

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public void invertirFrase() {
        StringBuilder invertida = new StringBuilder(frase);
        invertida.reverse();
        System.out.println("Frase invertida: " + invertida.toString());
    }

    public void vecesRepetido(String letra) {
        char c = letra.charAt(0);
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.toLowerCase(frase.charAt(i)) == Character.toLowerCase(c)) {
                contador++;
            }
        }
        System.out.println("El carácter '" + c + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(String otraFrase) {
        int otraLongitud = otraFrase.length();
        if (longitud == otraLongitud) {
            System.out.println("La longitud de ambas frases es igual.");
        } else if (longitud < otraLongitud) {
            System.out.println("La frase ingresada es más larga.");
        } else {
            System.out.println("La frase ingresada es más corta.");
        }
    }

    public void unirFrases(String otraFrase) {
        String fraseUnida = frase + " " + otraFrase;
        System.out.println("Frase resultante: " + fraseUnida);
    }

    public void reemplazar(String letra) {
        char oldChar = 'a';
        char newChar = letra.charAt(0);
        String fraseReemplazada = frase.replace(oldChar, newChar);
        System.out.println("Frase resultante: " + fraseReemplazada);
    }

    public boolean contiene(String letra) {
        char c = letra.charAt(0);
        return frase.toLowerCase().contains(Character.toString(c).toLowerCase());
    }
}
