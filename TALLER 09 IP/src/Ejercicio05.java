import java.util.Random;
public class Ejercicio05 {
    public static void main(String[] args) {
        // Número de estudiantes
        int numEstudiantes = 28;

        // Arreglos para almacenar los nombres y promedios de los estudiantes
        String[] nombres = new String[numEstudiantes];
        double[] promedios = new double[numEstudiantes];

        // Autogenerar nombres y promedios
        Random rand = new Random();
        for (int i = 0; i < numEstudiantes; i++) {
            nombres[i] = "Estudiante" + (i + 1);
            promedios[i] = rand.nextDouble() * 10; // Autogenerar promedio entre 0 y 10
        }

        // Calcular estadísticas
        double sumaTotal = 0;
        double mejorCalificacion = 0;
        double peorCalificacion = 10;
        int indiceMejorCalificacion = 0;
        int indicePeorCalificacion = 0;

        // Mostrar nombres de los estudiantes con sus notas
        System.out.println("Nombres de los estudiantes con sus notas:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.printf("%s: %.2f\n", nombres[i], promedios[i]);
            sumaTotal += promedios[i];

            // Actualizar mejor calificación
            if (promedios[i] > mejorCalificacion) {
                mejorCalificacion = promedios[i];
                indiceMejorCalificacion = i;
            }

            // Actualizar peor calificación
            if (promedios[i] < peorCalificacion) {
                peorCalificacion = promedios[i];
                indicePeorCalificacion = i;
            }
        }

        // Calcular el promedio del ciclo
        double promedioCiclo = sumaTotal / numEstudiantes;

        // Mostrar promedio del ciclo
        System.out.printf("\nPromedio del ciclo: %.2f\n", promedioCiclo);

        // Mostrar estudiantes por encima del promedio
        System.out.println("\nEstudiantes por encima del promedio:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] > promedioCiclo) {
                System.out.printf("%s: %.2f\n", nombres[i], promedios[i]);
            }
        }

        // Mostrar estudiantes por debajo del promedio
        System.out.println("\nEstudiantes por debajo del promedio:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] < promedioCiclo) {
                System.out.printf("%s: %.2f\n", nombres[i], promedios[i]);
            }
        }

        // Mostrar estudiante con la mejor calificación y su nota
        System.out.printf("\nEstudiante con la mejor calificación: %s: %.2f\n", nombres[indiceMejorCalificacion], mejorCalificacion);

        // Mostrar estudiante con la calificación más baja y su nota
        System.out.printf("Estudiante con la calificación más baja: %s: %.2f\n", nombres[indicePeorCalificacion], peorCalificacion);
    }
}
