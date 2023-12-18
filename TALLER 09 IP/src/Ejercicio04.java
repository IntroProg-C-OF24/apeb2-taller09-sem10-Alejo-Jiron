
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra:");
            inicial = entrada.nextLine().toUpperCase(); //aqui convierto las letras minusculas a mayusculas para poder hacer la comparacion profe
            for (String estudiante : estudiantes) {
                if (estudiante.toUpperCase().startsWith(inicial)) {
                    System.out.println("¡Coincidencia encontrada! Salir del ciclo.");
                    bandera = false;
                    break;
                }
            }
        }
    }
}
