
package ejercicio_12;

import java.util.Date;
import java.util.Scanner;


public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    // Constructor vacío
    public Persona() {
    }

    // Constructor parametrizado
    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método de creación del objeto mediante Scanner
    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();

        // Parsear la fecha de nacimiento a un objeto Date
        // Aquí se asume que el formato ingresado es válido y se encuentra en el formato especificado
        // Puedes agregar lógica adicional para validar el formato de fecha si lo deseas
        // También es posible utilizar bibliotecas como SimpleDateFormat para manejar diferentes formatos de fecha
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Restar 1 al mes, ya que en Date enero es el mes 0
        int anio = Integer.parseInt(partesFecha[2]);
        fechaNacimiento = new Date(anio - 1900, mes, dia);

        System.out.println("Persona creada con éxito.");
    }

    // Método para calcular la edad
    public int calcularEdad() {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth() < fechaNacimiento.getMonth()
                || (fechaActual.getMonth() == fechaNacimiento.getMonth()
                && fechaActual.getDate() < fechaNacimiento.getDate())) {
            // Ajustar la edad si aún no se ha cumplido el aniversario de nacimiento
            edad--;
        }
        return edad;
    }

    // Método para comparar la edad con otra persona
    public boolean menorQue(int edad) {
        int edadActual = calcularEdad();
        return edadActual < edad;
    }

    // Método para mostrar los datos de la persona
    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + calcularEdad());
    }
}

