
public class Ejercicio03 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};

        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < promedios.length; i++) {
            double promedio = promedios[i];

            if (promedio >= 0 && promedio <= 5.9) {
                promediosCualitativos[i] = ": Regular";
            } else if (promedio >= 6 && promedio <= 8.9) {
                promediosCualitativos[i] = ": Bueno";
            } else if (promedio >= 9 && promedio <= 10) {
                promediosCualitativos[i] = ": Sobresaliente";
            } else {
                promediosCualitativos[i] = "Error: Promedio fuera de rango";
            }
        }
        for (int i = 0; i < estudiantes.length; i++) {
            String nombre = estudiantes[i];
            double promedio = promedios[i];
            String promedioCualitativo = promediosCualitativos[i];
            System.out.printf("%s promedio: %.2f, promedio cualitativo: %s\n", nombre, promedio, promedioCualitativo);
        }
    }
}


