import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el número de marcas que desea ingresar: ");
        int numElementos = teclado.nextInt();
        teclado.nextLine(); 
        String[] marcas = new String[numElementos];
        for (int i = 0; i < numElementos; i++) {
            System.out.printf("Ingrese la marca #%d: ", i + 1);
            String marca = teclado.nextLine();
            if (marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T"))//El metodo de la clase string "marca.startsWith" verifica si la cadena de texto que queremos averiguar comeinza con una cadena especifica(osea si la cadena ingresada ingresa con alguna letra de las que se indico dara error)
            {
                System.out.println("Error: Las marcas que empiezan con las letras A, C, T no son permitidas.");
                i--; 
            } else {
                marcas[i] = marca;
            }
        }
        System.out.println("\nMarcas ingresadas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        teclado.close();
    }
}
