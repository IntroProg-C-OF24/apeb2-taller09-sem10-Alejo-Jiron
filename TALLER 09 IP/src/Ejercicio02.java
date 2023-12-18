public class Ejercicio02 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        double media = suma / arreglo.length;
        int arribaDeLaMedia = 0;
        int debajoDeLaMedia = 0;

        for (int elemento : arreglo) {
            if (elemento > media) {
                arribaDeLaMedia++;
            } else if (elemento < media) {
                debajoDeLaMedia++;
            }
        }
        System.out.println("Media aritmética: "+ media);
        System.out.println("Elementos arriba de la media: " + arribaDeLaMedia);
        System.out.println("Elementos por debajo de la media: " + debajoDeLaMedia);
    }
    
}
