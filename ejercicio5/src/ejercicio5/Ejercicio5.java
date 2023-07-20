
package ejercicio5;

import ejercicio5.CuentaBancaria.Cuenta;
import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        Cuenta cuenta = Cuenta.crearCuentaDesdeConsola();
        cuenta.ingresar(1000);
        cuenta.consultarSaldo();
        cuenta.retirar(500);
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();
        
    }
    
}
